class MyThread extends Thread  {
    public void run(){
        System.out.println("1, 2, 3");
        System.out.println("a, b, c, d, e");

        System.out.println("Thread is going to sleep");
        System.out.println("Thread woke up");
    }
}

class Alphabets extends Thread {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Alphabet " + ch);
        }
    }
}

class MainThread {
    public static void main(String [] args){
        System.out.println("Main Starts");

        MyThread t1 = new MyThread();
        Alphabets alpha = new Alphabets();



       t1.setPriority(Thread.MIN_PRIORITY);   // 1 (low priority)
      alpha.setPriority(Thread.MAX_PRIORITY); // 10 (high priority)


        t1.start();
        alpha.start();

        System.out.println("Main Ends");
    }
}