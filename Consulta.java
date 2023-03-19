package clinica;

public class Consulta {
    private double valor;
    private Exame[] listaExame = new Exame[5];

    public Consulta() {
    }

    public Consulta(double valor, Exame[] listaExame) {
        this.valor = valor;
        this.listaExame = listaExame;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Exame[] getListaExame() {
        return listaExame;
    }

    public void setListaExame(int posicao,Exame exame) {
        listaExame[posicao] = exame;
    }
}
