package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Introduction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[5];
		int[] marks_1;
		marks_1 = new int[10];
		int age[] = { 1, 1, 2, 1, 3, 5, 1 };

		int maxCount =0;
		int index =-1;


		List<Integer> ans = new ArrayList<Integer>();
		for(int i =0; i< age.length ; i++) {
			int count =0;
			for(int j =0; j<age.length ; j++) {
				if(age[i]==age[j]) {
					count++;
				}
				if(count > maxCount) {
					maxCount = count;
					index =i;
				}
			}
		}

int n = age.length;

		if (maxCount > n / 2)
            System.out.println(age[index]);

        else
            System.out.println("No Majority Element");
    }
	}


