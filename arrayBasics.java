import java.util.Scanner;

public class arrayBasics {

    void printSum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rown sand coloumn");
        int r= sc.nextInt();
        int c=sc.nextInt();

        int arr[][] = new int[r][c];

        
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j]= sc.nextInt();       
            }
        }
        

        // //Row Wise
        int maxSum=Integer.MIN_VALUE;
        int maxSumIndex=0;
        System.out.println("Row Wise Sum of Matrix");
        for(int i=0;i<r;i++) {
            int sum=0;
            for(int j=0;j<c;j++) {
                sum=sum+arr[i][j]; 
                if(maxSum < sum) {
                    maxSum = sum;
                    maxSumIndex=i;
                }    
            }
            System.out.println(sum);
        }  

        System.out.println("Maixmum Sum Row Wise"+maxSum+" of index"+maxSumIndex);
        

        
        
        // //Column Wise
        // System.out.println("Coloum Wise Sum of Matrix");
        // for(int i=0;i<c;i++) {
        //     int sum=0;
        //     for(int j=0;j<r;j++) {
        //         sum=sum+arr[j][i];     
        //     }
        //     System.out.println(sum);
        // } 

    }

    void elementSerach(int ele) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rown sand coloumn");
        int r= sc.nextInt();
        int c=sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j]= sc.nextInt();       
            }
        }
        
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(arr[i][j] == ele) {
                    System.out.println("fount at row " +i+ "  column "+j );
                }      
            }
        }

    }

    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Rown sand coloumn");
        // int r= sc.nextInt();
        // int c=sc.nextInt();


        // int arr[][] = new int[r][c];

        // for(int i=0;i<r;i++) {
        //     for(int j=0;j<c;j++) {
        //         arr[i][j]= sc.nextInt();       
        //     }
        // }
        
        // for(int i=0;i<r;i++) {
        //     for(int j=0;j<c;j++) {
        //         System.out.print(arr[i][j]+" ");       
        //     }
        //     System.out.print("\n");
        // }

        arrayBasics ab = new arrayBasics();
        // ab.elementSerach(4);
        ab.printSum();

    }
    
}
