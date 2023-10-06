package practise;

public class copy_array {

	public static void main(String[] args) {
		int array1[]=new int[] {10,20,30,40,50};
		
		//create another array
		int array2[]=new int [array1.length];
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		System.out.println("display original array");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
			System.out.println();
			System.out.println("dispaly copy of array");
			for(int i=0;i<array2.length;i++) {
				System.out.print(array2[i]+" ");
			}
	}
		

	}


