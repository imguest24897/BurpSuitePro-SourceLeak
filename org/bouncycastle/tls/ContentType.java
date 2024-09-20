package org.bouncycastle.tls;

public class ContentType {
  public static final short change_cipher_spec = 20;
  
  public static final short alert = 21;
  
  public static final short handshake = 22;
  
  public static final short application_data = 23;
  
  public static final short heartbeat = 24;
  
  public static final short tls12_cid = 25;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 21:
        return "alert";
      case 23:
        return "application_data";
      case 20:
        return "change_cipher_spec";
      case 22:
        return "handshake";
      case 24:
        return "heartbeat";
      case 25:
        return "tls12_cid";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + paramShort + ")";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\ContentType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */