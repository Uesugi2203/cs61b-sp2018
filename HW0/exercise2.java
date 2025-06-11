public class  exercise2 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int len = m.length;
        int max = 0;
        int current = 0;
        while (current < len){
            if (m[current] >+ max){
                max = m[current];
            }
            current = current + 1;
        }
        return max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));
    }
}