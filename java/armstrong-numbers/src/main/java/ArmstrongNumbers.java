class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String numero;
		int tamanhoNumero;
		Double armst = 0.0;
		Double pot;

		numero = Integer.toString (numberToCheck);
		tamanhoNumero = Integer.valueOf(numero.length());

		for (int i=0; i<tamanhoNumero; i++) {
			pot = Math.pow(Integer.parseInt(Character.toString(numero.charAt(i))), tamanhoNumero);
			armst = armst + pot;
		}

		if (armst == numberToCheck){
			return true;
		} else {
			return false;
		}
	}
}
