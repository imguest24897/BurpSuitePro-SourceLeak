package burp;

public class Zzi2 implements Zgx1 {
  private final Zrzd ZA;
  
  private static int[] ZO;
  
  public Zzi2(Zrzd paramZrzd) {
    this.ZA = paramZrzd;
  }
  
  public void Zc(Zstu paramZstu, Zm7o paramZm7o) {
    int i = paramZm7o.Zz();
    if (ZC(paramZstu, i))
      paramZm7o.Zl(Zb(paramZstu, i)); 
  }
  
  private boolean ZC(Zstu paramZstu, int paramInt) {
    return Zl(paramZstu, paramInt) ? Zk(paramZstu, paramInt + 1) : false;
  }
  
  private int Zb(Zstu paramZstu, int paramInt) {
    int i = ZS('"', paramZstu, paramInt + 1) - paramInt + 1;
    return i + this.ZA.Zo(paramZstu, paramInt + i);
  }
  
  private boolean Zl(Zstu paramZstu, int paramInt) {
    return (paramZstu.Zp(paramInt) == 34);
  }
  
  private boolean Zk(Zstu paramZstu, int paramInt) {
    return (ZS('"', paramZstu, paramInt) != -1);
  }
  
  private int ZS(char paramChar, Zstu paramZstu, int paramInt) {
    int[] arrayOfInt = ZW();
    int i = Zg(paramChar, paramZstu, paramInt);
    while (i > 0 && paramZstu.Zp(i - 1) == 92) {
      i = Zg(paramChar, paramZstu, i + 1);
      if (arrayOfInt == null)
        break; 
    } 
    return i;
  }
  
  private int Zg(char paramChar, Zstu paramZstu, int paramInt) {
    return Zlt_.Zq(paramZstu, (byte)paramChar, false, paramInt, paramZstu.Zpu());
  }
  
  public static void ZS(int[] paramArrayOfint) {
    ZO = paramArrayOfint;
  }
  
  public static int[] ZW() {
    return ZO;
  }
  
  static {
    if (ZW() == null)
      ZS(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzi2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */