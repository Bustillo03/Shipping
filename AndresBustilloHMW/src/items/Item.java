package items;

public class Item {
	private String name;
	private double length;
	private double width;
	private double height;
	private double weight;

	public Item(String name, double length, double width, double height, double weight) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Length: " + length + ", Width: " + width + ", Height: " + height + ", Weight: "
				+ weight;
	}

	public double calculateVolume() {
		return length * width * height;
	}

}

//Ivan Andres Bustillo 29879783