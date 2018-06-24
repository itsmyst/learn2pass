public class Question {
    private String [] answers = new String[6];
    private String[] correct = new String[3];
    private String question;

    public Question (String line){
        String[] q = line.split(",");
        int count = 0; //Counts how many answers

        question = q[2];
        answers[0] = q[3];
        answers[1] = q[4];
        answers[2] = q[5];
        answers[3] = q[6];
        answers[4] = q[7];
        answers[5] = q[8];

        for(int i = 0; i < answers.length; i++){
            if(answers[i].endsWith("*")){
                correct[count] = answers[i]; //Adds the correct answers
                count++;
            }
        }
    } //Kein Ahnung ob das alles stimmt, weil ich das programm nicht ausführen und testen kann xD!
}
