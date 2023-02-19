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
    public void deposita(double valor)
    {
        this.saldo = this.saldo + valor; // use o this para referenciar o método em questão
    }
}