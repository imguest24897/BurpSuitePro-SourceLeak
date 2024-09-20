package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zghr extends Zghg {
  private final String Zl;
  
  public Zghr(Zlqb paramZlqb, String paramString1, String paramString2, Supplier<String> paramSupplier, List<Zecn> paramList) {
    super(paramZlqb, paramString1, null, paramSupplier, paramList);
    this.Zl = paramString2;
  }
  
  public String ZY() {
    StringBuilder stringBuilder = new StringBuilder();
    if (this.Zl != null)
      stringBuilder.append(this.Zl).append(' '); 
    stringBuilder.append(Zv());
    return stringBuilder.toString();
  }
  
  public String Zv() {
    return Zn();
  }
  
  public String ZF() {
    return ZY();
  }
  
  public String ZD() {
    return this.Zl;
  }
  
  public String toString() {
    return Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zghr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */