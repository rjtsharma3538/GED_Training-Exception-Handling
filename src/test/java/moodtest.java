import com.example.MoodAnalyzer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class moodtest {
    @Test
    public void moodAnalyzerTest1() {
        String msg = "I am in Sad Mood";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("sad", moodAnalyzer.analyeMood(msg));
    }
}
