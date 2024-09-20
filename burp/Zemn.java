package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zemn {
  private final Zbnt Zv;
  
  private final Zes1 Zr;
  
  private final Zep_ Zj;
  
  private final Zm90 ZY;
  
  private final Zzzx Zu;
  
  private final Zxpl Zi;
  
  Zemn(Zbnt paramZbnt, Zes1 paramZes1, Zep_ paramZep_, Zm90 paramZm90, Zzzx paramZzzx, Zxpl paramZxpl) {
    this.Zv = paramZbnt;
    this.Zr = paramZes1;
    this.Zj = paramZep_;
    this.ZY = paramZm90;
    this.Zu = paramZzzx;
    this.Zi = paramZxpl;
  }
  
  Zlat ZU(Zz3o paramZz3o, Zefx paramZefx, Ztpx paramZtpx) {
    Zefx zefx = this.Zi.Zs(paramZefx);
    try {
      this.ZY.Zm();
      AtomicBoolean atomicBoolean = new AtomicBoolean();
      AtomicReference<Zlit> atomicReference = new AtomicReference();
      Zxfs zxfs = new Zxfs(this.Zv, this.Zr, atomicBoolean, atomicReference);
      Ztaw ztaw = this.Zu.ZJ(zefx, null, null, zxfs);
      Zsxd zsxd = paramZtpx.ZJ(ztaw);
      Zg3d zg3d = zsxd.ZG();
      try {
        Zxwm zxwm;
        switch (Ztbe.Zj[zg3d.Zb().ordinal()]) {
          default:
            Zuh.ZT(false, Zqf.Zk, zg3d.Zb().name());
          case 1:
          case 2:
          case 3:
            this.ZY.ZJ();
            return this.Zj.ZI(paramZz3o, zsxd, Zxwm.MEDIA_OR_LARGE_RESPONSE);
          case 4:
            try {
            
            } catch (Zgum zgum) {
              throw a(null);
            } 
            zxwm = (zg3d.Zx() instanceof Ztp7) ? Zxwm.PROXY_CONNECTION_FAILED : Zxwm.UNKNOWN_HOST;
            return this.Zj.ZI(paramZz3o, zsxd, zxwm);
          case 5:
            try {
              this.ZY.ZU(true);
            } catch (Zgum zgum) {
              throw a(null);
            } 
            zxwm = (zg3d.Zx() instanceof Zr9q) ? Zxwm.PROXY_CONNECTION_FAILED : Zxwm.CONNECTION_FAILED;
            return this.Zj.ZI(paramZz3o, zsxd, zxwm);
          case 6:
            this.ZY.ZU(true);
            return this.Zj.ZI(paramZz3o, zsxd, Zxwm.READ_TIMEOUT);
          case 7:
            this.ZY.ZU(true);
            return this.Zj.ZI(paramZz3o, zsxd, Zxwm.NO_RESPONSE_DATA);
          case 8:
            return this.Zj.ZI(paramZz3o, zsxd, Zxwm.UNSUPPORTED_RESPONSE_DATA);
          case 9:
            break;
        } 
      } catch (Zgum zgum) {
        throw a(null);
      } 
      try {
        this.ZY.ZJ();
        if (atomicBoolean.get())
          return this.Zj.ZI(paramZz3o, zsxd, Zxwm.MAX_REDIRECTS); 
      } catch (Zkok zkok) {
        throw a(null);
      } 
      try {
        if (atomicReference.get() != null)
          return this.Zj.Zg(paramZz3o, zsxd, atomicReference.get()); 
      } catch (Zkok zkok) {
        throw a(null);
      } 
      try {
        if (Zv(zg3d))
          return this.Zj.ZI(paramZz3o, zsxd, Zxwm.MEDIA_OR_LARGE_RESPONSE); 
      } catch (Zkok zkok) {
        throw a(null);
      } 
      try {
        if (Zg(zg3d))
          return this.Zj.ZI(paramZz3o, zsxd, Zxwm.PROXY_AUTHENTICATION_REQUIRED); 
      } catch (Zkok zkok) {
        throw a(null);
      } 
      return this.Zj.ZI(paramZz3o, zsxd, Zxwm.OK);
    } catch (Zgum zgum) {
      Zah.Zl(zgum, Zk_.IGNORED);
      throw new Zkok();
    } 
  }
  
  private static boolean Zv(Zg3d paramZg3d) {
    return Ztfi.ZC(paramZg3d.Ze().Zm());
  }
  
  private static boolean Zg(Zg3d paramZg3d) {
    try {
      if (!(paramZg3d.Zx() instanceof Zryl)) {
        try {
          if (paramZg3d.Zx() instanceof Zry8);
        } catch (Zkok zkok) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zkok zkok) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zemn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */