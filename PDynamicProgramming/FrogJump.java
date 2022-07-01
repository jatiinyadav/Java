package PDynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class FrogJump {

    public static boolean canCross(int[] stones) {

        if (stones == null || stones.length == 0)
            return false;

        if (stones.length == 1)
            return true;

        if (stones[1] != 1)
            return false;

        if (stones.length == 2)
            return true;

        int last = stones[stones.length - 1];

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < stones.length; i++) {
            if (i > 3 && stones[i] > stones[i - 1] * 2)
                return false;
            System.out.println(stones[i]);
            hs.add(stones[i]);
        }

        Set<String> checked = new HashSet<>();

        return canReach(hs, last, 1, 1, checked);
    }

    public static boolean canReach(HashSet<Integer> hs, int last, int pos, int jump, Set<String> checked) {

        if (pos == last)
            return true;

        if (checked.contains(pos + ":" + jump))
            return false;

        checked.add(pos + ":" + jump);

        if (hs.contains(pos + jump + 1)) {
            if (canReach(hs, last, pos + jump + 1, jump + 1, checked))
                return true;
        }

        if (hs.contains(pos + jump)) {
            if (canReach(hs, last, pos + jump, jump, checked))
                return true;
        }

        if (jump > 1 && hs.contains(pos + jump - 1)) {
            if (canReach(hs, last, pos + jump - 1, jump - 1, checked))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] stones = { 0, 1, 3, 5, 6, 8, 12, 17 };

        boolean ans = canCross(stones);
        System.out.println(ans);
    }
}
