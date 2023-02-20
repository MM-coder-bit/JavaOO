public class cria_conta {
    public static void main(String[] args) 
    {

        conta PrimeiraConta = new conta(122,1332); // Intancia do Objeto conta() pelo comando new conta() e salva na memoria 'conta PrimeiraConta'
        PrimeiraConta.deposita(200);         // Atribuição de valor no atributo saldo

        PrimeiraConta.deposita(500);        // Somando 100 na instância Saldo da primeira conta
        
        conta SegundaConta = new conta(123,1334);  // Intancia do Objeto conta() pelo comando new conta() e salva na memoria 'conta SegundaConta'
        SegundaConta.deposita(20);

        System.out.println("primeira conta tem " + PrimeiraConta.getSaldo()); // print do saldo da intancia do objeto 'Primeira Conta'
        System.out.println("segunda conta tem " + SegundaConta.getSaldo());   // print do saldo da intancia do objeto 'Segunda Conta'

    }
}
