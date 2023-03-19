package clinica;


import java.util.Scanner;

public class Principal {

    Scanner ler = new Scanner(System.in);

    static Paciente[] pacientes = new Paciente[99];
    static int numeroPaciente = 0;



    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Medico doutor1 = new Medico("Sergio", "0000", 12345678, 'm', 42, "Oftalmologia", 300.00, "sergio1", 4565);
        Medico doutor2 = new Medico("Pablo", "0010", 121212, 'm', 29, "clinico geral", 250.00, "minipablo", 2012);
        Medico doutora1 = new Medico("Ana", "0020", 343412, 'f', 32, "clinica geral", 275.00, "ana", 0612);

        Enfermeiro enfermeirum = new Enfermeiro("Rafael", 555522, 'm', 23, "rafa3l", 205);
        Enfermeiro enfermeira = new Enfermeiro("Julia", 777777, 'f', 25, "juL14", 9320);

        int k = 1;
        while (k < 2) {
            System.out.println("Tela de cadastro, digite 1 para cadastrar novo cliente ou 2 para pular: ");
            int criar = ler.nextInt();
            if (criar == 1) {
                Principal.criaPaciente();
            }
            k = criar;

        }



        for (int i = 0; i < numeroPaciente; i++) {
            System.out.println("Paciente " + i + " Nome: " + pacientes[i].getNome());
        }

        System.out.println("Digite o numero do paciente para realizar a consulta: ");
        int pacienteAtual = ler.nextInt();


        System.out.println("Escolha um medico\n digite\n 0 para Sergio\n 1 para Pablo\n2 para Ana");
        try {
            int medicor = ler.nextInt();
            if (medicor >= 2 && medicor <= 0) {
                throw new excecao();

            }

            if (medicor == 0) {
                doutor1.realizaConsulta(pacientes[pacienteAtual]);
            }
            if (medicor == 1) {
                doutor2.realizaConsulta(pacientes[pacienteAtual]);
            }
            if (medicor == 2) {
                doutora1.realizaConsulta(pacientes[pacienteAtual]);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Digite um para fazer o exame ou 2 para ver as despesas");
        int var = ler.nextInt();
        if (var == 1) {
            System.out.println("Digite 1 para o enfermeiro ou 2 para a enfermeira");
            int hy = ler.nextInt();
            if (hy == 1) {
                enfermeirum.realizaExame(pacientes[pacienteAtual]);
            }else{
                enfermeira.realizaExame(pacientes[pacienteAtual]);
            }

            }
            pacientes[pacienteAtual].pagarConsulta();


    }


        public static void criaPaciente() {
            Scanner ler = new Scanner(System.in);
            pacientes[numeroPaciente] = new Paciente();
            System.out.println("Digite o nome do paciente: ");
            pacientes[numeroPaciente].setNome(ler.next());
            System.out.println("Digite o telefone do paciente: ");
            pacientes[numeroPaciente].setTelefone(ler.nextInt());
            System.out.println("Digite a idade do paciente: ");
            pacientes[numeroPaciente].setIdade(ler.nextInt());
            System.out.println("Digite o genero com M ou F do paciente: ");
            pacientes[numeroPaciente].setGenero(ler.next().charAt(0));
            numeroPaciente++;
        }


    }




