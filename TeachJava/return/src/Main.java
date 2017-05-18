public class Main {

    public static void main(String[] args) {
        // numberを数値の9とする。
        int number = 9;

        // もし偶数だったら、
        if (isEven(number)) {
            // 「9 は偶数です」と出力する。
            System.out.println(number + " は偶数です");

        // もし偶数じゃなかったら、（奇数ならば）
        } else {
            // 「9 は奇数です」を出力する。
            System.out.println(number + " は奇数です");
        }
    }

    // booleanの形で値を返すメソッド。
    // 偶数のときtrue、偶数ではない（奇数）のときfalseを返す。
    private static boolean isEven(int a) {
        // aを2で割ったあまりが0（=偶数）という条件式を返す。
        return a % 2 == 0;
    }

}
