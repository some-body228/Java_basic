public class Questions {
    private String[] questions;

    private String[][] answerOptions;

    private int[] rightQuestion;

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public void setAnswerOptions(String[][] answerOptions) {
        this.answerOptions = answerOptions;
    }

    public void setRightQuestion(int[] rightQuestion) {
        this.rightQuestion = rightQuestion;
    }

    public String[] getQuestions() {
        return questions;
    }

    public String[][] getAnswerOptions() {
        return answerOptions;
    }

    public int[] getRightQuestion() {
        return rightQuestion;
    }


}
