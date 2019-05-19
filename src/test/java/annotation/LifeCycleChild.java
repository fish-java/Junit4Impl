package annotation;

import org.junit.*;

/**
 * 继承Junit测试类的话，相关的生命周期
 */
public class LifeCycleChild extends LifeCycle {
    @Test
    public void test(){
        System.out.println("Test1");
    }
}
//    beforeClass
//    before
//    Test1
//    after
//    afterClass