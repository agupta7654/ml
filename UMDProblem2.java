import java.util.Scanner;

public class UMDProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = Integer.toString(sc.nextInt());
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean addeda = false;
            boolean addedb = false;
            
            for(int i = 0; i < n.length(); i++) {
                if(Integer.parseInt(n.substring(i,i+1)) < a){
                    n = n.substring(0,i) + a + n.substring(i);
                    addeda = true;
                    break;
                }
            }

            if (!addeda) {
                n = n + a;
            }

            for(int i = 0; i < n.length(); i++) {
                if(Integer.parseInt(n.substring(i,i+1)) < b){
                    n = n.substring(0,i) + b + n.substring(i);
                    addedb = true;
                    break;
                }
            }

            if (!addedb) {
                n = n + b;
            }
            System.out.println(n);
        }
    }
}