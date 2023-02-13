public class InterThreadComm {
    public static void main(String[] args) {
        MyDataOne m = new MyDataOne();
        Producer p = new Producer(m);
        Consumer c = new Consumer(m);
        p.start();
        c.start();
    }
}

class MyDataOne {
    int value;
    boolean flag = true;

    synchronized public int getValue() {
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        flag = true;
        notify();
        return value;

    }

    synchronized public void setValue(int value) {
        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {

            }

        }
        this.value = value;
        flag = false;
        notify();
    }

}

class Producer extends Thread {
    MyDataOne m;

    public Producer(MyDataOne mm) {
        m = mm;
    }

    public void run() {
        int val = 1;
        while (true) {
            m.setValue(val);
            System.out.println("Producer produced "+ val );
            val++;

        }
    }
}

class Consumer extends Thread {
    MyDataOne m;

    public Consumer(MyDataOne mm) {
        m = mm;
    }

    public void run() {
        int val = 1;
        while (true) {
            System.out.println("Consumer consumed "+m.getValue() );
            val++;

        }
    }
}
