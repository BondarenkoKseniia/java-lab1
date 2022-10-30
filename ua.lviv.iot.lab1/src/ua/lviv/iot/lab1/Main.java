package ua.lviv.iot.lab1;

public class Main {
	public static void main(String[] args) {
		ua.lviv.iot.lab1.Oscillograph oscillograph1 = new ua.lviv.iot.lab1.Oscillograph(60, "Dnipro-M", "digital");
		ua.lviv.iot.lab1.Oscillograph oscillograph2 = new ua.lviv.iot.lab1.Oscillograph(40, 0.5f, "Fluke", "portable", 2020, 102500);
		ua.lviv.iot.lab1.Oscillograph oscillograph3 = new ua.lviv.iot.lab1.Oscillograph(200, 4.0f, "Owon", "digital", 2018, 42920);
		
		ua.lviv.iot.lab1.Oscillograph.celler = "Epicentr";
		
		System.out.println(ua.lviv.iot.lab1.Oscillograph.celler);


        System.out.println(oscillograph1);
        System.out.println(oscillograph2);
        System.out.println(oscillograph3);
	}
}
