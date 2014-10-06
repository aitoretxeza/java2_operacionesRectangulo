/* Clase para calcular el area y el perimetro de un rectangulo */

	public class Rectangulo {


		private double alto, base;


		public void setAlto (double altointroducido)
 		{
			alto = altointroducido;
 		}
		
		public double getAlto()
 		{
			return alto;
 		}


		public void setBase (double baseintroducida)
 		{
			base = baseintroducida;
 		}

		public double getBase()
 		{
			return base;
 		}


		public double area()
 		{
			double result;
			result = this.getAlto() * this.getBase();
			return result;
		}


		public double perimetro()
 		{
			double result;
			result = (2 * this.getBase()) + (2 * this.getAlto());
			return result;
 		}

	}
