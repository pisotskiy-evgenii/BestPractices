package hashcodemethod;

class HashCode {

    private boolean booleanField = true;
    private char charField = 'c';
    private byte byteField = 127;
    private short shortField = 32564;
    private int intField = 78125;
    private long longField = 555689L;
    private float floatField = 15.6F;
    private double doubleField = 70.5;

    private double[] arrayField = {2.0, 5.6, 56.3};
    private String referenceField = "some string";

    public static void main(String[] args) {
        int hash = new HashCode().hashCode(); // hashcode can be negative, it's normal
        System.out.print(hash);
    }

    /**
     * Or you can use this:
     * <p>
     * return Objects.hash(Object... values);
     * or
     * return Objects.hashCode(Object o);
     */

    // IMPORTANT: For every field which you tested in the equals() method, you must calculate a hash code:
    @Override
    public int hashCode() {
        // Start with a non-zero constant. Prime (простое число) is preferred
        final int prime = 31; // only prime number 31 is preferred
        int result = 17; // here you can use any prime numbers: 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37

        // Include a hash for each field.

        // Primitives
        // boolean
        result = prime * result + (booleanField ? 1 : 0);                   // 1 bit   » 32-bit

        // byte, char, short, int
        result = prime * result + byteField;                                // 8 bits  » 32-bit
        result = prime * result + charField;                                // 16 bits » 32-bit
        result = prime * result + shortField;                               // 16 bits » 32-bit
        result = prime * result + intField;                                 // 32 bits » 32-bit

        // long
        result = prime * result + (int) (longField ^ (longField >>> 32));    // 64 bits » 32-bit

        // float
        result = prime * result + Float.floatToIntBits(floatField);         // 32 bits » 32-bit

        // double
        long doubleFieldBits = Double.doubleToLongBits(doubleField);     // 64 bits (double) » 64-bit (long) » 32-bit (int)
        result = prime * result + (int) (doubleFieldBits ^ (doubleFieldBits >>> 32));

        // Objects
        // arrays
        // You can use this:
        // result = prime * result + Arrays.hashCode(arrayField); // var bits » 32-bit
        // or this:
        if (arrayField == null)
            result = prime * result + 0;
        else {
            for (Object element : arrayField) {
                result = prime * result + (element == null ? 0 : element.hashCode());
            }
        }

        // referenceField
        /*
         * Если поле является ссылкой на объект, а метод equals данного класса сравнивает это поле, рекурсивно вызывая
         * другие методы equals, так же рекурсивно вызывайте для этого поля метод hashCode.
         */
        result = prime * result + (referenceField == null ? 0 : referenceField.hashCode());

        return result;
    }
}
