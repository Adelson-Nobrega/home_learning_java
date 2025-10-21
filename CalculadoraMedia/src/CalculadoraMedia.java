void main() {
    double nota1 = 5.5;
    double nota2 = 4.0;
    double media = (nota1 + nota2) / 2;

    if (media >= 7.0) {
        IO.println("Parabéns! Você foi aprovado com média " + media);
    } else if (media >= 5.0 && media < 7.0) {
        IO.println("Precisa estudar mais, foi pra recuperação com média " + media);
    } else {
        IO.println("Infelizmente você foi reprovado com média " + media);
    }
}
