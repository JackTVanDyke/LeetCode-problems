package easy;

public class CountingBits {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        for (int i = 0; i <= n; i++) {
            answer[i] = count(i);
        }
        return answer;
    }

    private int count(int x) {
        int count = 0;
        while (x != 0) {
            x &= x - 1;
            count++;
        }
        return count;
    }
}
