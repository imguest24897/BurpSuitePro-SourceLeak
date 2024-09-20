package burp;

public class Ze5y implements Zbu2 {
  private int ZP = 0;
  
  public void ZW(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    if (paramZs68.ZH.Zj == 260) {
      Zyf zyf = Zyf.Zy(paramArrayOfbyte);
      this.ZP = Zzmg.Zy(zyf, paramZs68.Zd(), zyf.Zpu()).size();
    } 
  }
  
  public void ZB(Zt82 paramZt82) {
    paramZt82.Ze(ZV(), this.ZP);
  }
  
  public Zlug ZV() {
    return Zlug.JSON_NODE_COUNT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */