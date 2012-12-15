
public class VoitureEssence extends Voiture {
	
	protected double niveauReservoir;
	
	public static int VITESSE_MAX = 100;
	public static int CAPACITE_FREINAGE = 30; 
	public static int HABILITE = 30;
	
	public VoitureEssence(Position pCPosition) {
		this.type = Voiture.TYPE_VOITURE_ESSENCE;
		this.cVitesse = 0;
		this.cPosition = pCPosition;
		this.habilite = ConfigVoiture.VOITURE_ESSENCE_HABILITE;
	}
	
	public boolean hasToFill() {
		return niveauReservoir < ConfigVoiture.NIVEAU_RESERVOIR_MIN;
	}
	
}