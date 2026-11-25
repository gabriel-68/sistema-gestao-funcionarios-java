import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();

        colaboradores.add(new FuncionarioCLT("Mariana Costa", "111.222.333-44", "CLT-001", 4500.00, 850.00));
        colaboradores.add(new FuncionarioPJ("Rafael Mendes", "222.333.444-55", "PJ-010", 7200.00));
        colaboradores.add(new Estagiario("Lucas Oliveira", "333.444.555-66", "EST-102", 1500.00));
        colaboradores.add(new Aprendiz("Beatriz Santos", "444.555.666-77", "APR-205", 12.50, 80));
        colaboradores.add(new Consultor("Dr. Henrique Alves", "555.666.777-88", "CON-301", 180.00, 25));

        System.out.println("=== Relatório de Colaboradores e Capacidades ===\n");

        for (Colaborador c : colaboradores) {
            c.exibirInformacoes();

            if (c instanceof AcessoSistema) {
                ((AcessoSistema) c).acessarSistemaInterno();
            }

            if (c instanceof TrabalhoRemoto) {
                ((TrabalhoRemoto) c).trabalharRemotamente();
            }

            if (!(c instanceof AcessoSistema) && !(c instanceof TrabalhoRemoto)) {
                System.out.println(" -> Atuação exclusivamente presencial, sem acesso a sistemas internos.");
            }

            System.out.println();
        }
    }
}