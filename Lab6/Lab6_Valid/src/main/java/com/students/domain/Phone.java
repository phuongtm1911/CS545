/**
 * 
 */
package com.students.domain;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	@Digits(integer = 3, fraction = 0, message = "{Digits.area.validation}")
 	private Integer area;
	@NotNull
	@Digits(integer = 3, fraction = 0, message = "{Digits.prefix.validation}")
 	private Integer prefix;
	@NotNull
	@Digits(integer = 4, fraction = 0, message = "{Digits.number.validation}")
 	private Integer number;

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
