

public class DrawJulia extends Plot{
	
	
	
	/**
	 * Plot correct Julia set for the given constructor
	 */
	private static final long serialVersionUID = 1L;

	public DrawJulia(String setType) { 						//constructor for 1 argument
		this.setType = setType;
	}

	public DrawJulia(String setType, double rea, double img) { 			// constructor for 3 arguments
		this.setType = setType;
		c1.real = rea;
		c1.imag = img;
	}
	
	public DrawJulia(String setType, double rea, double img, int MAX_ITER) { 	// constructor for 4 arguments
		this.setType = setType;
		c1.real = rea;
		c1.imag = img;
		this.MAX_ITER = MAX_ITER;
	}
	
	
	
	
}
