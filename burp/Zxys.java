package burp;

import java.util.Objects;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxys implements Zkrr {
  private final Ze3n Zp;
  
  private final Zz1i Zr;
  
  private final Supplier<Boolean> ZN;
  
  private final Zsoh ZG;
  
  private final Zskh ZY;
  
  private final Ztbb ZH;
  
  private static String Zd;
  
  public Zxys(Ze3n paramZe3n, Zz1i paramZz1i, Supplier<Boolean> paramSupplier, Zsoh paramZsoh, Zskh paramZskh, Ztbb paramZtbb) {
    this.Zp = paramZe3n;
    this.Zr = paramZz1i;
    this.ZN = paramSupplier;
    this.ZG = paramZsoh;
    String str = ZY();
    try {
      this.ZY = paramZskh;
      this.ZH = paramZtbb;
      if (str == null)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_HiddenHttp2;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    String str = ZY();
    try {
      if (this.Zp.Za().ZJZ())
        try {
          if (!this.ZH.ZM(this.Zp.Za())) {
            try {
              if (!((Boolean)this.ZN.get()).booleanValue()) {
                Zmgc.H2_DISABLED.Zh(this.ZY.ZA(), new Object[0]);
                return;
              } 
            } catch (Zscd zscd) {
              throw a(null);
            } 
            try {
              Zsxd zsxd = this.ZG.ZD(Ztao.Zc(paramZtpx, this.Zp.ZM(), this.Zp.ZA().ZD()).Zx(Zxgd.ZZ().ZT(Ze45.FORCE_HTTP2_NON_POOLED)).ZA());
              Zstu zstu = Zsoh.ZA(zsxd);
              try {
                if (zstu != null)
                  try {
                    if (zstu.Zpu() != 0)
                      ZR(zsxd.ZG().ZL(), zstu, paramZz4_); 
                  } catch (Zscd zscd) {
                    throw a(null);
                  }  
              } catch (Zscd zscd) {
                throw a(null);
              } 
            } catch (Zscd zscd) {
              try {
                if (zscd.getCause() instanceof java.io.IOException) {
                  try {
                    Zah.Zl(zscd, Zk_.IGNORED);
                    if (str == null) {
                      Zah.Zl(zscd, Zk_.RETHROWN);
                      throw zscd;
                    } 
                  } catch (Zscd zscd1) {
                    throw a(null);
                  } 
                } else {
                  Zah.Zl(zscd, Zk_.RETHROWN);
                  throw zscd;
                } 
              } catch (Zscd zscd1) {
                throw a(null);
              } 
            } 
            return;
          } 
          return;
        } catch (Zscd zscd) {
          throw a(null);
        }  
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private void ZR(Zefx paramZefx, Zstu paramZstu, Zz4_ paramZz4_) {
    Zvow zvow = this.Zp.ZI().ZC(paramZefx).Zu(paramZstu);
    paramZz4_.Zz(Zsop.ZH(this.Zp.ZA().ZF(), zvow));
    Objects.requireNonNull(this.Zr.Zc(this.Zp.Za()));
    paramZz4_.ZL(this.Zr.Zc(this.Zp.Za())::ZC1);
  }
  
  public static void Zk(String paramString) {
    Zd = paramString;
  }
  
  public static String ZY() {
    return Zd;
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
  
  static {
    if (ZY() == null)
      Zk("w4dot"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxys.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */