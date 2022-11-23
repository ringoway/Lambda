package FourthAttempt;

public class Operation {
    public static void main(String[] args) {

        Operationable operationSum = (x,y)->x+y;
        Operationable operationDifference = (x,y)->x-y;
        Operationable operationMultiplication = (x,y)->x*y;
        Operationable operationDivision = (x,y) -> x/y;

        Double valueS = (double) operationSum.calculate(10, 20);
        Double valueDf = (double) operationDifference.calculate(10, 20);
        Double valueM = (double) operationMultiplication.calculate(10,20);
        Double valueDn = (double) operationDivision.calculate(10,20);

        System.out.println(valueS);
        System.out.println(valueDf);
        System.out.println(valueM);
        System.out.println(valueDn);
    }
}
