import java.util.Scanner;

void main() {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
	double raio = sc.nextDouble();
	double pi = 3.14159;
	double area = pi*raio*raio;
	
	System.out.printf("A = %.2f%n", area);
	
	sc.close();
}