public class testeSacaNegativo { 
    public static void main(String[] args) 
    {
        // Tentativa de sacar valor maior que o saldo
        conta conta = new conta(122,9878);
        conta.deposita(100);
        System.out.println(conta.saca(101)); // retorna True pra OK e False para NOK

        conta.saca(101);

        System.out.println(conta.getSaldo()); // Saldo Atual
    }
}
