
public class Duplex {

	public static void main(String []args) {
		
	//	int []arr = {-500,-400,-300,-10,0,6,10,200,500,700};

	/*	int n = -4;
		int len = arr.length;

		int []arr1 = new int[2];

		for(int i = 0; i<len-1 ;i++ ) {

		for(int j = i+1; j< len ; j++) {

		if((arr[i] + arr[j]) == n)  {

		arr1[0] = arr[i];
		arr1[1] = arr[j];
		System.out.println("pair is  = " + arr1[0] + " , " + arr1[1]);
*/
		int []arr = {-500,-400,-300,-10,6,10,200,500,700};
		int n = -4;
	int l = 0;
	int r = 1;
	int sum = arr[0] + arr[1];
	
	if(sum == n)
		System.out.println(arr[l] + " , " + arr[r]);
	
	while(r < arr.length-1) {
		r++;
		sum = sum + arr[r];
		sum = sum - arr[l];
		l++;
		
		if(sum == n)
		System.out.println(arr[l] + " , " + arr[r]);
		}


		}

}
