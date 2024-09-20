package net.portswigger.browser;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Ze0 {
  private Zt5 ZT = Zt5.Zv();
  
  private String ZD = Zi.ZC();
  
  private int ZL = -1;
  
  private boolean Zd = false;
  
  private boolean ZH = true;
  
  private boolean ZI = false;
  
  private Zdy ZK = Zdy.SANDBOX_IF_POSSIBLE;
  
  private final Collection<String> ZG = new LinkedHashSet<>();
  
  public Ze0 ZB(Zt5 paramZt5) {
    this.ZT = Objects.<Zt5>requireNonNull(paramZt5);
    return this;
  }
  
  public Ze0 ZV(String paramString) {
    this.ZD = Objects.<String>requireNonNull(paramString);
    return this;
  }
  
  public Ze0 Zj(int paramInt) {
    this.ZL = paramInt;
    return this;
  }
  
  public Ze0 ZZ(boolean paramBoolean) {
    this.Zd = paramBoolean;
    return this;
  }
  
  public Ze0 Zx() {
    this.Zd = true;
    return this;
  }
  
  public Ze0 Zy(boolean paramBoolean) {
    this.ZH = paramBoolean;
    return this;
  }
  
  public Ze0 ZB() {
    this.ZH = true;
    return this;
  }
  
  public Ze0 ZI(boolean paramBoolean) {
    this.ZI = paramBoolean;
    return this;
  }
  
  public Ze0 Zg() {
    this.ZI = true;
    return this;
  }
  
  public Ze0 ZY(Zdy paramZdy) {
    this.ZK = Objects.<Zdy>requireNonNull(paramZdy);
    return this;
  }
  
  public Ze0 Zl(String... paramVarArgs) {
    this.ZG.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public Zc3 ZK() {
    return new Zc3(this.ZT, this.ZD, this.ZL, this.Zd, this.ZH, this.ZI, this.ZK, this.ZG);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Ze0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */