import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	

	public static void main(String[] args) {
		// Our arr contains 8 elements
        int[] arr = {22, 25, 45, 28, 40, 33, 37, 56, 28, 20};
 
        Arrays.sort(arr);
 
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
	}

}
