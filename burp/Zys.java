package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zys extends Zni implements Zghu {
  private final short[] Za;
  
  private static String Zf;
  
  Zys(int paramInt) {
    this(new short[paramInt]);
  }
  
  private Zys(short[] paramArrayOfshort) {
    this.Za = paramArrayOfshort;
  }
  
  public short ZCO(int paramInt) {
    return this.Za[paramInt];
  }
  
  public void ZU(int paramInt, short paramShort) {
    this.Za[paramInt] = paramShort;
  }
  
  public void Zm(Zghu paramZghu) {
    String str = ZDS();
    try {
      if (paramZghu.Zpu() < this.Za.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZghu instanceof Zys)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zys zys = (Zys)paramZghu;
    try {
      System.arraycopy(this.Za, 0, zys.Za, 0, this.Za.length);
      if (Zbqc.Zwu() == null)
        Zg("xPJGdb"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int Zpu() {
    return this.Za.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZE(this);
  }
  
  public Zllg<Zghu> ZF() {
    return Zghu.Zw;
  }
  
  public static void Zg(String paramString) {
    Zf = paramString;
  }
  
  public static String ZDS() {
    return Zf;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    if (ZDS() == null)
      Zg("inEtY"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zys.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */