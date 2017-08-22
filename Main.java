
public class Main {
	// a köv. sor egy függvény és egyben egy entry point. Belépési pontnak mindig megkeresi a main függvényt.
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// a Person a type a firstPerson pedig a neve, ahogyan hivatkozunk rá. Minden sor végére ;
		// variable declaration
		Person firstPerson;
		// initialization shown in below line. Initialization is only for the first time when a variable gets a value
		firstPerson = new Person();
		// = itt értékadás, Zita kora mostantól kezdve legyen 10
		firstPerson.age = 10;
		// karakterfüzéreket mindig macskakörmök közé írunk
		firstPerson.name = "Zita";
		
		
		// a declaration and initialization in one step (instantization=példányosítás).
		// we instantiate classes with the "new" operator. An operator can be a +, new etc. 
		// csinálunk class-okat és azokat a new operátorral példányosítjuk.
		Person secondPerson = new Person();
		
		// assign value to a variable
		// variable = value;
		
		// e.g.:
		// age = 12;
		
		
		// class = osztály
		// instance/object = példány
		// az osztályt példányosítjuk = életre keltjük
		
		
		
		// there are two different families of types in java language:
		// primitives and
		// objects (reference types).
		
		// SYSOUT majd ctrl + space
		
		
		// HOMEWORK: create a class called Address
		// add the following attributes to the Address class: country, region, county, district, city, suburb, public are, zip code, level, house number
		// add two addresses attributes to Person class: temporary and fixed.
		

		Person thirdPerson;
		thirdPerson = new Person();
		thirdPerson.name = "Joe";
		thirdPerson.age = 23;
		thirdPerson.fixedAddress.country = "Hungary";
		thirdPerson.fixedAddress.region = "Közép-Magyarország";
		thirdPerson.fixedAddress.county = "Pest county";
		thirdPerson.fixedAddress.postalCode = 1096;
		thirdPerson.fixedAddress.city = "Budapest";
		thirdPerson.fixedAddress.district = 9;
		thirdPerson.fixedAddress.suburb = "Haller";
		thirdPerson.fixedAddress.publicArea = "street";
		thirdPerson.fixedAddress.houseNumber = 64;
		thirdPerson.fixedAddress.level = 3;
		thirdPerson.temporaryAddress.country = "Hungary";
		thirdPerson.temporaryAddress.region = "Közép-Magyarország";
		thirdPerson.temporaryAddress.county = "Pest county";
		thirdPerson.temporaryAddress.postalCode = 1073;
		thirdPerson.temporaryAddress.city = "Budapest";
		thirdPerson.temporaryAddress.district = 7;
		thirdPerson.temporaryAddress.suburb = "Dohány";
		thirdPerson.temporaryAddress.publicArea = "street";
		thirdPerson.temporaryAddress.houseNumber = 92;
		thirdPerson.temporaryAddress.level = 2;
		
			
		
		System.out.println( "thirdPerson fixedAddress: " + thirdPerson.fixedAddress );
				
		System.out.println("thirdPerson name: " + thirdPerson.name);
		System.out.println(  "thirdPerson age: " + thirdPerson.age);
		System.out.println( "firstPerson name: " + firstPerson.name );
	}
}
