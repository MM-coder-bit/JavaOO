import java.util.Random;
public class testeValores 
{
    public static void main(String[] args) 
    {
        int varAgencia = 122;
        int varNumero = 1011;
        Random r_varNumero = new Random();
        //------------------- = invocando o contrutor conta()
        conta contaConstrutor =  new conta(varAgencia,varNumero); 
        
        System.out.println(contaConstrutor.getAgencia());
        conta contaConstrutor2 =  new conta(varAgencia,r_varNumero.nextInt(1000));
        conta contaConstrutor3 =  new conta(varAgencia,(r_varNumero.nextInt(1000) + 100));
        
        System.out.println("Total de contas: " + conta.getTotal());
    }
}
