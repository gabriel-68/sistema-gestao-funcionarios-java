Sistema de Gestão de Funcionários em JavaAplicação desenvolvida em Java para praticar a modelagem orientada a objetos utilizando Abstração, Herança, Interfaces e Polimorfismo, simulando o cadastro, o cálculo de remuneração e o controle de capacidades operacionais de diferentes perfis de colaboradores.Sobre o ProjetoO sistema modela uma hierarquia de colaboradores a partir da superclasse abstrata Colaborador, que centraliza atributos e comportamentos comuns, combinada com interfaces específicas (AcessoSistema e TrabalhoRemoto) para atribuir capacidades opcionais conforme o vínculo de cada profissional.Regras de Negócio e Capacidades por PerfilPerfilClasseAcesso InternoTrabalho RemotoRegra de RemuneraçãoFuncionário CLTFuncionarioCLT.Salário base + benefíciosFuncionário PJFuncionarioPJ.Valor fixo estabelecido em contratoEstagiárioEstagiario.Bolsa-auxílio fixaAprendizAprendiz.Valor por hora × horas trabalhadasConsultor (Extra)Consultor.Valor da hora técnica × horas de consultoria.Conceitos de POO AplicadosAbstração: Uso da classe abstract class Colaborador e do método abstrato calcularRemuneracao().Herança: Reaproveitamento de dados comuns (nome, cpf, matricula e remuneracaoBase) nas subclasses via extends e super().Interfaces: Segregação das capacidades AcessoSistema e TrabalhoRemoto, permitindo que cada classe implemente apenas as permissões compatíveis com sua função.Polimorfismo: Sobrescrita de métodos (@Override) para o cálculo salarial e manipulação uniforme dos colaboradores em uma coleção List<Colaborador>.Princípio Aberto-Fechado (OCP): Inclusão da classe Consultor sem necessidade de alterar o código das classes já existentes.Por que combinar Herança e Interfaces?Herança (Colaborador): Representa a relação "é um", eliminando duplicação de código para atributos e comportamentos compartilhados por todos os integrantes da empresa.Interfaces (AcessoSistema e TrabalhoRemoto): Representam a relação "pode fazer", contornando a ausência de herança múltipla de classes em Java e evitando que perfis como Aprendiz herdem permissões que não possuem.📁 Estrutura de Arquivos├── AcessoSistema.java      # Interface para acesso aos sistemas internos
├── TrabalhoRemoto.java     # Interface para autorização de trabalho remoto
├── Colaborador.java        # Superclasse abstrata com atributos e métodos comuns
├── FuncionarioCLT.java     # Subclasse para colaboradores CLT
├── FuncionarioPJ.java      # Subclasse para prestadores PJ
├── Estagiario.java         # Subclasse para estagiários
├── Aprendiz.java           # Subclasse para jovens aprendizes
├── Consultor.java          # Subclasse do desafio extra (consultoria externa)
└── Main.java               # Classe principal para execução e demonstração
 Como Executar o ProjetoPré-requisitosJava JDK (versão 11 ou superior) instalado na máquina.
Acesse a pasta do projeto:cd sistema-gestao-funcionarios-java
Compile os arquivos Java:javac *.java
Execute a classe principal:java Main
Exemplo de Saída=== Relatório de Colaboradores e Capacidades ===

[FuncionarioCLT] Matrícula: CLT-001 | Nome: Mariana Costa | CPF: 111.222.333-44 | Remuneração: R$ 5350,00
 -> Mariana Costa acessou o ERP e os sistemas internos da empresa.
 -> Mariana Costa está trabalhando em regime home office.

[FuncionarioPJ] Matrícula: PJ-010 | Nome: Rafael Mendes | CPF: 222.333.444-55 | Remuneração: R$ 7200,00
 -> Rafael Mendes (PJ) acessou os sistemas internos do projeto.
 -> Rafael Mendes (PJ) está atuando remotamente conforme contrato.

[Estagiario] Matrícula: EST-102 | Nome: Lucas Oliveira | CPF: 333.444.555-66 | Remuneração: R$ 1500,00
 -> Lucas Oliveira (Estagiário) acessou o sistema interno com perfil supervisionado.

[Aprendiz] Matrícula: APR-205 | Nome: Beatriz Santos | CPF: 444.555.666-77 | Remuneração: R$ 1000,00
 -> Atuação exclusivamente presencial, sem acesso a sistemas internos.

[Consultor] Matrícula: CON-301 | Nome: Dr. Henrique Alves | CPF: 555.666.777-88 | Remuneração: R$ 4500,00
 -> Dr. Henrique Alves (Consultor) está prestando consultoria externa remotamente.
