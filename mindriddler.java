public class mindriddler {
    public static void main(String[] args) {
        int a = 10;
        int b =11;
        System.out.println("===========Guess The Answer===========");
        System.out.println( "Operational "+ (a++));
        System.out.println( "OG "+ (++b));
        System.out.println( "Binary ");
        System.out.println( "1+2" +1+2);
        System.out.println( "1+2"+(1+2));
        System.out.println( 1+2 + "=3");
        int increment = ++a*b++;
        System.out.println( increment);
    }
}
