package FourthAttempt;

public class Operation {
    public static void main(String[] args) {

        Operationable operationSum = (x,y)->x+y;
        Operationable operationDifference = (x,y)->x-y;
        Operationable operationMultiplication = (x,y)->x*y;
        Operationable operationDivision = (x,y) -> x/y;

        System.out.println(operationSum.calculate(10, 20));
        System.out.println(operationDifference.calculate(10, 20));
        System.out.println(operationMultiplication.calculate(10,20));
        System.out.println(operationDivision.calculate(10,20));
    }
}
