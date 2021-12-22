package generic;

public class FindMaximum <T extends Comparable<T>>{

	private final T VAR1;
	private final T VAR2;
	private final T VAR3;

	public FindMaximum(T var1, T var2, T var3) {
		this.VAR1 = var1;
		this.VAR2 = var2;
		this.VAR3 = var3;
	}
	public T testMaximum() {
		T findMax = FindMaximum.testMaximum(VAR1, VAR2, VAR3);
		printMax(findMax); 
		return findMax;
	}

	public void printMax(T max) {
		System.out.println("\nMAXIMUM IS :- " + max);
	} 

	public static <T extends Comparable <T>> T testMaximum(T var1 , T var2 , T var3 ) {

		T max = var3;

		if(var1.compareTo(var2)>0  && var1.compareTo(max)>0) {
			max = var1;
		}
		else if (var2.compareTo(var3)>0 &&  var2.compareTo(max)>0) {
			max = var2;
		}
		else {
			max = var3;
		}
		return max;
	}
}


