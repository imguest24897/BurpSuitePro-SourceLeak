package org.yaml;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TimeZone;

public class Zl7 extends Zly {
  protected Map<Class<? extends Object>, Zty> ZV = Collections.emptyMap();
  
  public Zl7(Z_k paramZ_k) {
    super(paramZ_k);
    this.Zs.put(null, new Z_p(this));
  }
  
  public void Za(Zt7 paramZt7) {
    super.Za(paramZt7);
    int i = Zlj.ZG();
    Collection<Zty> collection = this.ZV.values();
    for (Zty zty : collection) {
      zty.Zt(paramZt7);
      if (i == 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zl7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */