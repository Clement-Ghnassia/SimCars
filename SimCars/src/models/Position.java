package models;

public class Position {
	protected Segment cSegment;
	protected int avancement;
	
	public static final int AVANCEMENT_MAX = 100;
	
	public Position() {
		this.cSegment = null;
		this.avancement = 0;
	}
	
	public Position(Segment pCSegment) {
		this.cSegment = pCSegment;
		this.avancement = 0;
	}
	
	public Position(Segment pCSegment, int pAvancement) {
		this.cSegment = pCSegment;
		this.avancement = pAvancement;
	}
	
	public Segment getSegment() {
		return this.cSegment;
	}
	
	public void setSegment(Segment pSegment) {
		this.cSegment = pSegment;
	}
	
	public int getAvancement() {
		return this.avancement;
	}
	
	public void setPosition(Segment pCSegment, int pAvancement) throws DepassementSegmentException {
		
		this.cSegment = pCSegment;
		this.avancement = pAvancement;
		
		if(pAvancement > Position.AVANCEMENT_MAX) {
			this.avancement = Position.AVANCEMENT_MAX;
			throw new DepassementSegmentException(Position.AVANCEMENT_MAX - this.avancement);
		}
	}
	
	public void update(double distance) throws DepassementSegmentException {
		this.avancement += distance;
		if(this.avancement > Position.AVANCEMENT_MAX) {
			this.avancement = Position.AVANCEMENT_MAX;
			throw new DepassementSegmentException(Position.AVANCEMENT_MAX - this.avancement);
		}
	}

}