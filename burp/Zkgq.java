package burp;

import java.util.Arrays;
import java.util.Collections;

public class Zkgq {
  private static int[] Zb;
  
  public static Ztm4 Zp(int paramInt1, int paramInt2, Zbjl paramZbjl, Zxs7 paramZxs7, Zkfj paramZkfj, Ztai paramZtai) {
    return new Zeof(paramInt1, paramInt2, paramZbjl, paramZxs7, paramZkfj, Zlep.ZJ(paramZxs7) ? Ztx9.Zv : Arrays.<Zlp9>asList(new Zlp9[] { Zlp9.XSS_DEFERRED_PAYLOAD_SHORT, Zlp9.XSS_DEFERRED_PAYLOAD_LONG }, ), new Zrhh(paramZbjl, paramZtai));
  }
  
  public static Ztm4 Zn(int paramInt1, int paramInt2, Zbjl paramZbjl, Zxs7 paramZxs7, Zkfj paramZkfj, Ztai paramZtai) {
    return new Zeof(paramInt1, paramInt2, paramZbjl, paramZxs7, paramZkfj, Collections.singletonList(Zlp9.FILE_UPLOAD_PHP), new Zlxa(paramZbjl, paramZtai));
  }
  
  public static Ztm4 ZV(int paramInt1, int paramInt2, Zbjl paramZbjl, Zxs7 paramZxs7, Zkfj paramZkfj, Ztai paramZtai) {
    return new Zeof(paramInt1, paramInt2, paramZbjl, paramZxs7, paramZkfj, Collections.singletonList(Zlp9.FILE_UPLOAD_SVG), new Zm3_(paramZbjl, paramZtai, null));
  }
  
  static Ztm4 ZF(int paramInt1, int paramInt2, Zbjl paramZbjl, Zxs7 paramZxs7, Ztai paramZtai, Zmxc paramZmxc) {
    return new Zeof(paramInt1, paramInt2, paramZbjl, paramZxs7, null, Collections.singletonList(Zlp9.FILE_UPLOAD_SVG), new Zm3_(paramZbjl, paramZtai, paramZmxc));
  }
  
  public static Ztm4 Zi(int paramInt1, int paramInt2, Zbjl paramZbjl, Zxs7 paramZxs7, Zkfj paramZkfj, Ztai paramZtai) {
    return new Zeof(paramInt1, paramInt2, paramZbjl, paramZxs7, paramZkfj, Collections.singletonList(Zlp9.FILE_UPLOAD_SSI), new Zxpv(paramZbjl, paramZtai, paramZxs7));
  }
  
  public static Ztm4 Zj(int paramInt1, int paramInt2, Ztai paramZtai, Zbjl paramZbjl, Zxs7 paramZxs7, Zkfj paramZkfj) {
    return new Zgpt(paramInt1, paramInt2, paramZbjl, paramZxs7, paramZkfj, paramZtai);
  }
  
  public static void Zg(int[] paramArrayOfint) {
    Zb = paramArrayOfint;
  }
  
  public static int[] Zr() {
    return Zb;
  }
  
  static {
    if (Zr() == null)
      Zg(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkgq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */