package burp;

import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrg8 implements Zm4g {
  private final int ZJ;
  
  private final byte Zo;
  
  private final byte[] Zi;
  
  private final List<Zl1r> ZB;
  
  private final List<Zl1r> ZI;
  
  private byte[] Zf;
  
  private final Zmzk Z_;
  
  private final String Zw;
  
  private final Zxs7 ZN;
  
  private final Zlvf ZD;
  
  private Zlvf Zm;
  
  private Zrwf Zl;
  
  private byte Zk;
  
  private int Zg;
  
  private List<Zl1r> Zx;
  
  private List<Zl1r> ZR;
  
  private Zrg8(Zmzk paramZmzk, String paramString, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zrwf paramZrwf, Zlvf paramZlvf1, Zlvf paramZlvf2, List<Zl1r> paramList1, List<Zl1r> paramList2, List<Zl1r> paramList3, List<Zl1r> paramList4) {
    this.Zl = paramZrwf;
    this.Z_ = paramZmzk;
    this.Zw = paramString;
    this.Zk = paramByte1;
    this.ZJ = paramInt2;
    this.Zg = paramInt1;
    this.Zi = paramArrayOfbyte1;
    this.Zf = paramArrayOfbyte2;
    this.Zo = paramByte2;
    this.ZN = paramZxs7;
    this.ZD = paramZlvf1;
    this.Zm = paramZlvf2;
    this.ZB = paramList1;
    this.ZI = paramList2;
    this.Zx = paramList3;
    this.ZR = paramList4;
  }
  
  public byte ZU() {
    return this.Zk;
  }
  
  public int ZR() {
    return this.ZJ;
  }
  
  public void ZG(Zlvf paramZlvf, String paramString, byte paramByte, int paramInt, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    this.Zx = paramList1;
    this.ZR = paramList2;
    this.Zm = paramZlvf;
    this.Zf = Zkb.Zy(paramString);
    this.Zl = Zrwf.DIFFABLE;
    this.Zk = paramByte;
    this.Zg = paramInt;
  }
  
  public Zx_5 Zx() {
    switch (Zruq.Zq[this.Zl.ordinal()]) {
      case 1:
        return Zgky.Zr(this.Z_, this.Zw, this.Zg, this.ZJ, this.Zk, this.Zo, this.ZN, this.Zi, this.ZD, this.ZB, this.ZI);
      case 2:
        return Zgky.Zl(this.Z_, this.Zw, this.Zg, this.ZJ, this.Zo, this.Zk, this.ZN, this.Zi, this.Zf, this.ZD, this.Zm, this.ZB, this.ZI, this.Zx, this.ZR);
    } 
    Zuh.ZT(false, Zqf.Zk, this.Zl.name());
    return null;
  }
  
  public int Zl() {
    return this.Zg;
  }
  
  public Zrwf ZG() {
    return this.Zl;
  }
  
  public static Zm4g ZA(Zmzk paramZmzk, String paramString, byte paramByte1, int paramInt1, int paramInt2, byte paramByte2, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zlvf paramZlvf1, Zlvf paramZlvf2, List<Zl1r> paramList1, List<Zl1r> paramList2, List<Zl1r> paramList3, List<Zl1r> paramList4) {
    return new Zrg8(paramZmzk, paramString, paramInt1, paramInt2, paramByte1, paramByte2, paramZxs7, paramArrayOfbyte1, paramArrayOfbyte2, Zrwf.DIFFABLE, paramZlvf1, paramZlvf2, paramList1, paramList2, paramList3, paramList4);
  }
  
  public static Zm4g ZJ(Zmzk paramZmzk, String paramString, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2, Zxs7 paramZxs7, byte[] paramArrayOfbyte, Zlvf paramZlvf, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    return new Zrg8(paramZmzk, paramString, paramInt1, paramInt2, paramByte1, paramByte2, paramZxs7, paramArrayOfbyte, null, Zrwf.IN_BAND, paramZlvf, null, paramList1, paramList2, null, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrg8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */