
public abstract class Segment {
	
		protected TypeSegment type;
		protected int vitesseMax; 
		protected boolean isStand;
		protected int difficulte; // 1 = facile, 2 = moyen et 3 = difficile
		

		public Segment(TypeSegment pType, int pVitesseMax, int pDifficulte) {
			this.type = pType;
			this.vitesseMax = pVitesseMax;
			this.isStand = false;
			this.difficulte = pDifficulte;
			
		}
		
		public Segment(TypeSegment pType, boolean pIsStand) {
			this.type = pType;
			this.isStand = pIsStand;
		}
		
		public int getVitesseMax() {
			return this.vitesseMax;
		}
		
		//la vitesse maximume d'une voiture sur ce troncon en fonction de son habilit�
		public int getVitesseMaxEffective(int habilite) {
			int res;
			
			if(difficulte == 1) {
				res = this.vitesseMax;
			}
			else {
				res = (int) (2 / habilite) * this.vitesseMax;
			}

			return res;
		}
		
		public TypeSegment getType() {
			return this.type;
		}
		
		public void setType(TypeSegment pType) {
			this.type = pType;
		}
		
		public boolean isStand() {
			return this.isStand;
		}
		
		public void setStand(boolean pIsStand) {
			this.isStand = pIsStand;
		}
}