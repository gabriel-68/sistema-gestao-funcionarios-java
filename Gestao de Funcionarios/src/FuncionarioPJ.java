public class FuncionarioPJ extends Colaborador implements AcessoSistema, TrabalhoRemoto {

    public FuncionarioPJ(String nome, String cpf, String matricula, double valorContrato) {
        super(nome, cpf, matricula, valorContrato);
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase();
    }

    @Override
    public void acessarSistemaInterno() {
        System.out.println(" -> " + getNome() + " (PJ) acessou os sistemas internos do projeto.");
    }

    @Override
    public void trabalharRemotamente() {
        System.out.println(" -> " + getNome() + " (PJ) está atuando remotamente conforme contrato.");
    }
}
