package wiiusej.wiiuseapirequest;

/**
 * Represents a request with a float value to pass to wiiuse API.
 * @author gduche
 *
 */
public class FloatValueRequest extends WiiUseApiRequest {

	private float floatValue;

	/**
	 * Constructor setting the id of the wiimote concerned.
	 * 
	 * @param id
	 *            the id of the wiimote concerned.
	 */
	public FloatValueRequest(int id, int type) {
		super(id, type);
	}

	/**
	 * Constructor setting the id of the wiimote concerned.
	 * 
	 * @param id
	 *            the id of the wiimote concerned.
	 * @param type
	 *            type of the request
	 * @param th
	 *            threshold in degrees
	 */
	public FloatValueRequest(int id, int type, float th) {
		super(id, type);
		floatValue = th;
	}

	/**
	 * Get the float value.
	 * @return the float value
	 */
	public float getFloatValue() {
		return floatValue;
	}

	/**
	 * Set the float value.
	 * @param val the value to set
	 */
	public void setFloatValue(float val) {
		this.floatValue = val;
	}
	
	

}
