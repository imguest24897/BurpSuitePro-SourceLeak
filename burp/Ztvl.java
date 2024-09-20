package burp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

public class Ztvl {
  private static int[] ZV;
  
  public static Zx_5 ZC(Zmzk paramZmzk, String paramString, byte paramByte, int paramInt, Zerr paramZerr) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { paramZerr.ZJ() });
    List<Zlfv<? extends Zgkc>> list = (List)paramZerr.ZL().stream().map(Ztvl::lambda$makeIssue$0).collect(Collectors.toList());
    int[] arrayOfInt = ZH();
    if (Zbqc.Zwu() == null)
      Zf(new int[5]); 
    return new Zx_5(Zzu2.REQUEST_SMUGGLING, paramByte, (byte)paramInt, paramString, map, list, paramZerr.ZP(), paramZerr.Zt(), paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static Zx_5 ZY(Ze3n paramZe3n, Zsxd paramZsxd1, byte[] paramArrayOfbyte, Zsxd paramZsxd2) {
    int[] arrayOfInt = ZH();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
    return ZC(paramZe3n.Za(), paramZe3n.ZN(), (byte)9, 4, Zerr.Zw(Zroa.CL_0, new Zvow[] { paramZe3n.Zt().ZC(paramZsxd1.Zz().ZL()).Zu(paramZsxd1.ZG().Ze().Za()), paramZe3n.Zt().Zp(paramArrayOfbyte).Zu(paramZsxd2.ZG().Ze().Za()) }));
  }
  
  private static Zt2w lambda$makeIssue$0(Zvow paramZvow) {
    return new Zt2w(new Zz25(new byte[0], 0), paramZvow);
  }
  
  public static void Zf(int[] paramArrayOfint) {
    ZV = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return ZV;
  }
  
  static {
    if (ZH() == null)
      Zf(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */