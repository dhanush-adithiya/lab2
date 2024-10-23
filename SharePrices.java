
class SharePrices {

    static int findMaxProfit(int[] prices) {
        int firstBuy = -99999999;
        int firstSell = 0;
        int secondBuy = -9999999;
        int secondSell = 0;

        for (int price : prices) {
            if (-price > firstBuy) {
                firstBuy = -price;
            }
            if (firstBuy + price > firstSell) {
                firstSell = firstBuy + price;
            }
            if (firstSell - price > secondBuy) {
                secondBuy = firstSell - price;
            }
            if (secondBuy + price > secondSell) {
                secondSell = secondBuy + price;
            }
        }

        return secondSell;
    }

    public static void main(String[] args) {
        int[] prices = {10, 22, 5, 75, 65, 80};
        System.out.println(findMaxProfit(prices));
    }
}
