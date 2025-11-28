public class Gerente extends Funcionario {

    // 1. Atributo específico do Gerente
    private double bonus;

    // 2. Construtor da Subclasse
    public Gerente(String nome, String cpf, double salario, double bonus) {
        // 2a. A PRIMEIRA coisa a fazer é chamar o construtor da Superclasse
        // Usamos o 'super()' para passar os dados que o Funcionario precisa
        super(nome, cpf, salario);

        // 2b. Agora inicializamos o atributo específico desta classe
        this.bonus = bonus;
    }

    // 3. Método específico do Gerente
    public void aprovarProjeto() {
        System.out.println("Gerente " + getNome() + " aprovou o projeto."); // getNome() foi herdado!
    }

    // 4. Sobrescrevendo (@Override) um método da Superclasse
    // O Gerente tem um cálculo de salário diferente (salário base + bônus)
    @Override
    public double getSalario() {
        // Podemos acessar o salário base da classe mãe usando 'super.metodo()'
        // Ou acessamos 'this.salario' diretamente, pois ele é 'protected'
        // double salarioBase = super.getSalario(); 

        return this.salario + this.bonus;
    }
}