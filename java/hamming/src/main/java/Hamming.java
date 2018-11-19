class Hamming {

    String lStrand;
    String rStrand;

    Hamming(String leftStrand, String rightStrand) {
      lStrand = leftStrand;
      rStrand = rightStrand;

      if (leftStrand.length() != rightStrand.length())
          throw new IllegalArgumentException ("leftStrand and rightStrand must be of equal length.");
    }

    int getHammingDistance() {
      int ham = 0;

      for (int i = 0; i < lStrand.length(); i++) {
          if(lStrand.charAt(i) != rStrand.charAt(i))
              ham ++;
      }
      return ham;
    }

}
