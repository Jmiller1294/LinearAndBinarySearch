import java.util.Arrays;

public class SearchDriver implements SearchDriverInterface{
	public static void main(String[] args) {
		SearchDriver d = new SearchDriver();
		d.runLinearSearch(d.getListOfNumbers(), 500, 10);
		d.runBinarySearch(d.getListOfNumbers(), 500, 10);
	}
	
	public int[] getListOfNumbers() {
		int[] arr = new int[10000000];
		
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = i + 1;
		}
		return arr;
	}
	
	public int[] getTargets() {
		int[] arr = new int[] {500, 10000, 100000, 1000000, 5000000, 7500000, 10000000};
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
		
		LinearSearch linear = new LinearSearch();
		long startTime = System.nanoTime();
		while(numberOfTimes > 0 ) {
			linear.search(listOfNumbers, target);
			numberOfTimes--;
			//System.out.println("hello");
		}
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		return new TestTimes();
	}
	
	public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
		
		BinarySearch binary = new BinarySearch();
		long startTime = System.nanoTime();
		while(numberOfTimes > 0 ) {
			binary.search(listOfNumbers, target);
			numberOfTimes--;
			//System.out.println("world");
		}
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		
		return new TestTimes();
	}
}
