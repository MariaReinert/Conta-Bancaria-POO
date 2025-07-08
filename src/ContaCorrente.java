public class ContaCorrente extends Conta{
    public ContaCorrente(String titular)
    {super(titular);}
    @Override public void atualizarSaldo() {
        saldo +=1.01;
        System.out.println("Conta Poupança - Rendimento de 1% aplicado para" + titular);
    }
}
