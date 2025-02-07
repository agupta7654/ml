import java.util.Scanner;

public class Tardy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        boolean ag = a > max;
        boolean bg = b > max;
        boolean cg = c > max;
        boolean dg = d > max;

        if(ag && bg || ag && cg || ag && dg || bg && cg || bg && dg || cg && dg) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}