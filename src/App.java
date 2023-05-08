import java.util.Scanner;

public class App {
   public String nome;
public String cpf;
public int idade;

public void main(String[] args) throws Exception {

      int idade;
      String nome, cpf;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Informe seu nome");
      nome = input.next();
      System.out.println("Informe seu CPF ");
      cpf = input.next();
      System.out.println("Informe sua idade");
      idade = input.nextInt();   
      input.close();   
      if (idade < 0 || idade > 120) {
         System.out.println("Idade Invalida");
      } else {
         System.out.println("Nome: " + nome + " CPF: " + cpf + " Idade: " + idade + " Anos");
      }

   }

public String nome(String nome) {
   return nome;
}

public String cpf(String cpf) {
    return cpf;
}

public int idade(int idade) {
    return idade;
}

}
