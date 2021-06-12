
public class LinearSearch implements SearchInterface{
	

	public int search(int[] listOfNumbers, int target) {
		for(int i = 0; i < listOfNumbers.length; ++i) {
			if (listOfNumbers[i] == target) {
				return i;
			}
		}
		return target;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6,8,10};
		
		
		LinearSearch s = new LinearSearch();
		int res = s.search(arr, 10);
		System.out.println(res);
	}
	
}


