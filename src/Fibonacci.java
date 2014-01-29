/**
 * Generate the nth fibonacchi 
 * @author chandru
 *
 */
public class Fibonacci {
	
	private int first = 1;
	private int second = 1;

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(String.valueOf(f.getntthfib(1)));
		System.out.println(String.valueOf(f.getntthfib(2)));
		System.out.println(String.valueOf(f.getntthfib(3)));
		System.out.println(String.valueOf(f.getntthfib(4)));
		System.out.println(String.valueOf(f.getntthfib(5)));
		System.out.println(String.valueOf(f.getntthfib(6)));
		System.out.println(String.valueOf(f.getntthfib(1000000)));

	}

	/**
	 * Note there is a sub linear solution to find the nth fibonacci using matrix multiplcation. 
	 * @param i
	 * @return
	 */
	private int getntthfib(int i) {
		if (i < 1){
			return 0;
		} else if (i == 1){
			return this.first;
		} else if (i == 2){
			return this.second;
		}
		
		int result = 0;
		int nminus1 = this.second;
		int nminus2 = this.first;
		for (int x = 3; x <= i; x++ ){
			result = nminus1 + nminus2;
			nminus2 = nminus1;
			nminus1 = result;
			
		}
		
		return result;
	}
	
	//This is a bad solution. it is of the order n!
	//This can be converted to O(n) if we store the value is hash table. 
	// but it needs a lot of space. which is not needed. 
	private int getnthfibrecursive(int i){
		if (i < 0){
			return 0;
		}else if (i == 1 ){
			return this.first;
		}else if (i == 2 ){
			return this.second;
		}else {
			return getnthfibrecursive(i -1 ) + getnthfibrecursive(i -2);
		}
	}

}
