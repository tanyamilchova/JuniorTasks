package Figures;

public class PiramideOfNumbers {
    public static int findRows(int input){
        int row=1;
        while (input>0){
            input-=row;
            row++;
        }
        return row-1;
    }

    public static void drawNumbers(int input){
        int n = PiramideOfNumbers.findRows(input);
        int spaces = n-1;
        int starts = 1;
        int number=1;

        for (int k = 0; k <n ; k++) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(".");
            }
            for (int i = 0; i < starts; i++) {
                System.out.print(number++);
                if (number>input){
                    break;
                }
            }
            spaces--;
            starts++;
            System.out.println();
        }
    }
    public static void drawInOneGo(int input) {

        int n = PiramideOfNumbers.findRows(input);
        int position = 0;
        int spaces = n - 1;
        int number = 1;
        int countSpases = 0;
        for (int k = 1; k <= n * n; k++) {

            if (countSpases<spaces ) {
                System.out.print(".");
                position++;
                countSpases++;
            }

            if (countSpases == spaces) {
                System.out.print(number++);
                position++;
            }
            if (position == n) {
                spaces--;
                System.out.println();
                countSpases = 0;
                position = 0;
            }

            if (number > input) {
                break;
            }
        }
    }




    public static void main(String[] args) {

        int input=18;
        PiramideOfNumbers.drawNumbers(input);
        PiramideOfNumbers.drawInOneGo(input);

        }
}
