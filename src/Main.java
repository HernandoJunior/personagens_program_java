import java.util.Scanner;
/*Fazemos a importação do Scanner para habilitar a entrada de dados no sistema,
* utilizando o import correspondente */

public class Main {
    public static void main(String[] args) {
        //Instanciando a classe Scan
        Scanner sc = new Scanner(System.in);
        //Crianco o objeto personagem
        PersonagemMagico personagem = new PersonagemMagico();

        int option;
        do {
            System.out.println("""
                    Escolha uma opção:\
                    
                    1-Cadastrar Personagem\s
                    2-Exibir Personagem\
                    
                    3-Atacar\s
                    4-Aumentar energia \s
                    5-Usar habilidade especial \s
                    6-Ativar/Desativar habilidade \s
                    0-Sair\s
                    Digite a opção:\s""");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = sc.next() + sc.nextLine();

                    System.out.println("Digite o nome do poder do personagem: ");
                    String poder = sc.next() + sc.nextLine();

                    System.out.println("Informe a energia do personagem: ");
                    int energia = sc.nextInt();

                    personagem.name = nome;
                    personagem.poderMagico = poder;
                    personagem.nivelEnergia = energia;

                    System.out.println("Digite o nome da habilidade especial: ");
                    String nomeHabilidade = sc.next() + sc.nextLine();

                    System.out.println("Digite o custo de energia para usar a habilidade: ");
                    int nivelEnergia = sc.nextInt();

                    System.out.println("A habilidade está ativada? (true/false): ");
                    boolean ativada = sc.nextBoolean();

                    //Criando o objeto que representa a habilidade especial
                    personagem.habilidade = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                    break;

                case 2:
                    System.out.println("Nome: " + personagem.name + "\nPoder: " + personagem.poderMagico + "\nEnergia: " + personagem.nivelEnergia);
                    System.out.println("Habilidade: " + personagem.habilidade.nome + "\nCusto energia: " + personagem.habilidade.custoEnergia + "\nHabilitada: " + personagem.habilidade.habilitada);
                    break;

                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;

                case 4:
                    System.out.println("Digite a quantidade de energia capturada: ");
                    int quantidade = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(quantidade);
                    System.out.println("Nivel atual de energia: " + nivelAtual);
                    break;

                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;

                case 6:
                    System.out.println("1- Ativar\n 2-Desativar \n Digite: ");
                    String escolha = sc.next() + sc.nextLine();
                    if (escolha.equals("1")){
                        personagem.habilidade.ativarHabilidade();
                    } else if (escolha.equals("2")){
                        personagem.habilidade.desativarHabilidade();
                    } else {
                        System.out.println("Opção invalida");
                    }
                    break;

                case 0:
                    System.out.println("Finalizando o programa...");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }

        }while(option != 0);
        sc.close();
    }
}