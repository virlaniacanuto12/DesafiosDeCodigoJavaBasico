
import java.util.*;
 
public class PercentualDeDesconto{
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    
    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
    int desconto = M - S;
    int multiplicacao = desconto * 100;
    int resultadoPorcentagem = multiplicacao / M;
     
    System.out.println("O desconto foi de " + resultadoPorcentagem + "%");

    }
}