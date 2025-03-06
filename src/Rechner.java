import java.math.BigDecimal;

public class Rechner {
    public BigDecimal plus(BigDecimal x, BigDecimal y) {
        BigDecimal rechnung = x.add(y);
        return rechnung.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
    public BigDecimal minus(BigDecimal x, BigDecimal y) {
        BigDecimal rechnung = x.subtract(y);
        return rechnung.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
    public BigDecimal mul(BigDecimal x, BigDecimal y) {
        BigDecimal rechnung = x.multiply(y);
        return rechnung.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
    public BigDecimal div(BigDecimal x, BigDecimal y) {
        if(y.compareTo(BigDecimal.ZERO) == 0) {
            System.err.println("Der Divisor darf nicht null sein");
        }
        else {
            BigDecimal rechnung = x.divide(y);
            return rechnung.setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return new BigDecimal(0);
    }
    public static void test(){
        Rechner rechner=new Rechner();
        System.out.println("\nTest:"  + "\nPlus" + "\n(2.3456+3.4567 = 5.8023 = 5.80) erwartet");
        System.out.println(rechner.plus(new BigDecimal(2.3456),new BigDecimal(3.4567)));

        System.out.println("Minus" + "\n(2. - 3.4567 = -1.1111 = -1.11) erwartet");
        System.out.println(rechner.minus(new BigDecimal(2.3456),new BigDecimal(3.4567)));

        System.out.println("Multiplizieren:" + "\n(2.3456 * 3.4567 = 8,10803552 = 8.11) erwartet");
        System.out.println(rechner.mul(new BigDecimal(2.3456),new BigDecimal(3.4567)));

        System.out.println("Dividieren:" + "\n(10 / 2 = 5.00) erwartet");
        System.out.println(rechner.div(new BigDecimal(10),new BigDecimal(2)));

        System.out.println("--------------------------------------------------------------------------------------");
    }
}
