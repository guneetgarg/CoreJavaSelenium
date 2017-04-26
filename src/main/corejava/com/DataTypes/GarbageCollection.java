package com.DataTypes;

import java.util.Date;

//http://xyzcode.blogspot.in/2016/02/explain-objects-lifecycle-creation.html

class GarbageCollection{
  public static void main(String args[]) {
		GarbageCollection objref = new GarbageCollection(); // objref --> GCobj1
		objref.demo();
		System.gc(); // suggest JVM it is a good point to garbage collection, JVM may ignore
		objref = new GarbageCollection();  //objref --> GCobj2, GCobj1 is ready for garbage collection
		objref = null;  //GCobj2 is ready for garbage collection
    
		// try to create lots of garbage
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
			new GarbageCollection();
			System.gc();
		}
	}

  /*JVM calls this during garbage collection.
  * When GCobj1 and GCobj2 are garbage collected,
  * "in finalizer" can possibilily be printed twice.
  * However, there is no garentee the garbage collection will happen at all. 
  */ 
	protected void finalize() {
		System.out.println("in finalizer");
	}

	private void demo() {
		Date ref1 = new Date(); // ref1 -->object1;
		Date ref2 = new Date(); // ref2 -->object2; ref1 -->object1
		Date ref3 = ref1; // ref3, ref1 --> object1; ref2 --> object2
		Date ref4 = ref1; // ref4, ref3, ref1 --> object1; ref2 --> object2
		ref4 = ref2; // ref4, ref2 --> object2; ref3, ref1 --> object1
		ref4 = null; // ref2 --> object2; ref3, ref1 --> object1
		ref2 = ref1; // ref3, ref2, ref1 --> object1, object2 is ready for
						// garbage collection
	}//ref1, ref2, ref3 run out of scope, object1 is read for garbage collection
}