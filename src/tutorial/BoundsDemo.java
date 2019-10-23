package tutorial;

public class BoundsDemo {

	public static void main(String[] args) {
		
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		
		System.out.println("Recriprocal of iOb is: " + iOb.reciprocal());
		System.out.println("Fractional component of iOB is: " + iOb.fraction());
		
		System.out.println();
		
		NumericFns<Double> dOb = new NumericFns<Double>(5.25);
		
		System.out.println("Recriprocal of dOb is: " + dOb.reciprocal());
		System.out.println("Fractional component of dOB is: " + dOb.fraction());

	}

}
