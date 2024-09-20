package com.fasterxml.Zm;

import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zq.Zn;
import com.fasterxml.Zq6;

public class Zs extends Ze {
  protected final Ze ZG;
  
  protected final Zm5 Za;
  
  protected String ZM;
  
  protected Object Zs;
  
  protected Zs(Ze paramZe, Zq6 paramZq6) {
    super(paramZe);
    this.ZG = paramZe.Zf();
    this.ZM = paramZe.Z_();
    int i = Zx.Zo();
    this.Zs = paramZe.Zb();
    if (paramZe instanceof Zn) {
      Zn zn = (Zn)paramZe;
      this.Za = zn.Zj(paramZq6);
      if (i == 0) {
        this.Za = Zm5.Zi;
        return;
      } 
      return;
    } 
    this.Za = Zm5.Zi;
  }
  
  protected Zs(Ze paramZe, Zm5 paramZm5) {
    super(paramZe);
    this.ZG = paramZe.Zf();
    this.ZM = paramZe.Z_();
    this.Zs = paramZe.Zb();
    this.Za = paramZm5;
  }
  
  protected Zs() {
    super(0, -1);
    this.ZG = null;
    this.Za = Zm5.Zi;
  }
  
  protected Zs(Zs paramZs, int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2);
    this.ZG = paramZs;
    this.Za = paramZs.Za;
  }
  
  public Object Zb() {
    return this.Zs;
  }
  
  public void Z_(Object paramObject) {
    this.Zs = paramObject;
  }
  
  public static Zs ZV(Ze paramZe) {
    return (paramZe == null) ? new Zs() : new Zs(paramZe, Zq6.Zf());
  }
  
  public Zs Zt() {
    this.Zb++;
    return new Zs(this, 1, -1);
  }
  
  public Zs ZJ() {
    this.Zb++;
    return new Zs(this, 2, -1);
  }
  
  public Zs ZY() {
    return (this.ZG instanceof Zs) ? (Zs)this.ZG : ((this.ZG == null) ? new Zs() : new Zs(this.ZG, this.Za));
  }
  
  public String Z_() {
    return this.ZM;
  }
  
  public boolean ZV() {
    return (this.ZM != null);
  }
  
  public Ze Zf() {
    return this.ZG;
  }
  
  public void ZM(String paramString) throws Zmt {
    this.ZM = paramString;
  }
  
  public void Za() {
    this.Zb++;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */