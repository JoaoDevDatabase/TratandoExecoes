import java.util.Scanner;
import java.util.InputMismatchException;

public class Aboume {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double altura;
        try {// PASSAR TODA A REPRESENTAÇÃO DO MEU CÓDIGO
            System.out.println("Olá me diga seu nome? ");
            nome = scanner.nextLine();
            System.out.println("\n");

            System.out.println("Agora me diga qual a sua idade? ");
            idade = scanner.nextInt();
            System.out.println("\n");

            System.out.println("Agora me diga mais ou menos quanto de altura você possui? ");
            altura = scanner.nextDouble();
            System.out.println("\n");
            scanner.close();
        } catch (InputMismatchException e) {// TRATAMENTO DO MEU ERRO NO CÓDIGO, PEGANDO O NOME DO ERRO, IMPORTANTO ELE,
                                            // E DANDO UM VALOR ATRIBUIDO A ELE;
            System.out
                    .println("OS CAMPOS DE , IDADE E ALTURA , NÃO PODEM POSSUIR DADOS POR ESCRITO, APENAS NUMÉRICOS!");
        }
    }
}
/*
 * EXPLICAÇÃO DO CÓDIGO
 * 
 * O MEU TRY ELE VAI PASSAR TUDO AQUILO QUE VAI SER A PARTE POSITIVA DO MEU
 * CÓDIGO
 * NA HORA QUE TIVER ALGUM ERRO E TERMOS QUE TRATAR, O MEU CATCH VAI ENTRAR EM
 * AÇÃO PEGANDO O
 * GANCHO DA PARTE AONDE ESTÁ O ERRO.
 * 
 * VAMOS PASSAR TODA A PARTE POSITIVA DESSE MEU CÓDIGO PARA O TRY, A PARTE DO
 * MEU CATCH, VAI SER QUANDO TIVER ALGUM TIPO DE ERRO CAUSADO PELO MEU USUÁRIO
 */