package Atividades;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        scanner.close();

        System.err.println("Sua Palavra escolhida: " + palavra);
        String frase = palavra.replaceAll("[^a-zA-Z0-9]", "").toUpperCase(); // Higienização com o Chat

        Pali(frase);
    }

    //não consegui arrumar os filtros mas ele faz a comparação com palavras

    public static String Pali(String a) {
        List<String> letras = new ArrayList<>(List.of(a.split("")));

        
        for (int i = 0; i < letras.size() / 2; i++) {
            if (!letras.get(i).equals(letras.get(letras.size() - 1 - i))) {
                System.out.println("A palavra " + a + " não é um palíndromo");
                return "finalizado"; 
            } else {
                System.out.println("A palavra " + a + " é um palíndromo");
            }
        }
        
        
        return "finalizado";
    }
}
