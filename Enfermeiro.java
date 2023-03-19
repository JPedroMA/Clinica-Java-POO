package clinica;

public class Enfermeiro extends pessoa{

    public static String author = " João Pedro Martins";
    private String nome;
    private int Telefone;
    private char genero;
    private int idade;
    private String user;
    private int senha;

    public Enfermeiro() {
    }



    public Enfermeiro(String nome, int telefone, char genero, int idade, String user, int senha) {
        this.nome = nome;
        Telefone = telefone;
        this.genero = genero;
        this.idade = idade;
        this.user = user;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void realizaExame(Paciente paciente){
        System.out.println("O enfermeiro de nome: "+getNome()+" realizou o(s) exame(s)"+
                paciente.getConsulta().getListaExame()+" no paciente "+paciente.getNome());

    }

}
