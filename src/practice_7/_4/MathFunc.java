package practice_7._4;

public class MathFunc implements MathCalculate{
    MathFunc() {}
    @Override
    public int pow(int num, int grad) {
        int num_copy = num;
        if (grad == 0) { return 1; }
        if (grad == 1) { return num; }
        for (int i = 0; i < grad - 1; i++){ num = num  * num_copy; }
        return num;
    }

    @Override
    public int abs(int num) {
        if (num > 0 ) return num;
        else return num *= -1;
    }

    @Override
    public double PI() {
        return 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825;
    }
}
