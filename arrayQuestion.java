import java.util.*;

class arrayQuestion {

    // 1 MINIMUM Element
    void minElement(int array[]) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("MINIMUM Element " + min);
    }

    // 2 MAXIMUM ELEMENT
    void maxElement(int array[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum Element " + max);
    }

    // 3 SUM OF ARRAY ELEMENT
    void sumofArray(int array[]) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum " + sum);
    }

    // 4 REVERSE OF ARRAY
    void reverseArray(int array[]) {

        printArray(array);

        int temp;
        int start = 0, end = array.length - 1;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        printArray(array);
    }

    // 5 ALTERNATE element REVERSE OF ARRAY
    void alternateReverse(int array[]) {

        printArray(array);

        int temp;
        for (int i = 0; i < array.length; i = i + 2) {
            if (i + 1 < array.length) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

        }
        printArray(array);
    }

    // 6 Find UNIQUE ELEMENT IN ARRAY
    void uniqueElement(int array[]) {

        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            ans = ans ^ array[i];

        }
        System.out.println(ans);
    }

    // 7 Find Duplicate ELEMENT IN ARRAY
    void duplicateElement(int array[]) {

        // APPROACH 1
        // Fail for test case array={2,2,2,2,2,2}
        /*
         * int ans = 0;
         * for (int i = 0; i < array.length; i++) {
         * ans = ans ^ array[i];
         * }
         * 
         * for (int i = 0; i < array.length; i++) {
         * ans = ans ^ i;
         * }
         */

        // APPROACH 2 Usinh HASH SET
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int num : array) {
            if (seen.contains(num))
                System.out.println(num);
            seen.add(num);
        }


        /* Find ALL DUPLICATE all element in array 
            Using ARRAYLIST  
        {
            List< Integer > list=new ArrayList< Integer >();
             HashSet<Integer> seen = new HashSet<Integer>();
            for (int num : nums) {
                if (seen.contains(num))
                    list.add(num);
                seen.add(num);
            }
            return list;
        }

         */


    }

    //8 Find Array InterSection 
    // TWO POINTER APPROACH
    void arrayIntersection(int array[], int array1[]) {
        int i=0,j=0;
        while(i<array.length && j<array1.length) {
            if(array[i]==array1[j]) {
                System.out.println(array[i]);
                i++;
                j++;
            }
            else if(array[i]>array1[j]) {
                j++;
            }

            else {
                i++;
            }
        }
    }

    // 9 UNIQUE NUMBER OF OCCURRENCESS
    boolean numberofOccurences(int array[]) {

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        // Stores key AND occurrences
        for (int i = 0; i < array.length; i++) {

            if (freq.containsKey(array[i])) {
                freq.put(array[i], freq.get(array[i]) + 1); // if present then increment occurrences by 1
            } else {
                freq.put(array[i], 1); // if not present then ADD key
            }

        }

        HashSet<Integer> uniqueFreq = new HashSet<Integer>();

        for (Integer f : freq.values()) {
            uniqueFreq.add(f);
            if (uniqueFreq.containsAll(freq.values())) {
                return true;
            }
        }
        return false;

    }


    //10 TWO SUM
    void twoSum(int array[], int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++) {
           
            map.put(array[i],i);
        }
        
        for(int i=0;i<array.length;i++) {
            int number = array[i];
            int remainingNumber = target - number;
            if(map.containsKey(remainingNumber)) {
                int indexofRemainingNumber = map.get(remainingNumber);
                if(indexofRemainingNumber==i) continue;
                System.out.println(i+""+indexofRemainingNumber); 
            }
                
        }
    }

    //14 Kth Largest Element
    void kthlargestElement(int array[], int k) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer>();
        for(int i=0;i<k;i++) {
            max.add(array[i]);
        }
        
         for(int i=k;i<array.length;i++) {
             if(max.peek()<array[i]) {
                 max.remove();
                 max.add(array[i]);
                 
             }
        }
        System.out.println(max.peek());


        //MINIMUN ELEMENT

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<k;i++) {
            pq.add(array[i]);
        }
        
         for(int i=k;i<array.length;i++) {
             if(pq.peek()>array[i]) {
                 pq.remove();
                 pq.add(array[i]);
                 
             }
        }
        System.out.println(pq.peek());


    }

    //15 MAX SUB Array
    void maxSubArray(int array[]) {

        int maxSum = array[0], currSum = 0;
        for(int i = 0; i < array.length; i++){
            currSum = currSum + array[i];
            if(currSum < array[i]){
                currSum= array[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);

    }

    //18 Intersection of Sorted Arrays
    void findCommon(int ar1[], int ar2[], int ar3[])
    {
        // Initialize starting indexes for ar1[], ar2[] and
        // ar3[]
        int i = 0, j = 0, k = 0;
 
        // Iterate through three arrays while all arrays
        // have elements
        while (i < ar1.length && j < ar2.length
               && k < ar3.length) {
            // If x = y and y = z, print any of them and
            // move ahead in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }
 
            // x < y
            else if (ar1[i] < ar2[j])
                i++;
 
            // y < z
            else if (ar2[j] < ar3[k])
                j++;
 
            // We reach here when x > y and z < y, i.e., z
            // is smallest
            else
                k++;
        }
    }

    //19 
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;int prod=1;
        
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            max=Math.max(max,prod);
            if(prod==0){
                prod=1;
            }
        }
		
               // This another loop is for handling edge cases like  - 8   5   3   1    6  .
	// In this  , product at the end become negative . that's why we have to do this
	
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            prod*=nums[i];
            max=Math.max(max,prod);
            if(prod==0){
                prod=1;
            }
        }
        return max;
    }

    //20 Minimum NUmber of jumps
    public int jump(int[] nums) {
        
        int jumpCount = 0;
        int leftIdx = 0;
        int rightIdx = 0;

        while (rightIdx < nums.length - 1){
            int farthestIdx = 0;
            for (int i = leftIdx; i <= rightIdx; i++){
                farthestIdx = Math.max(farthestIdx, i + nums[i]);
            }
            leftIdx = rightIdx + 1;
            rightIdx = farthestIdx;
            jumpCount++;
        }

        return jumpCount;
        
    }

    // TO Print ARRAY
    void printArray(int array[]) {

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
    }


    public static void main(String args[]) {
        int array[] = {-2,1,-3,4,-1,2,1,-5,4};
        int array1[] = {2,7,11,15};
        arrayQuestion arr = new arrayQuestion();

        // arr.minElement(array);

        // arr.maxElement(array);

        // arr.sumofArray(array);

        // arr.reverseArray(array);

        // arr.alternateReverse(array);

        arr.uniqueElement(array);

        // arr.numberofOccurences(array);

        // arr.duplicateElement(array);
        
        // arr.arrayIntersection(array, array1);

        // arr.twoSum(array1, 9);

        // arr.kthlargestElement(array, 2);

        // arr.maxSubArray(array);
    }

}


