import java.util.*;

public class BusRoutes {
    public int solution(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; ++i) {
            for (int j = 0; j < routes[i].length; ++j) {
                List<Integer> buses = map.getOrDefault(routes[i][j], new ArrayList<>());
                buses.add(i);
                map.put(routes[i][j], buses);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        int result = 0;
        Set<Integer> seen = new HashSet<>();
        while (!queue.isEmpty()) {
            ++result;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                int busStation = queue.poll();
                List<Integer> buses = map.get(busStation);
                for (int bus : buses) {
                    if (seen.add(bus)) {
                        for (int j = 0; j < routes[bus].length; ++j) {
                            if (routes[bus][j] == target) {
                                return result;
                            }
                            queue.add(routes[bus][j]);
                        }
                    }
                }

            }
        }

        return -1;
    }
}
