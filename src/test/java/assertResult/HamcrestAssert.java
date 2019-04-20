package assertResult;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class HamcrestAssert {
    // 类似英语自然语言的语法
    @Test
    public void assertThat(){
        Assert.assertThat(3, Is.is(3));
        Assert.assertThat(2, IsEqual.equalTo(2));
    }
}
