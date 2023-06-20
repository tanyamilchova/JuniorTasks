package main.String;

public class CreateByAddReverce {
    public static void main(String[] args) {
        //Една задача от интервю:
        //Приемаш един стринг initial, който е съставен само от "А" и "B". Като е м/у 1 и 999 символа.
        // / може да е А, АВ, АА, АААААВ, ВВВАВВВВАААААВ и т.н. /
        // Още един стринг, който е target, той трябва да е м/у 2 и 1000 символа, задължително по-голям от initial и пак е съставен само от "А" и "B".
        // С initial стрингът може да се извършват само 2 операции - едната метод add(), който добавя "А" към края на стринга,
        // т.е. ако initial = "ABB", след метод add() ще се получи -> "ABBA". Дръгата операция е метод reverse(), който обръща стрингът и добавя "В" накрая,
        // т.е. ако initial = "ABB", след метод reverse() ще се получи -> "ВВАВ".
        //Да се напише програма, която проверява дали targeт може да се получи от initial,
        // използвайки една от двете или двете по колкото си искаш начина операции.

        String initial = "AB";
        String target = "BBBAB";
        boolean result = checkTarget(initial, target);
        System.out.println(result);
    }

    public static String add(String initial) {
        return initial.concat("B");
    }

    public static String reverese(String initial) {
        StringBuilder builder = new StringBuilder();
        for (int i = initial.length() - 1; i >= 0; i--) {
            builder.append(initial.charAt(i));
        }
        builder.append("B");
        String s = builder.toString();
        return s;
    }


    public static boolean checkTarget(String initial, String target) {

        if (initial.equals(target) ) {
            return true;
        }
        if (!initial.equals(target)&& initial.length() > target.length()) {
        return false;
        }

        boolean addTree= checkTarget(add(initial), target);
        System.out.println(initial + " imitial a");
        boolean reverseTree=checkTarget(reverese(initial), target);
        System.out.println(initial + " initial b");
        boolean resultTree=addTree||reverseTree;

            return resultTree;
    }
}
