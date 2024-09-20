package burp;

import java.util.Date;

public interface ICookie {
  String getDomain();
  
  String getPath();
  
  Date getExpiration();
  
  String getName();
  
  String getValue();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\ICookie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */