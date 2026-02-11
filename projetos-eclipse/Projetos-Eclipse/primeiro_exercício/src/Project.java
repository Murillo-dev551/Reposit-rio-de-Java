import java.util.Scanner;

void main() {
	Scanner sc = new Scanner (System.in);
	
	int x, y;
	
	x = sc.nextInt();
	y = sc.nextInt();
	int soma = x + y;
	
	System.out.println("SOMA = " + soma);
	
	sc.close();
}