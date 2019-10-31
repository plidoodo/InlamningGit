public class TestGuesser {

	public static void main(String[] args) {

		Guesser guesser = new Guesser(0, 1000);

		System.out.println(guesser);

		Guesser guesser2 = new Guesser(123, 972);

		System.out.println(guesser2);

		Guesser guesser3 = new Guesser(500, 0);

		System.out.println(guesser3);
	}

}
