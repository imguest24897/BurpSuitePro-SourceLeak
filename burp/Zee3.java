package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zee3 {
  private final Zrzv ZY;
  
  private final Zey9 ZJ;
  
  private final int Zt;
  
  private final int Zs;
  
  Zee3(Zrzv paramZrzv, int paramInt1, int paramInt2, Zey9 paramZey9) {
    this.Zt = paramInt1;
    this.Zs = paramInt2;
    this.ZY = paramZrzv;
    this.ZJ = paramZey9;
  }
  
  public Zg3d Z_(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    Zg3d zg3d = null;
    int i = 1 + this.Zt;
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    byte b = 0;
    while (b < i) {
      zg3d = this.ZY.ZY(this.ZJ.ZY(paramZmzk, paramArrayOfbyte));
      try {
        if (zg3d.Zb() != Zvom.STREAMING_RESPONSE)
          try {
            if (zg3d.Zb() != Zvom.RESPONSE_RECEIVED)
              try {
                if (!(zg3d.Zx() instanceof java.net.UnknownHostException)) {
                  try {
                    Thread.sleep(this.Zs);
                  } catch (InterruptedException interruptedException) {
                    Zah.Zl(interruptedException, Zk_.IGNORED);
                  } 
                  b++;
                  if (arrayOfZbqc != null)
                    break; 
                  continue;
                } 
                return zg3d;
              } catch (InterruptedException interruptedException) {
                throw a(null);
              }  
          } catch (InterruptedException interruptedException) {
            throw a(null);
          }  
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      return zg3d;
    } 
    return zg3d;
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zee3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */