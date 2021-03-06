package module6;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for land earthquakes on an earthquake map
 * @author Eric Cordero Castillo
 */
public class LandQuakeMarker extends EarthquakeMarker {
	
	
	public LandQuakeMarker(PointFeature quake) {		
		super(quake);
		isOnLand = true;
	}

	// drawing circle for LandQuake
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		
		pg.ellipse(x, y, 2*radius, 2*radius);
		
	}	

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}

		
}