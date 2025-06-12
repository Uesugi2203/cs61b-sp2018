public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 10; i += 1) {
            System.out.print(x + " ");
            x = x + i + 1;
        }
    }
}