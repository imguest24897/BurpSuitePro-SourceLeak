package burp;

import java.util.Objects;

class Zb4k implements Zmt5<Object> {
  private final Zmt5<Object> Zb;
  
  private volatile boolean Zl;
  
  Zb4k(Zmt5<?> paramZmt5) {
    this.Zb = (Zmt5)paramZmt5;
    this.Zl = true;
  }
  
  Zmt5<Object> ZY() {
    return this.Zb;
  }
  
  public Zehw Zc() {
    return this.Zb.Zc();
  }
  
  public boolean Ze() {
    return this.Zb.Ze();
  }
  
  public Class<Object> ZZ() {
    return this.Zb.ZZ();
  }
  
  public void Zy(Object paramObject) {
    this.Zb.Zy(paramObject);
  }
  
  boolean Z_() {
    return this.Zl;
  }
  
  void ZM() {
    this.Zl = false;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zb4k zb4k = (Zb4k)paramObject;
    return Objects.equals(this.Zb, zb4k.Zb);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zb });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */