package burp;

import java.util.Objects;

public abstract class Zx9q extends Zxsr implements Zk28 {
  private static int Zj;
  
  protected Zx9q(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkg3 ZVS() {
    return Zzaq.Zq(this);
  }
  
  public boolean ZY(Ze7n paramZe7n) {
    return Zzaq.ZY(paramZe7n);
  }
  
  public boolean ZRC() {
    return this.Za.Zi(this, Zknx.Zq);
  }
  
  public Zs2c ZRT() {
    return this.Za.<Zs2c>ZJ(this, Zknx.ZP);
  }
  
  public String ZRF() {
    return this.Za.Zf(this, Zknx.ZM);
  }
  
  public boolean equals(Object paramObject) {
    return Zzaq.ZL(this, paramObject);
  }
  
  public int hashCode() {
    int i = Zde();
    if (ZRC())
      return Objects.hash(new Object[] { ZRT(), ZRF() }); 
    if (i != 0)
      Zbqc.Zr(new Zbqc[3]); 
    return Objects.hash(new Object[] { ZRT(), ZRF(), Boolean.valueOf(ZRC()) });
  }
  
  public static void ZZ(int paramInt) {
    Zj = paramInt;
  }
  
  public static int Zde() {
    return Zj;
  }
  
  public static int Zdi() {
    int i = Zde();
    return (i == 0) ? 59 : 0;
  }
  
  static {
    if (Zde() != 0)
      ZZ(22); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */