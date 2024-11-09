package DDflorishU;

public class Util {
    protected static double GST_PERCENT = 0.09;
    public static double calculateGST(double costPrice){
        return costPrice * GST_PERCENT;
    }
}
