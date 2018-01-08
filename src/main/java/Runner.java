public class Runner {

    public static void main(String[] args) {
        EightBall eightBall = new EightBall();
        eightBall.addUserAnswer();
        System.out.println(eightBall.getRandomAnswer());
    }
}
