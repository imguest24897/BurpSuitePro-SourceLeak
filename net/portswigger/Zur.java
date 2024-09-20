package net.portswigger;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;

public class Zur {
  private final List<Zms> Zq;
  
  private final List<List<Object>> Zn;
  
  private String ZS;
  
  private boolean ZH;
  
  private int Zh;
  
  private int Zm;
  
  private Boolean ZG;
  
  private String ZQ;
  
  public Zur() {
    boolean bool = Zrmr.ZmZ();
    this.Zq = new ArrayList<>();
    this.Zn = new ArrayList<>();
    this.ZH = true;
    this.Zh = 0;
    this.Zm = Integer.MAX_VALUE;
    this.ZG = null;
    this.ZQ = "";
    if (bool)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zur Zx(Zms paramZms) {
    this.Zq.add(paramZms);
    return this;
  }
  
  public Zur Zt(String paramString) {
    this.ZS = paramString;
    return this;
  }
  
  public Zur ZS(Boolean paramBoolean) {
    this.ZG = paramBoolean;
    return this;
  }
  
  public Zur ZQ(boolean paramBoolean) {
    this.ZH = paramBoolean;
    return this;
  }
  
  public Zur ZH(List<Object> paramList) {
    this.Zn.add(paramList);
    return this;
  }
  
  public Zur ZX(int paramInt) {
    this.Zh = paramInt;
    return this;
  }
  
  public Zur Zs(int paramInt) {
    this.Zm = paramInt;
    return this;
  }
  
  public Zur Zk(String paramString) {
    this.ZQ = paramString;
    return this;
  }
  
  public Zoj ZS() {
    return new Zoj(this.Zq, this.ZS, this.ZH, this.Zh, this.Zm, this.ZG, this.Zn, this.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zur.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */