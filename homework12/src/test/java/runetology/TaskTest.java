package runetology;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class TaskTest {
    @Test
    public void testSimpleTaskIfMatches(){
        SimpleTask simpleTask = new SimpleTask(5,"Позвонить маме");


        boolean actual = simpleTask.matches( "Позвонить");

        Assertions.assertTrue( actual);
    }

    @Test
    public void testSimpleTaskIfNotMatches(){
        SimpleTask simpleTask = new SimpleTask(5,"Позвонить маме");


        boolean actual = simpleTask.matches( "Набрать");

        Assertions.assertFalse( actual);
    }

    @Test
    public void testEpicTaskIfMatches(){
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic (44, subtasks);


        boolean actual = epic.matches( "Хлеб");

        Assertions.assertTrue( actual);
    }
    @Test
    public void testEpicTaskIfNotMatches(){
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic (44, subtasks);


        boolean actual = epic.matches( "Колбаса");

        Assertions.assertFalse( actual);
    }
    @Test
    public void testMeetingTaskTopicIfMatches(){

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );
        boolean actual = meeting.matches("Выкатка");

        Assertions.assertTrue( actual);
    }
    @Test
    public void testMeetingTaskProjectIfMatches(){

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение");

        Assertions.assertTrue( actual);
    }
    @Test
    public void testMeetingTaskIfNotMatches(){

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("В среду");

        Assertions.assertFalse( actual);
    }
}
