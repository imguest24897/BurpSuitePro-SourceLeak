package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zor.Zyt;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Za;
import java.io.IOException;

public class Zyp extends Zb {
  private static final long serialVersionUID = 1L;
  
  private static final Zo Zc = (Zo)new Zyt();
  
  protected final Za Zn;
  
  protected final Zo ZY;
  
  protected Object Zk;
  
  protected Object Zr;
  
  protected Zyd<Object> ZV;
  
  protected Zyd<Object> ZA;
  
  public Zyp(Za paramZa, Zo paramZo) {
    super((paramZo == null) ? Zyb.Zf : paramZo.ZO());
    this.Zn = paramZa;
    this.ZY = (paramZo == null) ? Zc : paramZo;
  }
  
  public void ZF(Object paramObject1, Object paramObject2, Zyd<Object> paramZyd1, Zyd<Object> paramZyd2) {
    this.Zk = paramObject1;
    this.Zr = paramObject2;
    this.ZV = paramZyd1;
    this.ZA = paramZyd2;
  }
  
  public String ZT() {
    return (this.Zk instanceof String) ? (String)this.Zk : String.valueOf(this.Zk);
  }
  
  public Zr ZS() {
    return new Zr(ZT());
  }
  
  public void Zy(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    this.ZV.serialize(this.Zk, paramZf, paramZyi);
    String str = Zz0.ZG();
    try {
      if (this.Zn == null) {
        try {
          this.ZA.serialize(this.Zr, paramZf, paramZyi);
          if (str != null) {
            this.ZA.Zo(this.Zr, paramZf, paramZyi, this.Zn);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZA.Zo(this.Zr, paramZf, paramZyi, this.Zn);
  }
  
  public void ZQ(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    try {
      if (!paramZf.Zu())
        paramZf.Zd(ZT()); 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public void ZD(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    String str = Zz0.ZG();
    try {
      if (this.Zn == null) {
        try {
          this.ZA.serialize(this.Zr, paramZf, paramZyi);
          if (str != null) {
            this.ZA.Zo(this.Zr, paramZf, paramZyi, this.Zn);
            return;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    this.ZA.Zo(this.Zr, paramZf, paramZyi, this.Zn);
  }
  
  public void ZM(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    paramZf.ZT();
  }
  
  public Zk Zp() {
    return this.ZY.Zp();
  }
  
  public Zr Zb() {
    return this.ZY.Zb();
  }
  
  public Ziz ZQ() {
    return this.ZY.ZQ();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */