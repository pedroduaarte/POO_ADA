public class Calculadora {

    private float valor1;
    private float valor2;

    public float somar(float valor1, float valor2) {
        float resultado = valor1 + valor2;
        return resultado;
    }

    public float subtrair(float valor1, float valor2) {
        float resultado = valor1 - valor2;
        return resultado;
    }

    public float multiplicar(float valor1, float valor2) {
        float resultado = valor1 * valor2;
        return resultado;
    }

    public float dividir(float valor1, float valor2) {
        float resultado = valor1 / valor2;
        return resultado;
    }

}