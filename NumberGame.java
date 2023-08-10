import java.util.Scanner;

public class NumberGame {

    public static void guessNum() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());

        int K = 10;
        int i, guess;
        System.out.println(
                "A number is choosen"
                        + "beetwen 1 to 100. " + "Guess the number "
                        + "within 10 trails.");

        for (i = 0; i < K; i++) {
            System.out.println("Guess the number: ");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Greate 💥🎉" + "You gussed the correct number.");
                break;
            } else if (number > guess && i != K - 1) {
                System.out.println("Ohoo! ❌" + "try a greater number greater than " + guess);
            } else if (number < guess && i != K - 1) {
                System.out.println("Ohoo! ❌" + "try a smaller number greater than " + guess);
            }

        }
        if (i == K) {
            System.out.println("You didn't guess it right....😒");
            System.out.println("Number was.... " + number);
        }
        System.out.println("do you want to play again??");
        char replay=sc.next().charAt(0);
        if(replay=='y' || replay=='Y'){
            guessNum();
        }else{
            return;
        }
    }

    public static void main(String[] args) {
        guessNum();
    }
}