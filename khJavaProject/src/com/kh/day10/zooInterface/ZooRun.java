package com.kh.day10.zooInterface;

public class ZooRun {

	public static void main(String[] args) {

		ZooKeeper zk =  new ZooKeeper();
		zk.feed();
		zk.feed(new Tiger());
		zk.feed(new Lion());
		zk.feed(new Bear());
	}

}
