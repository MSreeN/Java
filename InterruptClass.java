class InterruptClass extends Thread {
    public InterruptClass(String name, boolean b) {
        super(name);
        // setDaemon(b);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " run");
            // Thread.interrupted();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
               for (int j = 0; j < 5; j++) {
                    System.out.println(j);
               }
            }
        }
    }

    public static void main(String[] args) {

        InterruptClass tc = new InterruptClass("Sree", true);
        tc.start();
        // Thread t = new Thread();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " main");
            tc.interrupt();
            
        //     if (i == 3) {
        //         tc.interrupt();


        //     }
        }
        tc.setDaemon(true);
        try {
            tc.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(tc.getName());
    }
}
