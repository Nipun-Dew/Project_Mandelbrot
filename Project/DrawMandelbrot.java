

public class DrawMandelbrot extends Plot{
	
	/**
	 * Plot the correct Mandelbrot set for the given constructor
	 */
	private static final long serialVersionUID = 1L;

	// constructor for 1 arg
	public DrawMandelbrot(String setType) { 								
		this.setType = setType;
	}

	// constructor for 5 args
	public DrawMandelbrot(String setType, double re_start, double re_end, double im_start, double im_end) { 
		this.re_start = re_start;
		this.re_end = re_end;
		this.im_start = im_start;
		this.im_end = im_end;
		this.setType = setType;
	}
	// constructor for 6 args
	public DrawMandelbrot(String setType, double re_start, double re_end, double im_start, double im_end, int MAX_ITER) { 
		this.re_start = re_start;
		this.re_end = re_end;
		this.im_start = im_start;
		this.im_end = im_end;
		this.MAX_ITER = MAX_ITER;
		this.setType = setType;
	}
}
