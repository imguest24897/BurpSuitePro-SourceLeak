package org.bouncycastle.tls;

public class HeartbeatMessageType {
  public static final short heartbeat_request = 1;
  
  public static final short heartbeat_response = 2;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 1:
        return "heartbeat_request";
      case 2:
        return "heartbeat_response";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + paramShort + ")";
  }
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 1 && paramShort <= 2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\HeartbeatMessageType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */