package burp;

import net.portswigger.Zsy;

public class Zkmg {
  public static Zr69 Zn(Zkkg paramZkkg, Zsy paramZsy, Zz28 paramZz28, Zskh paramZskh, boolean paramBoolean, int paramInt) {
    String[] arrayOfString = Zbq0.Zh();
    Ze72 ze72 = (new Ze72()).Zl((paramInt > 11926)).ZL(paramZsy).ZZ(paramZz28).Zo(new Zmpw()).Zk(paramBoolean).Zj(paramZskh);
    paramZkkg.ZD().ZH(ze72);
    paramZkkg.Zq().Z_(ze72);
    paramZkkg.ZP().ZA(ze72);
    paramZkkg.ZM().ZC(ze72);
    paramZkkg.Zb().Zx(ze72);
    if (paramBoolean) {
      ze72.ZH(false);
      ze72.Zz(false);
      ze72.ZK(Zkmg::lambda$from$0);
    } 
    if (Zbqc.Zwu() == null)
      Zbq0.ZM(new String[2]); 
    return ze72.ZC();
  }
  
  public static Zr69 ZL() {
    return (new Ze72()).Zz(Zbq0.NORMAL.networkIdleThreshold).ZT(Zbq0.NORMAL.domIdleThreshold).Zj(Zbq0.NORMAL.awaitNavigationTimeout).ZL(true).ZC();
  }
  
  private static Integer lambda$from$0() {
    return Integer.valueOf(0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */