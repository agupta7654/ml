import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String[] banned = sc.nextLine().split(" ");
        String[] computer = sc.nextLine().split(" ");
        for(int i = 0; i < computer.length; i++){
            for(int j = 0; j < a; j++){
                if(computer[i].equals(banned[j])){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}