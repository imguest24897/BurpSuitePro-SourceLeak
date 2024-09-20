package META-INF.versions.9.org.bouncycastle.tls;

public class AlertLevel {
  public static final short warning = 1;
  
  public static final short fatal = 2;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 1:
        return "warning";
      case 2:
        return "fatal";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + getName(paramShort) + ")";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\AlertLevel.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */