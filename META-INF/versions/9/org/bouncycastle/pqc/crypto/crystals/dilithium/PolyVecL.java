package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Poly;

class PolyVecL {
  Poly[] vec;
  
  private DilithiumEngine engine;
  
  private int mode;
  
  private int polyVecBytes;
  
  private int dilithiumL;
  
  private int dilithiumK;
  
  public PolyVecL(DilithiumEngine paramDilithiumEngine) {
    this.engine = paramDilithiumEngine;
    this.mode = paramDilithiumEngine.getDilithiumMode();
    this.dilithiumL = paramDilithiumEngine.getDilithiumL();
    this.dilithiumK = paramDilithiumEngine.getDilithiumK();
    this.vec = new Poly[this.dilithiumL];
    for (byte b = 0; b < this.dilithiumL; b++)
      this.vec[b] = new Poly(paramDilithiumEngine); 
  }
  
  public PolyVecL() throws Exception {
    throw new Exception("Requires Parameter");
  }
  
  public Poly getVectorIndex(int paramInt) {
    return this.vec[paramInt];
  }
  
  public void expandMatrix(byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < this.dilithiumL; b++)
      this.vec[b].uniformBlocks(paramArrayOfbyte, (short)((paramInt << 8) + b)); 
  }
  
  public void uniformEta(byte[] paramArrayOfbyte, short paramShort) {
    short s = paramShort;
    for (byte b = 0; b < this.dilithiumL; b++) {
      s = (short)(s + 1);
      getVectorIndex(b).uniformEta(paramArrayOfbyte, s);
    } 
  }
  
  public void copyPolyVecL(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecL paramPolyVecL) {
    for (byte b = 0; b < this.dilithiumL; b++) {
      for (byte b1 = 0; b1 < 'Ā'; b1++)
        paramPolyVecL.getVectorIndex(b).setCoeffIndex(b1, getVectorIndex(b).getCoeffIndex(b1)); 
    } 
  }
  
  public void polyVecNtt() {
    for (byte b = 0; b < this.dilithiumL; b++)
      this.vec[b].polyNtt(); 
  }
  
  public void uniformGamma1(byte[] paramArrayOfbyte, short paramShort) {
    for (byte b = 0; b < this.dilithiumL; b++)
      getVectorIndex(b).uniformGamma1(paramArrayOfbyte, (short)(this.dilithiumL * paramShort + b)); 
  }
  
  public void pointwisePolyMontgomery(Poly paramPoly, org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecL paramPolyVecL) {
    for (byte b = 0; b < this.dilithiumL; b++)
      getVectorIndex(b).pointwiseMontgomery(paramPoly, paramPolyVecL.getVectorIndex(b)); 
  }
  
  public void invNttToMont() {
    for (byte b = 0; b < this.dilithiumL; b++)
      getVectorIndex(b).invNttToMont(); 
  }
  
  public void addPolyVecL(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecL paramPolyVecL) {
    for (byte b = 0; b < this.dilithiumL; b++)
      getVectorIndex(b).addPoly(paramPolyVecL.getVectorIndex(b)); 
  }
  
  public void reduce() {
    for (byte b = 0; b < this.dilithiumL; b++)
      getVectorIndex(b).reduce(); 
  }
  
  public boolean checkNorm(int paramInt) {
    for (byte b = 0; b < this.dilithiumL; b++) {
      if (getVectorIndex(b).checkNorm(paramInt))
        return true; 
    } 
    return false;
  }
  
  public String toString() {
    null = "\n[";
    for (byte b = 0; b < this.dilithiumL; b++) {
      null = null + "Inner Matrix " + null + " " + b;
      if (b != this.dilithiumL - 1)
        null = null + ",\n"; 
    } 
    return null + "]";
  }
  
  public String toString(String paramString) {
    return paramString + ": " + paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\dilithium\PolyVecL.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */