package com.bridgelabz.moodAnalyserException.moodAnalyser;
import org.junit.*;
public class MoodAnalyserTest {
	@BeforeClass
    public static void show_msg_before_all_test_case (){
        System.out.println("*****Welcome to Mood Analyzer****");
    }
    @AfterClass
    public static void show_Msg_After_All_Test_Case(){
        System.out.println("All Test Case Completed");
    }
    @After
   public void after_Each_Test_Case_Print_Msg(){
        System.out.println("Pass");
    }
    MoodAnalyser object ;
    @Before
    public void setUp() {
        object = new MoodAnalyser();
    }
    @Test
    public void moodAnalyser(){
        String ans = object.moodAnalyser("I am in Sad Mood");
        Assert.assertEquals("SAD",ans);;
        System.out.println(ans);
    }
}
