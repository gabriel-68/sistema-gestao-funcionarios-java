public abstract class Colaborador {
    private String nome;
    private String cpf;
    private String matricula;
    private double remuneracaoBase;

    public Colaborador(String nome, String cpf, String matricula, double remuneracaoBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.remuneracaoBase = remuneracaoBase;
    }

    public abstract double calcularRemuneracao();

    public void exibirInformacoes() {
        System.out.printf("[%s] Matrícula: %s | Nome: %s | CPF: %s | Remuneração: R$ %.2f%n",
                getClass().getSimpleName(), matricula, nome, cpf, calcularRemuneracao());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getRemuneracaoBase() {
        return remuneracaoBase;
    }
}
