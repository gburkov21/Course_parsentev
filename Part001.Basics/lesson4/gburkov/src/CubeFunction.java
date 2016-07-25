package gburkov;

public class CubeFunction {
    float a;
    float b;
    float c;

    public CubeFunction(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float calculate(int x) {
        float y = this.a * x * x + this.b * x + this.c;
        return y;
    }
}