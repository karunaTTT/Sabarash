package pack;//unique number

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author ssadaiyappan
 * 
 */
class UniqueNumber {
	private static final Logger log = LogManager.getLogger(UniqueNumber.class);

	public static void main(String[] args) {
		log.info("You are into  main()");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give number for finding unique or not");
		int n = sc.nextInt(),count ;

		System.out.println("the number is " + n);
		log.info("the input number is ",n);


		count = UserMainCode4.getUnique(n);
		if (count > 0) {
			System.out.println("Not Unique");
		} else {
			System.out.println("Unique");
		}
		sc.close();
	}
}

class UserMainCode4 {
	private static final Logger log = LogManager.getLogger(UserMainCode4.class);

	public static int getUnique(int n)
	{
		log.info("You are into  getUnique(),paramater  - size:" ,n);

		int[] a = new int[50];
		int size = 0, count = 0;
		
		// making digits in my integer array
		while (n != 0) {
			int num = n % 10;
			a[size] = num;
			size++;
			n = n / 10;
		}
		
		//counting same digits
		for (int j = 0; j <= size - 1; j++) 
		{
			for (int k = j + 1; k <= size - 1; k++) 
			{
				if (a[j] == a[k]) 
				{
					count++;
				}
			}
		}		
		return count;
	}
}