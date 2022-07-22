public class PalinDromeNumber {
    public boolean solution(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int reversedNum = 0;
        int current = x;

        while (current > reversedNum) {
            reversedNum = reversedNum * 10 + current % 10;
            current /= 10;
        }

        return current == reversedNum || current == reversedNum / 10;
    }
}
