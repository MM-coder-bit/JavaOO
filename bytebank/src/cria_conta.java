public class cria_conta {
    public static void main(String[] args) 
    {
        conta PrimeiraConta = new conta();       // Intancia do Objeto conta()
        PrimeiraConta.saldo = 200;               // Atribuição de valor no atributo saldo
        System.out.println(PrimeiraConta.saldo); // print do saldo da intancia do objeto 'Primeira Conta'
    }
}
