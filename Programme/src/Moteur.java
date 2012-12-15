
public class Moteur {
	
	protected TypeMoteur type;
	protected int vitesseMax;
	protected int acceleration;
	protected double consommation;
	
	public Moteur(TypeMoteur pType) {
		this.type = pType;
		if(pType == TypeMoteur.TYPE_ESSENCE) {
			this.vitesseMax = ConfigMoteur.MOTEUR_ESSENCE_VITESSE_MAX;
			this.acceleration = ConfigMoteur.MOTEUR_ESSENCE_ACCELERATION;
			this.consommation = ConfigMoteur.MOTEUR_ESSENCE_CONSOMMATION;
		}
		else {
			this.vitesseMax = ConfigMoteur.MOTEUR_ELECTRIQUE_VITESSE_MAX;
			this.vitesseMax = ConfigMoteur.MOTEUR_ELECTRIQUE_ACCELERATION;
			this.consommation = ConfigMoteur.MOTEUR_ELECTRIQUE_CONSOMMATION;
		}
	}
	
	public TypeMoteur getType() {
		return this.type;
	}
	
	public int getVitesseMax() {
		return this.vitesseMax;
	}
	
	public int getVitessePotentielle(int vitesse) {
		
		int res;
		
		if(vitesse == this.vitesseMax) {
			res = vitesseMax;
		}
		else {
			res = vitesse + (this.acceleration * this.vitesseMax/(vitesse + 1));
			if(res > vitesseMax) {
				res = vitesseMax;
			}
		}

		return res;
	}
}