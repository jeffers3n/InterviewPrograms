package com.sunilsahoo.thread;

public class MultiThread extends Thread {
	@Override
	public void run() {
		System.out.println("Running Thread Name: " + currentThread().getName());
		System.out.println(
				"Running Thread Priority: " + currentThread().getPriority());
	}
}