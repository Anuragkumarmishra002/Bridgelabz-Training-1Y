public class MultiThreadString {

    // Wrapper class instead of extending
    static class MyBuffer {
        private StringBuffer sb = new StringBuffer();

        public synchronized void append(String str) {
            System.out.println("Appending: " + str);
            sb.append(str);
        }

        public String toString() {
            return sb.toString();
        }
    }

    static class Task extends Thread {
        MyBuffer sb;

        Task(MyBuffer sb) {
            this.sb = sb;
        }

        public void run() {
            sb.append("Hello ");
            sb.append("World ");
        }
    }

    public static void main(String[] args) throws Exception {

        MyBuffer sb = new MyBuffer();

        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final String: " + sb);
    }
}