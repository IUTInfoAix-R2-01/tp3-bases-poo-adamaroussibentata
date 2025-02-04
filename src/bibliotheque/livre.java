package bibliotheque;

public class livre {
		private String name;
		private Float price;
		private int quantite;
		
		
		
		public livre() {
		}
		
		// constructeur
		public livre (String name, Float price, int quantite) {
			this.name= name;
			this.price = price;
			this.quantite = quantite;
		}
		
		public String getName() {
			return name;
		}
		
		public Float getPrice() {
			return price;
		}

		public int getQuantite() {
			return quantite;
		}
		
		public String toString() {
			return "livre{" +
		               "name='" + name + '\'' +
		               ", price=" + price +
		               ", quantite=" + quantite +
		               '}';
			}

}      

