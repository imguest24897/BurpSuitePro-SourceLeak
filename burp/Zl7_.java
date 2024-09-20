package burp;

import java.util.Arrays;
import java.util.List;

public class Zl7_ {
  private Zr9_ Zw;
  
  private List<Ztx4> ZC;
  
  private Zkol ZE;
  
  public Zl7_ Ze(Zr9_ paramZr9_) {
    this.Zw = paramZr9_;
    return this;
  }
  
  public Zl7_ ZW(Ztx4... paramVarArgs) {
    this.ZC = Arrays.asList(paramVarArgs);
    return this;
  }
  
  public Zl7_ ZS(Zkol paramZkol) {
    this.ZE = paramZkol;
    return this;
  }
  
  public Zl30 ZX() {
    try {
      if (this.Zw != null)
        try {
          if (this.ZC != null)
            try {
              if (this.ZE != null)
                return new Zl30(this.Zw, this.ZC, this.ZE); 
              throw new IllegalStateException();
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */