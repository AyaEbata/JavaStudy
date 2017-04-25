import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        // まず、体積を求める
        // 数字に小数点ないから(double)付けてあげよう、、、
        // double volume = 20.0 * 20 * 10 / 3; とかでもいけるけど、、、
        double volume = (double) 20 * 20 * 10 / 3;

        // BigDecimal#setScaleのメソッドを使いたいので、volumeの型をBigDecimalにしてあげる
        BigDecimal bigDecimalVolume = new BigDecimal(volume);

        // BigDecimal#setScaleで桁数が操作できるので、
        // RoundingMode.DOWN（切り捨てるよって意味のやつ）を指定して小数点7桁目以降を切り捨てる
        // （なんか小数点7桁目までしか出力されてなかったので）
        bigDecimalVolume = bigDecimalVolume.setScale(7, RoundingMode.DOWN);

        System.out.println(bigDecimalVolume);
    }

}