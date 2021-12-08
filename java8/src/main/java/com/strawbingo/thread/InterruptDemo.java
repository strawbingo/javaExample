package com.strawbingo.thread;



public class InterruptDemo {

    public static void main(String[] args) {
//        Thread thread = new Thread();
        SecurityManager appsm = System.getSecurityManager();
        if(appsm == null) {
            System.out.println("SecurityManager is null true");
        }

//        try {
//            thread.sleep(1000);
//            thread.interrupt();
            System.out.println("args = [" + Thread.currentThread().getName() +":"+ Thread.currentThread().isInterrupted() + "]");
            Thread.currentThread().interrupt();
            System.out.println("args = [" + Thread.currentThread().getName() +":"+ Thread.currentThread().isInterrupted() + "]");

            WorkerRunnable workerRunnable = new WorkerRunnable();
            Thread thread1 = new Thread(workerRunnable);
//            Thread thread2 =  new Thread(workerRunnable);
            thread1.start();

//            Thread.sleep(1000);
            thread1.interrupt();
            System.out.println("args = [" + thread1.getName() +":"+ thread1.isInterrupted() + "]");
            System.out.println("args = [" + Thread.currentThread().getName() +":"+ thread1.interrupted()+ "]");
            System.out.println("args = [" + Thread.currentThread().getName() +":"+ thread1.interrupted()+ "]");

            System.out.println("--------------------");

            new WorkerThread().start();
            new WorkerThread().start();


            System.out.println("end");
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException in main");
//            e.printStackTrace();
//        }

    }


    public static class WorkerRunnable implements Runnable{

        public int count = 10;

        public synchronized void run() {
//            while (count > 0) {
//                count--;
//                System.out.println(Thread.currentThread().getName()+":"+count);
//            }
            try{
                System.out.println("WorkerRunnable");
                Thread.sleep(10000);
//                Thread.currentThread().join();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException in Runnable");
                e.printStackTrace();
            }

        }
    }

    public static class WorkerThread extends Thread{

        public int count = 10;

        public synchronized void run() {
//            while (count > 0) {
//                count--;
//                System.out.println(Thread.currentThread().getName()+":"+count);
//            }

            System.out.println("WorkerThread");

        }
    }

}
