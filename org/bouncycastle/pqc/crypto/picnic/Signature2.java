package org.bouncycastle.pqc.crypto.picnic;

class Signature2 {
  byte[] salt;
  
  byte[] iSeedInfo;
  
  int iSeedInfoLen;
  
  byte[] cvInfo;
  
  int cvInfoLen;
  
  byte[] challengeHash;
  
  int[] challengeC;
  
  int[] challengeP;
  
  Proof2[] proofs;
  
  public Signature2(PicnicEngine paramPicnicEngine) {
    this.challengeHash = new byte[paramPicnicEngine.digestSizeBytes];
    this.salt = new byte[32];
    this.challengeC = new int[paramPicnicEngine.numOpenedRounds];
    this.challengeP = new int[paramPicnicEngine.numOpenedRounds];
    this.proofs = new Proof2[paramPicnicEngine.numMPCRounds];
  }
  
  public static class Proof2 {
    byte[] seedInfo = null;
    
    int seedInfoLen = 0;
    
    byte[] aux;
    
    byte[] C;
    
    byte[] input;
    
    byte[] msgs;
    
    public Proof2(PicnicEngine param1PicnicEngine) {
      this.C = new byte[param1PicnicEngine.digestSizeBytes];
      this.input = new byte[param1PicnicEngine.stateSizeBytes];
      this.aux = new byte[param1PicnicEngine.andSizeBytes];
      this.msgs = new byte[param1PicnicEngine.andSizeBytes];
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\Signature2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */