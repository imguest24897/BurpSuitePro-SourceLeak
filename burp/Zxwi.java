package burp;

import java.net.InetAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class Zxwi {
  private Set<String> ZG = Collections.emptySet();
  
  public void ZM(Collection<InetAddress> paramCollection) {
    this.ZG = (Set<String>)paramCollection.stream().map(InetAddress::getHostAddress).collect(Collectors.toSet());
  }
  
  public boolean Zf(String paramString) {
    return this.ZG.contains(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxwi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */