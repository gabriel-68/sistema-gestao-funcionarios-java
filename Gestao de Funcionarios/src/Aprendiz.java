public class Aprendiz extends Colaborador {
    private int horasTrabalhadas;

    public Aprendiz(String nome, String cpf, String matricula, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, matricula, valorHora);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase() * horasTrabalhadas;
    }
}
