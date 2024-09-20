package burp;

import net.portswigger.Zo;

public class Zkmj {
  private final int ZM;
  
  private final byte ZT;
  
  private final Zo ZJ;
  
  private final Zstu Zs;
  
  private final Ze3o Z_;
  
  private static int[] Ze;
  
  public Zkmj(int paramInt, byte paramByte, Zo paramZo, Zstu paramZstu, Ze3o paramZe3o) {
    this.ZM = paramInt;
    this.ZT = paramByte;
    this.ZJ = paramZo;
    int[] arrayOfInt = Za();
    this.Zs = paramZstu;
    this.Z_ = paramZe3o;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public int ZM() {
    return this.ZM;
  }
  
  public byte Zu() {
    return this.ZT;
  }
  
  public Zstu ZE() {
    return this.Zs;
  }
  
  public Ze3o Zm() {
    return this.Z_;
  }
  
  public boolean ZZ() {
    return (this.ZM > 0 && this.Zs != null && this.Z_ != null);
  }
  
  public static void ZB(int[] paramArrayOfint) {
    Ze = paramArrayOfint;
  }
  
  public static int[] Za() {
    return Ze;
  }
  
  static {
    if (Za() != null)
      ZB(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */