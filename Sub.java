public class Sub {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int sum=a+b;
        int multi=a*b;
        int div=a/b;
        int sup = a-b;
        System.out.println("-----------Method One-----------");
        System.out.println("The Sum of Var A and B is " + sum);
        System.out.println("The multi of Var A and B is " + multi);
        System.out.println("The div of Var A and B is " + div);
        System.out.println("The subtraction of Var A and B is " + sup);
        System.out.println("-----------Method Two-----------");
        System.out.println("The Sum of Var A and B is " + (a + b));
        System.out.println("The multi of Var A and B is " + (a*b));
        System.out.println("The div of Var A and B is " + (a/b));
        System.out.println("The subtraction of Var A and B is " + (a-b));

    }
}
