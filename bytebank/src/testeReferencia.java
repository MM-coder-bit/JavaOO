public class testeReferencia 
{ 
    public static void main(String[] args) 
    {
        conta primeiraConta = new conta();  // Cria um objeto
        primeiraConta.saldo = 300;          // Altera o parametro saldo

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        conta segundaConta = primeiraConta; // COPIA A REFERÊNCIA DA PRIMEIRA CONTA

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;

        // Os dois próximos print mostra que quando se altera o valor da segunda conta 
        // a primeira conta altera tambem, devido ao fato de estarem na mesma referencia
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 
        System.out.println("saldo agora da primeira conta " + primeiraConta.saldo);

        // maneira de provar isso é realizar essa comparação:
        if(primeiraConta == segundaConta) 
        {
            System.out.println("e a mesma conta");                
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);                            
    }
}
