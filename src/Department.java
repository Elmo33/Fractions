public class Department {
    int numerator;
    int denominator;

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department thing = (Department) o;
        return numerator == thing.numerator;
    }
}
