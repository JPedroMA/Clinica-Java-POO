package clinica;

import java.util.Scanner;

public class Medico extends pessoa{
    Scanner ler = new Scanner(System.in);

    public static String author = " João Pedro Martins";
    private String nome;
    private String crm;//ou int//
    private int telefone;
    private char genero;
    private int idade;
    private String especialidade;
    private double precoConsulta;
    private String user;
    private int senha;



    public Medico() {
    }




    public Medico(String nome, String crm, int telefone, char genero, int idade, String especialidade, double precoConsulta, String user, int senha) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
        this.especialidade = especialidade;
        this.precoConsulta = precoConsulta;
        this.user = user;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getPrecoConsulta() {
        return precoConsulta;
    }

    public void setPrecoConsulta(double precoConsulta) {
        this.precoConsulta = precoConsulta;
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


    public void realizaConsulta(Paciente paciente) {
        System.out.println("Dr."+getNome()+" de especialidade: "+getEspecialidade()+" está atendendo o paciente: "+ paciente.getNome());
        Consulta consultaTeste = new Consulta();
        consultaTeste.setValor(getPrecoConsulta());
        System.out.println("--> Você já fez quantos exames: <--");
        int num = ler.nextInt();
        Exame teste = new Exame();
        teste.setNome("Exame relacionado à area de "+getEspecialidade());
        teste.setPreco(70.5d);
        teste.setMedico(nome);
        consultaTeste.setListaExame(num, teste);
        consultaTeste.setValor(precoConsulta);
        paciente.setConsulta(consultaTeste);
    }



}