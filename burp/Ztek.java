package burp;

public class Ztek implements Zrzd {
  private static final byte[] ZG = new byte[] { 60, 33, 45, 45 };
  
  private static final byte[] Zt = new byte[] { 45, 45, 62 };
  
  private static final Zzrd Zf = Zzrd.ZJ(Zt, false, false);
  
  public int Zo(Zstu paramZstu, int paramInt) {
    if (paramZstu.Zpu() - paramInt > 4 && Zlt_.ZT(paramZstu, ZG, paramInt)) {
      int i = Zf.Zi(paramZstu, paramInt + 4, paramZstu.Zpu()).ZR();
      if (i != -1) {
        i += 3;
        i += Zmra.Zw(paramZstu, i);
        if (i < paramZstu.Zpu())
          return i - paramInt - 1; 
      } 
      return 1;
    } 
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztek.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */