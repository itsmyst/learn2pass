import java.io.*;
import java.util.LinkedList;

public class Learn2PassBL {
    private LinkedList<Question> questions = new LinkedList<>();

    public void load() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(new File("src\\ccna.csv")));
        String line = br.readLine();

        while((line = br.readLine()) != null){
            questions.add(new Question(line));
        }
        br.close();
    }
}
