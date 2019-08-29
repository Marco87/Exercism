class RaindropConverter {

    String convert(int number) {
        String rd = "";
        boolean i = false;

        if (number % 3 == 0) {
			rd += "Pling";
			i = true;
		}
		if (number % 5 == 0) {
			rd += "Plang";
			i = true;
		}
		if (number % 7 == 0) {
			rd += "Plong";
			i = true;
		}
		if (i == false)
			rd = Integer.toString(number);

        return rd;
    }

}
