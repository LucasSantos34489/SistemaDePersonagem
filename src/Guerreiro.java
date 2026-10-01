public class Guerreiro extends Personagens {

    private double forca;

    public Guerreiro(String nome, double nivel, double qtdVida, double forca) {
        super(nome, nivel, qtdVida);
        this.forca = forca;
    }

    @Override
    public void atacar() {
        super.atacar();
        IO.println("O guerreiro atacou com a espada!");
    }
}
