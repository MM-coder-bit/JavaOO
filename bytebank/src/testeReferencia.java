public class testeReferencia 
{ 
    public static void main(String[] args) 
    {
        conta primeiraConta = new conta(1009,5673);  // Cria um objeto
        primeiraConta.deposita(300);        // Altera o parametro saldo

        System.out.println("saldo da primeira: " + primeiraConta.getSaldo());

        conta segundaConta = primeiraConta; // COPIA A REFERÊNCIA DA PRIMEIRA CONTA

        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.deposita(100); 

        // Os dois próximos print mostra que quando se altera o valor da segunda conta 
        // a primeira conta altera tambem, devido ao fato de estarem na mesma referencia
        System.out.println("saldo da segunda conta " + segundaConta.getSaldo()); 
        System.out.println("saldo agora da primeira conta " + primeiraConta.getSaldo());

        // maneira de provar isso é realizar essa comparação:
        if(primeiraConta == segundaConta) 
        {
            System.out.println("e a mesma conta");                
        }

        System.out.println("endereço da primeira conta:" + primeiraConta);
        System.out.println("endereço da segunda conta:" +segundaConta);                            
    }
}
