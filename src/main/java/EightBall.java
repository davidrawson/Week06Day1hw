import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EightBall {

    private ArrayList<String> answers;
    Scanner userInput = new Scanner(System.in);


    public EightBall(){
        this.answers = new ArrayList<>();
    }

    public void addAnswer(String answer){
        this.answers.add(answer);
    }

    public int getAnswerCount() {
        return this.answers.size();
    }

    public String getRandomAnswer(){
        Collections.shuffle(this.answers);
        System.out.println(this.answers.get(0));
        return this.answers.get(0);
    }

    public void addUserAnswer(){
        System.out.println("Enter your Eight Ball answer: ");
        String answer = userInput.nextLine();
        addAnswer(answer);
    }
}
