import java.util.Scanner;
/*Fazemos a importação do Scanner para habilitar a entrada de dados no sistema,
* utilizando o import correspondente */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n0-Sair");
            op = sc.nextInt();

        }while(op != 0);
        sc.close();
    }
}