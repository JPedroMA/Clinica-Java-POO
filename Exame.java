package clinica;

public class Exame {
    private String nome;
    private Double preco = 89d;
    private String medico;

    public Exame() {
    }

    public Exame(String nome, double preco, String medico) {
        this.nome = nome;
        this.preco = preco;
        this.medico = medico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
}
