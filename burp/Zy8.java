package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zy8 extends Zni implements Zsqo {
  private final boolean[] ZT;
  
  private static int ZG;
  
  public Zy8(int paramInt) {
    this(new boolean[paramInt]);
  }
  
  private Zy8(boolean[] paramArrayOfboolean) {
    this.ZT = paramArrayOfboolean;
  }
  
  public static Zy8 Zt(boolean[] paramArrayOfboolean) {
    try {
      if (paramArrayOfboolean == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zy8(paramArrayOfboolean);
  }
  
  public boolean[] ZK4() {
    boolean[] arrayOfBoolean = new boolean[this.ZT.length];
    System.arraycopy(this.ZT, 0, arrayOfBoolean, 0, this.ZT.length);
    return arrayOfBoolean;
  }
  
  public Zsqo ZU(boolean[] paramArrayOfboolean) {
    try {
      if (paramArrayOfboolean.length != this.ZT.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    System.arraycopy(paramArrayOfboolean, 0, this.ZT, 0, paramArrayOfboolean.length);
    return this;
  }
  
  public boolean ZV(int paramInt) {
    return this.ZT[paramInt];
  }
  
  public void ZC(int paramInt, boolean paramBoolean) {
    this.ZT[paramInt] = paramBoolean;
  }
  
  public void Zq(Zsqo paramZsqo) {
    try {
      if (paramZsqo.Zpu() < this.ZT.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZsqo instanceof Zy8)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy8 zy8 = (Zy8)paramZsqo;
    System.arraycopy(this.ZT, 0, zy8.ZT, 0, this.ZT.length);
  }
  
  public int Zpu() {
    return this.ZT.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZV(this);
  }
  
  public Zllg<Zsqo> ZF() {
    return Zsqo.ZR;
  }
  
  public static void ZN(int paramInt) {
    ZG = paramInt;
  }
  
  public static int Zsf() {
    return ZG;
  }
  
  public static int Zsb() {
    int i = Zsf();
    try {
      if (i == 0)
        return 40; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    if (Zsf() == 0)
      ZN(6); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zy8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */