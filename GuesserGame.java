public class GuesserGame {

	public static void main(String[] args) {

    int ilow = Integer.parseInt(args[0]);
    int ihigh = Integer.parseInt(args[1]);

    Guesser guesser = new Guesser(ilow, ihigh);


			guesser.start();

      System.exit(0);

	}

}
