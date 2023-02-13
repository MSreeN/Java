class YieldThread {
    public static void main(String[] args) {
        ThreadOne to = new ThreadOne();
        ThreadTwo tt = new ThreadTwo();

        to.start();
        tt.start();
    }
}

class ThreadOne extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " ThreadOne");
            i++;
            Thread.yield();

        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " ThreadTwo");
            i++;
        }
    }
}