import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        // Sort the coins in ascending order
        List<Integer> sortedCoins = new ArrayList<>(coins);
        Collections.sort(sortedCoins);

        int n = sortedCoins.size();
        int[] chosen = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (amount >= sortedCoins.get(i)) {
                amount -= sortedCoins.get(i);
                chosen[i]++;
            }
        }

        if (amount != 0) {
            throw new IllegalArgumentException("Cannot make exact change with given coins.");
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < chosen[i]; j++) {
                result.add(sortedCoins.get(i));
            }
        }

        return result;
    }
}