package module6;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * @author Eric Cordero Castillo
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		isOnLand = false;
	}
	
	// drawing centered square for Ocean earthquakes
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
	}
	

	

}
