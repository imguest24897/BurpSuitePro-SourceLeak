package burp;

import java.net.UnknownHostException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxz1 {
  private final Zskh Z_;
  
  private final Zzv5 ZM;
  
  private final Zgi1 ZL;
  
  Zxz1(Zskh paramZskh, Zzv5 paramZzv5, Zgi1 paramZgi1) {
    this.Z_ = paramZskh;
    this.ZM = paramZzv5;
    this.ZL = paramZgi1;
  }
  
  public Zg3d ZV(Zefx paramZefx) throws UnknownHostException {
    Zg3d zg3d = null;
    int i = 1 + this.ZM.ZR();
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    byte b = 0;
    while (true) {
      Zvom zvom;
      if (b < i) {
        zg3d = this.ZL.ZP(paramZefx);
        zvom = zg3d.Zb();
        try {
          if (zg3d.Zx() instanceof UnknownHostException)
            throw (UnknownHostException)zg3d.Zx(); 
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
        try {
          if (zvom != Zvom.STREAMING_RESPONSE)
            try {
              if (zvom != Zvom.RESPONSE_RECEIVED) {
                this.ZM.Zg();
                try {
                  Thread.sleep(this.ZM.Zs());
                } catch (InterruptedException interruptedException) {
                  Zah.Zl(interruptedException, Zk_.IGNORED);
                } 
                b++;
                if (arrayOfZbqc == null)
                  break; 
                continue;
              } 
              try {
                if (zg3d.Ze() != null)
                  try {
                    if (zvom == Zvom.RESPONSE_RECEIVED)
                      this.ZM.Zu(zg3d.Ze().Za().Zpu()); 
                  } catch (InterruptedException interruptedException) {
                    throw a(null);
                  }  
              } catch (InterruptedException interruptedException) {
                throw a(null);
              } 
            } catch (InterruptedException interruptedException) {
              throw a(null);
            }  
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
      } else {
        break;
      } 
      try {
        if (zg3d.Ze() != null)
          try {
            if (zvom == Zvom.RESPONSE_RECEIVED)
              this.ZM.Zu(zg3d.Ze().Za().Zpu()); 
          } catch (InterruptedException interruptedException) {
            throw a(null);
          }  
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } 
    return zg3d;
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxz1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */