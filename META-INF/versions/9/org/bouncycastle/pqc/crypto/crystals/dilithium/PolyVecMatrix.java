package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK;
import org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecL;

class PolyVecMatrix {
  private final int dilithiumK;
  
  private final int dilithiumL;
  
  private final PolyVecL[] mat;
  
  public PolyVecMatrix(DilithiumEngine paramDilithiumEngine) {
    this.dilithiumK = paramDilithiumEngine.getDilithiumK();
    this.dilithiumL = paramDilithiumEngine.getDilithiumL();
    this.mat = new PolyVecL[this.dilithiumK];
    for (byte b = 0; b < this.dilithiumK; b++)
      this.mat[b] = new PolyVecL(paramDilithiumEngine); 
  }
  
  public void pointwiseMontgomery(PolyVecK paramPolyVecK, PolyVecL paramPolyVecL) {
    for (byte b = 0; b < this.dilithiumK; b++)
      paramPolyVecK.getVectorIndex(b).pointwiseAccountMontgomery(this.mat[b], paramPolyVecL); 
  }
  
  public void expandMatrix(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < this.dilithiumK; b++) {
      for (byte b1 = 0; b1 < this.dilithiumL; b1++)
        this.mat[b].getVectorIndex(b1).uniformBlocks(paramArrayOfbyte, (short)((b << 8) + b1)); 
    } 
  }
  
  private String addString() {
    null = "[";
    for (byte b = 0; b < this.dilithiumK; b++) {
      null = null + "Outer Matrix " + null + " [";
      null = null + null;
      if (b == this.dilithiumK - 1) {
        null = null + "]\n";
      } else {
        null = null + "],\n";
      } 
    } 
    return null + "]\n";
  }
  
  public String toString(String paramString) {
    return paramString.concat(": \n" + addString());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\dilithium\PolyVecMatrix.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */