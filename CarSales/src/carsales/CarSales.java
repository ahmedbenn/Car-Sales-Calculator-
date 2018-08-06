package carsales;
import java.util.Scanner;

public class CarSales{
    Scanner scan = new Scanner(System.in);
    int sales[];
    
    public CarSales(){
        sales=new int[12];
    }
    
public void setArray(){
    for(int n=0; n<12; n++){
    System.out.println("Enter sales of month"+(n+1)+";");
    sales[n]= scan.nextInt();
    }    
}
}



