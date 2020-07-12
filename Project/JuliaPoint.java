
public class JuliaPoint {
	
	//check the given number is in the set or not
	public static int IsJulia(double z_r, double z_i, double c_r, double c_i, int MAX_ITER) {
		int m1 = 0;
		Complex c = new Complex(c_r, c_i);
		Complex z = new Complex(z_r, z_i);
		while (z.Abs() <= 4 && m1 < MAX_ITER) {
			z.Square();
			z.Add(c);
			m1 = m1 + 1;
		}
		return m1;
	}
}
