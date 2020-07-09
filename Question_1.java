/*Section B
   Question No. 4
   
   Anshul transport company charges for the parcels of its customers as per the 
   following specifications given below:
   
   
   Class Name :
                    Transport
   
   Member Variables :
                        String name - to store the name of the customer
                        
                        int w       - to store the weight of the parcel in Kg
                        
                        int charge  - to store the charge of the parcel
   Member Functions :
                        void accept() - to accept the name of the customer,
                                        weight of the parcel from the user
                                        using Scanner class
                                        
                        void calculate() - to calculate the charge as per weight 
                                           of the parcel as per the following 
                                           criteria
                         
                                   Weight       Charge
                                   Upto 10 kg   Rs.25 per Kg
                                   Next 20 kg   Rs.20 per Kg
                                   Above 30 kg  Rs.10 per Kg
                                   
                         A surcharge of 5% is charged on the bill
                         
                         void print() -to print the name of the customer, weight of the parcel, total bill
                                       inclusive of surcharge in a tabular form in the following format :
                                      
                                       
                                        Name    Weight     Bill amount
                                       ------- --------- ---------------
   
   */
  
// Solution
import java.util.Scanner;

public class Question_1{
    public static void main(String args[]){
        Transport t = new Transport();
        t.accept();
        t.calculate();
        t.print();
    }
    
}
class Transport{
    public String name;
    public int w=0,charge=0;
    
    public void accept(){
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter your name:-");
        name = rd.nextLine();
        
        System.out.println("Enter the weight of the parcel:-");
        w = rd.nextInt();
       
    }
    
    public void calculate(){
       
        if (w<=10){
            charge = w*25;
        }
        else if(w<=30){
            charge = w*20;
        }
        else {
            charge = w*10;
        }
        
        charge += charge * 0.05; 
    }
    
    public void print(){
        
        String head[] = new String []{"Name","Weight","Bill amount"};
        String data[] = new String []{name,Integer.toString(w),Integer.toString(charge)};
        
        for (int i = 0; i < head.length; i++) {  
            System.out.print(head[i] + " ");  
        }
        
        System.out.println("");
        
        for (int j = 0; j < data.length; j++) {  
            System.out.print(data[j] + " ");  
        }
        
        
        
    }
}

    










  
  
