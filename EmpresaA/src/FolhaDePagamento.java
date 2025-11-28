void main() {
    // Criamos uma LISTA de... FUNCIONÁRIOS!
    List<Funcionario> funcionariosDaEmpresa = new ArrayList<>();

    // Agora podemos adicionar QUALQUER classe que "É-UM" Funcionario
    funcionariosDaEmpresa.add(new Funcionario("Ana", "111...", 3000.0));
    funcionariosDaEmpresa.add(new Funcionario("Bruno", "222...", 3200.0));
    funcionariosDaEmpresa.add(new Gerente("Carlos", "555...", 8000.0, 2500.0));

    double custoTotalFolha = 0.0;

    // Aqui está o poder do Polimorfismo:
    // O loop não precisa saber se o 'f' é um Gerente, um Diretor ou um Funcionario.
    // Ele simplesmente trata todos como 'Funcionario' e chama 'getSalario()'.
    for (Funcionario f : funcionariosDaEmpresa) {

        IO.println("Processando salário de: " + f.getNome());

        // A JVM se encarrega de chamar o método getSalario() CORRETO
        // (o do Gerente se for Gerente, o do Funcionario se for Funcionario).
        custoTotalFolha += f.getSalario();
    }

    IO.println("\nCusto total da folha de pagamento: R$" + custoTotalFolha);

    for (Funcionario f : funcionariosDaEmpresa) {

        // 1. Verificando o tipo em tempo de execução
        if (f instanceof Gerente) {

            IO.println(f.getNome() + " é um Gerente!");

            // 2. Fazendo o "Casting"
            // Dizendo ao compilador: "Trate esta referência 'f' como um Gerente"
            //Gerente g = (Gerente) f;

            // 3. Agora sim, podemos chamar o método específico
            ((Gerente) f).aprovarProjeto();
        }
    }

// Nota: A partir do Java 16, isso foi simplificado (Pattern Matching):
// if (f instanceof Gerente g) {
//     g.aprovarProjeto();
// }
// Mas é fundamental entender o casting manual primeiro.
}