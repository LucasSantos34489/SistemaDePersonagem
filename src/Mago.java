public class Mago extends Personagens {

    private double mana;

    public Mago(String nome, double nivel, double qtdVida, double mana) {
        super(nome, nivel, qtdVida);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        super.atacar();
        IO.println("O mago realizou um feitiço");
    }
}