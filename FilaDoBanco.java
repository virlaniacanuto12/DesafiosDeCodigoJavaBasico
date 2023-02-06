import java.util.Scanner; 
 
public class FilaDoBanco { 
 
    public static void main(String[] args) { 
 
    String[] nomesFila = new String[3]; 
    Scanner nome = new Scanner(System.in); 

 //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:
    for (int i = 0; i < 3; i++){
      nomesFila[i]=nome.next();
    }
    int count = 0;
    for (int j = 0; j < 3; j++){
      count = j+1;
      System.out.println(nomesFila[j] + " - esta na posicao: " + count);
    }
  } 
}