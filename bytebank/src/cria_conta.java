public class cria_conta {
    public static void main(String[] args) 
    {

        conta PrimeiraConta = new conta(); // Intancia do Objeto conta() pelo comando new conta() e salva na memoria 'conta PrimeiraConta'
        PrimeiraConta.saldo = 200;         // Atribuição de valor no atributo saldo

        PrimeiraConta.saldo += 100;        // Somando 100 na instância Saldo da primeira conta
        
        conta SegundaConta = new conta();  // Intancia do Objeto conta() pelo comando new conta() e salva na memoria 'conta SegundaConta'
        SegundaConta.saldo = 50;

        System.out.println("primeira conta tem " + PrimeiraConta.saldo); // print do saldo da intancia do objeto 'Primeira Conta'
        System.out.println("segunda conta tem " + SegundaConta.saldo);   // print do saldo da intancia do objeto 'Segunda Conta'

    }
}
