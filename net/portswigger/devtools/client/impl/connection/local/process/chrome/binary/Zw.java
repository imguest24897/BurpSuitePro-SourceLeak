package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.util.Collection;
import java.util.Collections;

public class Zw {
  final Collection<String> ZR;
  
  final String ZU;
  
  Zw(Collection<String> paramCollection) {
    this.ZR = paramCollection;
    this.ZU = "";
  }
  
  Zw(String paramString) {
    this.ZU = paramString;
    this.ZR = Collections.emptyList();
  }
  
  public boolean ZW() {
    return !this.ZU.isEmpty();
  }
  
  boolean Zg() {
    return !this.ZR.isEmpty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\Zw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */