package annotation;

import org.junit.Test;

public class TestOption {
    // 表明这是一个测试方法
    @Test
    public void test(){};

    // 表明希望抛出某种异常
    @Test(expected = ArithmeticException.class)
    public void divideZero(){
        int res = 1 / 0;
    }

    // 表明希望方法在规定时间内完成
    @Test(timeout = 1000)
    public void timeout() throws Exception{
        Thread.sleep(100);
    }
}
