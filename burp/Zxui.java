package burp;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public abstract class Zxui extends Zxsr implements Zgd4 {
  private static Zbqc[] ZL;
  
  protected Zxui(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Optional<Zski> ZHk() {
    return Optional.empty();
  }
  
  public List<Zl_> ZHp() {
    return Collections.emptyList();
  }
  
  public List<Zgyy> ZHR() {
    return Collections.emptyList();
  }
  
  public List<Zrp0> ZHV() {
    return Collections.emptyList();
  }
  
  public void Za(List<Zgyy> paramList) {}
  
  public static void Zh(Zbqc[] paramArrayOfZbqc) {
    ZL = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zj8() {
    return ZL;
  }
  
  static {
    if (Zj8() == null)
      Zh(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxui.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */