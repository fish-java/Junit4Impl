package assertResult;

import org.junit.Assert;
import org.junit.Test;

public class JUnitAssert {
    @Test(expected = AssertionError.class)
    public void assertSame(){
        Object obj = new Object();
        Object obj2 = new Object();

        // 判断两个参数是不是同一个对象
        Assert.assertSame(obj, obj2);
    }

    @Test(expected = AssertionError.class)
    public void assertEquals(){
        Object obj = new Object();
        Object obj2 = new Object();

        // 判断两个参数是不是相等
        Assert.assertEquals(obj, obj2);
    }

    @Test(expected = AssertionError.class)
    public void assertNull(){
        // 判断参数是不是null
        Assert.assertNull(2);
    }

    @Test(expected = AssertionError.class)
    public void assertTrue(){
        Assert.assertTrue(false);
    }

    @Test(expected = AssertionError.class)
    public void assertArrayEquals(){
        String[] arr1 = {"a", "b"};
        String[] arr2 = {"a", "c"};
        Assert.assertArrayEquals(arr1, arr2);
    }
}
