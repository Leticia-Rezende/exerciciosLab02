package exe02;

public class Funcionario {
    private String nome;
    private double salario;
    private int horasTrabalhadas;

    //Construtor sem parametro
    public Funcionario(){
        this.nome = "Vinicius";
        this.salario = 2.900;
        this.horasTrabalhadas = 8;
    }
    public Funcionario(String nome, double salario, int horasTrabalhadas){
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double calcularSalarioMensal(){
        System.out.println( "O salario mensal é : " + this.salario*horasTrabalhadas);
        return this.salario;
    }
    public double ajustarSalario(double novoSalarioAjustado){
        this.salario = this.salario*0.30;
        this.salario = this.salario + novoSalarioAjustado;
        System.out.println( "O salario ajustado com 30% é : " + this.salario);
        return this.salario;
    }
}
