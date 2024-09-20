package burp;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Zr1o {
  private int ZK;
  
  private String Zt;
  
  private Path Zk;
  
  private String ZI;
  
  private List<Exception> ZR = Collections.emptyList();
  
  private Zsvm Zg;
  
  private boolean ZT;
  
  public Zr1o() {}
  
  private Zr1o(Zryx paramZryx) {
    this.ZK = paramZryx.Zj;
    this.Zt = paramZryx.ZL;
    this.Zk = paramZryx.Zn;
    this.ZI = paramZryx.Zt;
    this.ZR = paramZryx.ZN;
    this.Zg = paramZryx.Zb;
    this.ZT = paramZryx.ZC;
  }
  
  public Zr1o ZW(int paramInt) {
    this.ZK = paramInt;
    return this;
  }
  
  public Zr1o Zf(String paramString) {
    this.Zt = paramString;
    return this;
  }
  
  public Zr1o Zl(Path paramPath) {
    this.Zk = paramPath;
    return this;
  }
  
  public Zr1o Za(String paramString) {
    this.ZI = paramString;
    return this;
  }
  
  public Zr1o ZV(List<Exception> paramList) {
    this.ZR = paramList;
    return this;
  }
  
  public Zr1o ZP(Zsvm paramZsvm) {
    this.Zg = paramZsvm;
    return this;
  }
  
  public Zr1o Zd(boolean paramBoolean) {
    this.ZT = paramBoolean;
    return this;
  }
  
  public Zryx Zr() {
    return new Zryx(this.ZK, this.Zt, this.Zk, this.ZI, this.ZR, this.Zg, this.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */