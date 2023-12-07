package classes_and_objects;

public class Polynomial {

	int Degree[];

	public Polynomial() {
		Degree = new int[10];
	}

	public void setcoefficient(int degree, int coeff) {
		if (degree > this.Degree.length - 1) {
			int temp[] = Degree;
			Degree = new int[degree + 1];
			for (int i = 0; i < temp.length; i++) {
				Degree[i] = temp[i];
			}
			Degree[degree] = coeff;
		} else {
			Degree[degree] = coeff;
		}
	}

	public int getCoefficient(int i) {
		if (i < Degree.length)
			return Degree[i];
		else
			return 0;
	}

	public void print() {
		for (int i = 0; i < Degree.length; i++) {
			if (Degree[i] != 0)
				System.out.println(Degree[i] + "x" + i + " ");
		}
	}

	public Polynomial add(Polynomial p) {
		Polynomial out = new Polynomial();

		int poly1 = this.Degree.length;
		int poly2 = p.Degree.length;
		int l = Math.min(poly1, poly2);

		int i;
		for (i = 0; i < l; i++) {
			out.setcoefficient(i, this.Degree[i] + p.Degree[i]);
		}
		while (i < poly1) {
			out.setcoefficient(i, this.Degree[i]);
		}
		while (i < poly2) {
			out.setcoefficient(i, p.Degree[i]);
		}
		return out;
	}

	public Polynomial subtract(Polynomial p) {
		Polynomial out = new Polynomial();

		int poly1 = this.Degree.length;
		int poly2 = p.Degree.length;
		int l = Math.min(poly1, poly2);

		int i;
		for (i = 0; i < l; i++) {
			out.setcoefficient(i, this.Degree[i] - p.Degree[i]);
		}
		while (i < poly1) {
			out.setcoefficient(i, this.Degree[i]);
		}
		while (i < poly2) {
			out.setcoefficient(i, -p.Degree[i]);
		}
		return out;
	}
	public Polynomial multiplication(Polynomial p) {
		Polynomial out = new Polynomial();
		for(int i = 0;i<this.Degree.length;i++) {
			for(int j = 0; j<p.Degree.length;j++) {
				int newDegree = i+j;
				int newcoeff = this.Degree[i] * p.Degree[j];
				int oldcoeff = out.getCoefficient(newDegree);
				out.setcoefficient(newDegree,newcoeff + oldcoeff);
			}
		}
		
		return out;
	}
}
