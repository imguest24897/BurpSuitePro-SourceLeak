package burp;

class Zgm5 {
  private final byte[] Zn;
  
  private byte[] ZE;
  
  private Zs68 ZH;
  
  private final Zbnt ZL;
  
  Zgm5(byte[] paramArrayOfbyte, Zs68 paramZs68, Zbnt paramZbnt) {
    this.Zn = paramArrayOfbyte;
    this.ZH = paramZs68;
    this.ZL = paramZbnt;
  }
  
  byte[] ZP() {
    return (this.ZE == null) ? this.Zn : this.ZE;
  }
  
  byte[] Zy() {
    if (this.ZE == null)
      this.ZE = (byte[])this.Zn.clone(); 
    return this.ZE;
  }
  
  void Zh(byte[] paramArrayOfbyte) {
    this.ZE = paramArrayOfbyte;
  }
  
  Zs68 ZL() {
    if (this.ZH == null)
      this.ZH = Zmre.ZK(null, ZP(), Zt0k.HTML_ANALYSIS, this.ZL); 
    return this.ZH;
  }
  
  void Zl() {
    this.ZH = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgm5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */