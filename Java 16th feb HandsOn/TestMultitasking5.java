Q2) Perform multiple task:
WAP to create 2 threads and 2 task will perform by allocating
them and align different task to them time to time .

Ans.
package com.org.gen.16thfebHandsOn

class TestMultitasking5{  
public static void main(String args[]){  
  Runnable r1=new Runnable(){  
    public void run(){  
      System.out.println("task one");  
    }  
  };  
  
  Runnable r2=new Runnable(){  
    public void run(){  
      System.out.println("task two");  
    }  
  };  
      
  Thread t1=new Thread(r1);  
  Thread t2=new Thread(r2);  
  
  t1.start();  
  t2.start();  
}  
}  