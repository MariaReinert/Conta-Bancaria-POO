public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println(titular + "Depositou R$" + valor);
        else
            System.out.println("Valor de depósito inválido");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println(titular + "Sacou R$" + valor);
            return true;
        }
        System.out.println("Saldo insuficiente para sacar de R$" + valor);
        return false;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo:R$%.2f\n",saldo);
    }
    public abstract void atualizarSaldo();


}



