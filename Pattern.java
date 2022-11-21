public class Pattern {

    void Rectangle() {

        for(int i=0;i<5;i++) {
            for(int j=0;j<4;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


    }

    void HollowRectangle() {

        int i,j;
        for(i=0;i<5;i++) {
            for(j=0;j<4;j++) {
                if(i==0 || i==4 || j==0 || j==3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }


    }

    void HalfPrymaid() {

        for(int i=0;i<5;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    

    void invertedHalfPrymaid() {
        for(int i=0;i<5;i++) {
            for(int j=i;j<5;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    void HalfPrymaid_180_Rotation() {

        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(j<5-i) {

                    System.out.print("  ");

                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

    }
  
    public static void main(String args[]) {
        Pattern p = new Pattern();

        for(int i=0;i<5;i++) {
            for(int j=0;j<=i;j++) {
                if(j%2==0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
        
    }
    
}
