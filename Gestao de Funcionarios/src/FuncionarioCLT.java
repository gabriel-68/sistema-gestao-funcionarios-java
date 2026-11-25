public class FuncionarioCLT extends Colaborador implements AcessoSistema, TrabalhoRemoto {
    private double beneficios;

    public FuncionarioCLT(String nome, String cpf, String matricula, double salarioBase, double beneficios) {
        super(nome, cpf, matricula, salarioBase);
        this.beneficios = beneficios;
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase() + beneficios;
    }

    @Override
    public void acessarSistemaInterno() {
        System.out.println(" -> " + getNome() + " acessou o ERP e os sistemas internos da empresa.");
    }

    @Override
    public void trabalharRemotamente() {
        System.out.println(" -> " + getNome() + " está trabalhando em regime home office.");
    }
}
