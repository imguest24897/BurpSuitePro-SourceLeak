package burp;

import net.portswigger.Zmw;
import net.portswigger.Zsy;
import net.portswigger.Zvy;

abstract class Ztqa extends Ztqv {
  private final Zrgd ZP;
  
  private final Zsy ZC;
  
  Ztqa(Zrgd paramZrgd, Zsy paramZsy, Zkjm paramZkjm, Ztb2 paramZtb2, String paramString1, String paramString2) {
    super(paramZkjm, paramZtb2, paramString1, paramString2);
    this.ZP = paramZrgd;
    this.ZC = paramZsy;
  }
  
  String Zr() {
    return new String(Zvy.ZS(Zb60.ZP(this.Zc.Zd(), this.Zc.ZJ()), false));
  }
  
  int Zn() {
    return 46;
  }
  
  String Zc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws Zxt3 {
    int j = Zu(paramArrayOfbyte1[40], paramArrayOfbyte1[41]);
    int k = Zu(paramArrayOfbyte1[44], paramArrayOfbyte1[45]);
    byte[] arrayOfByte1 = Zmw.Zz(paramArrayOfbyte1, k, k + j);
    int i = Ztqv.ZU();
    Zb60 zb60 = new Zb60(this.ZP, this.ZC);
    byte[] arrayOfByte2 = zb60.ZN(this.Zc.Zd(), this.Zc.ZJ(), this.Zc.Zk(), this.Zc.Zb(), this.Zc.ZQ(), paramArrayOfbyte2, arrayOfByte1);
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
    return new String(Zvy.ZS(arrayOfByte2, false));
  }
  
  private static int Zu(byte paramByte1, byte paramByte2) {
    return ZW(paramByte1) + 256 * ZW(paramByte2);
  }
  
  private static int ZW(byte paramByte) {
    return paramByte & 0xFF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */