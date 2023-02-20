public class testa_classe 
{
    public static void main(String[] args) 
    {
        // populando a classe cliente()
        cliente mateus = new cliente();
        mateus.nome = "Mateus Marques";
        mateus.cpf = "444.444.444-44";
        mateus.profissao = "Programador";

        // adicionando 100 no atributo deposita
        conta conta_do_mateus = new conta();
        conta_do_mateus.deposita(100);

        // a conta_do_mateus recebe no titular ->
        // toda as informações setadas na class cliente()
        // tanto a conta_do_mateus() e mateus() estão no mesmo endereço de memória
        conta_do_mateus.titular = mateus; 

        // Print do atributo titular do método conta()->
        // composto pelo atributo nome do método cliente()
        System.out.println(conta_do_mateus.titular.nome); 
        System.out.println(conta_do_mateus.titular.cpf); 
        System.out.println(conta_do_mateus.titular.profissao); 
    }   
}
