import java.util.*;

public class AlienDictionary {

    public String solution(String[] words) {

        Map<Character, Integer> inbound = new HashMap<>();

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                inbound.put(ch, 0);
            }
        }

        Map<Character, List<Character>> adj = new HashMap<>();

        if (!topologySort(words, inbound, adj)) {
            return "";
        }

        Queue<Character> queue = initQueue(inbound);

        String result = makeDictionary(inbound, adj, queue);

        return result.length() == inbound.size() ? result : "";
    }

    private String makeDictionary(Map<Character, Integer> inbound, Map<Character, List<Character>> adj, Queue<Character> queue) {
        String result = "";
        while (!queue.isEmpty()) {
            char ch = queue.poll();
            result += ch;
            if (adj.containsKey(ch)) {
                List<Character> currentAdj = adj.get(ch);
                for (char adjCh : currentAdj) {
                    inbound.put(adjCh, inbound.get(adjCh) - 1);
                    if (inbound.get(adjCh) == 0) {
                        queue.add(adjCh);
                    }
                }
            }
        }
        return result;
    }

    private Queue<Character> initQueue(Map<Character, Integer> inbound) {
        Queue<Character> queue = new LinkedList<>();
        for (Map.Entry<Character, Integer> entry : inbound.entrySet()) {
            if (entry.getValue() == 0) {
                queue.add(entry.getKey());
            }
        }
        return queue;
    }

    private boolean topologySort(String[] words, Map<Character, Integer> inbound, Map<Character, List<Character>> adj) {
        for (int i = 1; i < words.length; ++i) {
            String word1 = words[i - 1];
            String word2 = words[i];
            int len1 = word1.length();
            int len2 = word2.length();

            if (len1 > len2 && word1.startsWith(word2)) {
                return false;
            }

            int minLen = Math.min(len1, len2);
            for (int j = 0; j < minLen; ++j) {
                char ch1 = word1.charAt(j);
                char ch2 = word2.charAt(j);
                if (ch1 != ch2) {
                    inbound.put(ch2, inbound.get(ch2) + 1);
                    List<Character> currentAdj = adj.getOrDefault(ch1, new ArrayList<>());
                    currentAdj.add(ch2);
                    adj.put(ch1, currentAdj);
                    break;
                }
            }
        }
        return true;
    }
}
