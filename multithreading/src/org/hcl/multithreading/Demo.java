package org.hcl.multithreading;

public class Demo {

	public static void main(String[] args)

	{

		Display d1 = new Display();

		MyThread t1 = new MyThread(d1, "Sita");

		MyThread t2 = new MyThread(d1, "Gita");

		t1.start();

		t2.start();

	}

}
