package META-INF.versions.9.org.bouncycastle.tls;

public class HeartbeatMode {
  public static final short peer_allowed_to_send = 1;
  
  public static final short peer_not_allowed_to_send = 2;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 1:
        return "peer_allowed_to_send";
      case 2:
        return "peer_not_allowed_to_send";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + getName(paramShort) + ")";
  }
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 1 && paramShort <= 2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\HeartbeatMode.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */