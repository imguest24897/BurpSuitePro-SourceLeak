package burp;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zkb;

public class Zs_y {
  private final Zs2p ZZ;
  
  private final Zz28 ZN;
  
  private static String[] Zw;
  
  public Zs_y(Zs2p paramZs2p, Zz28 paramZz28) {
    this.ZZ = paramZs2p;
    this.ZN = paramZz28;
  }
  
  public Zgh0 Zi(byte[] paramArrayOfbyte, Ze3o paramZe3o, Zlit paramZlit) {
    String[] arrayOfString = ZP();
    if (this.ZZ.ZF() && !this.ZN.ZG(paramZlit))
      return new Zgh0(paramArrayOfbyte, false); 
    List<Zku8> list = this.ZZ.Za(paramZe3o::lambda$handleMatchReplace$0);
    if (list.isEmpty())
      return new Zgh0(paramArrayOfbyte, false); 
    String str = Zkb.ZG(paramArrayOfbyte);
    boolean bool = false;
    for (Zku8 zku8 : list) {
      Pattern pattern = this.ZZ.ZM(zku8);
      Matcher matcher = pattern.matcher(str);
      if (matcher.find()) {
        str = matcher.replaceAll(zku8.ZIX());
        bool = true;
      } 
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    return bool ? new Zgh0(Zkb.Zy(str), true) : new Zgh0(paramArrayOfbyte, false);
  }
  
  private static boolean Zt(Zl25 paramZl25, Ze3o paramZe3o) {
    switch (Zvog.Zc[paramZl25.ordinal()]) {
      case 1:
      
      case 2:
        return (paramZe3o == Ze3o.CLIENT_TO_SERVER);
      case 3:
        return (paramZe3o == Ze3o.SERVER_TO_CLIENT);
    } 
    return false;
  }
  
  private static boolean lambda$handleMatchReplace$0(Ze3o paramZe3o, Zku8 paramZku8) {
    return (paramZku8.ZIp() && Zt(paramZku8.ZIu(), paramZe3o));
  }
  
  public static void Zc(String[] paramArrayOfString) {
    Zw = paramArrayOfString;
  }
  
  public static String[] ZP() {
    return Zw;
  }
  
  static {
    if (ZP() != null)
      Zc(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */