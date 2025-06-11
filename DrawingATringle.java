public class DrawingATringle {
    public static void main(String[] args){
        int line = 6;
        int currentLine = 1;
        while (currentLine < line){
            int row = currentLine;
            int currentRow = 0;
            while (currentRow < row){
                System.out.print("*");
                currentRow = currentRow + 1;
            }
            System.out.println();
            currentLine = currentLine + 1;
        }
    }
}