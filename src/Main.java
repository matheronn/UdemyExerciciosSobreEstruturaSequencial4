import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero do funcionario: ");
		int num = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: ");
		double val = sc.nextDouble();

		double salario = val * horas;

		System.out.println();
		System.out.println("Number: " + num);
		System.out.printf("Salary: %.2f%n", salario);

		sc.close();

	}
}
