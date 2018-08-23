package no.hvl.dat100;
	
	import easygraphics.*;

	public class Grafikk extends EasyGraphics {

		public static void main(String[] args) {
			launch(args);
		}

		public void run() {
			makeWindow("Grafikk", 700, 400);

			drawCircle(90, 70, 60);
			
			drawCircle(275, 70, 60);
			
			drawCircle(90, 220, 60);
			
			drawCircle(90, 335, 60);
		}
	}