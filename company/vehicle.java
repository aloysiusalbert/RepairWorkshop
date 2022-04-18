package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//making program for a vehicle repair workshop and making the input menu too! all costs in ntd

public class vehicle {
    String ownername;
    int cost;
    public vehicle(String ownername) {

        this.ownername = ownername;
    }
    public void Service(){

    }
    public void changefilter(){

    }
}
class Car extends vehicle{
    Scanner input=new Scanner(System.in);
    public Car(String ownername) {

        super(ownername);
    }
    public void Service(){

        cost=(4*30)+(3*100);
    }
    public void spooringbalancing(){
        System.out.println("Do you want to do spooring and balancing?");
        System.out.println("Y/N");
        String choice= input.next();
        if(choice.equalsIgnoreCase("Y")){
            int sbcost =4*50;
            cost=cost+sbcost;
        }
    }
    public void changefilter(){
        System.out.println("Do you want to Change filter?");
        System.out.println("Y/N");
        String choice= input.next();
        if(choice.equalsIgnoreCase("Y")){
            int cfcost=150;
            cost=cost+cfcost;
        }
    }
}
class Motorcycle extends vehicle{
    Scanner input= new Scanner(System.in);
    public Motorcycle(String ownername){
        super(ownername);
    }
    public void Service(){
        cost= (2*10)+(1*100);
    }
    public void changefilter(){
        System.out.println("Do you want to change filter");
        System.out.println("Y/N");
        String choice=input.next();
        if(choice.equalsIgnoreCase("Y")){
            int cfcost=100;
            cost=cost+cfcost;
        }
    }

}
class vehicleworkshop{

    public static void main(String[] agrs){
        Scanner input= new Scanner(System.in);
        ArrayList<vehicle> queue= new ArrayList<>();
        boolean x=true;

        while(x){
            System.out.println("MENU");
            System.out.println("1. car");
            System.out.println("2. motorcycle");
            System.out.println("0. Exit");
            System.out.println("Input choice");
            int choice=input.nextInt();
            if(choice==1){
                System.out.println("input owner's name: ");
                String name=input.next();
                vehicle car= new Car(name);
                queue.add(car);
            }
            else if(choice==2){
                System.out.println("input owner's name:");
                String name=input.next();
                vehicle motorcycle=new Motorcycle(name);
                queue.add(motorcycle);
            }
            else{
                x=false;
            }

        }
        for (vehicle Vehicle: queue ){
            Vehicle.Service();
            Vehicle.changefilter();

            if (Vehicle instanceof Car){
                ((Car) Vehicle).spooringbalancing();
            }
            System.out.println("Total Cost: ");
            System.out.println(Vehicle.cost);
        }




    }


}






