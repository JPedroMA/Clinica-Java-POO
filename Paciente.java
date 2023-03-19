package clinica;

import java.util.Scanner;

public class Paciente extends pessoa{
    public static String author = " João Pedro Martins";
    Scanner ler = new Scanner(System.in);
    private String nome;
    private int Telefone;
    private char genero;
    private int idade;

    private Consulta consulta;
    private Consulta[] historicoMedico = new Consulta[5];

    public Paciente() {
    }

    public Paciente(String nome, int telefone, char genero, int idade) {
        this.nome = nome;
        Telefone = telefone;
        this.genero = genero;
        this.idade = idade;
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

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Consulta[] getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(Consulta[] historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void pagarConsulta(){
        Exame[] valor = consulta.getListaExame();
        double preco = consulta.getValor();
        System.out.println("Valor da consulta"+ consulta.getValor());
        for (Exame teste:valor ) {
            if(teste!=null){
                System.out.println("O exame "+teste.getNome()+"custa"+teste.getPreco());
                preco += teste.getPreco();
            }
        }
        System.out.println("O valor total foi"+ preco);

        
        System.out.printf("Você ja realizou pagou quantas consultas anteriores?");
        int pos = ler.nextInt();
        historicoMedico[pos] = consulta;
        consulta = new Consulta();

    }
}
