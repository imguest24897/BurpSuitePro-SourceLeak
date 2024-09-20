package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zxsr {
  protected final Zkit Za;
  
  private final long ZK;
  
  private static Zbqc[] Zs;
  
  protected Zxsr(Zkit paramZkit, long paramLong) {
    this.Za = paramZkit;
    this.ZK = paramLong;
    if (paramLong <= 0L)
      Zuh.ZT(this instanceof Zx2v, Zqf.Zr, getClass().getName()); 
  }
  
  public final Zr_4 ZPz() {
    return this.Za;
  }
  
  public final long ZXU() {
    return this.ZK;
  }
  
  public final boolean ZF(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof Zxsr) {
      Zxsr zxsr = (Zxsr)paramObject;
      return (this.Za == zxsr.Za && this.ZK == zxsr.ZK);
    } 
    return false;
  }
  
  public final Object Zz6() {
    return this.Za.Zj(this);
  }
  
  public void ZQ(Zm31[] paramArrayOfZm31, Zs7v paramZs7v) {
    Zm31[] arrayOfZm31 = paramArrayOfZm31;
    int i = arrayOfZm31.length;
    Zbqc[] arrayOfZbqc = ZXP();
    byte b = 0;
    while (b < i) {
      Zm31 zm31 = arrayOfZm31[b];
      if (paramZs7v.ZQ())
        return; 
      if (paramZs7v.Zs(zm31))
        zm31.ZK(paramZs7v); 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public int hashCode() {
    return (int)this.ZK;
  }
  
  public boolean equals(Object paramObject) {
    return ZF(paramObject);
  }
  
  public static void Zj(Zbqc[] paramArrayOfZbqc) {
    Zs = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZXP() {
    return Zs;
  }
  
  static {
    if (ZXP() != null)
      Zj(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */