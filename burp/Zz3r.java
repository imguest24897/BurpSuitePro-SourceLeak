package burp;

import java.util.function.Supplier;

public class Zz3r {
  private final Zbnt ZP;
  
  public Zz3r(Zbnt paramZbnt) {
    this.ZP = paramZbnt;
  }
  
  public boolean ZJ(Zlve paramZlve) {
    return paramZlve.ZO().isPresent();
  }
  
  public boolean ZA(Zlve paramZlve, Zbju paramZbju) {
    Zt70 zt70 = paramZlve.ZO().<Throwable>orElseThrow(IllegalArgumentException::new);
    String str = Zgcr.ZR(zt70.ZC().Za(), zt70.ZC().Zm(), zt70.ZC().Zs(), zt70.ZC().Ze(), 1);
    boolean bool = Zz44.ZT();
    try {
      if (str != null) {
        Zv(zt70, paramZbju, str, 0);
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zs0c zs0c = Zgcr.Ze(zt70.ZC().Zm());
    if (zs0c == null)
      zs0c = Zgcr.ZY((zt70.ZH()).Zd, (zt70.ZH()).ZH); 
    try {
      if (zs0c != null) {
        try {
          Zv(zt70, paramZbju, zs0c.Zx(), zs0c.Zl());
          if (zs0c.Zl() == 0)
            try {
              if (zs0c.Z_() != Zlju.META_REFRESH_NOSCRIPT);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!bool)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private void Zv(Zt70 paramZt70, Zbju paramZbju, String paramString, int paramInt) {
    Zlit zlit = Zgcr.Zd(paramZt70.Zr().Zdz(), paramZt70.Zr().Zdw(), this.ZP, paramString);
    try {
      if (zlit != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        paramZbju.ZM((new Zkkb<>((paramInt == 0) ? Zz3o.REDIRECT : Zz3o.DELAYED_REDIRECT, zlit)).Zl());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */