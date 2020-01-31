
package caltivates;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;


public class Main {
     public static void main (String[] args) 
	{
		Caltivates obj = new Caltivates();
		obj.setYearlyBuy("20 Ton");
		obj.setYearlySell("20 ton");
                obj.setYearlyBenifite("10 Thousand");
                obj.setRateOfFishes(200);
                obj.setRateOfCrops(30);
                obj.setRateOfDiary(50);
               
		System.out.println("Yearly Buy of Fishes: " + obj.getYearlyBuy());
		System.out.println("Yearly Buy of Fishes: " + obj.getYearlySell()); 
                System.out.println("Yearly Benifit of Fishes: " + obj.getYearlyBenifite());
                System.out.println("Avarage Rate of Fishes perkg: " + obj.getRateOfFishes());
                System.out.println("Avarage Rate of Dairy perkg :" + obj.getRateOfCrops());
                System.out.println("Avarage Rate of Crops perkg: " + obj.getRateOfDiary());
                
                Fishes e = new Fishes();
                e.setMonthlyEarn(3500);
                e.setMonthlyInvest(3000);
                e.setTotalBenifit(500);
                System.out.println("Monthly Earn from fishes: " + e.getMonthlyEarn());
                System.out.println("Monthly Invest from fishes: " + e.getMonthlyInvest());
                System.out.println("Monthly Income from fishes: " + e.getTotalBenifit());
                
                Crops e1 = new Crops();
                e1.setMonthlyEarn(3500);
                e1.setMonthlyInvest(3000);
                e1.setTotalBenifit(500);
                System.out.println("Monthly Earn from fishes: " + e1.getMonthlyEarn());
                System.out.println("Monthly Invest from fishes: " + e1.getMonthlyInvest());
                System.out.println("Monthly Income from fishes: " + e1.getTotalBenifit());
                
                Crops e2 = new Crops();
                e2.setMonthlyEarn(3500);
                e2.setMonthlyInvest(3000);
                e2.setTotalBenifit(500);
                System.out.println("Monthly Earn from fishes: " + e2.getMonthlyEarn());
                System.out.println("Monthly Invest from fishes: " + e2.getMonthlyInvest());
                System.out.println("Monthly Income from fishes: " + e2.getTotalBenifit());
                
               Dairy e3 = new Dairy();
                e3.setMonthlyEarn(3500);
                e3.setMonthlyInvest(3000);
                e3.setTotalBenifit(500);
                System.out.println("Monthly Earn from fishes: " + e3.getMonthlyEarn());
                System.out.println("Monthly Invest from fishes: " + e3.getMonthlyInvest());
                System.out.println("Monthly Income from fishes: " + e3.getTotalBenifit());
      
                
   }
}
