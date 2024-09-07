package exe01;

import exe02.Funcionario;
import exe03.Retangulo;
import exe04.ContaCorrente;
import exe05.Calculadora;

public class main {
    public static void main(String[]arg){
        System.out.println( "\n" + "Exercicio 01 - Classe Produto");
        Produto produtoEx01 = new Produto();
        Produto produtoEx02 = new Produto("Notebook", 2.500, 2);
        produtoEx01.calcularValorEstoque();
        produtoEx02.adicionarEstoque(3);

        System.out.println( "\n" + "Exercicio 02 - Funcionario");
        Funcionario funcionarioEx01 = new Funcionario();
        Funcionario funcionarioEx02 = new Funcionario("Vinicius", 2.900, 8);
        funcionarioEx01.calcularSalarioMensal();
        funcionarioEx02.ajustarSalario(3.000);

        System.out.println( "\n" + "Exercicio 03 - Classe Retangulo");
        Retangulo retanguloEx01 = new Retangulo();
        Retangulo retanguloEx02 = new Retangulo(2.5, 1.2 );
        retanguloEx01.calcularArea();
        retanguloEx02.aumentarTamanho(5.0, 2.5);

        System.out.println( "\n" + "Exercicio 04 - Conta Corrente");
        ContaCorrente contaCorrenteEx01 = new ContaCorrente();
        ContaCorrente contaCorrenteEx02 = new ContaCorrente(0);
        contaCorrenteEx01.verificarSaldo();
        contaCorrenteEx02.depositar(50.5);

        System.out.println( "\n" + "Exercicio 05 - Calculadora");
        Calculadora calculadoraEx01 = new Calculadora();
        Calculadora calculadoraEx02 = new Calculadora(7.5);
        calculadoraEx01.obterResultado();
        calculadoraEx02.somar(5, 5);




    }
}
