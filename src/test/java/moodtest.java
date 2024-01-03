import com.example.MoodAnalyzer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class moodtest {

    //TC - 1.1
    @Test
    public void moodAnalyzerTest1() {
        String msg = "I am in Sad Mood";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("sad", moodAnalyzer.analyeMood(msg));
    }

    // Tc - 1.2
    @Test
    public void moodAnalyzerTest2(){
        String msg = "I am in any mood";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("happy", moodAnalyzer.analyeMood(msg));

        msg = "I am in HAppy mood";
        assertEquals("happy", moodAnalyzer.analyeMood(msg));
    }
}
