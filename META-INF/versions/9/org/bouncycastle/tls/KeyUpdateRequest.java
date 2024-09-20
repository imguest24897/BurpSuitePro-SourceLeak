package META-INF.versions.9.org.bouncycastle.tls;

public class KeyUpdateRequest {
  public static final short update_not_requested = 0;
  
  public static final short update_requested = 1;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 0:
        return "update_not_requested";
      case 1:
        return "update_requested";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + getName(paramShort) + ")";
  }
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 0 && paramShort <= 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\KeyUpdateRequest.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */