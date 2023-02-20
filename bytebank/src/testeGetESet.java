public class testeGetESet
{
    public static void main(String[] args) 
    {
        // cria conta
        conta contaTeste = new conta(123,3455);
        contaTeste.setNumero(137);
        System.out.println(contaTeste.getNumero());
        // cria cliente
        cliente cliente1 = new cliente();
        cliente1.setNome("Mateus Marques");
        // Associa as classes
        contaTeste.setTitular(cliente1);
        System.out.println(contaTeste.getTitular().getNome());
        // seta var por chamadas de classes
        contaTeste.getTitular().setProfissao("Programador");
        System.out.println(contaTeste.getTitular().getProfissao());
    }
}
