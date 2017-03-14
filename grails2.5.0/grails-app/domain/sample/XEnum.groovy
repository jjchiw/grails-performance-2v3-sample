package sample

enum XEnum {
	X__ONE (000, "x.one"),
	X__TWO (100, "x.two"),
	X__THREE (200, "x.three")

	final int id
	final String name

	private XEnum(int id, String name) {
		this.id = id
		this.name = name
	}

	String toString() {
		name
	}
}
