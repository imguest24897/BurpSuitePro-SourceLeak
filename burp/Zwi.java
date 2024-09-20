package burp;

import burp.api.montoya.core.HighlightColor;

public class Zwi extends Zni implements Zk2m {
  @Zzvo(1)
  private String ZV;
  
  @Zzvo(2)
  private byte ZU;
  
  public Zwi(String paramString, byte paramByte) {
    this.ZV = paramString;
    this.ZU = paramByte;
  }
  
  public Zeu4<? extends Zk2m> ZF() {
    return Zk2m.Zi;
  }
  
  public void Zq(String paramString) {
    this.ZV = paramString;
  }
  
  public String ZYJ() {
    return this.ZV;
  }
  
  public void Ze(HighlightColor paramHighlightColor) {
    this.ZU = Zkho.Zk(paramHighlightColor);
  }
  
  public HighlightColor ZYP() {
    return Zkho.Zk(this.ZU);
  }
  
  public boolean equals(Object paramObject) {
    return super.equals(paramObject) ? true : Zen3.Zr(this, paramObject);
  }
  
  public int hashCode() {
    return Zen3.ZQ(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */