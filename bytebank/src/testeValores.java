public class testeValores 
{
    public static void main(String[] args) 
    {
        int varAgencia = 122;
        int varNumero = 1011;
        //------------------- = invocando o contrutor conta()
        conta contaConstrutor =  new conta(varAgencia,varNumero); 
        
        System.out.println(contaConstrutor.getAgencia());
        
    }
}
