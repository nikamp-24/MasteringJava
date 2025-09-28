package Home.Java_Recursion;

public class TowerOfHanoi_08 {
    public static void main(String[] args) {
        int n = 3;
        solve(n, 'A', 'C', 'B');
    }

    static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk from " + from + " to " + to);
            return;
        }

        solve(n-1, from , aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solve(n-1, aux, to, from);
    }
}
