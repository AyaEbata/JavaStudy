import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        double length, height;

        // System.out.printlnじゃなくてSystem.out.printにしたのは、改行を入れたくなかったから
        System.out.print("length=");
        // getInputValueメソッドへ（標準入力のメソッド外だしした。heightでもう一回使うので）
        length = getInputValue();

        // 上のと同じ
        System.out.print("height=");
        height = getInputValue();

        // 今回は桁数合わせないでいいや
        // ので、上記で取得した値を使って普通に体積計算して出力
        double volume = (length * length * height) / 3;
        System.out.println("体積=" + volume);
    }

    /**
     * 標準入力から値を受け取り、double型で返却します。
     * 数値以外を入力したら落ちます。（そこまでやってない）
     *
     * @return double型の数字
     * @throws IOException
     */
    private static double getInputValue() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Double.parseDouble(in.readLine());  // in.readLine()はtry/catchしろーって言われたIDEに
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}
