package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

        output(queen.doYourJob());
        output(queen.fly());

        // output(worker.doYourJob());
        // output(queen.fly());

        // output(drone.doYourJob());
        // output(queen.fly());

    }

   private static void pollObj(Queen obj){
    output(obj.doYourJob());
    output(obj.fly());
    output("---------------------------");
   }
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

