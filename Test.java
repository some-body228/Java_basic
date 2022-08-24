public class Test implements UserOutput {
    private final TestElement[] questions;
    private final Integer rightAnswersCount;

    public Test(TestElement[] questions, Integer rightAnswersCount) {
        this.questions = questions;
        this.rightAnswersCount = rightAnswersCount;
    }

    public void passTest(){
        int result = 0;
        for (TestElement question : questions) {
            if (question.ask()) {
                result++;
            }
        }
            System.out.println("резуьтат " + result + " из " + rightAnswersCount);
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
