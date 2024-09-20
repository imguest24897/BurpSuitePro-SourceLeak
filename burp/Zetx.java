package burp;

public class Zetx implements Zrzd {
  private static final byte[] ZE = new byte[] { 60, 63, 120, 109, 108 };
  
  public int Zo(Zstu paramZstu, int paramInt) {
    if (Zlt_.ZL(paramZstu, ZE, false, paramInt)) {
      int i = Zlt_.ZT(paramZstu, (byte)62, paramInt, paramZstu.Zpu());
      if (i > 0) {
        int j = i + 1;
        j += Zmra.Zw(paramZstu, j);
        return j - paramInt;
      } 
    } 
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zetx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */