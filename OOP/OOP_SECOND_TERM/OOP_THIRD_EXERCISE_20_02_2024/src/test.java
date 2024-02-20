import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Въведете число: ");
			number = scanner.nextInt();
			System.out.println(divideMethod(100, number));

		} catch (InputMismatchException e) {
			System.err.println("Моля, въведете число!");

		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public static int divideMethod(int a, int b) throws  ArithmeticException, Exception {
		if (b == 0) {
			throw new ArithmeticException("Делите на 0!");
		} else {
			return a / b;
		}
	}

}
