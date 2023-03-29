import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MoodAnalyserTest {

    static MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void whenGivenMoodShouldReturnSAD() {
        String mood = moodAnalyser.analyseMood("i am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }
}