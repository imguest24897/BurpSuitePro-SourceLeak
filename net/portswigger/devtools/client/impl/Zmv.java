package net.portswigger.devtools.client.impl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Zmv {
  private final LocalDateTime Zv;
  
  private final List<Zv> ZX;
  
  public Zmv(List<Zv> paramList) {
    this.ZX = new ArrayList<>(paramList);
    this.Zv = LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS);
  }
  
  public LocalDateTime Zt() {
    return this.Zv;
  }
  
  public List<Zv> Zs() {
    return this.ZX;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */