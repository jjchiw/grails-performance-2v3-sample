package sample
/**
 * http://grails.1312388.n4.nabble.com/Question-about-the-use-of-enum-types-in-Grails-td3220149.html
 */
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
