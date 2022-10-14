public class Fraction {

    int numerator;
    int denominator;

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Fraction) {
            return numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator;
        }

        return false;
    }

    public int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    public Fraction reduce() {
        int g = gcd(this.denominator, this.numerator);
        this.numerator /= g;
        this.denominator /= g;
        System.out.println(this.numerator);
        System.out.println(this.denominator);
        return this;
    }

    public Fraction add(Fraction b) {
        int new_numerator = this.numerator * b.denominator + b.numerator * this.denominator;
        int new_denominator = this.denominator * b.denominator;
        Fraction to_reduce = new Fraction();
        to_reduce.numerator = new_numerator;
        to_reduce.denominator = new_denominator;
        return to_reduce.reduce();
    }

    public Fraction subtract(Fraction b) {
        int new_numerator = this.numerator * b.denominator - b.numerator * this.denominator;
        int new_denominator = this.denominator * b.denominator;
        Fraction to_reduce = new Fraction();
        to_reduce.numerator = new_numerator;
        to_reduce.denominator = new_denominator;
        return to_reduce.reduce();
    }

    public Fraction multiply(Fraction b){
        int new_numerator = this.numerator * b.numerator;
        int new_denominator = this.denominator * b.denominator;
        Fraction to_reduce = new Fraction();
        to_reduce.numerator = new_numerator;
        to_reduce.denominator = new_denominator;
        return to_reduce.reduce();
    }
    public Fraction divide(Fraction b){
        int new_numerator = this.numerator * b.denominator;
        int new_denominator = this.denominator * b.numerator;
        Fraction to_reduce = new Fraction();
        to_reduce.numerator = new_numerator;
        to_reduce.denominator = new_denominator;
        return to_reduce.reduce();
    }
}
