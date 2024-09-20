package burp;

import net.portswigger.Zvy;

abstract class Ztqm extends Ztqv {
  Ztqm(Zkjm paramZkjm, Ztb2 paramZtb2, String paramString1, String paramString2) {
    super(paramZkjm, paramZtb2, paramString1, paramString2);
  }
  
  String Zr() {
    return new String(Zvy.ZS(Zlq5.Zg(this.Zc.Zd(), this.Zc.ZJ()), false));
  }
  
  int Zn() {
    return 32;
  }
  
  String Zc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws Zxt3 {
    int i = Ztqv.Zm();
    byte[] arrayOfByte = Zlq5.ZF(this.Zc.Zd(), this.Zc.ZJ(), this.Zc.Zk(), this.Zc.Zb(), this.Zc.ZQ(), paramArrayOfbyte2);
    if (Zbqc.Zwu() == null)
      Ztqv.Zw(++i); 
    return new String(Zvy.ZS(arrayOfByte, false));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */