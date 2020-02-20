package algortimos;

public class SelectionSort {
	// 3 7 5 1 6
	// 1 7 5 3 6
	// 1 3 5 7 6
	// 1 3 5 7 6
	// 1 3 5 6 7
	public int[] selection(int[] vector){
		
		int minimo;
		for(int i=0; i<vector.length-1;i++){
			minimo = i;
			
			for(int j=i+1;j<vector.length;j++){
				if(vector[j]<vector[minimo]){
					minimo = j;
				}
			}
			
			int aux = vector[i];
			vector[i]=vector[minimo];
			vector[minimo]=aux;
		}
		return vector;
	}	
}
