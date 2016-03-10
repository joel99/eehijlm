public class MergeSortTester{
	 public static long test(int n, int i){
      	long timeSum = 0;
      	for (int k = 0; k < i; k++){
      	    int[] arr = new int[n];
      	    for (int j = 0; j < n; j++){
      		arr[j] = (int)(n * 10 * Math.random());
      	    }
      	    long start = System.nanoTime();
      	    int[] a = MergeSort.sort(arr); 
      	    long end = System.nanoTime();
      	    timeSum += end - start;
      	}
      	return timeSum / i;
    }
    
    public static void main(String[] args){
	    System.out.println("Average time: " + test(10, 1000));
		System.out.println("Average time: " + test(100, 1000));
		System.out.println("Average time: " + test(1000, 1000));
		System.out.println("Average time: " + test(10000, 1000));
		System.out.println("Average time: " + test(100000, 1000));
    }
}