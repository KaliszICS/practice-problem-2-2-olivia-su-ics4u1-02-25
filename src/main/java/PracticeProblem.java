import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	
	public static int[] compareSearch(int[] array, int number){

		Arrays.sort(array);

		int[] count = {0, 0};

		int start = 0;
		int end = array.length - 1;

		for (int i = 0; i < array.length; i++){
			count[0] += 1;
			if (number == array[i]){
				i = array.length;
			}
		}

		while(start <= end){
			count[1] += 1;
			int middle = (start + end) /2;

			if (number > array[middle]){
				start = middle + 1;
				
			}else if (number < array[middle]){
				end = middle - 1;
			
			}else{
				start = end + 1;
			}
		}
		return count;
	
	}

	public static int[] compareStringSearch(String[] array, String word){

		Arrays.sort(array);

		int[] count = {0, 0};

		int start = 0;
		int end = array.length - 1;

		for (int i = 0; i < array.length; i++){
			count[0] += 1;
			if (word.equals(array[i])){
				i = array.length;
			}
		}

		while(start <= end){
			count[1] += 1;
			int middle = (start + end) /2;
			int compare = word.compareTo(array[middle]);

			if (compare > 0){
				start = middle + 1;
				
			}else if (compare < 0){
				end = middle - 1;
			
			}else{
				start = end + 1;
			}
		}
		return count;
	}
}
