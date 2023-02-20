public class testaMetodo { 
    public static void main(String[] args) 
    {
      // --------------- Deposita ------------------ //
      conta contaDoMateus = new conta(1244,456);        // cria método chamado conta do mateus
      contaDoMateus.deposita(100);                // insira manualmente 100
      contaDoMateus.deposita(50);        // insira 50 pelo metodo deposita
      System.out.println(contaDoMateus.getSaldo()); // Print
      
      // --------------- Saca ------------------ //
      boolean consegueSacar = contaDoMateus.saca(20); // saca 20 do método 'saca' e retorna um 'bool'
      System.out.println(contaDoMateus.getSaldo()); // print novo saldo
      System.out.println(consegueSacar);       // print return do metodo saca
    
      conta contaDaMarcela = new conta(1389,234);      // Criado método chamado conta Marcela
      contaDaMarcela.deposita(1000);    // Deposita 1000 na conta

      // --------------- Transfere  ------------------ //
      // Este método retorna um bool, onde o resultado é true se é possivel transferir e falso se não
      boolean sucessoTransferencia = contaDaMarcela.transfere(1222, contaDoMateus);
      
      if(sucessoTransferencia) 
      {
        System.out.println("transferencia com sucesso");
      } else 
      {
        System.out.println("faltou dinheiro");
      }

      // Printa dos saldos das contas
      System.out.println(contaDaMarcela.getSaldo());
      System.out.println(contaDoMateus.getSaldo());
    }

  }
  
