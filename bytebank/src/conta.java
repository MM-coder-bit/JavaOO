/**
 * conta
 */

 // esta conta possui 4 atributos
public class conta
{
    double saldo;
    int agencia;
    int numero;
    String titular;  
    
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

}