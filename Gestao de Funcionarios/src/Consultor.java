public class Consultor extends Colaborador implements TrabalhoRemoto {
    private int horasConsultoria;

    public Consultor(String nome, String cpf, String matricula, double valorHoraConsultoria, int horasConsultoria) {
        super(nome, cpf, matricula, valorHoraConsultoria);
        this.horasConsultoria = horasConsultoria;
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase() * horasConsultoria;
    }

    @Override
    public void trabalharRemotamente() {
        System.out.println(" -> " + getNome() + " (Consultor) está prestando consultoria externa remotamente.");
    }
}
