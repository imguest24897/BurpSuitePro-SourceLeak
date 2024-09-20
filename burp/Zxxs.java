package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zxxs {
  private final Zeg_ ZZ;
  
  private final Zeow Zr;
  
  private static int[] ZM;
  
  public Zxxs(Zeg_ paramZeg_, Zeow paramZeow) {
    this.ZZ = paramZeg_;
    this.Zr = paramZeow;
  }
  
  public void ZL(Zlit paramZlit, String paramString, int paramInt, Zm4 paramZm4) {
    int[] arrayOfInt = Zz();
    if (paramString == null)
      return; 
    for (Ztkq ztkq : Zku_.Zu(paramString, 0, paramString.length())) {
      String str = ztkq.ZQ;
      if (str.length() < 10)
        continue; 
      byte[] arrayOfByte = Zkb.Zy(str);
      Zg6y zg6y = this.ZZ.Zj(paramZlit, arrayOfByte, paramInt + ztkq.ZP, (byte)3, paramZm4);
      if (zg6y == null && Zvu.Zz(arrayOfByte, 0) == 256) {
        List<Ztu8> list = Zeam.Zv(arrayOfByte, 0, arrayOfByte.length, (byte)0);
        this.Zr.Z_(paramZlit, list, paramInt + ztkq.ZP, paramZm4);
      } 
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  public static void ZO(int[] paramArrayOfint) {
    ZM = paramArrayOfint;
  }
  
  public static int[] Zz() {
    return ZM;
  }
  
  static {
    if (Zz() != null)
      ZO(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxxs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */