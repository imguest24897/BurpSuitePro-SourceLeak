package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztw3 {
  private final Zskh Zc;
  
  private final Zz8w Zg;
  
  private final Zkh1 Zp;
  
  private final Zmdy Zv;
  
  private final Zmfy Zd;
  
  private static String[] Zk;
  
  public Ztw3(Zz0n paramZz0n, Zskh paramZskh, Zbnt paramZbnt, Ztg4 paramZtg4, Ztwv paramZtwv, Zrn7 paramZrn7) {
    this.Zc = paramZskh;
    Zee5 zee5 = new Zee5(paramZz0n.ZM(), paramZz0n.ZR());
    Zeoo zeoo = new Zeoo(paramZskh);
    Zteh zteh = new Zteh(paramZz0n, zee5, paramZskh, paramZtg4, paramZrn7);
    this.Zg = new Zz8w(paramZz0n, zee5, paramZskh, paramZbnt, paramZtg4, paramZtwv, paramZrn7, zeoo, zteh);
    this.Zp = new Zkh1(paramZz0n, zee5, paramZskh, paramZbnt, paramZtg4, paramZtwv, paramZrn7, zeoo);
    this.Zv = new Zmdy(paramZz0n, zee5, paramZskh, paramZbnt, paramZtg4, paramZtwv, paramZrn7, zteh);
    this.Zd = new Zmfy(paramZz0n, zee5, paramZskh, paramZbnt, paramZtg4, paramZtwv, paramZrn7, zteh);
  }
  
  public Zlz3 ZN(Zeu1 paramZeu1, Zxr1 paramZxr1, Ztx8 paramZtx8) throws Exception {
    try {
      try {
        switch (Zgdr.ZP[paramZeu1.ZS().ordinal()]) {
          case 1:
          
          case 2:
          case 3:
          
          case 4:
          case 5:
          
          case 6:
          case 7:
          
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zuh.ZT(false, Zqf.Zk, (paramZeu1.ZS()).displayName);
      throw new IllegalStateException();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.COMMON_RUNTIME_FAILURE);
      paramZeu1.ZN(throwable, this.Zc);
      throw throwable;
    } 
  }
  
  public static void ZE(String[] paramArrayOfString) {
    Zk = paramArrayOfString;
  }
  
  public static String[] ZI() {
    return Zk;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    if (ZI() == null)
      ZE(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztw3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */