public class DaemonThread extends Thread {
    public void run() {
        for (int i = 0;; i++) {
            System.out.println(i);
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
                // e.printStackTrace();
            // }
        }
    }

    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread(); 
       
        // String name = dt.getName();
        dt.setDaemon(true);
        dt.start();
        Thread mainThread = Thread.currentThread();
        try{
        // dt.join();
            // Thread.sleep(100);
            // dt.wait();
            // dt.interrupt();
            mainThread.join();

        }
        catch(InterruptedException e){
        System.out.println(e.getMessage());
        }
        // System.out.println(dt.getName());
    }
}
