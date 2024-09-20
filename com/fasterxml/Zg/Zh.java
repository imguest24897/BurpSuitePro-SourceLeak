package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zs;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zh extends Zv<Zh> implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final List<Zb> Zr = new ArrayList<>();
  
  public Zh(Zfc paramZfc) {
    super(paramZfc);
  }
  
  protected Zb Zu(Zs paramZs) {
    return ZC(paramZs.Zs());
  }
  
  public boolean Zq(Zyi paramZyi) {
    return this.Zr.isEmpty();
  }
  
  public Zfr ZF() {
    return Zfr.ARRAY;
  }
  
  public boolean ZJ() {
    return true;
  }
  
  public Zl ZV() {
    return Zl.START_ARRAY;
  }
  
  public int Zv() {
    return this.Zr.size();
  }
  
  public Iterator<Zb> Zn() {
    return this.Zr.iterator();
  }
  
  public Zb ZC(int paramInt) {
    return (paramInt >= 0 && paramInt < this.Zr.size()) ? this.Zr.get(paramInt) : null;
  }
  
  public Zb ZL(String paramString) {
    return null;
  }
  
  public void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    List<Zb> list = this.Zr;
    int i = list.size();
    String str = Zf.ZE();
    paramZf.Zf(this, i);
    byte b = 0;
    while (b < i) {
      Zb zb = list.get(b);
      zb.Zh(paramZf, paramZyi);
      b++;
      if (str == null)
        break; 
    } 
    paramZf.ZI();
  }
  
  public void Zy(Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(this, Zl.START_ARRAY));
    String str = Zf.ZE();
    for (Zb zb : this.Zr) {
      ((Zf)zb).Zh(paramZf, paramZyi);
      if (str == null)
        break; 
    } 
    paramZa.ZP(paramZf, zn);
  }
  
  public List<Zb> ZI(String paramString, List<Zb> paramList) {
    Iterator<Zb> iterator = this.Zr.iterator();
    String str = Zf.ZE();
    while (iterator.hasNext()) {
      Zb zb = iterator.next();
      paramList = zb.ZI(paramString, paramList);
      if (str == null)
        break; 
    } 
    return paramList;
  }
  
  public List<Zb> ZM(String paramString, List<Zb> paramList) {
    Iterator<Zb> iterator = this.Zr.iterator();
    String str = Zf.ZE();
    while (iterator.hasNext()) {
      Zb zb = iterator.next();
      paramList = zb.ZM(paramString, paramList);
      if (str == null)
        break; 
    } 
    return paramList;
  }
  
  public Zh ZV(Zb paramZb) {
    if (paramZb == null)
      paramZb = Zc(); 
    Z_(paramZb);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject instanceof Zh) ? this.Zr.equals(((Zh)paramObject).Zr) : false));
  }
  
  public int hashCode() {
    return this.Zr.hashCode();
  }
  
  protected Zh Z_(Zb paramZb) {
    this.Zr.add(paramZb);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */