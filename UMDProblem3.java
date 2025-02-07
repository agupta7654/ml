import java.util.Scanner;

public class UMDProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String n = sc.nextLine();
            String cur = "";
            for(int i = 0; i < n.length(); i++){
                if(n.charAt(i) != ' '){
                    cur += n.charAt(i);
                }
                else{
                    break;
                }
            }   
            int k = Integer.parseInt(cur);
            n = n.substring(cur.length()+1);
            String[] arr = new String[n.length()/k];
            for(int i = 0; i < n.length()/k; i++) {
                arr[i] = "";
            }
            for(int i = 0; i < k; i++) {
                for(int j = 0; j < n.length()/k; j++) {
                    arr[j] += n.charAt(i*n.length()/k+j);
                }
            }
            String fin = "";
            for(int i = 0; i < n.length()/k; i++) {
                fin += arr[i];
            }
            System.out.println(fin);
        }
    }
}