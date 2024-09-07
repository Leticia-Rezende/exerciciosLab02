package exe03;

public class Retangulo {
    private double largura;
    private double altura;
    private double area;

    public Retangulo(){
        this.largura = 2.5;
        this.altura = 1.2;
    }
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public double calcularArea(){
        System.out.println( "A area total é: " + this.largura*altura);
        return this.largura;
    }
    public double aumentarTamanho(double novaLargura, double novaAltura){
        this.altura =this.altura * this.largura;
        this.area = novaLargura*novaAltura;
        System.out.println( "A nova area total é: " + this.area);
        return this.area;
    }

}
