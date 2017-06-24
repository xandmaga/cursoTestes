
public class calculator {
	   
	   private static int result;//atributo estático que guarda o resultado
	   
	   public void add(int n) {
	      result = result + n;
	   }
	   
	   public void subtract(int n) {
		  result = result - n;              
	   }
	   
	   public void multiply(int n) {
	      result = result * n;
	   }
	   
	   public void divide(int n) {
		  result = result / n;
	   }
	   
	   public void square(int n) {
	      result = n * n;
	   }
	   
	   public void clear() {               
		  result = 0;
	   }
	   
	   public void switchOn() {// Liga a tela
		   result = 0;                    
	   }
		
	   public void switchOff(){// Desliga a tela
	   }
		
	   public int getResult() {
	       return result;    
	   }
}

