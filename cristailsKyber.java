import java.util.*;

public class cristailsKyber {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        while (LER.hasNext()) {
            int[] vet = new int[LER.nextInt()];
            int[] buscas = new int[LER.nextInt()];
    
            for (int i = 0; i < vet.length; i++) {
                vet[i] = LER.nextInt();
            }
            for (int i = 0; i < buscas.length; i++) {
                buscas[i] = LER.nextInt();
            }
    
            doSelection(vet);
            int cont = 1;
            System.out.println("CASE# " + cont + ":");
            for (int i = 0; i < buscas.length; i++) {
                int resp = buscaBinario(vet, buscas[i]);
                if(resp < 0){
                    System.out.println(buscas[i] + " not found");
                }else{
                    System.out.println(buscas[i] + " found at " + (resp+1));

                }
                
            }
            cont++;
        }


    }

    public static int buscaBinario(int[] vet, int num){
        int inicio = 0;
        int fim = vet.length - 1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;

            if(vet[meio] == num){
                return meio;
            }else if(vet[meio] < num){
                inicio = meio+1;
            }else{
                fim = meio-1;
            }
        }

        return -1;
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
