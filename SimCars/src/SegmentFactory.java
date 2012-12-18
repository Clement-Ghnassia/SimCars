import java.awt.Point;


public class SegmentFactory {

		private SegmentFactory() {
			//classe statique
		}
		
		public static Segment getSegment(TypeSegment type, boolean isStand, int positionX, int positionY) {
			Segment res;
			Point position = new Point(positionX, positionY);
			
			switch(type) {
				case TYPE_STRAIGHT_HORIZONTAL:
				case TYPE_STRAIGHT_VERTICAL:
					res = new Segment(150, 1, isStand, position);
					break;
				case TYPE_TURN_TOP_TO_LEFT:
				case TYPE_TURN_TOP_TO_RIGHT:
				case TYPE_TURN_BOTTOM_TO_LEFT:
				case TYPE_TURN_BOTTOM_TO_RIGHT:
					res = new Segment(80, 2, isStand, position);
					break;
				case TYPE_TURN_HARD_HORIZONTAL:
				case TYPE_TURN_HARD_VERTICAL:
					res = new Segment(50, 2, isStand, position);
				default: //TYPE_NONE
					//erreur c'est pas possible
					res = null;
			}
			
			return res;
		}
}