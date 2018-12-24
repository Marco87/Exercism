class RnaTranscription {

    String transcribe(String dnaStrand) {

      String rnaStrand;

      rnaStrand = dnaStrand.replace("G", "c1").replace("C", "G").replace("T", "a1").replace("A", "U");
      rnaStrand = rnaStrand.replace("a1", "A").replaceAll("c1", "C");
        
      return rnaStrand;
    }
}
