package algortimos;

class Binario {
	public int busquedaBinaria(int[]array,int valorBuscado){
		
		int inf = 0;
		int max = array.length - 1;
		int mid;
		
		//{1,2,3,4,5,6,7,8,9}
		while(inf <= max){
			mid = inf + ((max-inf)/2);
			
			if(array[mid]==valorBuscado){
				return mid;
			} else if(array[mid] < valorBuscado){
				inf = mid + 1;
			} else{
				max = mid - 1;
			}
		}
		return -1;
	}
}
