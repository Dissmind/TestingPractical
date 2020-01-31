public class Calculator {
    public Calculator() { this.error = false; }

    public int multi(int a, int b) {
        this.error = false;

        if (Math.abs(Integer.MAX_VALUE / b) < Math.abs(a)) {
            this.error = true;
            return 0;
        }

        return a * b;
    }

    public boolean isError() {
        return true;
    }

    private boolean error = false;
}
