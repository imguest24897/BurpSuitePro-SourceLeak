package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zldj implements Iterable<Zru2>, Zs40 {
  private final List<Zru2> ZL = new ArrayList<>();
  
  int Zi;
  
  private static Zbqc[] ZA;
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Zru2> iterator = this.ZL.iterator();
    Zbqc[] arrayOfZbqc = ZL();
    while (iterator.hasNext()) {
      Zru2 zru2 = iterator.next();
      stringBuilder.append(zru2.ZI);
      if (arrayOfZbqc == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public byte[] Zy() {
    if (this.Zi >= this.ZL.size()) {
      Zuh.Zv(false, Zqf.Zr, this.Zi);
      return Zkb.Zy("");
    } 
    return Zkb.Zy(((Zru2)this.ZL.get(this.Zi)).ZI);
  }
  
  public List<Zl1r> Zn(Zbll paramZbll, Zxs7 paramZxs7) {
    Zs2i zs2i = paramZbll.Zk.Zu(paramZxs7);
    byte[] arrayOfByte = paramZbll.Zk.Zh();
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zbqc[] arrayOfZbqc = ZL();
    int i = Zli.ZR(zs2i.ZE(), arrayOfByte);
    if (i == -1) {
      Zuh.Zb((paramZbll.Zk.ZY() == 0), Zqf.Zk);
      return zs2i.ZO();
    } 
    for (Zru2 zru2 : this.ZL) {
      if (zru2.ZT) {
        int j = Zli.ZR(arrayOfByte, Zkb.Zy(zru2.ZI));
        arrayList.add(new Zl1r(i + j, i + j + zru2.ZI.length()));
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      ZR(new Zbqc[1]); 
    return arrayList;
  }
  
  public void Zi(Zru2 paramZru2) {
    this.ZL.add(paramZru2);
  }
  
  public int ZI() {
    return this.ZL.size();
  }
  
  public Zru2 Ze(int paramInt) {
    return this.ZL.get(paramInt);
  }
  
  public int Zm(Zru2 paramZru2) {
    return this.ZL.indexOf(paramZru2);
  }
  
  public void Zg(int paramInt, Zru2 paramZru2) {
    this.ZL.set(paramInt, paramZru2);
  }
  
  public void Zy(int paramInt, Zru2 paramZru2) {
    this.ZL.add(paramInt, paramZru2);
  }
  
  public Iterator<Zru2> iterator() {
    return this.ZL.iterator();
  }
  
  public static void ZR(Zbqc[] paramArrayOfZbqc) {
    ZA = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZL() {
    return ZA;
  }
  
  static {
    if (ZL() == null)
      ZR(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */