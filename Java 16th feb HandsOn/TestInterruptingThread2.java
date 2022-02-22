Q1) WAP to interrupt sleep method and due to interruption the
sleep method will not execute successfully and it will throw
interruption error that must be handled by catch block.

Ans.
package com.org.gen.16thfebHandsOn

class TestInterruptingThread2 extends Thread{  
public void run(){  
try{  
Thread.sleep(1000);  
System.out.println("task");  
}catch(InterruptedException e){  
System.out.println("Exception handled "+e);  
}  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
TestInterruptingThread2 t1=new TestInterruptingThread2();  
t1.start();  
  
t1.interrupt();  
  
}  
}  