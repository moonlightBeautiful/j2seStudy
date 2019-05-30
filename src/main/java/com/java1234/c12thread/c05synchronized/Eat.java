package com.java1234.c12thread.c05synchronized;

public class Eat implements Runnable{

	private int baoZi=1;
	
	private String threadName;

	public Eat(String threadName) {
		super();
		this.threadName = threadName;
	}

	@Override
	public synchronized void run() {
		while(baoZi<=10){
			System.out.println(threadName+" �Ե�"+baoZi+"������");
			baoZi++;
		}
	}
	
	public static void main(String[] args) {
		//给资源上锁  方式1 方法上加synchronized
		Eat t1=new Eat("炒鸡张三");

		Thread t11=new Thread(t1);
		Thread t12=new Thread(t1);
		Thread t13=new Thread(t1);
		
		t11.start();
		t12.start();
		t13.start();
	}

}
