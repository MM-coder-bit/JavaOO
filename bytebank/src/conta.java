/**
 * conta
 */

 // esta conta possui 4 atributos
public class conta
{
    private double saldo; // atributo privado
    private int agencia;
    private int numero;
    private cliente titular;  // a definição vem da classe cliente() - uma classe chamando outra
    private static int total; // variavel da classe e não do objeto, 'static = da Classe'

    //------------------------------------------------------------------------------------------------//
    // Construtor
    // rotina de inicialização
    public conta(int agencia, int numero) // obriga que na construção do objeto seja incluida a ag. e conta.
    {
        conta.total++; // incrementa toda vez que a classe conta() é criada
        //System.out.println("O total de contas abertas são:" + conta.total);
        this.agencia = agencia; // recebendo do construtor e enviando para ESTE(this) objeto.
        this.numero = numero;
        System.out.println("Agencia:" + this.agencia + '\n' + "Numero:" + this.numero);
    }
    //------------------------------------------------------------------------------------------------//
    // Método deposita
    // Função que atribui o valor no 'saldo' da classe principal 
    // quando o método tem o void, significa que não tem retorno
    public void deposita(double valor)
    {
        this.saldo += valor; // use o this para referenciar o método em questão
    }

    // Método Saca
    public boolean saca(double valor)
    {
        if (this.saldo >= valor) // Valor é menor que saldo?
        {
            this.saldo -= valor; // decrementa do saldo
            return true;    
        }else
        {
            return false;
        }
    }

    // Método transfere
    // recebe valor e variavel da conta destino
    public boolean transfere(double valor,conta destino)
    {
        if (this.saldo >= valor)
        {
            this.saldo -= valor;
            destino.deposita(valor); // chama método deposita()
            return true;
        }
        return false;
    }

    // Retorna saldo
    // Get()
    public double getSaldo()
    {
        return this.saldo;
    }
    //-----------------------------------------//
    // Numero da conta
    // Get()
    public int getNumero()
    {
        return this.numero;
    }
    // Set()
    public void setNumero(int Numero)
    {
        this.numero = Numero;
    }
    //-----------------------------------------//
    // Numero da agência
    // Get()
    public int getAgencia()
    {
        return this.agencia;
    }
    //Set()
    public void setAgencia(int agencia) 
    {
        this.agencia = agencia;
    }
    //-----------------------------------------//
    // Nome do Titular
    // Get()
    public cliente getTitular() 
    {
        return titular;
    }
    // Set()
    public void setTitular(cliente titular) 
    {
        this.titular = titular;
    }

    //-----------------------------------------//
    // Quantidade de contas existentes
    // Get() da classe
    // entre grande ASPAS "" o static seria um var global
    public static int getTotal()
    {
        return conta.total;
    }
}