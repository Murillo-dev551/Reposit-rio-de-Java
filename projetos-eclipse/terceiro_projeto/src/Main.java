import java.util.Locale;

void main() {
	
	Locale.setDefault(Locale.US);
	double x = 10.504910392;
	
	System.out.printf("%.5f%n", x);
	IO.println("weqe");
	IO.println("Olá");	
	
	System.out.printf("%.1f%n", x);
	
	System.out.println("Resultado " + x + " metros.");
}