package Basics;

/**
 * 
 * @author Shahana Basheer 4.Arrays in java
 *
 */

public class Arrays {

	public void addNum() {
		int a[] = { 10, 20, 30, 40 };
		int sum = 0;

		System.out.println("\n1.Add integer elements of an array");
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("  Sum:" + sum);
	}

	public void average() {
		int a[] = { 10, 20, 30, 40 };
		int sum = 0, average;

		System.out.println("\n 2.Average value of an array of inegers");
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		average = sum / a.length;
		System.out.println("  Average :" + average);

	}

	public void findIndex() {
		int a[] = { 10, 20, 30, 40 };

		/*
		 * System.out.println("Enter the number"); Scanner in=new Scanner(System.in);
		 * num=in.nextInt();
		 */

		int num = 30;
		System.out.println("\n 3.FInd index of element");

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num)
				System.out.println("  Index of " + num + " is " + i);

		}
	}

	public void containsValue() {
		int a[] = { 10, 20, 30, 40 };

		System.out.println("\n 4.Array contains specific value");

		/*
		 * System.out.println("Enter the number"); Scanner in=new Scanner(System.in);
		 * num=in.nextInt();
		 */

		int num = 20;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num)
				flag = true;
		}
		if (flag)
			System.out.println("  Array contains the value " + num);
		else
			System.out.println("Array does not contain the value");
	}

	public void removeValue() {

		int a[] = { 10, 20, 30, 40 };
		int[] newarray = new int[a.length - 1];

		System.out.println("\n 5.Remove value from an array");

		/*
		 * System.out.println("Enter the number"); Scanner in=new Scanner(System.in);
		 * num=in.nextInt();
		 */

		int num = 40;

		for (int i = 0, k = 0; i < a.length; i++) {
			if (a[i] == num) {
				continue;
			}
			newarray[k++] = a[i];
		}

		System.out.println(" New array after removal: ");
		for (int k = 0; k < newarray.length; k++) {
			System.out.print(" " + newarray[k]);
		}
	}

	public void copyArray() {
		int a[] = { 10, 20, 30, 40 };
		int[] newarray = new int[a.length];

		System.out.println("\n 6.Copy array");
		for (int i = 0; i < a.length; i++) {
			newarray[i] = a[i];
		}

		System.out.println("  New array: ");
		for (int k = 0; k < newarray.length; k++) {
			System.out.print("  " + newarray[k]);

		}
	}

	public void insertElement() {
		int a[] = { 10, 20, 30, 40 };
		int[] newarray = new int[a.length + 1];

		System.out.println("\n7.Insert element to an array");
		int num, index;
		num = 50;
		index = 4;

		for (int i = 0; i < newarray.length; i++) {
			if (i != index)
				newarray[i] = a[i];
			else if (i == index) {
				newarray[i] = num;
			}
		}

		System.out.println("  New array after insertion : ");
		for (int k = 0; k < newarray.length; k++) {
			System.out.print("  " + newarray[k]);

		}
	}

	public void minAndmax() {
		int a[] = { 20, 30, 10, 40 };
		int min, max = 0;
		System.out.println("\n 8.Minimum and maximum number in an array");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("  Maximum number is " + max);

		min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("  Minimum number is " + min);

	}

	public void reverseArray() {
		int a[] = { 10, 20, 30, 40 };
		int[] newarray = new int[a.length];
		System.out.println("\n 9.Reverse of an array");
		int j = a.length;
		for (int i = 0; i < a.length; i++) {
			newarray[j - 1] = a[i];
			j = j - 1;
		}

		for (int k = 0; k < newarray.length; k++)
			System.out.print("  " + newarray[k]);
	}

	public void findDuplicates() {
		int a[] = { 10, 30, 30, 40 };
		System.out.println("\n 10.Find duplicate elements in an array");
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.print(" " + a[j]);
			}

	}

	public void findCommonvalues() {
		int arr1[] = { 5, 10, 15, 20, 25 };
		int arr2[] = { 10, 20, 30, 40 };
		System.out.println("\n11.FInd common values between two arrays");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j])
					System.out.print(arr1[i] + " ");

			}
		}
	}

	public void removeDuplicate() {
		int a[] = { 10, 30, 30, 50, 60 };
		int[] temp = new int[a.length];
		int k = 0;

		System.out.println("\n 12.Remove duplicate elements in an array");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					temp[k] = a[i];
					k++;
				}
				break;
			}
		}
		temp[k++] = a[a.length - 1];
		System.out.print("  Old array:");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);

		System.out.print("\n  New array:");
		for (int i = 0; i < temp.length - 1; i++)
			System.out.print(" " + temp[i]);

	}

	public void findSecondlargest() {
		int a[] = { 10, 30, 40, 20, 50 };
		int temp;
		System.out.println("\n 13.Find second largest element in an array");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		System.out.println("  The second largest element is: " + a[a.length - 2]);
	}

	public void findNumofEvenOdd() {
		int a[] = { 10, 20, 34, 47, 18, 25 };
		int even = 0, odd = 0;
		System.out.println("\n 15.Find number of even and odd numbers in an array");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				even = even + 1;
			else
				odd = odd + 1;
		}
		System.out.println("  Number of even numbers is: " + even + " Number of odd numbers: " + odd);

	}

	//Function to Find difference of largest and smallest number in an array
	public void diffLargeSmall() {
		int a[] = { 10, 30, 24, 55, 35 };
		int large = 0, small;
		System.out.println("\n 16.Find difference of largest and smallest number in an array");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large)
				large = a[i];
		}
		small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small)
				small = a[i];
		}
		System.out.println("  Difference : " + (large - small));

	}

	//Function to check Array contains two specific value
	public void containsTwovalue() {
		int a[] = { 10, 23, 12, 40 };

		System.out.println("\n 17.Array contains two specific value");

		int num1 = 23, num2 = 12;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num1) {
				System.out.println("  Array contains the value " + num1);
			} else if (a[i] == num2) {
				System.out.println("  Array contain the value " + num2);
			}
		}

	}

	//Function to find Missing number from sorted array of 1 to 100
	public void missingNum() {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("\n 19.Missing number from sorted array of 1 to 100");

		int j = 0;
		for (int i = 1; i <= 100; i++) {
			if (j < a.length && i == a[j])
				j++;
			else
				System.out.print(" " + i);
		}

	}

	public static void main(String args[]) {

		Arrays array = new Arrays();
		array.addNum();
		array.average();
		array.findIndex();
		array.containsValue();
		array.removeValue();
		array.copyArray();
		array.insertElement();
		array.minAndmax();
		array.reverseArray();
		array.findDuplicates();
		array.findCommonvalues();
		array.removeDuplicate();
		array.findSecondlargest();
		array.findNumofEvenOdd();
		array.diffLargeSmall();
		array.containsTwovalue();
		array.missingNum();

	}

}
