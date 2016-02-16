public class CountBits {
    public int count(int num) {

        int count = 0;
        int mask = 1;

        while (num != 0) {
            if ((num & mask) != 0) {
                count++;
            }
            num >>>= 1;
        }
        return count;
    }
}