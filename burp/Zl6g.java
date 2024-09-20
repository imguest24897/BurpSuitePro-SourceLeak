package burp;

import java.util.concurrent.atomic.AtomicInteger;

public class Zl6g {
  private final AtomicInteger ZL;
  
  private final int Zj;
  
  private static Zbqc[] Zy;
  
  public Zl6g() {
    this(4096, 2147483647);
  }
  
  public Zl6g(int paramInt1, int paramInt2) {
    this.ZL = new AtomicInteger(paramInt1);
    this.Zj = paramInt2;
  }
  
  public int Ze() {
    return this.Zj;
  }
  
  public int ZQ() {
    return this.ZL.get();
  }
  
  public void ZU(int paramInt) {
    this.ZL.set(paramInt);
  }
  
  public static void Zs(Zbqc[] paramArrayOfZbqc) {
    Zy = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZJ() {
    return Zy;
  }
  
  static {
    if (ZJ() != null)
      Zs(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */