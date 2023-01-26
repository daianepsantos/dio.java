import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 O usuário deve informar qual número ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo:

 Tabuada do 5:
 5 x 1 = 5
...
...
 5 x 10 = 50
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i) );
        }
    }
}
