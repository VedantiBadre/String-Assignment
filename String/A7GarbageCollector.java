package String;

public class A7GarbageCollector {

	String str;

	public A7GarbageCollector(String str) {
		this.str = str;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.str + " collected");
	}

	public static void main(String[] args) {
		 A7GarbageCollector gc = new A7GarbageCollector("Vedanti");
	        System.out.println("String=" + gc.str.toString());
	        gc = null;
	        System.gc();
	}



	}


