import java.util.*;

public class sentencaDancante {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        while (LER.hasNext()) {
            String frase = LER.nextLine();
            String[] letras = frase.split("");
            boolean seMaiusculo = true;
            for (int i = 0; i < letras.length; i++) {
                if(Character.isLetter(letras[i].charAt(0))){
                    if(seMaiusculo){
                        letras[i] = letras[i].toUpperCase();
                        seMaiusculo = false;
                    }else{
                        letras[i] = letras[i].toLowerCase();
                        seMaiusculo = true;
                    }
                }
            }
            for (int i = 0; i < letras.length; i++) {
                System.out.print(letras[i]);
            }
        }
    }
}
