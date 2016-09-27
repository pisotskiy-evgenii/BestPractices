package linked_exception;

class Test {

    private static int getAreaValue(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("'x' or 'y' is negative: x=" + x + ", y=" + y);
        }
        return x * y;
    }

    public static void main(String[] args) throws MyException {

        try {
            int result = getAreaValue(-1, 100);
            System.out.print(result);
        } catch (IllegalArgumentException e) {
            throw new MyException(e);
        }

        /*
        throw new MyException(e);
    Exception in thread "main" linked_exception.MyException	at linked_exception.Test.main(Test.java:21)
    !!! Caused by: java.lang.IllegalArgumentException: value of 'x' or 'y' is negative: x=-1, y=100
         */

        /*
        throw e;
    Exception in thread "main" java.lang.IllegalArgumentException: value of 'x' or 'y' is negative: x=-1, y=100
	at linked_exception.Test.getAreaValue(Test.java:10)
	at linked_exception.Test.main(Test.java:19)
         */
    }


}