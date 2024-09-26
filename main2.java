public class main2{
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 3.50;
        double doubleOperandB = 4.50;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient ;
        intSum = intOperandB + intOperandA;
        intProduct = intOperandB * intOperandA;
        intDifference = intOperandB - intOperandA;
        intQuotient = intOperandB / intOperandA;
        intModulo = intOperandA % intOperandB;
        doubleSum = doubleOperandB + doubleOperandA;
        doubleProduct = doubleOperandB * doubleOperandA;
        doubleDifference = doubleOperandB - doubleOperandA;
        doubleQuotient = doubleOperandB / doubleOperandA;
        System.out.println("The sum using int of " + intOperandB + " and " + intOperandA + " is " + intSum);
        System.out.println("The product using int of " + intOperandB + " and " + intOperandA + " is " + intProduct);
        System.out.println("The difference using int of " + intOperandB + " and " + intOperandA + " is " + intDifference);
        System.out.println("The quotient using int of " + intOperandB + " and " + intOperandA + " is " + intQuotient);
        System.out.println("The modulo using int of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        System.out.println("The sum using double of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleSum);
        System.out.println("The product using double of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleProduct);
        System.out.println("The difference using double of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);
        System.out.println("The quotient using double of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleQuotient);

    }
}


