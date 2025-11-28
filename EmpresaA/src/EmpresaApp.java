void main() {
        // Criando um funcionário comum
        Funcionario f1 = new Funcionario("Ana", "111.222.333-44", 3000.00);

        // Criando um gerente
        Gerente g1 = new Gerente("Carlos", "555.666.777-88", 8000.00, 2500.00);

        System.out.println("--- Funcionário ---");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário: " + f1.getSalario());
        f1.baterPonto();

        System.out.println("\n--- Gerente ---");
        System.out.println("Nome: " + g1.getNome()); // Método herdado de Funcionario
        System.out.println("Salário: " + g1.getSalario()); // Método SOBRESCRITO (@Override)
        g1.baterPonto();        // Método herdado de Funcionario
        g1.aprovarProjeto(); // Método específico de Gerente
}
