package loop;

public class ExampleOfForLoop {
	int[] a = {1,2,3,4,5,6,7,8,9,10};
	void printA() {
		for(int i=1 ; i<=a.length ; i=i+1) {
			if( i % 2 == 0 ) {
			System.out.println(i);
			}
		}
	}

}
