public class Main {
    static int disc(int a, int b, int c){
        return (int)Math.pow(b, 2) - (4*a*c);
    }
    static String shortest(String[] strings){
        String shortest = strings[0];
        for (String i : strings){
            if (i.length() < shortest.length()){
                shortest = i;
            }
        }
        return shortest;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int a = 2;
        int b = 3;
        int c = 4;
        String[] idk = {"xachapuri", "nigvziani badrijani", "yiyliyo", "soko"};
        System.out.println(disc(a,b,c));
        System.out.println(shortest(idk));

        Fraction test = new Fraction();
        test.numerator = 5;
        test.denominator = 10;
        Fraction reduced = test.reduce();

        Fraction test2 = new Fraction();
        test2.numerator = 1;
        test2.denominator = 5;

        Fraction added = test.add(test2);
        System.out.println(added.numerator);
        System.out.println(added.denominator);


    }
}