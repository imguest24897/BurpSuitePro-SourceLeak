package burp;

import java.util.Collections;

public class Zsop {
  private static int ZR;
  
  public static Zsqx<Zrdb> ZH(Zlit paramZlit, Zvow paramZvow) {
    int i = Za();
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.HIDDEN_HTTP2, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZlit.Zdz(), paramZlit.Zd4(), null);
  }
  
  public static void Zn(int paramInt) {
    ZR = paramInt;
  }
  
  public static int Za() {
    return ZR;
  }
  
  public static int Zu() {
    int i = Za();
    return (i == 0) ? 21 : 0;
  }
  
  static {
    if (Za() != 0)
      Zn(13); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsop.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */