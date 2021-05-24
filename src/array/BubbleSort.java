package array;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {30,20,10,50,60};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;i++) {
				if(a[i]<a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			
		}
	}

}
