public class SearchA2DMatrix {

    public boolean solution(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m - 1;

        //search row with binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == matrix[mid][0]) {
                return true;
            } else if (target < matrix[mid][0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return binarySearch(matrix[end], target);
    }

    private boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
