package otherTask;

import java.util.Arrays;

public class Lesson2HW_1 {

	private int size;
		
	public Lesson2HW_1(int size) {
		super();
		this.size = size;
	}

	public void start() {
					
				findMinAndMax(createMass(size));
	}
	
	public int[] createMass(int size) {
		int[] mass = new int[size];
		int a = 1;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = a;
			a++;
		}	
		showMass(mass);
		return mass;	
	}
	
	public void showMass(int[] mass) {
		for (int i : mass) {
			System.out.print(i+" ");
		}
	}
	
	public void findMinAndMax(int[] mass) {
		int min = Arrays.stream(mass).min().orElse(0);
		System.out.println();
		System.out.println("Min element in array ="+min);
		int max = Arrays.stream(mass).max().orElse(0);
		System.out.println("Max element in array ="+max);
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == min){
				minIndex = i;
			}
			if (mass[i] == max){
				maxIndex = i;
			}
		}
		changeElements(mass, minIndex, maxIndex, min, max);
		
		
	}
	
	public void changeElements(int[] mass, int minIndex, int maxIndex,int min,int max) {
		
		mass[minIndex] = max;
		mass[maxIndex] = min;
		showMass(mass);
		
		
	}
	
	
	
}
