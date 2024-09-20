package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl2r implements Zbx0 {
  private final Zez3[] ZZ;
  
  private final Zl41 ZE;
  
  private final Zerg Zc;
  
  private final Zskh ZK;
  
  private final Zz28 ZU;
  
  private final Zey9 ZA;
  
  private final Zmt0 Ze;
  
  private final Zt2i ZY;
  
  private final boolean Zp;
  
  private boolean ZF;
  
  Zl2r(Zez3[] paramArrayOfZez3, Zl41 paramZl41, Zerg paramZerg, Zskh paramZskh, Zz28 paramZz28, Zey9 paramZey9, Zmt0 paramZmt0, Zt2i paramZt2i, boolean paramBoolean) {
    this.ZZ = paramArrayOfZez3;
    this.ZE = paramZl41;
    this.Zc = paramZerg;
    this.ZK = paramZskh;
    this.ZU = paramZz28;
    this.ZA = paramZey9;
    this.Ze = paramZmt0;
    this.ZY = paramZt2i;
    this.Zp = paramBoolean;
  }
  
  public void Zx() {
    if (this.ZY.ZS())
      try {
        this.Zc.ZA().Zo(this, this.ZZ);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
    if (this.ZY.Za())
      try {
        this.Zc.ZJ().Zu(this);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
    if (this.ZY.Zr())
      try {
        this.Zc.Zm().ZR(this);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
    if (this.ZY.Zh())
      try {
        this.Zc.Ze().Za(this);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  public void ZP() {
    this.ZF = true;
  }
  
  public boolean Zi(Zeew paramZeew, Zll9 paramZll9) {
    switch (Zb2a.ZF[paramZeew.ordinal()]) {
      case 1:
        return !this.ZY.ZS() ? this.ZF : Zp(paramZll9);
      case 2:
        return !this.ZY.Za() ? this.ZF : Zp(paramZll9);
      case 3:
        return !this.ZY.Zr() ? this.ZF : Zp(paramZll9);
      case 4:
        return this.ZF;
    } 
    Zuh.ZT(false, Zqf.Zk, paramZeew.toolName);
    return Zp(paramZll9);
  }
  
  public boolean Zp(Zll9 paramZll9) {
    try {
      if (this.ZF)
        return true; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      try {
        if (this.ZY.ZM() && !this.ZU.ZG(paramZll9.ZlL()))
          return false; 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (this.ZZ != null && !Zz(paramZll9.ZlL()))
          return false; 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (Za(paramZll9))
          this.ZE.ZS(this, paramZll9); 
      } catch (Exception exception) {
        throw a(null);
      } 
      Ztyh.Zc();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.ZK);
    } 
    return this.ZF;
  }
  
  Zt2i Zy() {
    return this.ZY;
  }
  
  private boolean Za(Zll9 paramZll9) {
    if (!this.ZY.Zt())
      return false; 
    boolean bool1 = Zx(Zq(paramZll9));
    if (bool1 && !this.Zp)
      return true; 
    boolean bool2 = Zx(Zt(paramZll9));
    return (bool2 && !this.Zp) ? true : ((this.Zp && !bool1 && !bool2));
  }
  
  private boolean Zz(Zlit paramZlit) {
    Zez3[] arrayOfZez3 = this.ZZ;
    int i = arrayOfZez3.length;
    String str = Zl41.ZU();
    byte b = 0;
    while (b < i) {
      Zez3 zez3 = arrayOfZez3[b];
      if (zez3.ZR(paramZlit))
        return true; 
      b++;
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private Zstu Zq(Zmgv paramZmgv) {
    Zbr zbr = paramZmgv.Zo3();
    Zefx zefx = zbr.ZP(paramZmgv.Zod(), this.ZA);
    Zgvw zgvw = new Zgvw(this.ZY.Zo(), this.ZY.ZB());
    zefx.Zi(zgvw);
    return zgvw.ZS();
  }
  
  private Zstu Zt(Zmgv paramZmgv) {
    return Zz9g.Zf(paramZmgv.ZoO(), this.ZY.ZE(), this.ZY.ZK());
  }
  
  private boolean Zx(Zstu paramZstu) {
    try {
      if (paramZstu == null)
        return false; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      return this.Ze.ZA(paramZstu);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */