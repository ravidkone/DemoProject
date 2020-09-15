package JavaLogicProgms;

public class binarySearch {
	
	
	public static void bSearch(int[] arr,int first,int last, int key) {
		int mid=(first+last)/2;
		
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
			}else if(arr[mid]==key) {
				System.out.println("key found at index: "+mid);
				break;
			}else {
				last=mid-1;
			}
		mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("key not found");
		
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,40,50};
		int key=10;
		int last=a.length-1;
		bSearch(a,0,last,key);

	}

}
