package JavaLabPractical;

public class AverageArrayElement {
	public static void main(String[] args){
		int sum = 0;
		int[] arrayVar = {2,3,5,8,9};
		for(int a: arrayVar)
		{
		sum += a;
		}
		float average = sum / 4;
		System.out.println("Average of array elements is: " + average);
		}
}
