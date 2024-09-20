package burp;

import java.util.Objects;

public class Zbf8 {
  public final Zr5_ Zn;
  
  private boolean Zh;
  
  public Zbf8(Zr5_ paramZr5_) {
    this(paramZr5_, false);
  }
  
  public Zbf8(Zr5_ paramZr5_, boolean paramBoolean) {
    this.Zh = paramBoolean;
    this.Zn = paramZr5_;
  }
  
  public boolean Zb() {
    return this.Zh;
  }
  
  public void Zh(boolean paramBoolean) {
    this.Zh = paramBoolean;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zbf8 zbf8 = (Zbf8)paramObject;
    return (this.Zh == zbf8.Zh && Objects.equals(this.Zn, zbf8.Zn));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zn, Boolean.valueOf(this.Zh) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */