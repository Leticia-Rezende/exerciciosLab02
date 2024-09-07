package exe04;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(){
        this.saldo = 0;
    }
    public ContaCorrente( double saldo){
        this.saldo = saldo;
    }
    public double verificarSaldo(){
        System.out.println( "O saldo disponível é de : " + this.saldo);
        return this.saldo;
    }
    public double depositar( double qtdDepositar){
        this.saldo = this.saldo + qtdDepositar;
        System.out.println( "O novo saldo é de : " + saldo);
        return this.saldo;
    }
}
