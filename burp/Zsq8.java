package burp;

public class Zsq8 {
  public final byte Zm;
  
  public final Zlit ZZ;
  
  public final String Z_;
  
  public final Ztu8 ZH;
  
  public final Zs5n Zn;
  
  public final short Zg;
  
  public final int ZJ;
  
  public final int Zv;
  
  private static int[] Zw;
  
  public Zsq8(byte paramByte, Zlit paramZlit, String paramString, Ztu8 paramZtu8, Zs5n paramZs5n, short paramShort, int paramInt1, int paramInt2) {
    this.Zm = paramByte;
    this.ZZ = paramZlit;
    this.Z_ = paramString;
    this.ZH = paramZtu8;
    int[] arrayOfInt = ZE();
    this.Zn = paramZs5n;
    this.Zg = paramShort;
    this.ZJ = paramInt1;
    this.Zv = paramInt2;
    if (Zbqc.Zwu() == null)
      ZG(new int[4]); 
  }
  
  public static void ZG(int[] paramArrayOfint) {
    Zw = paramArrayOfint;
  }
  
  public static int[] ZE() {
    return Zw;
  }
  
  static {
    if (ZE() != null)
      ZG(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsq8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */