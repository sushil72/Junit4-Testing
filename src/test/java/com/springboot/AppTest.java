package com.springboot;
import org.junit.*;

public class AppTest {
    @BeforeClass
            public static  void setUpBeforeClass() throws Exception {
        System.out.println("All the execution is done before the class AppTest");
    }
    @AfterClass
            public static void tearDownAfterClass() throws Exception {
        System.out.println("Executes aftr the all the test cases are exccuted...");
    }

    @Before
    public  void BeforeEachTestCase() throws Exception {
        System.out.println("Before each test case...");
    }
    Calculator calc = new Calculator();
    @Test
    public void AdditionTest() {

        int result = calc.Add(12, 2);
        Assert.assertEquals(14, result);
    }
    @Test
    public void MultiplicationTest()
    {
        int result = calc.multiple(12,2);
        Assert.assertEquals(24,result);
    }

}
