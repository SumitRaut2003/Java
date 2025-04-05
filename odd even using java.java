package test;

import java.lang.Thread;

class EvenThread extends Thread{

public void run() {

for(int i = 2 ; i <= 20 ; i += 2 )

{

System.out.println("Even numbers"+i);

}

}

}

class OddThread extends Thread{

public void run() {

for(int i = 1 ; i <= 20 ; i += 2 )

{

System.out.println("Odd numbers"+i);

}

}

}



public class EvenOdd {

public static void main(String [] args ) {

EvenThread even = new EvenThread();

OddThread odd = new OddThread();

even.start();

try {

even.join();

System.out.println("Join is running");

} catch(Exception e)

{ e.printStackTrace();

}

odd.start();

}

}
