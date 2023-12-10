import org.example.Solution9;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class L2021113691_9_Test {
    private Solution9 solution9 = new Solution9();
/*使用了等价类划分原则*/
    /*对于能够成功划分为两组的例子进行测试*/
    @Test
    public void testExample1() {
        int n = 4;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 4}};
        boolean result = solution9.possibleBipartition(n, dislikes);
        assertTrue(result);
    }
/*对于因为偏好问题不能划分为两个组的用例进行测试*/
    @Test
    public void testExample2() {
        int n = 3;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 3}};
        boolean result = solution9.possibleBipartition(n, dislikes);
        assertFalse(result);
    }
}
