package burp;

public abstract class Zni {
  private Zxsr ZN;
  
  private static int[] ZP;
  
  public final boolean ZF(Object paramObject) {
    return (paramObject == this);
  }
  
  public final Object Zz6() {
    return this;
  }
  
  public void ZQ(Zm31[] paramArrayOfZm31, Zs7v paramZs7v) {
    Zm31[] arrayOfZm31 = paramArrayOfZm31;
    int[] arrayOfInt = Zp1();
    int i = arrayOfZm31.length;
    byte b = 0;
    while (b < i) {
      Zm31 zm31 = arrayOfZm31[b];
      if (paramZs7v.ZQ())
        return; 
      if (paramZs7v.Zs(zm31) && !ZP(zm31, paramZs7v))
        zm31.ZK(paramZs7v); 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      ZH(new int[5]); 
  }
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return false;
  }
  
  public Zxsr Zp8() {
    return this.ZN;
  }
  
  public void ZS(Zxsr paramZxsr) {
    this.ZN = paramZxsr;
  }
  
  public static void ZH(int[] paramArrayOfint) {
    ZP = paramArrayOfint;
  }
  
  public static int[] Zp1() {
    return ZP;
  }
  
  static {
    if (Zp1() != null)
      ZH(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zni.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */