package com.kh.day14.listCollection;

public class ObjectList {
	// 배열의 단점 : 3. 한 타입의 데이터만 저장 가능하다
	// 다형성을 활용해 Object배열을 내부적으로 선언하여 보완
	
	private Object[] objects;
	private int size;

	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new ObjectList[3];
		size = 0;
	}
}
