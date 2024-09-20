package burp;

public abstract class Zsp {
  public final int ZD;
  
  public final Zmcm Zi;
  
  public final Zz0x ZS;
  
  private static String[] ZA;
  
  protected Zsp(int paramInt, Zmcm paramZmcm, Zz0x paramZz0x) {
    this.ZD = paramInt;
    this.Zi = paramZmcm;
    this.ZS = paramZz0x;
  }
  
  public abstract byte[] Zd();
  
  public abstract void ZX(Zkoj paramZkoj);
  
  public byte Za() {
    return this.Zi.Zi(this.ZS);
  }
  
  public boolean ZF(byte paramByte) {
    return this.ZS.ZL(new int[] { paramByte });
  }
  
  public boolean ZL() {
    return (this.ZD == 0);
  }
  
  public boolean ZG() {
    return !ZL();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zsp zsp = (Zsp)paramObject;
    return (this.ZD == zsp.ZD && this.Zi == zsp.Zi && this.ZS.equals(zsp.ZS));
  }
  
  public static void ZV(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Ze() {
    return ZA;
  }
  
  static {
    if (Ze() != null)
      ZV(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */