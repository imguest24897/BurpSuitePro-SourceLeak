package burp;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Zgvv {
  private final List<File> ZH = new ArrayList<>();
  
  private boolean ZM;
  
  private String ZT;
  
  private boolean Zg;
  
  private boolean Zp;
  
  private boolean ZU;
  
  private boolean ZV;
  
  private File Zi;
  
  private Runnable ZA;
  
  private boolean Zh;
  
  private boolean ZK;
  
  public Zgvv ZP(boolean paramBoolean) {
    this.ZM = paramBoolean;
    return this;
  }
  
  public Zgvv Zg(String paramString) {
    this.ZT = paramString;
    return this;
  }
  
  public Zgvv Zc(boolean paramBoolean) {
    this.Zp = paramBoolean;
    return this;
  }
  
  public Zgvv ZV(boolean paramBoolean) {
    this.ZU = paramBoolean;
    return this;
  }
  
  public Zgvv ZU(boolean paramBoolean) {
    this.ZV = paramBoolean;
    return this;
  }
  
  public Zgvv Zk(File paramFile) {
    this.Zi = paramFile;
    this.Zg = false;
    return this;
  }
  
  public Zgvv ZL(File paramFile) {
    this.Zi = paramFile;
    this.Zg = true;
    return this;
  }
  
  public Zgvv Zl(File paramFile) {
    this.ZH.add(paramFile);
    return this;
  }
  
  public Zgvv ZH(Collection<File> paramCollection) {
    this.ZH.addAll(paramCollection);
    return this;
  }
  
  public Zgvv ZF(Runnable paramRunnable) {
    this.ZA = paramRunnable;
    return this;
  }
  
  public Zgvv Zi(boolean paramBoolean) {
    this.Zh = paramBoolean;
    return this;
  }
  
  public Zgvv ZT(boolean paramBoolean) {
    this.ZK = paramBoolean;
    return this;
  }
  
  public Zrej ZZ() {
    return new Zrej(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */