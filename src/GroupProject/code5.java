package GroupProject;

public class code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1000, 2000, 30, 400, 50, 60, 70, 80 };

		int largest = num[0];
		int secondLargest = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > largest) {

				secondLargest = largest;
				largest = num[i];

			} else if (num[i] < largest && num[i] > secondLargest || largest == secondLargest) {
				secondLargest = num[i];
			}

		}
		System.out.println(secondLargest);

	}

}
