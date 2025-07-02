import java.util.Scanner;

public class pell {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = LER.nextInt() - 1;
        int resp = doPellRec(n);
        System.out.println(resp);
    }

    public static int doPellRec(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        return 2 * doPellRec(n-1) + doPellRec(n - 2);
    }
}
