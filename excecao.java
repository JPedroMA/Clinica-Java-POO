package clinica;

public class excecao extends RuntimeException {
    public excecao() {
        super("O valor está fora do limite");
    }
}
