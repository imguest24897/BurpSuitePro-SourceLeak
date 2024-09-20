package burp;

import net.portswigger.Zm2;

public class Zg21 implements Zl_d {
  private final Zkh ZL;
  
  private final Ztg4 ZS;
  
  private final String ZY;
  
  private final Zl04 ZU;
  
  private Zk8l ZO;
  
  private Zgbj ZG;
  
  private volatile boolean Zd;
  
  private boolean ZI;
  
  private boolean Zx;
  
  public Zg21(Zkh paramZkh, Ztg4 paramZtg4, String paramString, Zl04 paramZl04) {
    this.ZL = paramZkh;
    this.ZS = paramZtg4;
    this.ZY = paramString;
    this.ZU = paramZl04;
  }
  
  public void ZH(Zk8l paramZk8l) {
    this.ZO = paramZk8l;
  }
  
  public void ZO(Zgbj paramZgbj) {
    this.ZG = paramZgbj;
  }
  
  public void Zq(Zkit paramZkit) {
    int i = Zeew.ZL();
    try {
      if (this.Zd) {
        try {
          this.ZL.ZP(paramZkit, this.ZO, this.ZG, this.ZS, this.ZY, this.ZU);
          if (i != 0) {
            this.Zx = true;
            return;
          } 
        } catch (Zkfw zkfw) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.Zx = true;
  }
  
  public boolean ZK(Zkit paramZkit) {
    try {
      if (this.Zx) {
        Zm2.Zo(Zze0.SUITE_PROJECTS_PROJECT_FILE_INVALID);
        this.ZL.Zo(paramZkit, this.ZO, this.ZG, this.ZS, this.ZY);
        return true;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return false;
  }
  
  public void Zw() {
    this.ZI = true;
    this.Zd = false;
  }
  
  public void Zo() {
    this.Zd = false;
  }
  
  public void ZN(boolean paramBoolean) {
    try {
      if (!this.ZI) {
        try {
          if (this.Zx)
            try {
              this.Zx = false;
              if (paramBoolean)
                throw new Zkfw(); 
            } catch (Zkfw zkfw) {
              throw a(null);
            }  
        } catch (Zkfw zkfw) {
          throw a(null);
        } 
        this.Zd = true;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public boolean Zx() {
    return this.Zd;
  }
  
  private static Zkfw a(Zkfw paramZkfw) {
    return paramZkfw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg21.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */