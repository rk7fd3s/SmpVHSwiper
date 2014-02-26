package com.example.smpvhswiper.item;

public class ItemUpper {
	private String text = null;
	private int position;

	public static ItemUpper newInstance(final int position) {
		ItemUpper Item = new ItemUpper(position);

		return Item;
	}

	public ItemUpper(final int position) {
		setText("ItemUpper" + Integer.toString(position));
		setPosition(position);
	}

	/**
	 * @return text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            セットする text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param postion
	 *            セットする position
	 */
	public void setPosition(int position) {
		this.position = position;
	}

}
