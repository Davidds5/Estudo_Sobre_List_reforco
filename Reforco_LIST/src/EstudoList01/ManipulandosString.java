package EstudoList01;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipulandosString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Nome String na posicao #" + (i + 1) + ": ");
            String nomeAdd = scanner.nextLine();

            stringList.add(nomeAdd);

        }
        System.out.println();
        
        System.out.println("Mostrando os nomes");
        for (String nome : stringList){
            System.out.println(nome);
        }
    }
}
