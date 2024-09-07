package exe05;

public class Calculadora {
    private double resultado;

    public Calculadora(){
        this.resultado = 15.9;
    }
    public Calculadora(double resultado){
        this.resultado = resultado;
    }
    public double obterResultado(){
        System.out.println( "O resultado é : " + this.resultado);
        return this.resultado;
    }
    public double somar( double num1, double num2){
        this.resultado = num1 + num2;
        System.out.println( "A soma dos dois numeros é : " + this.resultado);
        return this.resultado;
    }
}
