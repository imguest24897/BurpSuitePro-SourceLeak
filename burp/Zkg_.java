package burp;

public class Zkg_ {
  protected static final byte[] ZA = new byte[] { 60, 33, 100, 111, 99, 116, 121, 112, 101 };
  
  protected static final byte[] Zk = new byte[] { 104, 116, 109, 108 };
  
  protected static final byte[] Zi = new byte[] { 83, 89, 83, 84, 69, 77 };
  
  protected static final byte[] Zx = new byte[] { 80, 85, 66, 76, 73, 67 };
  
  private static final Zzrd Zm = Zzrd.ZJ(Zi, true, false);
  
  private static final Zzrd ZV = Zzrd.ZJ(Zx, true, false);
  
  protected static final Zzrd Zq = Zzrd.ZJ(Zk, true, false);
  
  private static final Zzrd ZR = Zzrd.ZG(new String(ZA));
  
  protected final Zrzd ZK;
  
  private final Zrzd ZN;
  
  protected Zkg_(Zrzd paramZrzd1, Zrzd paramZrzd2) {
    this.ZK = paramZrzd1;
    this.ZN = paramZrzd2;
  }
  
  protected boolean Zo(Zstu paramZstu, int paramInt) {
    int i = ZD(paramZstu, paramInt + this.ZN.Zo(paramZstu, paramInt));
    return Zlt_.ZL(paramZstu, ZA, false, i);
  }
  
  protected int Z_(Zstu paramZstu, int paramInt) {
    int i = ZR.Zi(paramZstu, paramInt, paramZstu.Zpu()).ZR();
    return ZD(paramZstu, i + ZA.length);
  }
  
  protected boolean ZJ(Zstu paramZstu, int paramInt) {
    return Zq.Zi(paramZstu, paramInt, paramInt + Zk.length).ZP();
  }
  
  protected int ZC(Zstu paramZstu, int paramInt) {
    int[] arrayOfInt = Zesg.Zj();
    int i = paramInt;
    while (i < paramZstu.Zpu() && paramZstu.Zp(i) > 32 && paramZstu.Zp(i) != 62) {
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    return ZD(paramZstu, i);
  }
  
  protected boolean Zl(Zstu paramZstu, int paramInt) {
    return Zm.Zi(paramZstu, paramInt, paramInt + Zi.length).ZP();
  }
  
  protected boolean Zk(Zstu paramZstu, int paramInt) {
    return ZV.Zi(paramZstu, paramInt, paramInt + Zx.length).ZP();
  }
  
  protected int ZD(Zstu paramZstu, int paramInt) {
    return paramInt + this.ZK.Zo(paramZstu, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkg_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */