public class Funcionario {

    private String nome;
    private String cpf;
    protected double salario; // 'protected' é visível para as classes filhas

    // Construtor da Superclasse
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Método que será usado por todos
    public String getNome() {
        return this.nome;
    }

    // Método que será herdado
    public double getSalario() {
        return this.salario;
    }

    public void baterPonto() {
        System.out.println("Funcionário " + this.nome + " bateu o ponto.");
    }
}
