package Common;

import java.util.ArrayList;

public class Form {
    boolean setAnswersVisible = false;
    private int maxAnserwsForQuestion;
    private int numOfQuestions;
    private String[] questions;
    private String[][] possibleAnswers;
    private ArrayList<String>[] fullAnsewrs;

    public Form(int maxAnserwsForQuestion, int numOfQuestions) {
        this.maxAnserwsForQuestion = maxAnserwsForQuestion;
        this.numOfQuestions = numOfQuestions;
    }

    public int getMaxAnserwsForQuestion() {
        return maxAnserwsForQuestion;
    }

    public int getNumOfQuestions() {
        return numOfQuestions;
    }

    public boolean isSetAnswersVisible() {
        return setAnswersVisible;
    }

    public void setSetAnswersVisible(boolean setAnswersVisible) {
        this.setAnswersVisible = setAnswersVisible;
    }

    public String getQuestion(int num) {
        return questions[num];
    }
    public String[] getPossibleAnswers(int num) {
        return possibleAnswers[num];
    }
    public ArrayList<String> getfullAnsewrs(int num) {
        return fullAnsewrs[num];
    }
}
