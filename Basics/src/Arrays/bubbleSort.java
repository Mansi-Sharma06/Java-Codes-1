package Arrays;

public class bubbleSort {

	public static void bubblesort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 8,2,6,1,5};
		bubblesort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");

		}

	}
}