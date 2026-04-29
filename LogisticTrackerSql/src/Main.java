package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// ---------------- THREAD CLASS ----------------
class MyThread extends Thread {
    public void run() {
        System.out.println("1, 2, 3");
        System.out.println("a, b, c, d, e");
        try {
            System.out.println("Thread is going to sleep");
            Thread.sleep(3000);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

// ---------------- ANOTHER THREAD ----------------
class Alphabets extends Thread {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Alphabet: " + ch);
        }
    }
}

// ---------------- RUNNABLE ----------------
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread running...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Count: " + i);
        }
    }
}

// ---------------- CALLABLE ----------------
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Callable thread running...");
        Thread.sleep(2000);
        return "Result from Callable";
    }
}

// ---------------- MAIN CLASS ----------------
class MainThread {
    public static void main(String[] args) {
        System.out.println("Main Starts");

        // Thread class
        MyThread dev = new MyThread();
        Alphabets alpha = new Alphabets();
        // Runnable
        Thread runnableThread = new Thread(new MyRunnable());

        // Callable
        FutureTask<String> task = new FutureTask<>(new MyCallable());
        Thread callableThread = new Thread(task);

        // Start all threads
        dev.start();
        alpha.start();
        runnableThread.start();
        callableThread.start();

        try {
            // Get result from Callable
            String result = task.get();
            System.out.println("Callable returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Ends");
    }
}