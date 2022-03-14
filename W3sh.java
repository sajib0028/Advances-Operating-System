package sh;

class ThreadClass extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class W3sh {
    public static void main(String[] args){
        int n = 5;
        for (int i = 0; i < n; i++) {
            ThreadClass t = new ThreadClass();
            t.start();
        }
    }
}
