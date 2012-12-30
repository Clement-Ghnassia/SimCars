package models;

public abstract class ConfigVoiture {
	public static final int VOITURE_ESSENCE_HABILITE = 50;
	public static final int VOITURE_ELECTRIQUE_HABILITE = 80;
	public static final int VOITURE_HYRIDE_HABILITE = 40;
	
	//public static final int NIVEAU_ESSENCE_RESERVOIR_MAX = 100;
	public static final int NIVEAU_ESSENCE_RESERVOIR_MAX = 100;
	public static final int NIVEAU_ELECTRIQUE_BATTERIE_MAX = 100;
	public static final int NIVEAU_HYBRIDE_RESERVOIR_MAX = 50;
	public static final int NIVEAU_HYBRIDE_BATTERIE_MAX = 50;
	
	public static final int NIVEAU_RESERVOIR_MIN = 10;
	public static final int NIVEAU_BATTERIE_MIN = 5;
	
	public static final double VITESSE_RECHARGEMENT_ESSENCE = 1; 		//quantit� recharg�e par seconde
	public static final double VITESSE_RECHARGEMENT_ELECTRIQUE = 5;		//quantit� recharg�e par secode
	public static final double VITESSE_RECHARGEMENT_HYBRIDE = 3;		//quantit� recharg�e par seconde
	
	public static final double ESSENCE_FREINAGE = 15;
	public static final double ELECTRIQUE_FREINAGE = 25;
	public static final double HYBRIDE_FREINAGE = 22;
}
