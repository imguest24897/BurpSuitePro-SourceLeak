package burp;

import java.awt.Window;
import java.io.File;
import net.portswigger.Zl0;
import net.portswigger.Zvh;
import net.portswigger.Zze;

public class Zb31 implements Zer4 {
  private final Ztg4 ZQ;
  
  private final Zl0 Zs;
  
  private final Zskh Zu;
  
  private final Zl_d ZN;
  
  private final Window Zr;
  
  private final Zr_4 ZM;
  
  public Zb31(Ztg4 paramZtg4, Zl0 paramZl0, Zskh paramZskh, Zl_d paramZl_d, Window paramWindow) throws Zev3 {
    this.ZQ = paramZtg4;
    this.Zs = paramZl0;
    this.Zu = paramZskh;
    this.ZN = paramZl_d;
    this.Zr = paramWindow;
    this.ZM = Zq();
  }
  
  public Zkit ZX(String paramString) throws Zev3 {
    File file = this.Zs.Zg(paramString);
    ZK(file);
    Zedh zedh = new Zedh(file, this.Zs, this.Zu, this.ZN, this.Zr);
    return Zkit.Zo(file, 32768, 134217728, 1073741824, zedh, Zk9w.PERIODIC_AND_ON_CLOSE);
  }
  
  public Zkit Zz(String paramString) throws Zev3 {
    File file = this.Zs.Zg(paramString);
    ZK(file);
    Zedh zedh = new Zedh(file, this.Zs, this.Zu, this.ZN, this.Zr);
    Zkit zkit = Zkit.Za(file, Long.MAX_VALUE, 32768, 134217728, 1073741824, zedh, Zk9w.PERIODIC_AND_ON_CLOSE);
    Zze.Zd(file);
    zkit.ZP(zkit.ZH(new Zl3g()));
    int[] arrayOfInt = Zlvs.Zd();
    try {
      if (Zbqc.Zwu() == null)
        Zlvs.ZN(new int[1]); 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    return zkit;
  }
  
  private static void ZK(File paramFile) throws Zev3 {
    try {
      if (Zvh.ZU.ZM())
        throw new Zev3(Zrgs.PROJECT_FILES_NOT_SUPPORTED_ON_32BIT_OS.ZN(new Object[] { paramFile.getAbsolutePath() })); 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
  }
  
  public Zr_4 ZC() {
    return this.ZM;
  }
  
  private Zr_4 Zq() throws Zev3 {
    int[] arrayOfInt = Zlvs.Zd();
    if (Zvh.ZU.ZM()) {
      Zr15 zr151 = new Zru8(this.ZQ);
      if (arrayOfInt == null) {
        File file1 = this.ZQ.Zr();
        zr151 = new Zr15(file1);
        Zze.Zd(file1);
        zr151.ZP(zr151.ZH(new Zl3g()));
        return zr151;
      } 
      zr151.ZP(zr151.ZH(new Zl3g()));
      return zr151;
    } 
    File file = this.ZQ.Zr();
    Zr15 zr15 = new Zr15(file);
    Zze.Zd(file);
    zr15.ZP(zr15.ZH(new Zl3g()));
    return zr15;
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb31.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */