public class WorkingWithIntegers {
    public static void main(String[] args) {
        //Working with integers
        /*
        byte - 1 byte - (-2(n-1)) to +2(n-1) -1 - -2(7) to  +2(7) -1 -> -128 to +127
        short - 2 bytes
        int - 4 bytes
        long - 8 bytes
         */

        //datatype variablename; //declaration of variable (data)

        byte age; //declaration
        age = 40;

        System.out.println(age);

        age = 20;

        System.out.println(age);

        // age = 130; not allowed exceeds the range of byte

        byte decrementPercentage;
        decrementPercentage = -10;

        System.out.println(decrementPercentage);
        decrementPercentage = -140;
    }
}
