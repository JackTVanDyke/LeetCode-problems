package easy;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        int mask = 1;
        for (int i =0; i < 32; i++) {
            int tmp = n & mask;
            if (tmp != 0) {
                int tmpMask = 1 << (31 - i);
                result = result | tmpMask;
            }
            mask <<= 1;
        }
        return result;
    }
}
