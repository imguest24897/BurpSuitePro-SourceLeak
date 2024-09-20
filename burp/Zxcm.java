package burp;

public class Zxcm implements Zt84 {
  private final Zbnt ZI;
  
  private byte[] ZS;
  
  private Zs68 ZZ;
  
  public Zxcm(byte[] paramArrayOfbyte, Zbnt paramZbnt) {
    this.ZS = paramArrayOfbyte;
    this.ZI = paramZbnt;
  }
  
  public byte[] ZcV() {
    return this.ZS;
  }
  
  public Zs68 ZeG() {
    if (this.ZZ == null && this.ZS != null)
      this.ZZ = Zmre.ZK(null, this.ZS, Zt0k.HTML_ANALYSIS, this.ZI); 
    return this.ZZ;
  }
  
  public void Zl(byte[] paramArrayOfbyte, Zr_4 paramZr_4) {
    this.ZS = paramArrayOfbyte;
    this.ZZ = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxcm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */