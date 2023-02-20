public class cliente 
{
    private String nome;
    private String cpf;
    private String profissao;

    // --------- Get e Set do nome --------- //
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    // --------- Get e Set do CPF --------- //
    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    // --------- Get e Set da profissão --------- //
    public String getProfissao() 
    {
        return profissao;
    }

    public void setProfissao(String profissao) 
    {
        this.profissao = profissao;
    }
}
