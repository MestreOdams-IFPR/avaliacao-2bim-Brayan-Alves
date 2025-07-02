import java.util.*;

public class tribonacci{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = LER.nextInt() - 1;
        int resp = doTribonacciRec(n);
        System.out.println(resp);
    }

    public static int doTribonacciRec(int n){
        if(n == 0 || n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }

        return doTribonacciRec(n-1) + doTribonacciRec(n-2) + doTribonacciRec(n-3);
        
    }

    // public static int doFibonacci(int n, int resp){
    //     if(n == 0){
    //         return resp;
    //     }else
            
    //     return n + doFibonacci(n-1);
    // }
}