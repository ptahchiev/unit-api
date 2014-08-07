/**
 * Unit-API - Units of Measurement API for Java
 * Copyright (c) 2014 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
/**
 * 
 */
package javax.measure.test;

import javax.measure.Measurement;
import javax.measure.Quantity;
import javax.measure.Unit;


/**
 * @author Werner Keil
 * @version 0.4
 */
public final class StringMeasurement<Q extends Quantity<Q>> implements
		Measurement<Q, String> {
	private final String v;
	private final Unit<Q> u;

	public StringMeasurement(String value, Unit<Q> unit) {
		this.v = value;
		this.u = unit;
	}

	public Measurement<Q, String> to(Unit<Q> unit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Unit<Q> getUnit() {
		return u;
	}

	public String getValue() {
		return v;
	}

	@Override
	public String toString() {
		return v + " " + u.getSymbol();
	}

}