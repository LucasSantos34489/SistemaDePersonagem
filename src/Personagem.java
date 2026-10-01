public class Personagens {
    private String nome;
    private double nivel;
    private double qtdVida;

    public Personagens(String nome, double nivel, double qtdVida) {
        this.nome = nome;
        if (qtdVida >= 1){
            this.qtdVida = qtdVida;
        }else{
            IO.println("Número invalido");
        }
        if (qtdVida <= 100){
            this.qtdVida = qtdVida;
        }
        this.qtdVida = qtdVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public double getQtdVida() {
        return qtdVida;
    }

    public void setQtdVida(double qtdVida) {
        this.qtdVida = qtdVida;
    }
    public void atacar(){
        IO.println("Ataque realizado");
    }
}
