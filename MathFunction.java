class MathFunction
{
    public void compute()
    {
        double value=0.5236,sine,cosine,sumSqr;
        sine=Math.sin(value);
        cosine=Math.cos(value);
        sumSqr=sine*sine+cosine*cosine;
        System.out.print("Sine of this value is "+sine);
        System.out.print("Cosine of this value is "+cosine);
        System.out.print("Sum of squares of sine and cosine is "+sumSqr);
    }
}