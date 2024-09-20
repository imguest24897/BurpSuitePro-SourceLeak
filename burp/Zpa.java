package burp;

import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

class Zpa extends Zni implements Zlx7 {
  @Zzvo(1)
  private final Zrte<Zsdr> Zz;
  
  @Zzvo(2)
  private final byte[] Zf;
  
  @Zzvo(3)
  private final Zrte<Zsdr> Zi;
  
  private final Object ZG;
  
  Zpa(Zrte<Zsdr> paramZrte1, Zrte<Zsdr> paramZrte2, byte[] paramArrayOfbyte) {
    this.Zz = paramZrte1;
    this.Zi = paramZrte2;
    this.Zf = paramArrayOfbyte;
    this.ZG = new Object();
  }
  
  public boolean Zv0(String paramString) {
    Zuh.Zb((paramString != null), Zqf.Zr);
    synchronized (this.ZG) {
      Zto<Integer, Integer> zto = Zf(this.Zz, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      boolean bool1 = (i != -1 && this.Zf[i] < 5) ? true : false;
      boolean bool2 = (i == -1 && j != -1) ? true : false;
      return (bool1 || bool2);
    } 
  }
  
  public void Zv6(String paramString) {
    Zuh.Zb((paramString != null), Zqf.Zr);
    synchronized (this.ZG) {
      Zto<Integer, Integer> zto = Zf(this.Zz, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      if (i != -1 && this.Zf[i] < 5)
        this.Zf[i] = (byte)(this.Zf[i] + 1); 
      if (i == -1 && j != -1) {
        this.Zz.ZU(j, new Zw_(paramString));
        this.Zf[j] = 1;
      } 
    } 
  }
  
  public void ZvO(String paramString) {
    Zuh.Zb((paramString != null), Zqf.Zr);
    synchronized (this.ZG) {
      int i = ((Integer)(Zf(this.Zz, paramString)).Zq).intValue();
      if (i != -1 && this.Zf[i] > 0) {
        this.Zf[i] = (byte)(this.Zf[i] - 1);
        if (this.Zf[i] == 0)
          this.Zz.ZU(i, (Zsdr)null); 
      } 
    } 
  }
  
  public boolean Zvn(String paramString) {
    Zuh.Zb((paramString != null), Zqf.Zr);
    synchronized (this.ZG) {
      Zto<Integer, Integer> zto = Zf(this.Zi, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      return (i == -1 && j != -1);
    } 
  }
  
  public void Zvq(String paramString) {
    Zuh.Zb((paramString != null), Zqf.Zr);
    synchronized (this.ZG) {
      Zto<Integer, Integer> zto = Zf(this.Zi, paramString);
      int i = ((Integer)zto.Zq).intValue();
      int j = ((Integer)zto.Zo).intValue();
      if (i == -1 && j != -1)
        this.Zi.ZU(j, new Zw_(paramString)); 
    } 
  }
  
  private static Zto<Integer, Integer> Zf(Zrte<Zsdr> paramZrte, String paramString) {
    byte b1 = -1;
    byte b2 = -1;
    byte b = 0;
    String str = Zxbp.ZV();
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
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */