package net.portswigger.browser;

import burp.Zlli;
import net.portswigger.Zsm;

public interface Zc1 extends Zlli<Zck> {
  Zt8 Zj();
  
  Zek ZH();
  
  Zeg ZE(int paramInt, Zcl paramZcl);
  
  void Zl() throws Ztk;
  
  @Deprecated
  @Zsm("In single browser a client of a context should not be able to globally shutdown the whole browser; it violates context isolation")
  Zeu Zz();
  
  boolean ZJ();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zc1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */