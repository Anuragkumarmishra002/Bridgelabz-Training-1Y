package com.gla.interface_abstraction;



public class BackgroundJob{
    public static void main(String[] args) {
        Runnable job1 = () -> System.out.println("Email sent");
        Runnable job2 = () -> System.out.println("Backup done");
        Runnable job3 = () -> System.out.println("Report generated");

        new Thread(job1).start();
        new Thread(job2).start();
        new Thread(job3).start();

        System.out.println("All jobs running...");
    }
}
