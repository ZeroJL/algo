import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSearchII {
    public List<String> solution(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = new TrieNode();

        for (String word : words) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); ++i) {
                char ch = word.charAt(i);
                if (!current.children.containsKey(ch)) {
                    current.children.put(ch, new TrieNode());
                }
                current = current.children.get(ch);
            }

            current.word = word;
        }

        int m = board.length;
        int n = board[0].length;

        for (int row = 0; row < m; ++row) {
            for (int col = 0; col < n; ++col) {
                if (root.children.containsKey(board[row][col])) {
                    find(row, col, root, board, result);
                }
            }
        }

        return result;
    }

    private void find(int row, int col, TrieNode node, char[][] board, List<String> result) {
        char ch = board[row][col];
        TrieNode current = node.children.get(ch);

        if (current.word != null) {
            result.add(current.word);
            current.word = null;
        }

        board[row][col] = '#';
        int[][] offsets = {{-1,0},{1,0},{0,-1},{0,1}};
        for (int[] offset : offsets) {
            int newRow = row + offset[0];
            int newCol = col + offset[1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                if (current.children.containsKey(board[newRow][newCol])) {
                    find(newRow, newCol, current, board, result);
                }
            }
        }
        board[row][col] = ch;

        if (current.children.isEmpty()) {
            node.children.remove(ch);
        }
    }

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word;
    }

}
