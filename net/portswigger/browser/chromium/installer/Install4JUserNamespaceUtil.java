package net.portswigger.browser.chromium.installer;

import burp.Zbqc;
import net.portswigger.devtools.client.impl.connection.local.process.chrome.Zm;

public class Install4JUserNamespaceUtil {
  private static boolean ZH;
  
  public static Install4JUserNamespaceUtil$Install4JUserNsCloneStatus isUserNamespaceCloneSupported() {
    boolean bool = ZM();
    try {
      switch (Install4JUserNamespaceUtil$1.$SwitchMap$net$portswigger$devtools$client$impl$connection$local$process$chrome$environment$sandbox$UserNsCloneStatus[Zm.ZL().ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (bool)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Install4JUserNamespaceUtil$Install4JUserNsCloneStatus.INDETERMINATE;
  }
  
  public static void Zz(boolean paramBoolean) {
    ZH = paramBoolean;
  }
  
  public static boolean ZM() {
    return ZH;
  }
  
  public static boolean ZR() {
    boolean bool = ZM();
    try {
      if (!bool)
        return true; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    if (!ZR())
      Zz(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\chromium\installer\Install4JUserNamespaceUtil.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */