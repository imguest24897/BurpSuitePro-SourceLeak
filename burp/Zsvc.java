package burp;

public class Zsvc {
  public final Zgho ZE;
  
  public final Object Zr;
  
  public final Zgfi ZY;
  
  public final String Zy;
  
  public final int ZH;
  
  public final int ZJ;
  
  private static int ZT;
  
  public Zsvc(Zgho paramZgho, Object paramObject, Zgfi paramZgfi, int paramInt1, int paramInt2) {
    this.ZE = paramZgho;
    this.Zr = paramObject;
    this.ZY = paramZgfi;
    this.Zy = paramZgfi.ZQ();
    this.ZH = paramInt1;
    this.ZJ = paramInt2;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zsvc zsvc = (Zsvc)paramObject;
    return (this.ZH != zsvc.ZH) ? false : ((this.ZJ != zsvc.ZJ) ? false : (((this.Zy != null) ? !this.Zy.equals(zsvc.Zy) : (zsvc.Zy != null)) ? false : ((this.ZE != zsvc.ZE) ? false : (!((this.Zr != null) ? !this.Zr.equals(zsvc.Zr) : (zsvc.Zr != null))))));
  }
  
  public int hashCode() {
    int i = ZX();
    int j = this.ZE.hashCode();
    j = 31 * j + ((this.Zr != null) ? this.Zr.hashCode() : 0);
    j = 31 * j + ((this.Zy != null) ? this.Zy.hashCode() : 0);
    j = 31 * j + this.ZH;
    j = 31 * j + this.ZJ;
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
    return j;
  }
  
  public static void ZQ(int paramInt) {
    ZT = paramInt;
  }
  
  public static int Zd() {
    return ZT;
  }
  
  public static int ZX() {
    int i = Zd();
    return (i == 0) ? 108 : 0;
  }
  
  static {
    if (ZX() != 0)
      ZQ(34); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */