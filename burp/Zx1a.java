package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zx1a extends Zxsr implements Zbg {
  Zx1a(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  private Zefg<Zl_> Zpl() {
    return this.Za.<Zefg<Zl_>>ZJ(this, Zkzp.ZX);
  }
  
  public void ZD(Zl_ paramZl_) {
    Zpl().add(paramZl_);
  }
  
  public List<Zl_> Zna() {
    return Collections.unmodifiableList(new ArrayList<>(Zpl()));
  }
  
  public boolean equals(Object paramObject) {
    Zbqc[] arrayOfZbqc = Zmc0.ZM();
    if (ZF(paramObject))
      return true; 
    if (paramObject instanceof Zbg) {
      Zbg zbg = (Zbg)paramObject;
      if (arrayOfZbqc != null)
        return Zn4().equals(zbg.Zn4()); 
    } 
    return false;
  }
  
  public Zgqa Zn4() {
    return this.Za.<Zgqa>ZJ(this, Zkzp.ZO);
  }
  
  public int hashCode() {
    return Zn4().hashCode();
  }
  
  public Zeu4<? extends Zbg> ZF() {
    return Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx1a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */