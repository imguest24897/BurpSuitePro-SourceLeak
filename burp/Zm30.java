package burp;

public class Zm30 {
  private final String ZO;
  
  private final Zmzz ZH;
  
  private boolean Zi;
  
  public Zm30(String paramString, boolean paramBoolean, Zmzz paramZmzz) {
    this.ZO = paramString;
    this.Zi = paramBoolean;
    this.ZH = paramZmzz;
  }
  
  public String ZR() {
    return this.ZO;
  }
  
  public boolean Zt() {
    return this.Zi;
  }
  
  public void Zd(boolean paramBoolean) {
    if (this.Zi != paramBoolean)
      this.ZH.ZT(this, paramBoolean); 
    this.Zi = paramBoolean;
  }
  
  public void Ze(boolean paramBoolean) {
    this.Zi = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm30.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */