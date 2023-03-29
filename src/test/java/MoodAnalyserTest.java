import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.Assert.assertSame;

public class MoodAnalyzerTest {
    //Test case for Sad mood
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am In Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        assertSame("SAD", mood);
    }
    //Constructor in message should return Happy

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }

    @Test
    public void given_NULLMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }
}
