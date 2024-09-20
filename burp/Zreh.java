package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zreh {
  private static final Zrak Zk = new Zrak(null, null, null, null, Collections.emptyList());
  
  private final Map<String, Zrak> Zs = new HashMap<>();
  
  public void ZH(String paramString, Zrak paramZrak) {
    this.Zs.put(paramString, paramZrak);
  }
  
  public List<Zrak> ZM() {
    return this.Zs.isEmpty() ? Collections.<Zrak>singletonList(Zk) : new ArrayList<>(this.Zs.values());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zreh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */