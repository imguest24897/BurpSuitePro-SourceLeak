package burp;

public class Zg3f implements Zlv8 {
  private final Zlbp ZK;
  
  private final boolean Zt;
  
  private final Zgli Zd;
  
  public Zg3f(Zlbp paramZlbp, boolean paramBoolean, Zgli paramZgli) {
    this.ZK = paramZlbp;
    this.Zt = paramBoolean;
    this.Zd = paramZgli;
  }
  
  public boolean ZY() {
    return (this.Zd.Zt() == Ze3o.CLIENT_TO_SERVER);
  }
  
  public byte[] ZW() {
    return this.ZK.ZP();
  }
  
  public void Zo(byte[] paramArrayOfbyte) {
    this.ZK.Zj(paramArrayOfbyte);
  }
  
  public Zefx ZP() {
    return this.Zd.ZM();
  }
  
  public String ZE() {
    return this.Zd.ZIx();
  }
  
  public void Zx(String paramString) {
    this.Zd.Zxg(paramString);
  }
  
  public byte Zq() {
    return this.Zd.ZaP();
  }
  
  public void Zj(byte paramByte) {
    this.Zd.ZB(paramByte);
  }
  
  public boolean ZM() {
    return this.Zt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */