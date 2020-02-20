package algortimos;

public class Burbujeo {
	
	// 5 3 4 2
	// 3 5 4 2
	// 3 4 5 2
	// 3 4 2 5
	
	public int[] burbujeoSort(int[] vector){
		
		/*int contadorDeOrdenamiento= -1;
		int iterarHasta= vector.length;
		
		while(contadorDeOrdenamiento !=0){
			
			contadorDeOrdenamiento = 0;
			for(int i=0;i<iterarHasta;i++){
				for(int j=0;j<vector.length-1;j++){
					if(vector[j]>vector[j+1]){
						int aux=vector[j];
						vector[j]=vector[j+1];
						vector[j+1]=vector[j];
					}
				}
			}
			iterarHasta--;
		}
		
		return vector;*/
		
		
		for(int i=0; i<vector.length-1;i++){
			for(int j=0;j<vector.length-1;j++){
				if(vector[j]>vector[j+1]){
					int aux= vector[j];
					vector[j]= vector[j+1];
					vector[j+1]=aux;
				}
			}
		}
		return vector;
	}
}
