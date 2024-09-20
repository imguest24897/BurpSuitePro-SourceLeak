package net.portswigger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Zcw {
  private final Zl9 Zp;
  
  private final int Zj;
  
  private final Map<String, String> ZF;
  
  private final List<String> ZP;
  
  public Zcw(Zl9 paramZl9, int paramInt) {
    this.Zp = paramZl9;
    this.Zj = paramInt;
    this.ZF = new TreeMap<>();
    this.ZP = new ArrayList<>();
  }
  
  public Zcw ZS(Map<String, String> paramMap) {
    this.ZF.putAll(paramMap);
    return this;
  }
  
  public Zcw ZW(Zlv... paramVarArgs) {
    Arrays.<Zlv>stream(paramVarArgs).forEach(this::lambda$withHeaders$0);
    return this;
  }
  
  public Zcw Zh(String paramString1, String paramString2) {
    this.ZF.put(paramString1, paramString2);
    return this;
  }
  
  public Zcw ZV(String paramString, Number paramNumber) {
    this.ZF.put(paramString, String.valueOf(paramNumber));
    return this;
  }
  
  public Zcw Zn(List<String> paramList) {
    this.ZP.addAll(paramList);
    return this;
  }
  
  public Zcw ZN(String paramString) {
    this.ZP.add(paramString);
    return this;
  }
  
  public Zcw Zs(Zgl paramZgl) {
    paramZgl.ZQ(this);
    return this;
  }
  
  public Zn8 ZV() {
    return new Zm_(this.Zp, this.Zj, this.ZF, this.ZP);
  }
  
  private void lambda$withHeaders$0(Zlv paramZlv) {
    this.ZF.put(paramZlv.ZS(), paramZlv.Zn());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zcw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */