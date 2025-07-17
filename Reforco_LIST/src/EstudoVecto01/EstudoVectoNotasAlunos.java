package EstudoVecto01;



import java.util.Scanner;
import java.util.Vector;

public class EstudoVectoNotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Double> notasAlunos = new Vector<>();

        for (int i = 0; i <4; i++) {
            System.out.println("Informe as notas dos alunos: ");
            double notas = sc.nextDouble();

            notasAlunos.add(notas);

        }
        for (Double nota : notasAlunos){
            System.out.println(nota);
        }

        int cont = 0;
        boolean acimaMedia = false;
        for (Double nota : notasAlunos){
            if (nota > 7){
                System.out.println("Nota acima da media: " + nota);

                cont ++;
                acimaMedia = true;
            }
        }
        if (!acimaMedia){
            System.out.println("Nenhuma nota acima da media.");
        }
        System.out.println("Quantidade que ficaram acima da media: " + cont);

    }
}
