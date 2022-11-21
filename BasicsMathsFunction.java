//BasicsMathsFunction

class BasicsMathsFunction {

    //1
    void checkEvenOdd(int number) {
        if (number % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    //2
    void checkPerfectnumber(int number) {
        int sum = 0;
        for (int i = 1; i < number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number)
            System.out.println("perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }

    //3
    void checkArmstrong(int number) {

        int sum=0;
        int num;
        int temp = number;
        while(temp!=0) {
            num = temp%10;
            sum = sum + (num*num*num);
            temp=temp/10;
        }

        if (sum == number)
            System.out.println(" is an Armstrong number.");
        else
            System.out.println(" is not an Armstrong number.");

    }

    //4
    boolean palindromeNumber(int number) {
        int orignalNum=number;
        int reverse=0;
        while(number>0) {
            reverse=reverse*10+number%10;
            number=number/10;
        }

        if(orignalNum==reverse) {
            return true;
        }
        else
            return false;
    }

    //5
    void checkStrong(int Number) {
        int num,sum=0;
        int temp=Number;
        while(Number!=0) {
            num=Number%10;
            sum=sum+factorial(num);
            Number=Number/10;
        }
        if(sum==temp)
            System.out.println("Strong Number");
        else    
            System.out.println("not Strong NUmber");
    }

    //6
    void checkPrime(int number) {

        int flag = 0;
        if (number < 2) {
            flag++;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                flag++;
            }
        }

        if (flag > 0)
            System.out.println("Not Prime Number");
        else
            System.out.println("Prime Number");

    }


    //7
    void findLuckyNumber(int dob) {

        int sum = 0;
        int num;
        while (dob != 0) {
            num = dob % 10;
            sum = sum + num;
            dob=dob/10;
        }
        if(sum>10)
            findLuckyNumber(sum);
        else
            System.out.println(sum);
    }

    //8
    int reverseInteger(int number) {
        int reverse=0;
        while(number>0) {
            reverse=reverse*10+number%10;
            number=number/10;
        }
        return reverse;
    }

    //9
    int factorial(int number) {
        if (number == 0)    
             return 1; 

        return number*factorial(number-1);
    }

    //11
    int minMoves() {
        int moves=0,sum=0;
        int nums[]={1,2,3,4};
        int min=Integer.MAX_VALUE;
        int numlength=nums.length;
        for(int i=0;i<numlength;i++) {
            if(nums[i]<min) {
                min=nums[i];
            }
            // Math.min(min, nums[i]);
            sum= sum+nums[i];
        }
        moves=sum-(numlength*min);
        return moves;
    }

    //12
    void fibonacciSeries(int number) {

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

        System.out.print(firstNumber+", "+secondNumber+", ");
        
        for(int i=2; i <= number; ++i) {
            nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + ", ");
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        } 
    }

    public static void main(String args[]) {

        BasicsMathsFunction b = new BasicsMathsFunction();

        // b.checkEvenOdd(2);
        
        // b.checkPerfectnumber(28);
        
        // b.checkPrime(6);
        
        // b.checkArmstrong(153);
        
        // System.out.println(b.factorial(5));
        
        // b.findLuckyNumber(25121999);

        // b.checkStrong(145);

        // b.reverseInteger(123);
        
        // b.palindromeNumber(313);

        
        // System.out.println(b.factorial(5));
        // // b.minMoves();

        b.fibonacciSeries(10);
    }
    
}
