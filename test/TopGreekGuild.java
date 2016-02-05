
import junit.framework.Assert;
import org.junit.Test;

public class TopGreekGuild {
    @Test
    public void addingTwoNumbers(){
        TeamDK.add(1,1);
    }
    @Test
    public void addingTwoNumbersEqualsTwo(){
        Assert.assertEquals(2, TeamDK.add(1,1));
    }
}
