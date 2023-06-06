//2 - Faça um Programa que leia um número
// e exiba o dia correspondente da semana.
// (1-Domingo, 2- Segunda, etc.),
// se digitar outro valor deve aparecer valor inválido.
//

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("Digite um número e eu te direi o dia da semana correspondente: ");
        int numero = entradaDoUsuario.nextInt();

        String[] diaSemana = new String[8];

        diaSemana[1] = "Domingo";
        diaSemana[2] = "Segunda-feira";
        diaSemana[3] = "Terca-feira";
        diaSemana[4] = "Quarta-feira";
        diaSemana[5] = "Quinta-feira";
        diaSemana[6] = "Sexta-feira";
        diaSemana[7] = "Sábado";

        if (numero == 0 || numero > 7) {
            System.out.println("Voce digitou um número inválido.");
        } else if (numero >= 1 || numero <= 7) {
            System.out.println("O número " + numero + " corresponde a " + diaSemana[numero]);

        }
    }
}
