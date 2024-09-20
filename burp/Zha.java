package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zha extends Zni implements Zbg {
  @Zzvo(1)
  private final Zgqa Zv;
  
  @Zzvo(2)
  private final Zefg<Zl_> Ze;
  
  Zha(Zgqa paramZgqa, Zefg<Zl_> paramZefg) {
    this.Zv = paramZgqa;
    this.Ze = paramZefg;
  }
  
  public void ZD(Zl_ paramZl_) {
    this.Ze.add(paramZl_);
  }
  
  public List<Zl_> Zna() {
    return Collections.unmodifiableList(new ArrayList<>(this.Ze));
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
    return this.Zv;
  }
  
  public int hashCode() {
    return this.Zv.hashCode();
  }
  
  public Zeu4<? extends Zbg> ZF() {
    return Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zha.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */