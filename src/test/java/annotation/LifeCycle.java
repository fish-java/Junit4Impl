package annotation;

import org.junit.*;

public class LifeCycle {
    // 在测试类初始化之前开始前执行
    //   必须是static方法
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    //在每个方法执行前执行
    @Before
    public void before(){
        System.out.println("before");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @After
    public void after(){
        System.out.println("after");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }
}
//    beforeClass

//    before
//    Test1
//    after

//    before
//    Test2
//    after

//    afterClass