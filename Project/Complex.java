

/**
 * this class is for do complex number operations
 * Z1 + Z2
 * Z1 x Z2 
 * Z ^ 2
 * | Z |
 * **/

public class Complex {
	public double real;								//real part of the complex no
	public double imag;								//imaginary part of the complex no

	public Complex(double real, double imag) {		//constructor which assigns complex number
		this.real = real;
		this.imag = imag;
	}

	public void Add(Complex a) {					//can add or subtract a complex number to a given complex number
		this.real = this.real + a.real;
		this.imag = this.imag + a.imag;
	}

	public void Multiply(Complex b) {				//can multiply a complex number with a given complex number
		double t1;
		t1 = this.real * b.real - this.imag * b.imag;
		this.imag = this.real * b.imag + this.imag * b.real;
		this.real = t1;
	}

	public void Square() {							//change the complex number to its square
		double t1;
		t1 = real * real - imag * imag;
		imag = real * imag + imag * real;
		real = t1;
	}

	public double Abs() {							//return the absolute value of a complex number
		double t2;
		t2 = real * real + imag * imag;
		return t2;
	}

}
