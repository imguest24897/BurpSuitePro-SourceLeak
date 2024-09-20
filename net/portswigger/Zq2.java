package net.portswigger;

import java.net.InetAddress;

public class Zq2 {
  private InetAddress ZM;
  
  private String Zw;
  
  private int ZQ;
  
  private Zcd Zi;
  
  public Zq2 Zr(InetAddress paramInetAddress) {
    this.ZM = paramInetAddress;
    return this;
  }
  
  public Zq2 Zo(String paramString) {
    this.Zw = paramString;
    return this;
  }
  
  public Zq2 Zc(int paramInt) {
    this.ZQ = paramInt;
    return this;
  }
  
  public Zq2 ZW(Zcd paramZcd) {
    this.Zi = paramZcd;
    return this;
  }
  
  public Zrxu Zn() {
    return new Zrxu(this.ZM, this.Zw, this.ZQ, this.Zi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zq2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */