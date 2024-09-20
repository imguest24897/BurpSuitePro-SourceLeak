package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Poly;

class PolyVecK {
  Poly[] vec;
  
  private DilithiumEngine engine;
  
  private int mode;
  
  private int polyVecBytes;
  
  private int dilithiumK;
  
  private int dilithiumL;
  
  public PolyVecK(DilithiumEngine paramDilithiumEngine) {
    this.engine = paramDilithiumEngine;
    this.mode = paramDilithiumEngine.getDilithiumMode();
    this.dilithiumK = paramDilithiumEngine.getDilithiumK();
    this.dilithiumL = paramDilithiumEngine.getDilithiumL();
    this.vec = new Poly[this.dilithiumK];
    for (byte b = 0; b < this.dilithiumK; b++)
      this.vec[b] = new Poly(paramDilithiumEngine); 
  }
  
  public PolyVecK() throws Exception {
    throw new Exception("Requires Parameter");
  }
  
  public Poly getVectorIndex(int paramInt) {
    return this.vec[paramInt];
  }
  
  public void setVectorIndex(int paramInt, Poly paramPoly) {
    this.vec[paramInt] = paramPoly;
  }
  
  public void uniformEta(byte[] paramArrayOfbyte, short paramShort) {
    short s = paramShort;
    for (byte b = 0; b < this.dilithiumK; b++) {
      s = (short)(s + 1);
      getVectorIndex(b).uniformEta(paramArrayOfbyte, s);
    } 
  }
  
  public void reduce() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).reduce(); 
  }
  
  public void invNttToMont() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).invNttToMont(); 
  }
  
  public void addPolyVecK(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).addPoly(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public void conditionalAddQ() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).conditionalAddQ(); 
  }
  
  public void power2Round(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).power2Round(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public void polyVecNtt() {
    for (byte b = 0; b < this.dilithiumK; b++)
      this.vec[b].polyNtt(); 
  }
  
  public void decompose(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).decompose(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public byte[] packW1() {
    byte[] arrayOfByte = new byte[this.dilithiumK * this.engine.getDilithiumPolyW1PackedBytes()];
    for (byte b = 0; b < this.dilithiumK; b++)
      System.arraycopy(getVectorIndex(b).w1Pack(), 0, arrayOfByte, b * this.engine.getDilithiumPolyW1PackedBytes(), this.engine.getDilithiumPolyW1PackedBytes()); 
    return arrayOfByte;
  }
  
  public void pointwisePolyMontgomery(Poly paramPoly, org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).pointwiseMontgomery(paramPoly, paramPolyVecK.getVectorIndex(b)); 
  }
  
  public void subtract(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).subtract(paramPolyVecK.getVectorIndex(b)); 
  }
  
  public boolean checkNorm(int paramInt) {
    for (byte b = 0; b < this.dilithiumK; b++) {
      if (getVectorIndex(b).checkNorm(paramInt))
        return true; 
    } 
    return false;
  }
  
  public int makeHint(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK1, org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK2) {
    int i = 0;
    for (byte b = 0; b < this.dilithiumK; b++)
      i += getVectorIndex(b).polyMakeHint(paramPolyVecK1.getVectorIndex(b), paramPolyVecK2.getVectorIndex(b)); 
    return i;
  }
  
  public void useHint(org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK1, org.bouncycastle.pqc.crypto.crystals.dilithium.PolyVecK paramPolyVecK2) {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).polyUseHint(paramPolyVecK1.getVectorIndex(b), paramPolyVecK2.getVectorIndex(b)); 
  }
  
  public void shiftLeft() {
    for (byte b = 0; b < this.dilithiumK; b++)
      getVectorIndex(b).shiftLeft(); 
  }
  
  public String toString() {
    null = "[";
    for (byte b = 0; b < this.dilithiumK; b++) {
      null = null + null + " " + b;
      if (b != this.dilithiumK - 1)
        null = null + ",\n"; 
    } 
    return null + "]";
  }
  
  public String toString(String paramString) {
    return paramString + ": " + paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\dilithium\PolyVecK.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */