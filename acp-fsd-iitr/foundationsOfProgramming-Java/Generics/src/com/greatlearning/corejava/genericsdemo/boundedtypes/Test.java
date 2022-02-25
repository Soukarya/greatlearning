package com.greatlearning.corejava.genericsdemo.boundedtypes;

class Test<T extends Number> {

}

class Test2<T extends Runnable>{
	
}

class Test3<T extends Number&Runnable>{
	
}

class Test4<T extends Number&Runnable&Comparable>{
	
}

class Test5<T extends Runnable&Comparable>{
	
}

/*

As per syntax, we have to write class first followed by the interface

class Test6<T extends Runnable&Number>{
	
}

*/

/*

We can't add more than one class simultaneously

class Test7<T extends Number&Thread>{
	
}

*/
