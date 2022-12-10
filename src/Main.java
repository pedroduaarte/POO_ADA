public class Main {
    public static void main(String[] args) {
        //Calculadora
        Calculadora calculadora = new Calculadora();
        float soma = calculadora.somar(5, 6);
        float subtracao = calculadora.subtrair(5, 6);
        float multiplicacao = calculadora.multiplicar(5, 6);
        float divisao = calculadora.dividir(5, 6);

        System.out.printf("Soma: %f, Subtração: %f, Multiplicação: %f, Divisão: %f\n", soma, subtracao, multiplicacao, divisao);

        // Número Par
        NumeroPar numeroPar = new NumeroPar();
        numeroPar.numero = 7;
        numeroPar.numeroPar();
    }
}
