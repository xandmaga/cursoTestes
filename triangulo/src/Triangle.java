
public class Triangle {

	//	 Os 3 lados do triângulo
	public int a, b, c;
	public static final int EQUILATERO = 1;
	public static final int ISOSCELES = 2;
	public static final int ESCALENO = 3;
	public static final int INEXISTENTE = 4;
	
	
	public Triangle (int lado1, int lado2, int lado3) {
		a = lado1;
		b = lado2;
		c = lado3;
	}

	public int determineType( ) {
		
		int tipo = ESCALENO;
        if (a <= 0 || b <= 0 || c <= 0) {
            tipo = INEXISTENTE;
        } else
		    if (! (a + b > c && a + c > b && b + c > a)) {
	            tipo = INEXISTENTE;
		    } else
		        if (a == b) {
		            tipo = ISOSCELES;
	                if (b == c) {
                        tipo = EQUILATERO;
		            }
		        } else 
		            if (b == c || a == c) {
		                tipo = ISOSCELES;
		            }
	    return tipo;   
	}
}	
