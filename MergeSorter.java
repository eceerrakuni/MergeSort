public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		
		if(lo < hi){
			int middle = (lo + hi) / 2;
			mergeSort(list, lo, middle);
			mergeSort(list, middle+1, hi);
			merge(list, lo, middle, hi);
		}	
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		
		int[] array = new int[list.length];
		for (int i = lo; i <= hi; i++) {
			array[i] = list[i];
		}
		
		int arrayLeft = lo;
		int arrayRight = mid+1;
		int current = lo;
		
		while (arrayLeft <= mid && arrayRight <=hi) {
			if(array[arrayLeft] <= array[arrayRight]){
				list[current] = array[arrayLeft];
				arrayLeft++;
				
			}else{
				list[current] = array[arrayRight];
				arrayRight++;
			}
			current ++;		
		}
		
		int remaining = mid - arrayLeft;
		for (int i = 0; i <= remaining; i++) {
			list[current+i] = array[arrayLeft+ i];
		}
	}
	}
	
