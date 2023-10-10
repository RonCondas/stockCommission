/*Ronald Noriega-Valdeolla
 * ITSE 2371
 * 8/30/2023
 In this exercise I will write a program that allow the user to input their 
 information. Including shares bought, the purchase price, the purchase commission
 (percent), the sale price, and the sale commission, 
 and the sale percent and get the correct amount of profit. */

import java.text.DecimalFormat;
import java.util.Scanner;






public class StockCommission {

	public static void main(String[] args) {
		
		double purchasePrice = 0.0;
		
		double commission = 0.0; //Purchase Commission
		
		double pTotal = 0.0; //Purchase Total
		
		double price =  0.0; //Sale Price
		
		double sCommission = 0.0; //Sale Commission
		
		double sTotal = 0.0; //Sole Total
		
		double pProfit = 0.0; //Purchase Profit
		
		Scanner shares = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("##,###.00");
		
		System.out.println("This program is intended to calculate the profit made in the stock");
		
		System.out.println("How many shares did you buy? ");
		int sharesPurchase = shares.nextInt(); 
		
		System.out.println("What was the purchase price of the share? ");
		double purchaseAmmount = shares.nextDouble();
		
		System.out.println("What percent commission did you pay? (For example, type in .07 for 7%) ");
		double percentCommission = shares.nextDouble();
		
		System.out.println("How many shares did you sell? ");
		int sharesSale = shares.nextInt();
		
		System.out.println("What was the sale price of the shares? ");
		double sharePrice = shares.nextDouble();
		
		System.out.println("What percent commission did you pay to sell the shares? (For example, type in .07 for 7%) ");
		double percentCommissionSale = shares.nextDouble();
		
		System.out.println("============================================================================================");
		
		purchasePrice = sharesPurchase * purchaseAmmount;
		
		System.out.println("Purchase Price:\t\t$" + df.format(purchasePrice));
		
		commission = purchasePrice * percentCommission;
		
		System.out.println("Purchase Commission:\t$" + df.format(commission));
		
		pTotal = purchasePrice + commission;
		
		System.out.println("Purchase Total:\t\t$" + df.format(pTotal));
		
		price = sharesSale * sharePrice;
		
		System.out.println("Sale Price:\t\t$" + df.format(price));
		
		sCommission = price * percentCommissionSale;
		
		System.out.println("Sale Commission:\t$" + df.format(sCommission));
		
		sTotal = price - sCommission;
		
		System.out.println("Sale Total:\t\t$" + df.format(sTotal));
		
		pProfit = sTotal - pTotal;
		
		System.out.println("Profit:\t\t\t$" +  df.format(pProfit));
		
		shares.close();
		
	}

}
