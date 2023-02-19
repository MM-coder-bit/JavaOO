public class testaMetodo { 
    public static void main(String[] args) 
    {
      conta contaDoMateus = new conta();        // cria método chamado conta do mateus
      contaDoMateus.saldo = 100;                // insira manualmente 100
      contaDoMateus.deposita(50);        // insira 50 pelo metodo deposita
      System.out.println(contaDoMateus.saldo); // Print
      boolean consegueSacar = contaDoMateus.saca(20); // saca 20 do método 'saca' e retorna um 'bool'

      System.out.println(contaDoMateus.saldo); // print novo saldo
      System.out.println(consegueSacar);       // print return do metodo saca
    }

  }
  
