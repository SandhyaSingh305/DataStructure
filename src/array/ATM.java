package array;

class ATM {

    private final long[] count;
    private final int[] value = {20, 50, 100, 200, 500};

    public ATM() {
        count = new long[5];
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            count[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {

        int[] used = new int[5];
        long[] temp = count.clone();

        for (int i = 4; i >= 0; i--) {
            long take = Math.min(temp[i], amount / value[i]);
            used[i] = (int) take;
            amount -= take * value[i];
        }

        if (amount != 0) {
            return new int[]{-1};
        }

        for (int i = 0; i < 5; i++) {
            count[i] -= used[i];
        }

        return used;
    }
}