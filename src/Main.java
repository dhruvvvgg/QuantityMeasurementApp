class Solution {

    // Unit enum (now includes INCH)
    enum Unit {
        FEET, INCH
    }

    // Quantity class
    static class Quantity {
        double value;
        Unit unit;

        Quantity(double value, Unit unit) {
            this.value = value;
            this.unit = unit;
        }
    }

    // Feet class
    static class Feet {
        Quantity q1, q2;

        Feet(double v1, double v2) {
            q1 = new Quantity(v1, Unit.FEET);
            q2 = new Quantity(v2, Unit.FEET);
        }

        boolean areEqual() {
            validate(q1.value, q2.value);
            return q1.value == q2.value;
        }
    }

    // Inches class
    static class Inches {
        Quantity q1, q2;

        Inches(double v1, double v2) {
            q1 = new Quantity(v1, Unit.INCH);
            q2 = new Quantity(v2, Unit.INCH);
        }

        boolean areEqual() {
            validate(q1.value, q2.value);
            return q1.value == q2.value;
        }
    }

    // Validation method (numeric check)
    static void validate(double v1, double v2) {
        if (Double.isNaN(v1) || Double.isNaN(v2)) {
            throw new IllegalArgumentException("Invalid input: not a number");
        }
    }

    // Static methods as per UC
    static boolean compareFeet(double v1, double v2) {
        Feet feet = new Feet(v1, v2);
        return feet.areEqual();
    }

    static boolean compareInches(double v1, double v2) {
        Inches inches = new Inches(v1, v2);
        return inches.areEqual();
    }

    // Main method
    public static void main(String[] args) {

        // Hard-coded inputs
        boolean feetResult = compareFeet(5.0, 5.0);
        boolean inchResult = compareInches(12.0, 12.0);

        System.out.println(feetResult);  // true
        System.out.println(inchResult);  // true
    }
}