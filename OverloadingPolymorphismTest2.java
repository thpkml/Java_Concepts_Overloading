/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class OverloadingPolymorphismTest2 extends OverloadingPolymorphism{
    
    void run(){
        System.out.println("Bike 2 is running fast!");
    }
     public static void main(String[] args){
        OverloadingPolymorphismTest2 Bike2 = new OverloadingPolymorphismTest2();
       
        Bike2.run();
     }
}