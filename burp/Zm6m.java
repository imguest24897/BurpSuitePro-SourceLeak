package burp;

public class Zm6m {
  private boolean ZF = true;
  
  private boolean Zl = true;
  
  private long ZT = 10000L;
  
  private Ze45 ZG = Ze45.ATTEMPT_HTTP2;
  
  private String ZL;
  
  public Zm6m Z_(boolean paramBoolean) {
    this.ZF = paramBoolean;
    return this;
  }
  
  public Zm6m Ze(boolean paramBoolean) {
    this.Zl = paramBoolean;
    return this;
  }
  
  public Zm6m ZR(Ze45 paramZe45) {
    this.ZG = paramZe45;
    return this;
  }
  
  public Zm6m Zv(String paramString) {
    this.ZL = paramString;
    return this;
  }
  
  public Zm6m Zt(long paramLong) {
    this.ZT = paramLong;
    return this;
  }
  
  public Zxtv ZF() {
    Zly6 zly6 = Zly6.Zq(this.Zl, this.ZL, this.ZT);
    return new Zxtm(this.ZG, this.ZF, zly6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */