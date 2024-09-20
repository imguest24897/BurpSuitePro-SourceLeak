package burp;

public class Zk1i implements Zrzd {
  private static final byte[] ZO = new byte[] { -17, -69, -65 };
  
  private static final byte[] ZB = new byte[] { -2, -1 };
  
  private static final byte[] ZW = new byte[] { -1, -2 };
  
  private static final byte[] Zh = new byte[] { -2, -1, 0, 0 };
  
  private static final byte[] ZC = new byte[] { -1, -2, 0, 0 };
  
  public int Zo(Zstu paramZstu, int paramInt) {
    return ZX(ZO, paramZstu, paramInt) ? ZO.length : (ZX(Zh, paramZstu, paramInt) ? Zh.length : (ZX(ZC, paramZstu, paramInt) ? ZC.length : (ZX(ZB, paramZstu, paramInt) ? ZB.length : (ZX(ZW, paramZstu, paramInt) ? ZW.length : 0))));
  }
  
  private boolean ZX(byte[] paramArrayOfbyte, Zstu paramZstu, int paramInt) {
    return Zlt_.ZL(paramZstu, paramArrayOfbyte, false, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk1i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */