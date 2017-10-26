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
		
		int[] helper = new int[list.length];
		for (int i = lo; i <= hi; i++) {
			helper[i] = list[i];
		}
		
		int helperLeft = lo;
		int helperRight = mid+1;
		int current = lo;
		
		while (helperLeft <= mid && helperRight <=hi) {
			if(helper[helperLeft] <= helper[helperRight]){
				list[current] = helper[helperLeft];
				helperLeft++;
				
			}else{
				list[current] = helper[helperRight];
				helperRight++;
			}
			current ++;		
		}
		
		int remaining = mid - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			list[current+i] = helper[helperLeft+ i];
		}
	}
	}
	
