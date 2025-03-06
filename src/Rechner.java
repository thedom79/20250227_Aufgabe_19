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
        System.out.println("Plus:");
        System.out.println(rechner.plus(new BigDecimal(2.3456),new BigDecimal(3.4567)));

        System.out.println("Minus:");
        System.out.println(rechner.minus(new BigDecimal(2.3456),new BigDecimal(3.4567)));

        System.out.println("Multiplizieren:");
        System.out.println(rechner.mul(new BigDecimal(2.3456),new BigDecimal(3.4567)));

        System.out.println("Dividieren:");
        System.out.println(rechner.div(new BigDecimal(10),new BigDecimal(2)));
    }
}
