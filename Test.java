public class Test {
    private final TestElement[] questions;

    private final UserOutput userOutput = new ConsoleUserOutput();

    public Test(TestElement[] questions) {
        this.questions = questions;
    }

    public void passTest(){
        int result = 0;
        for (TestElement question : questions) {
            if (question.ask()) {
                result++;
            }
        }
        userOutput.print("резуьтат " + result + " из " + questions.length);
    }
}
