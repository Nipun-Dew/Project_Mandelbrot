

public class MandelbrotPoint {

	//check the given value is in the set, and return value n to put a correct color to that number
	public static int IsMandelbrot(double c_r, double c_i, int MAX_ITER) {
		Complex c = new Complex(c_r, c_i);
		Complex z = new Complex(0, 0);
		int n = 0;
		while (z.Abs() <= 4 && n < MAX_ITER) {
			z.Square();
			z.Add(c);
			n = n + 1;
		}
		return n;
	}
}
