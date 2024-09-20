package org.openapi4j;

import java.util.HashSet;
import java.util.Set;

public class Zpg<O extends Zpq> {
  private final Set<Integer> Zm = new HashSet<>();
  
  public <V> void ZZ(O paramO, V paramV, Zpm<O, V> paramZpm, Zpu paramZpu) {
    if (!this.Zm.add(Integer.valueOf(paramV.hashCode())))
      return; 
    paramZpm.Zn(this, paramO, paramV, paramZpu);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */