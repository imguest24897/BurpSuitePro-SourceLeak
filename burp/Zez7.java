package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Zez7 {
  private final byte Zy;
  
  private static String Zn;
  
  public Zez7(byte paramByte) {
    this.Zy = paramByte;
  }
  
  public byte Zn() {
    return this.Zy;
  }
  
  public abstract String Zp();
  
  public abstract boolean ZN(Zsiv paramZsiv);
  
  public abstract void Zl(Zsiv paramZsiv, Zt1g paramZt1g);
  
  public abstract boolean Zg();
  
  protected static boolean ZQ(Zrp0 paramZrp0) {
    return !(paramZrp0 instanceof Zm5e);
  }
  
  protected static boolean Zi(Zrp0 paramZrp0) {
    return !(paramZrp0 instanceof Zm72);
  }
  
  protected static boolean ZT(Zrp0 paramZrp0, Zeg1 paramZeg1) {
    if (paramZrp0 instanceof Zl_) {
      Zl_ zl_ = (Zl_)paramZrp0;
      if (!paramZeg1.ZPt().contains(zl_));
      return false;
    } 
  }
  
  static boolean Z_(Zez7 paramZez7, Zt8i paramZt8i) {
    byte b = paramZt8i.Zsz();
    return (b == -1 || b >= paramZez7.Zn());
  }
  
  protected static List<Zrp0> Zf(Zl7h paramZl7h) {
    ArrayList<Zrp0> arrayList = new ArrayList<>(paramZl7h.ZVe().ZHV());
    Iterator<Zeu9> iterator = paramZl7h.ZVP().iterator();
    String str = Zv();
    while (iterator.hasNext()) {
      Zeu9 zeu9 = iterator.next();
      arrayList.addAll(zeu9.ZHV());
      if (str == null)
        break; 
    } 
    return arrayList;
  }
  
  public static void Zj(String paramString) {
    Zn = paramString;
  }
  
  public static String Zv() {
    return Zn;
  }
  
  static {
    if (Zv() == null)
      Zj("xLXuU"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zez7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */