import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.Assert.assertSame;

public class MoodAnalyzerTest {
    //Test case for Sad mood
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am In Sad Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("SAD", mood);
        } catch (MoodAnalysisException e) {
            System.out.println(e.printStackTrace());
        }
    }
    //Constructor in message should return Happy

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            System.out.println(e.printStackTrace());
        }
    }
}
