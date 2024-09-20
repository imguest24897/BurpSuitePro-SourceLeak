package burp;

import java.util.ArrayList;
import java.util.Collection;

public interface Zzxz extends Zgpi<Zzxz> {
  public static final Zkl5 Zn = new Zkl5();
  
  Ztrm Zqe();
  
  Collection<Ztrm> ZqX();
  
  default Collection<Ztrm> Zqg() {
    ArrayList<Ztrm> arrayList = new ArrayList<>(ZqX());
    arrayList.add(Zqe());
    return arrayList;
  }
  
  default Zeu4<? extends Zzxz> ZF() {
    return Zn;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzxz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */