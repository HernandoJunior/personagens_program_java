public class HabilidadeEspecial {
    String nome;
    int custoEnergia;
    boolean habilitada;

    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada) {
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    public void ativarHabilidade(){
        this.habilitada = true;
        System.out.println("Habilidade ativada!");
    }

    public void desativarHabilidade(){
        this.habilitada = false;
        System.out.println("Habilidade desativada!");
    }
}