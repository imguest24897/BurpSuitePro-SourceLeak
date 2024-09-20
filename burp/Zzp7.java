package burp;

class Zzp7 {
  private byte[] ZE;
  
  private Zstu ZO;
  
  void ZM(byte[] paramArrayOfbyte) {
    this.ZE = paramArrayOfbyte;
    this.ZO = null;
  }
  
  byte[] ZE() {
    return this.ZE;
  }
  
  Zstu Zr(Zr_4 paramZr_4) {
    if (this.ZE == null)
      return null; 
    if (this.ZO == null)
      this.ZO = paramZr_4.ZZ(this.ZE); 
    return this.ZO;
  }
  
  boolean ZP() {
    return (this.ZE != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzp7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */