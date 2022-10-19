package com.bridgelaz;

import java.util.Scanner;

class Stock1{
    private String stockName;
    private int numberOfShare;
    private int sharePrice;
    public Stock1() {
    }
    public Stock1(String stockName, int numberOfShare, int sharePrice) {
        this.stockName = stockName;
        numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getStockName() {return stockName;}
    public int getNumberOfShare() {  return numberOfShare;}
    public int getSharePrice() {return sharePrice;}
    void userInputToAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of stock : ");
        stockName = scan.next();
        System.out.println("Number of quantity : ");
        numberOfShare = scan.nextInt();
        System.out.println("Price of share : ");
        sharePrice = scan.nextInt();
    }

}
class StockReport{
    Stock1 stock = new Stock1();
    void printStockReport(){
        stock.userInputToAccount();
        System.out.println("Total value of stock "+stock.getStockName()+" is "+stock.getNumberOfShare()*stock.getSharePrice()+".");
  }
  void printPortfolio(int number){
        int totalPortfolio = 0;
      for (int i = 0; i < number; i++) {
          printStockReport();
          totalPortfolio+=stock.getNumberOfShare()*stock.getSharePrice();
      }
      System.out.println("Total portfolio of your account : "+totalPortfolio);
  }
}

public class StockAccountManagementB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of stocks int your D-mat account : ");
        int number = scanner.nextInt();
        StockReport person1 = new StockReport();
        person1.printPortfolio(number);
    }
}
