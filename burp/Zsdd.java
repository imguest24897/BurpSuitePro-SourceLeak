package burp;

import java.util.Iterator;
import java.util.List;

public class Zsdd implements Iterable<Zb3t> {
  private final Zkr1<Zmv4> Z_;
  
  private final Zrn9 Zj;
  
  private final int Zf;
  
  private static String[] ZL;
  
  public Zsdd(Zkr1<Zmv4> paramZkr1, Zrn9 paramZrn9, int paramInt) {
    this.Z_ = paramZkr1;
    this.Zj = paramZrn9;
    this.Zf = paramInt;
  }
  
  public Zrn9 ZD() {
    return this.Zj;
  }
  
  public int ZS() {
    return this.Zf;
  }
  
  public List<Zgbi> Zr() {
    return this.Zj.Zz().Zq();
  }
  
  public Iterator<Zb3t> iterator() {
    return new Zsy3(this, this.Z_);
  }
  
  public static void Zs(String[] paramArrayOfString) {
    ZL = paramArrayOfString;
  }
  
  public static String[] Zv() {
    return ZL;
  }
  
  static {
    if (Zv() != null)
      Zs(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsdd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */