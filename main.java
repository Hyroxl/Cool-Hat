package java_stuff;

/*public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world!");
		System.out.println(3+3);
		System.out.print("3+3=");
		System.out.print(3+3);
		 this is a comment!
		 this is a
		  multi-line comment 
		String hat = "cool";
		System.out.println(hat);
		int x = 5;
		int y = 5;
		int z = x + y;
		System.out.println(z);
		byte a = 100;
		byte b = 100;
		byte c = a + b;
		System.out.println(c);
		boolean hatiscool = true;
		if (hatiscool == true) {
		System.out.println("Cool Hat!");
		} else {
		System.out.println("Boring Hat");
		}
		int tester = 0;
		do {
			System.out.println(tester);
			tester++;
		}
		while (tester<50);
	}
}*/
public class Main {
	static void coolhat(String name) {
	if (name == "toby") {
		System.out.println(name +" Has a Cool Hat!");
	} else if (name == "brian") {
		System.out.println(name +" Has a Cool Hat!");
	} else if (name == "donovan") {
		System.out.println(name +" Has a Cool Hat!");
	} else if (name == "tyler") {
		System.out.println(name +" Has a Cool Hat!");
	}else {
		System.out.println(name +" Has a Boring Hat :(");
	}
		
	}
	
	
	public static void main(String[] args) {
	coolhat("toby");
	coolhat("brian");
	coolhat("donovan");
	coolhat("tyler");
	coolhat("john arbuckle");
	}
}