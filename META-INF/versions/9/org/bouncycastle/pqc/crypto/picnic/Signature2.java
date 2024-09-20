package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

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
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\Signature2.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */