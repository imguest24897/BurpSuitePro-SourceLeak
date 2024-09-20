package burp;

import java.util.List;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb2y {
  private final Integer Zw;
  
  private final Ztwh ZC;
  
  private Zb2y(Integer paramInteger, Ztwh paramZtwh) {
    Zuh.Zb((paramInteger == null || paramZtwh == null), Zqf.Zr);
    this.Zw = paramInteger;
    this.ZC = paramZtwh;
  }
  
  public static Zb2y ZX() {
    return new Zb2y(Integer.valueOf(0), null);
  }
  
  public static Zb2y Zs(int paramInt) {
    return new Zb2y(Integer.valueOf(paramInt), null);
  }
  
  public static Zb2y ZP(String paramString, boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2, boolean paramBoolean3, boolean paramBoolean4, int paramInt3, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, List<Integer> paramList) {
    return new Zb2y(null, (new Zlk6()).Zs(paramString).Zq(paramBoolean1).ZA(paramInt1).ZI(paramBoolean2).Zj(paramInt2).ZU(paramBoolean3).ZM(paramBoolean4).Zr(paramInt3).Zw(paramBoolean5).ZA(paramBoolean6).Zt(paramBoolean7).Zs(paramBoolean8).ZN(paramList).Zi());
  }
  
  public Optional<Integer> ZC() {
    return Optional.ofNullable(this.Zw);
  }
  
  public Optional<Ztwh> ZA() {
    return Optional.ofNullable(this.ZC);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */