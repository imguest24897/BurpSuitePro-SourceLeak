package burp;

import java.util.Objects;

public abstract class Zfk extends Zni implements Zk28 {
  @Zzvo(32)
  private final Zs2c ZG;
  
  @Zzvo(33)
  private final String ZU;
  
  @Zzvo(63)
  private final boolean Zx;
  
  protected Zfk(Zs2c paramZs2c, String paramString, boolean paramBoolean) {
    this.ZG = paramZs2c;
    this.ZU = paramString;
    this.Zx = paramBoolean;
  }
  
  public Zkg3 ZVS() {
    return Zzaq.Zq(this);
  }
  
  public boolean ZY(Ze7n paramZe7n) {
    return Zzaq.ZY(paramZe7n);
  }
  
  public boolean ZRC() {
    return this.Zx;
  }
  
  public Zs2c ZRT() {
    return this.ZG;
  }
  
  public String ZRF() {
    return this.ZU;
  }
  
  public boolean equals(Object paramObject) {
    return Zzaq.ZL(this, paramObject);
  }
  
  public int hashCode() {
    int i = Zx9q.Zdi();
    if (ZRC())
      return Objects.hash(new Object[] { ZRT(), ZRF() }); 
    if (Zbqc.Zwu() == null)
      Zx9q.ZZ(++i); 
    return Objects.hash(new Object[] { ZRT(), ZRF(), Boolean.valueOf(ZRC()) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zfk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */