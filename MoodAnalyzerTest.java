import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    private MoodAnalyser analyser;

    @Test
    public void givenMood_WhenSadMessage_ShouldReturnSad() {
        analyser = new MoodAnalyser();
        Assert.assertEquals("Sad",analyser.analyseMood("I Am In Sad Mood"));
    }
    @Test
    public void givenMood_WhenAnyMessage_ShouldReturnHappy() {
        analyser = new MoodAnalyser();
        Assert.assertEquals("Happy",analyser.analyseMood("I Am In Any Mood"));
    }
}
