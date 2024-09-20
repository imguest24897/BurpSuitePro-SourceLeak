package burp;

import java.util.Optional;
import net.portswigger.Zsy;

public class Zsw4 {
  private final Zsy ZT;
  
  public Zsw4(Zsy paramZsy) {
    this.ZT = paramZsy;
  }
  
  public Optional<Integer> Za(Zstu paramZstu) {
    int i = Zz();
    if (Zlt_.Zr(paramZstu, Integer.toString(i).getBytes()) >= 0) {
      i = Zz();
      if (Zlt_.Zr(paramZstu, Integer.toString(i).getBytes()) >= 0)
        return Optional.empty(); 
    } 
    return Optional.of(Integer.valueOf(i));
  }
  
  private int Zz() {
    return this.ZT.ZP().ZO(10002).Zr(65536).Zc();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsw4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */