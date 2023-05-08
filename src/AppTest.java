

import org.junit.Test;
public class AppTest {
    
    @Test
      public void testeApp() {
      App app = new App();
      String nome = app.nome("Joao");
      String cpf = app.cpf("111.111.111-11");
      int idade = app.idade(20);
      System.out.println(nome+" " + cpf +" "+ idade);
      
    
}
    
}
