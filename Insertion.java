package algortimos;

public class Insertion {
	
	// 30 15 2 21 44 8 
	// 30 30 2 21 44 8
	// 15 30 2 21 44 8
	
	// 2 15 21 30 44 44
	// 2 8 15 21 30 44
	//j=4
	public int[] insertionSort(int[] array){
		
		int aux;
		int j;
		for(int p=1;p<array.length;p++){
			aux = array[p];
			j = p-1;
			
			while( j>= 0 && aux<array[j]){
				array[j+1]=array[j];
				j--;
			}
			
			array[j+1]=aux;
			
		}
		return array;
	}
}
