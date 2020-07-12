

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Plot extends JPanel{
	static final long serialVersionUID = 1L;
	private int height = 800;						//number of pixels horizontally 
	private int width = 800;						//number of pixels vertically

	protected double re_start = -1; 					// minimum of the real part
	protected double re_end = 1; 						// maximum of the real part
	protected double im_start = -1; 					// minimum of the imaginary part
	protected double im_end = 1; 						// maximum of the imaginary part
	protected int MAX_ITER = 1000;						//maximum number of iterations
	double re_dif;								//difference between real axis
	double im_dif;								//difference between imaginary axis
	String setType; 							//string which contains set type
	int ans;
	
	public Complex c1 = new Complex(-0.4, 0.6);				//defaualt C value for the Julia set

	public void paint(Graphics g) { 									// paint method overriding
		
		double re_dif = (double) Math.abs(re_end - re_start);
		double im_dif = (double) Math.abs(im_end - im_start);

		double re; 											// real value of the complex
		double im; 											// imaginary of the complex
		int pos_x = 0;											// pixel position of the x axis
		int pos_y = 0; 											// pixel position of the y axis

		g.setColor(Color.white);
		g.fillRect(1, 1, width, height);

		for (int i = 0; i < height + 1; i++) {
			for (int j = 0; j < width + 1; j++) {
				re = (re_dif / width) * j + (double) re_start; 					// map in to complex plane
				im = (im_dif / height) * i + (double) im_start;


				

				
				if(setType.equals("Julia")) {
					ans = JuliaPoint.IsJulia(re, im, c1.real, c1.imag, MAX_ITER);
				}
				
				if(setType.equals("Mandelbrot")) {
					ans = MandelbrotPoint.IsMandelbrot(re, im, MAX_ITER);
				}

				 pos_x = j; 								// get corresponding position to each point in the complex plane
				 pos_y = height - i;

				if (ans == MAX_ITER) { 							// print black if Mandelbrot
					g.setColor(Color.black);
					g.drawLine(pos_x, pos_y, pos_x, pos_y);
				}
				else {
					g.setColor(Color.getHSBColor(ans/256f, 1, ans/(ans+8f)));	// print vivid colors according to ans
					g.drawLine(pos_x, pos_y, pos_x, pos_y);
				}
			}
		}
	}
}
