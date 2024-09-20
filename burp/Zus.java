package burp;

import net.portswigger.Zo;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zus extends Zni implements Zeeg {
  @Zzvo(0)
  private final int Zt;
  
  @Zzvo(9)
  private final int ZS;
  
  private final Ze3o ZM;
  
  private final byte Ze;
  
  private final Zrwo ZT;
  
  @Zzvo(5)
  private final Zstu Zp;
  
  @Zzvo(6)
  private final int ZA;
  
  @Zzvo(7)
  private final long Z_;
  
  private Zo ZC;
  
  Zus(int paramInt1, int paramInt2, Ze3o paramZe3o, byte paramByte, Zo paramZo, Zrwo paramZrwo, Zstu paramZstu, int paramInt3, long paramLong) {
    this.Zt = paramInt1;
    this.ZS = paramInt2;
    this.ZM = paramZe3o;
    this.Ze = paramByte;
    this.ZC = paramZo;
    this.ZT = paramZrwo;
    this.Zp = paramZstu;
    this.ZA = paramInt3;
    int[] arrayOfInt = Zrwo.ZO();
    try {
      this.Z_ = paramLong;
      if (Zbqc.Zwu() == null)
        Zrwo.Zp(new int[3]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public int ZaW() {
    return this.ZS;
  }
  
  public void ZnM(int paramInt) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public Ze3o Za_() {
    return this.ZM;
  }
  
  public byte Zay() {
    return this.Ze;
  }
  
  public Zo Zaz() {
    return this.ZC;
  }
  
  public Zrwo ZaE() {
    return this.ZT;
  }
  
  public Zstu Zaa() {
    return this.Zp;
  }
  
  public int ZaN() {
    return this.ZA;
  }
  
  public long ZaQ() {
    return this.Z_;
  }
  
  public Zeu4<Zeeg> ZF() {
    return ZE;
  }
  
  @Zzvo(3)
  private int Zvs() {
    return this.Ze;
  }
  
  @Zzvo(8)
  private byte ZvT() {
    return this.ZC.Ze();
  }
  
  @Zzvo(2)
  private boolean ZvS() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.ZM == Ze3o.CLIENT_TO_SERVER);
  }
  
  @Zzvo(4)
  private byte Zve() {
    return this.ZT.id;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */