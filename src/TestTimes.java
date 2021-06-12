import java.util.ArrayList;
import java.util.Arrays;

public class TestTimes {
	
	ArrayList<Long> myList = new ArrayList<Long>();
	public static void main(String[] args) {
		TestTimes times = new TestTimes();
		times.addTestTime(1);
		times.addTestTime(2);
		times.addTestTime(3);
		times.addTestTime(4);
		times.addTestTime(5);
		times.addTestTime(6);
		times.addTestTime(7);
		times.addTestTime(8);
		times.addTestTime(9);
		times.addTestTime(10);
		times.addTestTime(11);
		times.addTestTime(12);
		System.out.println(times.getAverageTestTime());
		System.out.println(Arrays.toString(times.getTestTimes()));
		System.out.println(times.getLastTestTime());
		//times.resetTestTimes();
		//System.out.println(Arrays.toString(times.getTestTimes()));
	}
	
	public long getLastTestTime() {
		return myList.get(myList.size() - 1);
	}
		
	public long[] getTestTimes() {
		final long[] arr = new long[myList.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = myList.get(i);
		}
		return arr;
	}
	
	public void resetTestTimes() {
		myList.clear();
	}
	
		
	public void addTestTime(long testTime) {
		if(myList.size() < 10) {
			myList.add(testTime);
			System.out.println(Arrays.toString(myList.toArray()));
			System.out.println(myList.size());
		}
		else {
			myList.remove(0);
			myList.add(testTime);
		}
	}
		
		
	public double getAverageTestTime() {
		double sum = 0.0;
		for(int i = 0; i < myList.size(); i++) {
			sum += myList.get(i);
		}
		return sum / myList.size();
	}
}
