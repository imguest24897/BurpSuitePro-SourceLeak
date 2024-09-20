package com.fasterxml.Zi;

import burp.Zbqc;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmt;

public abstract class Zg extends Zmt {
  private static final long serialVersionUID = 2L;
  
  protected transient Zf ZW;
  
  protected Zg(String paramString, Zf paramZf) {
    super(paramString, (Zm5)null);
    String[] arrayOfString = Za.Ze();
    this.ZW = paramZf;
    if (Zbqc.Zwu() == null)
      Za.Zt(new String[5]); 
  }
  
  public Zf Za() {
    return this.ZW;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zi\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */