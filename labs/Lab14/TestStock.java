package Lab14;

public class TestStock {
    public static void main(String[] args){
        Stock ggl = new Stock("GOOG", "Google Inc.");
        Stock fcb = new Stock("META", "Facebook");
        Stock amz = new Stock("AMZN", "Amazon");

        ggl.setCurrentPrice(2000);
        ggl.setPreviousClosingPrice(1000);
        ggl.changePercent();
        fcb.setCurrentPrice(733.19);
        fcb.setPreviousClosingPrice(732.17);
        fcb.changePercent();
        amz.setCurrentPrice(222.31);
        amz.setPreviousClosingPrice(216.48);
        amz.changePercent();
    }
}
