public class HomeWork {
    public static void main(String[] args) {
        Answer[] answers1 = new Answer[]{
                new Answer("Не правильный ответ"),
                new Answer("Правильный ответ"),
                new Answer("Не правильный ответ"),
                new Answer("Не правильный ответ"),
        };
        TestElement testElement1 = new TestElement(answers1, 1, "Правильный ответ 2");

        Answer[] answers2 = new Answer[]{
                new Answer("Не правильный ответ"),
                new Answer("Не правильный ответ"),
                new Answer("Правильный ответ"),
                new Answer("Не правильный ответ"),
        };
        TestElement testElement2 = new TestElement(answers2, 2, "Правильный ответ 3");

        Answer[] answers3 = new Answer[]{
                new Answer("Не правильный ответ"),
                new Answer("Не правильный ответ"),
                new Answer("Правильный ответ"),
                new Answer("Не правильный ответ"),
        };
        TestElement testElement3 = new TestElement(answers3, 2, "Правильный ответ 3");

        Answer[] answers4 = new Answer[]{
                new Answer("Правильный ответ"),
                new Answer("Не правильный ответ"),
                new Answer("Не правильный ответ"),
                new Answer("Не правильный ответ"),
        };
        TestElement testElement4 = new TestElement(answers4, 0, "Правильный ответ 4");

        Answer[] answers5 = new Answer[]{
                new Answer("Не правильный ответ"),
                new Answer("Не правильный ответ"),
                new Answer("Не правильный ответ"),
                new Answer("Правильный ответ"),
        };
        TestElement testElement5 = new TestElement(answers5, 3, "Правильный ответ 1");

        Test test = new Test(new TestElement[]{
                testElement1,
                testElement2,
                testElement3,
                testElement4,
                testElement5
        });

        test.passTest();

    }
}