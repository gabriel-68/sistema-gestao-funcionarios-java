public class Estagiario extends Colaborador implements AcessoSistema {

    public Estagiario(String nome, String cpf, String matricula, double bolsaAuxilio) {
        super(nome, cpf, matricula, bolsaAuxilio);
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase();
    }

    @Override
    public void acessarSistemaInterno() {
        System.out.println(" -> " + getNome() + " (Estagiário) acessou o sistema interno com perfil supervisionado.");
    }
}
