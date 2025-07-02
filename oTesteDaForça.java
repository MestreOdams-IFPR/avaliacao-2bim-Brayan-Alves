import java.util.*;

public class oTesteDaForça {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        while (LER.hasNext()) {
            int[] vet = new int[LER.nextInt()];
            int k = LER.nextInt();
    
            for (int i = 0; i < vet.length; i++) {
                vet[i] = LER.nextInt();
            }
    
            doSelection(vet);
    
            int soma = 0;
    
            for (int i = vet.length-1; i > -1; i--) {
                if(k != 0){
                    soma += vet[i];
                    k--;
                }
            }
    
            System.out.println(soma);
        }
    }



    public static void doSelection(int[] vet){
        int temp = 0;
            for (int i = 1; i < vet.length; i++) {
                for (int j = i; j >= 1; j--) {
                    if(vet[j] < vet[j-1]){
                        temp = vet[j];
                        vet[j] = vet[j-1];
                        vet[j-1] = temp;
                    }else{
                        break;
                    }
                }
            }
    }

    
}
