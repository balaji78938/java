import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private List<Question> questions;

    public QuizController() {
        questions = new ArrayList<>();
        populateQuestions(questions);
    }

    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return questions;
    }

    private void populateQuestions(List<Question> questions) {
        questions.add(new Question("What is the capital of France?", List.of("Berlin", "Madrid", "Paris", "Rome"), "Paris"));
        questions.add(new Question("What is 2 + 2?", List.of("3", "4", "5", "6"), "4"));
        questions.add(new Question("Which planet is known as the Red Planet?", List.of("Earth", "Mars", "Jupiter", "Venus"), "Mars"));
        questions.add(new Question("Who wrote 'To be, or not to be'?", List.of("Mark Twain", "William Shakespeare", "Charles Dickens", "J.K. Rowling"), "William Shakespeare"));
    }
}
