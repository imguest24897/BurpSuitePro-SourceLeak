package burp;

import java.util.List;
import java.util.Objects;

class Zmct<T> {
  private final int ZW;
  
  private final List<T> ZX;
  
  private int ZV = 0;
  
  private int ZL = 0;
  
  private Zmct(int paramInt, List<T> paramList) {
    this.ZW = paramInt;
    this.ZX = paramList;
  }
  
  public boolean Zt(T paramT) {
    this.ZV++;
    if (this.ZL >= this.ZX.size())
      return false; 
    T t = this.ZX.get(this.ZL);
    if (Objects.equals(paramT, t)) {
      this.ZL++;
      return true;
    } 
    return false;
  }
  
  private boolean Zz() {
    return (this.ZV >= this.ZW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmct.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */