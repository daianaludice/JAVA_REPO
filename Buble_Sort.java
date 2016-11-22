package first;

public class Buble_Sort {
	public static void main(String[] args) {
		int[] Num = new int[]{2,5,6,3,9,1};
		int t;
		 for(int i=0; i< Num.length; i++){
			 for(int j=i; j< Num.length; j++){
				 if(Num[i] > Num[j]){
					 t= Num[i];
					 Num[i] = Num[j];
					 Num[j]=t;
				 }
			 }
		 }
		System.out.println(Num);
				 
			 
		 }
	}
		


