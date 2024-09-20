package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Zz2i {
  private final String Ze;
  
  private final List<Zr_j> Zz;
  
  public Zz2i(String paramString, List<Zr_j> paramList) {
    this.Ze = Objects.<String>requireNonNull(paramString);
    this.Zz = new ArrayList<>(paramList);
  }
  
  public String Zn() {
    return this.Ze;
  }
  
  public List<Zr_j> Z_() {
    return new ArrayList<>(this.Zz);
  }
  
  public Optional<Zr_j> ZS() {
    return this.Zz.isEmpty() ? Optional.<Zr_j>empty() : Optional.<Zr_j>of(this.Zz.get(this.Zz.size() - 1));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */