package com.example.smpvhswiper.item;

public class ItemLower {
	private String text = null;
	private int position;

	public static ItemLower newInstance(final int position) {
		ItemLower Item = new ItemLower(position);

		return Item;
	}

	public ItemLower(final int position) {
		setText("ItemLower" + Integer.toString(position));
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
	 * @param position
	 *            セットする position
	 */
	public void setPosition(int position) {
		this.position = position;
	}

}
