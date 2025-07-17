package EstudoList01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipulandoStrings02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> nomesList = new ArrayList<>();

        nomesList.add("Ana");
        nomesList.add("Bruno");
        nomesList.add("Carlos");
        nomesList.add("Daniela");
        nomesList.add("Eduardo");

        for (String nome : nomesList) {
            System.out.println(nome);
        }

        
        for (int i = 0; i <nomesList.size() ; i++) {
            if(nomesList.get(i).equalsIgnoreCase("Carlos")){
                System.out.println("Nome encotrado");
            }

        }

        // poderia ter feito assim mas a atividade nao estava pedindo assim
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Nome #" + (i + 1) + ": ");
//            String nomeAdd = sc.nextLine();
//
//            nomesList.add(nomeAdd);
        }
    }

