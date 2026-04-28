class Solution {

    // Unit enum (only FEET for UC1)
    enum Unit {
        FEET
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

    // QuantityMeasurementApp class
    static class QuantityMeasurementApp {

        // Method to compare two quantities in feet
        boolean areEqual(Quantity q1, Quantity q2) {

            // Validate inputs (null check)
            if (q1 == null || q2 == null) {
                throw new IllegalArgumentException("Invalid input: null values not allowed");
            }

            // Ensure both are in FEET
            if (q1.unit != Unit.FEET || q2.unit != Unit.FEET) {
                throw new IllegalArgumentException("Both quantities must be in feet");
            }

            // Compare values
            return q1.value == q2.value;
        }
    }

    // Main method (test)
    public static void main(String[] args) {
        QuantityMeasurementApp app = new QuantityMeasurementApp();

        Quantity q1 = new Quantity(5.0, Unit.FEET);
        Quantity q2 = new Quantity(5.0, Unit.FEET);

        boolean result = app.areEqual(q1, q2);
        System.out.println(result); // true
    }
}