
public class BinarySearch implements SearchInterface {
	public int search(int[] listOfNumbers, int target) {
		int low = 0;
		int mid = 0;
		int high = listOfNumbers.length - 1;
		
		
		while (low <= high) {
			mid = (low + high) / 2;
			
			if(listOfNumbers[mid] > target) {
				high = mid - 1;
			}
			else if(listOfNumbers[mid] < target){
				low = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
//	public static void main(String[] args) {
//		int[] arr = new int[] {14,26,42,59,71,88,92};
//		
//		BinarySearch s = new BinarySearch();
//		
//		int res = s.search(arr, 14);
//		System.out.println(res);
//	}
}
