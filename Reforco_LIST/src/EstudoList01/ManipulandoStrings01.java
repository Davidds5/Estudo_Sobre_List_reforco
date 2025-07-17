package EstudoList01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipulandoStrings01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> alunosList = new ArrayList<>();

        System.out.println("=== Cadraste os alunos ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno #" + (i + 1) + ": ");
            String alunoAdd = sc.nextLine();

            alunosList.add(alunoAdd);

        }
        System.out.println("____________________________________________________");

        System.out.println("=== Lista Normal ===");
        // mostrando lista normal
        for (String nome : alunosList) {
            System.out.println(nome);
        }

        System.out.println("____________________________________________________");


//        // mostrando list usando o reversed
//        String reversedList = String.valueOf(alunosList.reversed());
//        System.out.println(reversedList);

        // mostrando apenas usando  a funcao for
        // int i sera o tamanho da list -1, enquanto i for maior ou igual a 0, i ira diminuir
        System.out.println("=== Lista reversed ===");
        for (int i = alunosList.size() - 1; i >= 0; i--) {
            System.out.println(alunosList.get(i));

        }

        System.out.println("____________________________________________");
        // nomes que comeca com a letra a, iremos usar a funcao .startsWith para ajuda nessa, junto com a tolowerCase para mostra meso se for maiuscula

        System.out.println("=== Nomes com a letra A ===");
        int cont = 0;
        boolean encontrado = false;
        for (String nome : alunosList) {
            if (nome.toLowerCase().startsWith("a")) {
                encontrado = true;
                System.out.println(nome);
                cont++;
            }
        }
        if (!encontrado){
            System.out.println("Nenhum nome com a letra a.");
        }
        System.out.println("____________________________________________________");
        System.out.println("Quantidade de nomes com a letra 'A': " + cont);
        sc.close();
    }
}



