package Multithreading;

class MyThread extends Thread  {
    public void run(){
        System.out.println("1, 2, 3");
        System.out.println("a, b, c, d, e");
        try {
            System.out.println("Thread is going to sleep");
            Thread.sleep(10000);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

class Alphabets extends Thread {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Alphabet: " + ch);
        }
    }
}

class MainThread {
    public static void main(String [] args){
        System.out.println("Main Starts");
        MyThread dev = new MyThread();
        Alphabets alpha = new Alphabets();
        dev.start();
        alpha.start();
        System.out.println("Main Ends");
    }
}