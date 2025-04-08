package LambdaExpression_Examples;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable thread1= ()-> {

            System.out.println("THis is a first thread class");
            System.out.println("Printing nums from 1 to 10: ");
            for (int i = 0; i <= 10; i++) {
                System.out.println("Value of i "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        //thread1.run();
        Thread t = new Thread(thread1);
        t.setName("XYZ");
        t.start();

        Runnable thread2 =()-> {

            try {

                for (int i= 0; i <= 10; i++) {
                    System.out.println("Values for second thread: " + i*2);

                Thread.sleep(2000);}

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
            Thread t2 = new Thread(thread2);
            t2.start();






    }
}
