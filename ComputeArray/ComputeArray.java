public class ComputeArray {
    public static int[] computeArray(int[] array) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                res[i] = array[i] * 5;
            } else if (array[i] % 3 == 1) {
                res[i] = array[i] + 7;
            } else {
                res[i] = array[i];
            }
        }
        return res;
    }
}

// If the item is a multiple of 3, it is multiplied by 5

// If the item is a multiple of 3 + 1 (e.g. 1, 4, 7, ...), it is incremented by
// 7

// If the item is a multiple of 3 + 2 (e.g. 2, 5, 8, ...), it stays unchanged.