import java.util.Scanner;

public class AngryRobots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vi = sc.nextDouble();
        double theta = sc.nextDouble();
        double xi = sc.nextDouble();
        double yi = sc.nextDouble();
        double dt = sc.nextDouble();

        double yf = yi + vi * Math.sin(Math.toRadians(theta)) * dt - 0.5 * 9.80665 * dt * dt;
        double xf = xi + vi * Math.cos(Math.toRadians(theta)) * dt;
        System.out.println(xf + " " + yf);
    }
}