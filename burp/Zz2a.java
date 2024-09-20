package burp;

import net.portswigger.Zsy;

abstract class Zz2a implements Zmsx {
  private final Zsy ZW;
  
  private final boolean Zf;
  
  private final String ZI;
  
  private int ZO = 0;
  
  private int Zi = 0;
  
  Zz2a(Zsy paramZsy, boolean paramBoolean, String paramString) {
    this.ZW = paramZsy;
    this.Zf = paramBoolean;
    this.ZI = paramString;
  }
  
  public String ZO() {
    int i = this.ZW.ZP().ZO(1000).Zr(10000).Zc();
    return (!this.Zf && this.ZO++ % 4 == 0) ? Zn(Integer.toString(this.ZW.ZP().ZO(10000000).Zr(100000000).Zc()), i, "0" + i) : Zn(Integer.toString(this.ZW.ZP().ZO(10000000).Zr(100000000).Zc()), i, String.valueOf(i));
  }
  
  public String ZS() {
    int[] arrayOfInt = Zz6s.Zp();
    int i = this.ZW.ZP().ZO(1009).Zr(9990).Zc();
    if (this.Zi++ % 4 == 1)
      return this.Zf ? Zn(Integer.toString(this.ZW.ZP().ZO(10000000).Zr(100000000).Zc()), i, "" + i + i) : Zn(Integer.toString(this.ZW.ZP().ZO(10000000).Zr(100000000).Zc()), i, "" + i + "0"); 
    int j = this.ZW.ZP().ZO(1).Zr(10).Zc();
    if (Zbqc.Zwu() == null)
      Zz6s.Zm(new int[1]); 
    return Zn(Integer.toString(this.ZW.ZP().ZO(10000000).Zr(100000000).Zc()), i, String.valueOf(i + j));
  }
  
  protected abstract String Zn(String paramString1, int paramInt, String paramString2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */