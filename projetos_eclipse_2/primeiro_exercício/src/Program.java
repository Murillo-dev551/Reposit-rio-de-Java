import java.util.Scanner;

void main() {
	Scanner sc = new Scanner (System.in);
	
	int x, y;
	int resultado;
	
	x = sc.nextInt();
	y = sc.nextInt();
	
	resultado = x + y;
	
	System.out.println("SOMA = " + resultado);
	
	sc.close();
}