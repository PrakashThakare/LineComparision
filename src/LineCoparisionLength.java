public class LineCoparisionLength {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation program");
        int x1 = 12, y1 = 14, x2 = 23, y2 = 43, x3 = 21, y3 = 32, x4 = 65, y4 = 96;
        int lineOneLength = (int) Math.sqrt((y1 - x1) ^ 2 + (y2 - x2) ^ 2);
        int lineTwoLength = (int) Math.sqrt((y3 - x3) ^ 2 + (y4 - x4) ^ 2); //UC1
        System.out.println("Length is :"+ (lineOneLength + lineTwoLength));
    }
}