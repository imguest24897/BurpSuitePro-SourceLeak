package burp;

import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

public class Zxbp extends Zxsr implements Zlx7 {
  private static String ZG;
  
  Zxbp(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean Zv0(String paramString) {
    String str = ZV();
    synchronized (Zz6()) {
      Zrte<Zsdr> zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk3x.Zy);
      Zto<Integer, Integer> zto = Zm(zrte, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      Zstu zstu = this.Za.<Zstu>ZA(this, Zk3x.Zb);
      boolean bool1 = (i != -1 && zstu.Zp(i) < 5) ? true : false;
      boolean bool2 = (i == -1 && j != -1) ? true : false;
      if (str != null)
        Zbqc.Zr(new Zbqc[2]); 
      return (bool1 || bool2);
    } 
  }
  
  public void Zv6(String paramString) {
    String str = ZV();
    Zuh.Zb((paramString != null), Zqf.Zr);
    synchronized (Zz6()) {
      Zrte<Zsdr> zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk3x.Zy);
      Zto<Integer, Integer> zto = Zm(zrte, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      Zstu zstu = this.Za.<Zstu>ZA(this, Zk3x.Zb);
      if (i != -1 && zstu.Zp(i) < 5) {
        byte b = zstu.Zp(i);
        b = (byte)(b + 1);
        zstu.Zs(i, b);
      } 
      if (i == -1 && j != -1) {
        zrte.ZU(j, ZPz().Zz(paramString));
        zstu.Zs(j, (byte)1);
      } 
    } 
    if (Zbqc.Zwu() == null)
      ZGm("DekHr"); 
  }
  
  public void ZvO(String paramString) {
    synchronized (Zz6()) {
      Zstu zstu = this.Za.<Zstu>ZA(this, Zk3x.Zb);
      Zuh.Zb((paramString != null), Zqf.Zr);
      Zrte zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk3x.Zy);
      int i = ((Integer)(Zm(zrte, paramString)).Zq).intValue();
      if (i != -1 && zstu.Zp(i) > 0) {
        byte b = zstu.Zp(i);
        b = (byte)(b - 1);
        zstu.Zs(i, b);
        if (b == 0)
          zrte.ZU(i, (Object)null); 
      } 
    } 
  }
  
  public boolean Zvn(String paramString) {
    synchronized (Zz6()) {
      Zrte<Zsdr> zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk3x.Zz);
      Zto<Integer, Integer> zto = Zm(zrte, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      return (i == -1 && j != -1);
    } 
  }
  
  public void Zvq(String paramString) {
    synchronized (Zz6()) {
      Zrte<Zsdr> zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk3x.Zz);
      Zto<Integer, Integer> zto = Zm(zrte, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      if (i == -1 && j != -1)
        zrte.ZU(j, new Zw_(paramString)); 
    } 
  }
  
  private static Zto<Integer, Integer> Zm(Zrte<Zsdr> paramZrte, String paramString) {
    byte b1 = -1;
    byte b2 = -1;
    byte b = 0;
    String str = ZV();
    while (b < paramZrte.Zpu()) {
      Zsdr zsdr = paramZrte.ZdF(b);
      if (zsdr == null && b1 == -1)
        b1 = b; 
      if (zsdr != null && paramString.equals(zsdr.toString()))
        b2 = b; 
      b++;
      if (str != null)
        break; 
    } 
    return Zto.ZM(Integer.valueOf(b2), Integer.valueOf(b1));
  }
  
  public Zeu4<? extends Zlx7> ZF() {
    return Zlx7.Zr;
  }
  
  public static void ZGm(String paramString) {
    ZG = paramString;
  }
  
  public static String ZV() {
    return ZG;
  }
  
  static {
    if (ZV() != null)
      ZGm("yXT6S"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxbp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */