public class FirstTest {

    public static void main(String[] args) {

        int actual = add(5, 3);
        int expected = 8;

        if (actual == expected) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
