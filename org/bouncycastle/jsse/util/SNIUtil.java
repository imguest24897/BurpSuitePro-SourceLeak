package org.bouncycastle.jsse.util;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.util.IPAddress;

public class SNIUtil {
  private static final Logger LOG = Logger.getLogger(SNIUtil.class.getName());
  
  public static BCSNIHostName getBCSNIHostName(URL paramURL) {
    if (null != paramURL) {
      String str = paramURL.getHost();
      if (null != str && str.indexOf('.') > 0 && !IPAddress.isValid(str))
        try {
          return new BCSNIHostName(str);
        } catch (Exception exception) {
          LOG.log(Level.FINER, "Failed to parse BCSNIHostName from URL: " + paramURL, exception);
        }  
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jss\\util\SNIUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */