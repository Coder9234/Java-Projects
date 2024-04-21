class Complex {
    int real;
    int imaginary;
    public Complex (int r, int i){
        real = r;
        imaginary = i;
    }


public static Complex sum (Complex a, Complex b){
    return new Complex((a.real + b.real), (a.imaginary + b.imaginary));
}

public static Complex difference(Complex a, Complex b){
    return new Complex ((a.real - b .real), (a.imaginary - b.imaginary));
}

public static Complex product (Complex a, Complex b){
    return new Complex (((a.real * b.real) - (a.imaginary * b.imaginary)), ((a.real * b.imaginary) + (a.imaginary * b.real)));
}

public void printComplex(){
    if (real == 0 && imaginary != 0){
        System.out.println(imaginary + "i");
    }
    else if (imaginary == 0 && real != 0){
        System.out.println(real);
    }
    else{
        System.out.println(real + "+" + imaginary + "i");
    }
}

class Solution {
    public static void main(String args[]){
        Complex c1 = new Complex(4, 7);
        Complex c2 = new Complex(8, 9);
        Complex s = Complex.sum(c1, c2);
        Complex d = Complex.difference(c1, c2);
        Complex p = Complex.product(c1, c2);
        s.printComplex();
        d.printComplex();
        p.printComplex();
    }
}

}