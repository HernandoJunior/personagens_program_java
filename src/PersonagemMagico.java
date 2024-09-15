public class PersonagemMagico {
    //Definindo atributos da classe
    String name;
    String poderMagico;
    int nivelEnergia;

    HabilidadeEspecial habilidade;


    public PersonagemMagico(){}

    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico){
        this.name = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico(String name){
        this.name = name;
    }

    public void atacar(String ataque){
        if (nivelEnergia >= 10){
            System.out.println(name + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= habilidade.custoEnergia;
        } else {
            System.out.println(name + " está sem energia para atacar. ");
        }
    }

    public int aumentarEnergia(int energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial(){
        if (!habilidade.habilitada){
            System.out.println("A Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidade.custoEnergia){
            System.out.println("Ativando a habilidade: " + habilidade.nome);
            nivelEnergia -= habilidade.custoEnergia;
        } else {
            System.out.println(name + " está sem energia para usar a habilidaade");
        }
    }
}