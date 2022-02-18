package GroupProject;

public class code9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20;
		boolean isPrime = true;
		if (number > 1) {

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			isPrime = false;
		}

		if (isPrime) {
			System.out.println(number + " is prime ");
		} else {
			System.out.println(number + " is not prime ");
		}

	}

}
