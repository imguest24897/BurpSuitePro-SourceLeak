package burp;

import java.util.Random;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zl26 {
  private static final Random Ze = new Random();
  
  static String ZY(int paramInt) {
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    String str = Long.toHexString(Ze.nextLong());
    while (str.length() < paramInt) {
      str = str + str;
      if (arrayOfZbqc == null)
        break; 
    } 
    return str.substring(0, paramInt);
  }
  
  static Zlit Zp(Zlit paramZlit, int paramInt) {
    String str1 = Zkb.ZG(paramZlit.ZdH());
    int[] arrayOfInt = paramZlit.Zdn();
    int i = (arrayOfInt == null) ? (paramZlit.Zd4()).length : arrayOfInt[0];
    int j = str1.lastIndexOf('/', i);
    if (j == -1) {
      Zuh.Zb(false, Zqf.Zr);
      return null;
    } 
    int k = j + 1;
    String str2 = str1.substring(0, k) + str1.substring(0, k) + ZY(paramInt);
    return new Zax(paramZlit.Zdz(), Zkb.Zy(str2));
  }
  
  static Zlit Zs(Zlit paramZlit, int paramInt) {
    String str1 = Zkb.ZG(paramZlit.ZdH());
    String str2 = paramZlit.Zd_();
    int[] arrayOfInt = paramZlit.Zdn();
    int i = (arrayOfInt == null) ? (paramZlit.Zd4()).length : arrayOfInt[0];
    if (str2 != null)
      i -= str2.length() + 1; 
    String str3 = str1.substring(0, i) + str1.substring(0, i) + ZY(paramInt);
    return new Zax(paramZlit.Zdz(), Zkb.Zy(str3));
  }
  
  static Zlit Zr(Zlit paramZlit, int paramInt) {
    String str1 = Zkb.ZG(paramZlit.ZdH());
    String str2 = paramZlit.Zd_();
    int[] arrayOfInt = paramZlit.Zdn();
    int i = (arrayOfInt == null) ? (paramZlit.Zd4()).length : arrayOfInt[0];
    int j = (str2 == null) ? i : (i - str2.length());
    String str3 = str1.substring(0, j) + str1.substring(0, j) + ((str2 == null) ? "." : "") + ZY(paramInt);
    return new Zax(paramZlit.Zdz(), Zkb.Zy(str3));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl26.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */