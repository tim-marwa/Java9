package com.ocaj.exam.chapter11;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierLambda
{
   public static void main(String[] args)
   {
      final CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Lets play"));
      Runnable r = () -> {
                            String name = Thread.currentThread().getName();
                            System.out.printf("%sAwaiting...%n", name);
                            try
                            {
                               barrier.await();
                            }
                            catch (Exception ie)
                            {
                               System.out.println("thread interrupted");
                               return;
                            }
                            System.out.printf("%s has joined game%n", name);
                      };
                   Thread t1 = new Thread(r);
                   Thread t2 = new Thread(r);
                   Thread t3 = new Thread(r);
                   t1.start();
                   t2.start();
                   t3.start();
   }
}