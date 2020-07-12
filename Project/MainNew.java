

import javax.swing.JFrame;

public class MainNew {


	public static void main(String[] args) {

			// check wrong number of arguments, correct numbers of arguments are 1,3,4,5,6
			if (args.length == 0 || args.length == 2 || args.length > 6) { 
				System.out.println("Wrong number of arguments\n<Mandelbrot> or \n"
						+ "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> or\n"
						+ "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> <iteration> or\n" + "<Julia> or\n"
						+ "<Julia> <complex real> <complex imaginary> or\n<Julia> <complex real> <complex imaginary> <iteration>");
				System.exit(1);
			}

			// check number of arguments in Julia set, correct numbers of arguments are 1,4
			if (args[0].equals("Julia") && (args.length == 2 || args.length > 4)) { 
				System.out.println("Wrong number of arguments\n<Mandelbrot> or \n"
						+ "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> or\n"
						+ "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> <iteration> or\n" + "<Julia> or\n"
						+ "<Julia> <complex real> <complex imaginary> or\n<Julia> <complex real> <complex imaginary> <iteration>");
				System.exit(1);
			}

			// check number of arguments in Mandelbrot set, correct numbers of arguments are 1,5,6
			if (args[0].equals("Mandelbrot") && (args.length == 2 || args.length == 3 || args.length == 4 || args.length > 6)) { 
																								
				System.out.println("Wrong number of arguments\n<Mandelbrot> or \n"
						+ "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> or\n"
						+ "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> <iteration> or\n" + "<Julia> or\n"
						+ "<Julia> <complex real> <complex imaginary> or\n<Julia> <complex real> <complex imaginary> <iteration>");
				System.exit(1);
			}
			
	
			
			// code wont plot if set type is wrong
			if (args[0].equals("Julia") || args[0].equals("Mandelbrot")) { 
				JFrame obj = new JFrame();
				obj.setBounds(0, 0, 800, 800);
				obj.setTitle("Project");
				obj.setResizable(false);
				obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// run correct constructor for their argument length and set type
				//and create the right object to plot
				if (args.length == 1 && args[0].equals("Julia")) { 
					DrawJulia set = new DrawJulia(args[0]); 
					obj.add(set);
				} 
				else if (args.length == 1 && args[0].equals("Mandelbrot")) {
					DrawMandelbrot set = new DrawMandelbrot(args[0]);
					obj.add(set);
				} 
				else if (args.length == 3 && args[0].equals("Julia")) {
					double x = Double.parseDouble(args[1]);
					double y = Double.parseDouble(args[2]);
					DrawJulia set = new DrawJulia(args[0], x, y);
					obj.add(set);
				}
				
				else if (args.length == 4 && args[0].equals("Julia")) {
					double x = Double.parseDouble(args[1]);
					double y = Double.parseDouble(args[2]);
					int v = Integer.parseInt(args[3]);
					
					//if iteration is less than 0 this will give you an Error
					if(v < 0) {
						System.out.println("Number of iterations should be bigger than 0");
						System.exit(1);
					}
					
					DrawJulia set = new DrawJulia(args[0], x, y, v);
					obj.add(set);
				} 
				else if (args.length == 5 && args[0].equals("Mandelbrot")) {
					double p = Double.parseDouble(args[1]);
					double q = Double.parseDouble(args[2]);
					double r = Double.parseDouble(args[3]);
					double s = Double.parseDouble(args[4]);
					
					if((p >= q) || (r >= s)) {
						System.out.println("minimum of the real and imaginary values should lower than maximum values"
								+ " of the real and imaginary values");
						System.exit(1);
					}
					
					DrawMandelbrot set = new DrawMandelbrot(args[0], p, q, r, s);
					obj.add(set);
				} 
				else if (args.length == 6 && args[0].equals("Mandelbrot")) {
					double p = Double.parseDouble(args[1]);
					double q = Double.parseDouble(args[2]);
					double r = Double.parseDouble(args[3]);
					double s = Double.parseDouble(args[4]);
					int t = Integer.parseInt(args[5]);
					
					//if minimum of real and complex part is bigger or equal to maximum this will give an Error
					if((p >= q) || (r >= s)) {
						System.out.println("minimum of the real and imaginary values should lower than maximum "
								+ "real and imaginary values");
						System.exit(1);
					}
					
					//if iteration is less than 0 this will give you an Error
					if(t < 0) {
						System.out.println("Number of iterations should be bigger than 0");
						System.exit(1);
					}
					
					DrawMandelbrot set = new DrawMandelbrot(args[0], p, q, r, s, t);
					obj.add(set);
				}

				obj.setVisible(true);
			} 
			else {
				System.out.println(
						"Wrong set type\n<Mandelbrot> or \n" + "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> or\n"
								+ "<Mandelbrot> <real min> <real max> <imaginary min> <imaginary max> <iteration> or\n" + "<Julia> or\n"
								+ "<Julia> <complex real> <complex imaginary> or\n<Julia> <complex real> <complex imaginary> <iteration>");
				System.exit(1);
			}
		}

}


