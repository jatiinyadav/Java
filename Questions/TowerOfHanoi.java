package Questions;

public class TowerOfHanoi {

    public static long toh(int N, int from, int to, int aux) {
        if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            return 1;
        }

        long i = toh(N - 1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        i = i + toh(N - 1, aux, to, from);

        return i + 1;
    }

    public static void main(String[] args) {

        long ans = toh(3, 1, 3, 2);
        System.out.println(ans);
    }
}
