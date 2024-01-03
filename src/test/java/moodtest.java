import com.example.MoodAnalysisException;
import com.example.MoodAnalyzer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class moodtest {

    //TC - 1.1
    @Test
    public void moodAnalyzerTest1() throws MoodAnalysisException {
        String msg = "I am in Sad Mood";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
        assertEquals("sad", moodAnalyzer.analyeMood());
    }

    // Tc - 1.2
    @Test
    public void moodAnalyzerTest2() throws MoodAnalysisException{
        String msg = "I am in any mood";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
        assertEquals("happy", moodAnalyzer.analyeMood());

        msg = "I am in HAppy mood";
        assertEquals("happy", moodAnalyzer.analyeMood());
    }

    @Test 
    public void moodAnalyzerUC2() throws MoodAnalysisException{
        String msg = null;
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
        assertThrows(MoodAnalysisException.class, ()->moodAnalyzer.analyeMood());
    }

    @Test
    public void moodAnalyzerUC22() throws MoodAnalysisException{
        String msg="";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
        assertThrows(MoodAnalysisException.class, ()->moodAnalyzer.analyeMood());

    }
}
