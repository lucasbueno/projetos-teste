package br.com.lucasbueno.entities;

public class PositiveNumber {
	private Object value;

	public PositiveNumber(Object value) {
		super();
		this.value = value;
	}

	public Object isOdd() {

		int newValue = (int) value;

		if (newValue < 0)
			return null;

		return true;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}