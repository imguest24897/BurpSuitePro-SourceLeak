package META-INF.versions.9.org.bouncycastle.tls;

public class PskKeyExchangeMode {
  public static final short psk_ke = 0;
  
  public static final short psk_dhe_ke = 1;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 0:
        return "psk_ke";
      case 1:
        return "psk_dhe_ke";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + getName(paramShort) + ")";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\PskKeyExchangeMode.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */