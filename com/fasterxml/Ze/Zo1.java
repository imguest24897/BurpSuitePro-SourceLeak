package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zm.Zl;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zo1 {
  protected final List<Zv> Zq = new ArrayList<>();
  
  public Zo1() {}
  
  protected Zo1(List<Zv> paramList) {}
  
  public void ZF(Zv paramZv) {
    this.Zq.add(paramZv);
  }
  
  public Zo1 ZM(Zee paramZee) {
    ArrayList<Zv> arrayList = new ArrayList(this.Zq.size());
    Iterator<Zv> iterator = this.Zq.iterator();
    String[] arrayOfString = Z_.ZI();
    while (iterator.hasNext()) {
      Zv zv = iterator.next();
      String str = paramZee.Zt(zv.ZT());
      zv = zv.ZB(str);
      Zyo zyo = zv.ZD();
      if (zyo != null) {
        Zyo zyo1 = zyo.Zv(paramZee);
        if (zyo1 != zyo)
          zv = zv.Zt(zyo1); 
      } 
      arrayList.add(zv);
      if (arrayOfString != null)
        break; 
    } 
    return new Zo1(arrayList);
  }
  
  public Object ZY(Zg paramZg, Zyg paramZyg, Object paramObject, Zl paramZl) throws IOException {
    byte b = 0;
    String[] arrayOfString = Z_.ZI();
    int i = this.Zq.size();
    while (b < i) {
      Zv zv = this.Zq.get(b);
      Zg zg = paramZl.Zi(paramZg.ZG());
      zg.ZV();
      zv.ZP(zg, paramZyg, paramObject);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return paramObject;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zo1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */