public class ContaInvestimento extends Conta{
    public ContaInvestimento(String titular)
    {super(titular);}
    @Override public void atualizarSaldo()
    {saldo = saldo* 1.02 - 5.0;
        System.out.println("Conta Investimento - Rendimento de 2% e taxa de R$ 5,00 aplicada para" + titular);

    }
}
