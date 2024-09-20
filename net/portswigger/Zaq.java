package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zaq {
  private boolean ZU = true;
  
  private final List<String> ZS = new ArrayList<>();
  
  private final List<String> Zh = new ArrayList<>();
  
  private Integer Zg;
  
  private Integer ZK;
  
  private Integer ZO;
  
  private Zrms ZE;
  
  private String ZR = "";
  
  public Zaq ZQ(boolean paramBoolean) {
    this.ZU = paramBoolean;
    return this;
  }
  
  public Zaq ZG(Integer paramInteger) {
    this.ZK = paramInteger;
    return this;
  }
  
  public Zaq ZP(Integer paramInteger) {
    this.ZO = paramInteger;
    return this;
  }
  
  public Zaq Zz(String paramString) {
    this.ZS.add(paramString);
    return this;
  }
  
  public Zaq Zt(String paramString) {
    int i = this.Zh.indexOf(paramString);
    boolean bool = Zrmr.ZmZ();
    if (i == -1) {
      this.Zh.add(paramString);
      this.Zg = Integer.valueOf(this.Zh.size() - 1);
      if (bool) {
        this.Zg = Integer.valueOf(i);
        return this;
      } 
      return this;
    } 
    this.Zg = Integer.valueOf(i);
    return this;
  }
  
  public Zaq ZO(String paramString) {
    this.Zh.add(paramString);
    return this;
  }
  
  public Zaq ZM(Zrms paramZrms) {
    this.ZE = paramZrms;
    return this;
  }
  
  public Zaq Zp(String paramString) {
    this.ZR = paramString;
    return this;
  }
  
  public Zrmr Zg() {
    return (this.Zg == null && this.ZK == null && this.ZO == null && this.ZE == null && this.ZS.isEmpty() && this.Zh.isEmpty() && Zlz.ZC(this.ZR)) ? Zrmr.ZD(this.ZU) : new Zrmr(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zaq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */