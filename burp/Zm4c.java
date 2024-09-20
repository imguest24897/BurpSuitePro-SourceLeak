package burp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zsy;

public class Zm4c<T extends Zm4c<T>> {
  protected final Zbnt Zx;
  
  protected final Zz3r ZV;
  
  protected final List<Zxj3> ZW;
  
  protected final List<Zthd> ZX;
  
  protected boolean ZU = false;
  
  protected boolean ZK;
  
  public Zm4c(Zbnt paramZbnt) {
    int i = Zz3o.Zj();
    this.ZK = false;
    this.Zx = paramZbnt;
    this.ZV = new Zz3r(paramZbnt);
    this.ZW = new LinkedList<>(Arrays.asList(new Zxj3[] { new Zlqu(paramZbnt), new Zlt6(paramZbnt), new Zebb() }));
    this.ZX = new LinkedList<>(Arrays.asList(new Zthd[] { new Ztxp(paramZbnt), new Zmto(paramZbnt) }));
    if (i != 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public T ZL(boolean paramBoolean) {
    if (paramBoolean)
      this.ZW.add(0, new Zlq1(this.Zx)); 
    return (T)this;
  }
  
  public T ZU(boolean paramBoolean, Zsy paramZsy) {
    return ZP(paramBoolean, Zmv7.ZN, paramZsy);
  }
  
  public T ZP(boolean paramBoolean, Zmv7 paramZmv7, Zsy paramZsy) {
    if (paramBoolean)
      this.ZX.add(new Zlje(this.Zx, paramZmv7, paramZsy.Z_(4), new Zet8(paramZmv7))); 
    return (T)this;
  }
  
  public T Zr(boolean paramBoolean) {
    if (paramBoolean)
      this.ZX.add(new Zzyv()); 
    return (T)this;
  }
  
  public T Zn() {
    this.ZU = true;
    return (T)this;
  }
  
  public T Zn(boolean paramBoolean) {
    this.ZK = paramBoolean;
    return (T)this;
  }
  
  public Zlio Zw() {
    return new Zlio(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */