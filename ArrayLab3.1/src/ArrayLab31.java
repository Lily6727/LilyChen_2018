import java.util.Arrays;
public class ArrayLab31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a1 = {1,2,3,4,5,8,9};
    	int[]a2 = {2,3,4,5,6,10,90};
    	int[]sumArr = sum(a1,a2);
    	int appendNum = 200;
    	int[]appendArr = append(a1,appendNum);
    	int removeIdx = 3;
    	int[]removeArr = remove(a2,removeIdx);
    	int sumOfEvens = sumEven(appendArr);
    	rotateRight(a1);
    	
    	
    	
    }    
	public static int[]sum(int[]arr1, int[]arr2){
		int[]c = new int[arr1.length];
    	    for(int i = 0; i<c.length-1; i++) {
    		c[i] = arr1[i]+arr2[i];
    	}
    	return c;

    	}
    public static int[]append(int[]arr, int num){
    	int[]output = new int[arr.length+1];
    	int d = 6;
    	output[arr.length+1] = d;
    	for(int i = 0; i<arr.length; i++) {
    		output[i] = arr[i];
    	}
    	return arr;
    }
    public static int[]remove(int[]arr, int idx){
        int[]newN = new int[arr.length-1];
        for(int i = 0; i<idx; i++) {
    		newN[i] = arr[i];
    	}
        for(int i = idx+1; i<arr.length; i++) {
        	newN[i-1] = arr[i];
        }
        return newN;
    	
    }
    public static int sumEven(int[]arr){
    	int output = arr[0];
    	for(int i = 2; i<arr.length; i+=2) {
    		output = arr[i] + output;
    	}
    	return output;
    	
    }
    
    public static void rotateRight(int[]arr) {
    	int temp = arr[arr.length-1];
    	for(int i = arr.length-1; i>=1; i-=1) {
    		arr[i] = arr[i-1];
    	}
    	arr[0] = temp;
    }

		
    


	}


