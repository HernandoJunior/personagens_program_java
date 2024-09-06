public class Teste1 {
    public static void main(String[] args) {
        //Criando um objeto (primeiro personagem)
        PersonagemMagico mago = new PersonagemMagico("Hernando");
        //Criando o segundo objeto (segundo personagem)
        PersonagemMagico elfo = new PersonagemMagico("Junior");

        //Atribuindo valores aos atributos do personagem 1
        mago.nivelEnergia = 100;
        mago.poderMagico = "Magia";

        //Atribuindo valores dos atributos do personagem 2
        elfo.nivelEnergia = 200;
        elfo.poderMagico = "Arqueiro";

        //Exibindo valores dos atributos do objeto:
        System.out.println("Nome do mago: " + mago.name + "\nEnergia: " + mago.nivelEnergia + "\nPoder magico: " + mago.poderMagico);

    }
}