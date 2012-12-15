
public class VoitureHybride extends Voiture {
	
	protected double niveauBatterie;
	protected double niveauReservoir;
	
	public VoitureHybride(Position pCPosition) {
		this.type = Voiture.TYPE_VOITURE_HYBRIDE;
		this.cVitesse = 0;
		this.cPosition = pCPosition;
		this.habilite = ConfigVoiture.VOITURE_HYRIDE_HABILITE;
	}
	
	public boolean hasToFill() {
		return this.niveauBatterie < ConfigVoiture.NIVEAU_RESERVOIR_MIN && this.niveauReservoir < ConfigVoiture.NIVEAU_BATTERIE_MIN;
	}
	
	public void switchMoteur() {
		if(moteur.getType() == TypeMoteur.TYPE_ELECTRIQUE) {
			this.moteur = new Moteur(TypeMoteur.TYPE_ESSENCE);
		}
		else {
			this.moteur = new Moteur(TypeMoteur.TYPE_ELECTRIQUE);
		}
	}

}
