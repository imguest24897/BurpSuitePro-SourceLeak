package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zghy extends Zghg {
  private final String Za;
  
  public Zghy(Zlqb paramZlqb, String paramString1, String paramString2, Supplier<String> paramSupplier, List<Zecn> paramList) {
    super(paramZlqb, paramString1, null, paramSupplier, paramList);
    this.Za = paramString2;
  }
  
  public String Zq() {
    StringBuilder stringBuilder = new StringBuilder();
    if (this.Za != null)
      stringBuilder.append(this.Za).append(' '); 
    stringBuilder.append(ZP());
    return stringBuilder.toString();
  }
  
  public String ZP() {
    return Zn();
  }
  
  public String ZF() {
    return Zq();
  }
  
  public String Zv() {
    return this.Za;
  }
  
  public String toString() {
    return ZP();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zghy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */