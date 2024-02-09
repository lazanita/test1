import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ConditionException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целочисленный пример: ");
        System.out.println(calc(sc.nextLine()));
            }
    public static String calc(String input) throws ConditionException {
        int count = 0, n=0;
        char c = '0';
        for ( char equSimb: input.toCharArray()) {
            if (equSimb == '+' || equSimb == '-' || equSimb == '*' || equSimb == '/') {
                c = equSimb;
                count++;
               n=input.indexOf(equSimb);
            }
        }
        int a=0,b=0;
        try {
            a = Integer.parseInt(input.substring(0, n));
            b = Integer.parseInt(input.substring((n+1), input.length()));
        } catch (NumberFormatException e) {
            throw new ConditionException();
        }
        if ((count!=1)||((a <= 0 || a > 10)||(b <= 0 || b> 10))) {
            throw new ConditionException();
        }
        int result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a/b;
                break;
            case '*':
                result = a*b;
                break;
        }
        return Integer.toString(result);
    }
        }



