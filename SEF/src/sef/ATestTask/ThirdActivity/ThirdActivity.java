package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption();
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException exception){
            System.out.println("Ooops, the value is incorrect");
        }
        finally {
            System.out.println("This should get printed even if there is an exception");
        }

    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exception

        void validateUser(String name) throws CustomExceptionActivity {
            //array of names
            String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0
            int flag = 0;
            for (int i = 0; i < 4; i++) {

//2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
                if (validUsers[i].equals(name)) {
                    flag = 1;
                    break;
                }

            }
//3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.
            if (flag == 0) {
                throw new CustomExceptionActivity();
            }
//4 - else if flag is one, print a message "Welcome to Payroll program".
            else if (flag == 1) {
                System.out.println("Welcome to Payroll program");
            }

        try {if ()}
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
            int result=num1/num2;
            System.out.println("The result is :" + result);

            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");

    }
}

