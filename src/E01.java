import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre pelo mais barato.
public class E01 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos que voce quer verificar: ");
        int qntProdutos = entradaDoUsuario.nextInt();

        List<String> produtos = new ArrayList<>();
        List<Double> precos = new ArrayList<>();

        String melhorProduto = null;
        double melhorPreco = 0;

        for (int i = 0; i < qntProdutos; i++) {
            System.out.println("Digite o nome do produtos");
            String produto = entradaDoUsuario.next();
            produtos.add(produto);

            System.out.println("O preço do produto");
            double preco = entradaDoUsuario.nextDouble();
            precos.add(preco);

            if( melhorProduto == null || preco < melhorPreco){
               melhorProduto = produto;
                melhorPreco = preco;
            }
        }

        System.out.println("Os produtos são: " + produtos + " e custam respectivamente: " + precos);
        System.out.println("O melhor produto é : " + melhorProduto + " e custa  : " + melhorPreco);

    }
}