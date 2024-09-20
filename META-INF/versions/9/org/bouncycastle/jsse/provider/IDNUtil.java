package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.IDN;

public class IDNUtil {
  public static final int ALLOW_UNASSIGNED = 1;
  
  public static final int USE_STD3_ASCII_RULES = 2;
  
  public static String toASCII(String paramString, int paramInt) {
    return IDN.toASCII(paramString, paramInt);
  }
  
  public static String toUnicode(String paramString, int paramInt) {
    return IDN.toUnicode(paramString, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\IDNUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */