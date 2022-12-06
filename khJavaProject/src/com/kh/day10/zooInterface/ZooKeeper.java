package com.kh.day10.zooInterface;

public class ZooKeeper {
	// 오버로딩
	// 동물들이 너무 많으면 메서드가 너무 많아지는데..
	public void feed() {
		System.out.println("feed meat");
	}
	
//	public void feed(Tiger tiger) {
//		System.out.println("feed beef");
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed gazel");
//	}
//	
//	public void feed(Bear bear) {
//		System.out.println("feed salmon");
//	}
	
	// 인터페이스로 묶기
	public void feed(Predator pre) {
		System.out.println("feed: " + pre.animalFood());
	}

}
