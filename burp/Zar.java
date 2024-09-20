package burp;

public class Zar extends Zni implements Zku8 {
  @Zzvo(0)
  private int ZW;
  
  @Zzvo(1)
  private boolean ZD;
  
  @Zzvo(5)
  private final String ZJ;
  
  @Zzvo(2)
  private final String ZO;
  
  @Zzvo(3)
  private final boolean Zk;
  
  @Zzvo(4)
  private final String ZU;
  
  public Zar(int paramInt, boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, String paramString3) {
    this.ZW = paramInt;
    this.ZD = paramBoolean1;
    this.ZJ = paramString1;
    this.ZO = paramString2;
    this.Zk = paramBoolean2;
    this.ZU = paramString3;
  }
  
  public Zl25 ZIu() {
    return Zl25.ZF(this.ZW);
  }
  
  public void Zk(Zl25 paramZl25) {
    this.ZW = paramZl25.projectPersistedId;
  }
  
  public boolean ZIp() {
    return this.ZD;
  }
  
  public void ZXg(boolean paramBoolean) {
    this.ZD = paramBoolean;
  }
  
  public String ZIX() {
    return this.ZO;
  }
  
  public boolean ZIr() {
    return this.Zk;
  }
  
  public String ZIt() {
    return this.ZU;
  }
  
  public String ZIG() {
    return this.ZJ;
  }
  
  public Zeu4<? extends Zku8> ZF() {
    return ZX;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zar.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */