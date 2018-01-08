import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

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
        System.out.println(this.answers.get(1));
        return this.answers.get(1);
    }
}
