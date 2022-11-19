
class javaBasics {

    //LOOPS IN JAVA
    void loops() {

        //FOR EACH LOOP

        // for(data_type variable : array) {  
        //     //body of the loop  
        //  }  
        int arr[]={1,2,3,4};
        for(int arr1:arr) {
            System.out.println(arr1);
        }

        //WHILE LOOP
        while(0<1) {

        }
    }

    //Conditional Statements
    void conditionalStatements() {
        int number=0;

        //IF else if  else
        if(number>9) {
            System.out.println("Large");
        }
        else if(number>5) {
            System.out.println("MID");
        }
        else {
            System.out.println("Small");
        }

    }

    //SWITCH CASE
    void switchCase() {
        int i=0;
        switch(i) {
            case 0:
                System.out.println("1");
            default :
                System.out.println("default");
        }
    }

    //ARRAY IN JAVA
    void arrayBasics() {
        int a[] = new int[6];
        int b[]= {1,2,3,4,5,6,7,8,9};

    }

    public static void main(String[] args) {

        javaBasics jb = new javaBasics();
        // jb.loops();
        // jb.switchCase();
        System.out.println("hello");
    
    }    
}
