import static org.junit.Assert.assertEquals;

import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void helloTest(){
        assertEquals("hello", SkillDemo.hello());
    }

}
