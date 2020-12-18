package org.hcl.multithreading;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException

	{

		ThreadB b = new ThreadB();

		b.start();

		synchronized (b)

		{

			System.out.println("main Thread calling wait() method");

			b.wait();

			System.out.println("main Thread got notification call");

			System.out.println(b.total);

		}

	}

}
