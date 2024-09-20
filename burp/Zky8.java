package burp;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zky8 extends Zkte {
  private final Zr4o ZE;
  
  public Zky8(Zr4o paramZr4o, Zr_4 paramZr_4) {
    super(paramZr_4, paramZr4o);
    this.ZE = paramZr4o;
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    String str = this.ZE.ZFo();
    if (str != null)
      paramArrayOfbyte = Zkb.Zy(str); 
    if (this.ZE.ZFK() == null)
      this.ZE.Ze(Zg(paramArrayOfbyte)); 
    if (this.ZE.ZFc() >= this.ZE.ZFK().Zpu()) {
      this.ZE.ZWo(0);
      int j = this.ZE.ZFw() + (this.ZE.ZFW() ? (this.ZE.ZFh() * 2) : this.ZE.ZFh());
      this.ZE.ZWY(j);
    } 
    if (this.ZE.ZFw() > paramArrayOfbyte.length)
      return null; 
    byte[] arrayOfByte1 = ((Zstu)this.ZE.ZFK().ZdF(this.ZE.ZFc())).ZiD();
    byte[] arrayOfByte2 = new byte[paramArrayOfbyte.length + arrayOfByte1.length];
    int i = this.ZE.ZFw();
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte2, 0, i);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, i, arrayOfByte1.length);
    System.arraycopy(paramArrayOfbyte, i, arrayOfByte2, i + arrayOfByte1.length, paramArrayOfbyte.length - i);
    this.ZE.ZWo(this.ZE.ZFc() + 1);
    return this.ZE.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, arrayOfByte2);
  }
  
  public void Zy4() {
    this.ZE.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZE.ZS(paramZs4f);
  }
  
  private void Zn(byte[] paramArrayOfbyte, Set<String> paramSet) {
    String[] arrayOfString = Zbwt.ZR();
    int i = this.ZE.ZFh();
    int j = this.ZE.ZFW() ? (i * 2) : i;
    int k = 0;
    while (k + j <= paramArrayOfbyte.length) {
      paramSet.add(Zkb.Zo(paramArrayOfbyte, k, j));
      k += j;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private Zrte<Zstu> Zg(byte[] paramArrayOfbyte) {
    TreeSet<String> treeSet = new TreeSet();
    Zn(paramArrayOfbyte, treeSet);
    String[] arrayOfString = Zbwt.ZR();
    try {
      Zefg<Zstu> zefg = this.ZE.ZFB();
      for (Zstu zstu : zefg) {
        Zn(zstu.ZiD(), treeSet);
        if (arrayOfString != null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    Zrte<Zstu> zrte = this.Zn.<Zrte>Zv((Zllg)new Zguz<>(Zstu.Zc), treeSet.size());
    Iterator<String> iterator = treeSet.iterator();
    int i = 0;
    while (i < zrte.Zpu()) {
      zrte.ZU(i, this.Zn.ZZ(Zkb.Zy(iterator.next())));
      i++;
      if (arrayOfString != null)
        break; 
    } 
    i = this.ZE.ZFh();
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    this.ZE.ZvH(zrte.Zpu() * (paramArrayOfbyte.length / (this.ZE.ZFW() ? (i * 2) : i) + 1));
    this.ZE.ZcN(false);
    return zrte;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zky8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */