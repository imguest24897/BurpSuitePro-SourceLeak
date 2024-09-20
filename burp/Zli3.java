package burp;

import java.io.IOException;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zli3 {
  private final long Zo;
  
  private final int ZP;
  
  private final Zlan Zw;
  
  private final Zt1d ZM;
  
  private final Zxpk ZK;
  
  private final Ze_w ZL;
  
  private final Ze8l Zg;
  
  private Zrbs ZJ;
  
  public Zli3(long paramLong, int paramInt, Zst8 paramZst8, Ztjd paramZtjd, Zlan paramZlan, Ze_w paramZe_w, Zx86 paramZx86, Ztf5 paramZtf5, Zbip paramZbip, Ze19 paramZe19, Zryu paramZryu, Ze8l paramZe8l) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: lload_1
    //   6: putfield Zo : J
    //   9: aload_0
    //   10: iload_3
    //   11: putfield ZP : I
    //   14: aload_0
    //   15: aload #6
    //   17: putfield Zw : Lburp/Zlan;
    //   20: aload_0
    //   21: aload #7
    //   23: putfield ZL : Lburp/Ze_w;
    //   26: aload_0
    //   27: aload #13
    //   29: putfield Zg : Lburp/Ze8l;
    //   32: aload_0
    //   33: new burp/Zt1d
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: putfield ZM : Lburp/Zt1d;
    //   43: aload_0
    //   44: aload #11
    //   46: <illegal opcode> Zb : (Lburp/Zli3;Lburp/Ze19;)Lburp/Ze19;
    //   51: astore #14
    //   53: aload_0
    //   54: new burp/Zxpk
    //   57: dup
    //   58: iload_3
    //   59: aload #4
    //   61: aload #14
    //   63: aload_0
    //   64: getfield ZM : Lburp/Zt1d;
    //   67: aload #5
    //   69: aload #8
    //   71: aload #9
    //   73: aload #10
    //   75: aload #12
    //   77: invokespecial <init> : (ILburp/Zst8;Lburp/Ze19;Lburp/Zevl;Lburp/Ztjd;Lburp/Zx86;Lburp/Ztf5;Lburp/Zbip;Lburp/Zryu;)V
    //   80: putfield ZK : Lburp/Zxpk;
    //   83: aload_0
    //   84: getstatic burp/Zrbs.NOT_WRITTEN : Lburp/Zrbs;
    //   87: putfield ZJ : Lburp/Zrbs;
    //   90: return
  }
  
  public byte[] Zj() {
    return this.Zg.ZP(this.ZM.Zx());
  }
  
  public void Zw(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zw : Lburp/Zlan;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> ZH : (Lburp/Zli3;[B)Lburp/Zzik;
    //   11: invokevirtual ZN : (Lburp/Zzik;)V
    //   14: return
  }
  
  public void Zw() {
    if (Zrbs.PARTIALLY_WRITTEN == this.ZJ && this.ZK.ZN())
      this.Zw.ZN(this::lambda$close$2); 
    this.ZK.Zm();
  }
  
  public void Z_(Zlxi paramZlxi) {
    this.ZK.Zb(paramZlxi);
  }
  
  void ZA(Zsp paramZsp) throws Zzt7, Zmfz {
    this.ZK.ZW(paramZsp);
  }
  
  boolean ZN() {
    return this.ZK.ZM();
  }
  
  private void lambda$close$2() throws IOException, Zzt7, Zmfz {
    this.ZK.Zq(this.ZL.Za(this.ZP));
  }
  
  private void lambda$sendResponseData$1(byte[] paramArrayOfbyte) throws IOException, Zzt7, Zmfz {
    String[] arrayOfString = Zt17.ZL();
    try {
      switch (this.ZJ.ordinal()) {
        case 0:
          try {
            this.ZK.Zq(this.ZL.ZF(this.ZP, paramArrayOfbyte));
            this.ZJ = Zrbs.PARTIALLY_WRITTEN;
            if (arrayOfString != null);
          } catch (IOException iOException) {
            throw a(null);
          } 
          return;
        case 1:
          try {
            this.ZK.Zq(this.ZL.ZO(this.ZP, paramArrayOfbyte));
            if (arrayOfString != null);
          } catch (IOException iOException) {
            throw a(null);
          } 
          return;
        case 2:
          try {
            if (arrayOfString != null)
              break; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zr, this.ZJ.name());
  }
  
  private void lambda$new$0(Ze19 paramZe19, Zrsv paramZrsv) {
    paramZe19.Zb(paramZrsv);
    if (paramZrsv == Zrsv.CLOSED)
      this.ZJ = Zrbs.COMPLETE; 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zli3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */