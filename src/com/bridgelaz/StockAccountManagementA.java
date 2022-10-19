package com.bridgelaz;
class Stock{
    private String stockName;
    private int NumberOfShare;
    private int sharePrice;
    public Stock(String stockName, int numberOfShare, int sharePrice) {
        this.stockName = stockName;
        NumberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }
    public String getStockName() {return stockName;}
    public int getNumberOfShare() {  return NumberOfShare;}
    public int getSharePrice() {return sharePrice;}
    void printStockReport(){
        System.out.println("Total value of stock "+getStockName()+" is "+getNumberOfShare()*getSharePrice());
    }
}

public class StockAccountManagementA {
    public static void main(String[] args) {
        Stock wipro = new Stock("Wipro", 100, 453);
        Stock infosys = new Stock("Infosys", 100, 700);
        wipro.printStockReport();
        infosys.printStockReport();
    }
}
