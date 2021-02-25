import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {
        @Test
        public void multiply() throws Exception {
            MyClass tester = new MyClass();
            assertEquals(5, tester.multiply(1, 5));
        }

        @Test
        public void test2() throws Exception {
            MyClass x = new MyClass();
            assertEquals(-10, x.multiply(-2, 5));
        }

        @Test
        public void multiplyby0() throws Exception {
            MyClass x = new MyClass();
            assertEquals(0, x.multiply(0, 0));
        }
        @Test(expected = IllegalArgumentException.class)
        public void multiplyGreaterThan999WithMaxInt() {
            MyClass tester = new MyClass();
            tester.multiply(Integer.MAX_VALUE, 0);
        }


}