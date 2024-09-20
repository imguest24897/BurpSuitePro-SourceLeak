package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zmw;
import net.portswigger.Zsy;

class Zb6x {
  private final Zku6 ZM;
  
  private final int Zw;
  
  private final int ZS;
  
  private final byte Zq;
  
  private final Zsy ZH;
  
  private final byte[] ZG;
  
  private final Zkv8 Zj;
  
  Zb6x(Zku6 paramZku6, int paramInt1, int paramInt2, byte paramByte, Zsy paramZsy, byte[] paramArrayOfbyte) {
    this.ZM = paramZku6;
    this.Zw = paramInt1;
    this.ZS = paramInt2;
    this.Zq = paramByte;
    this.ZH = paramZsy;
    this.ZG = paramArrayOfbyte;
    this.Zj = ZY();
  }
  
  public Zkv8 ZQ() {
    return this.Zj;
  }
  
  private Zkv8 ZY() {
    String str = Zz_p.Zl();
    Zstu zstu = this.ZM.ZI(this.Zq).Za();
    try {
      if (this.Zw < this.ZS)
        return ZR(zstu); 
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      boolean bool = ((this.ZM.ZX()).ZJ == 259) ? true : false;
      boolean bool1 = Zepo.ZE((new Zlg0(this.ZM.ZX())).ZK((this.ZM.ZV() == null) ? "/" : Zkb.ZG(this.ZM.ZV().ZD())));
      try {
        if (bool || bool1) {
          Zrcr zrcr = new Zrcr(this.Zw, this.ZS, this.ZG);
          String str1 = this.ZH.Zi().ZG().ZK(10);
          byte[] arrayOfByte1 = Zkb.Zy(str1);
          byte[] arrayOfByte2 = ZE(zstu.ZiD(), arrayOfByte1);
          if (bool)
            return zrcr.ZW(this.Zq, arrayOfByte2, arrayOfByte1, 0, arrayOfByte2.length); 
          Zkv8 zkv8 = zrcr.ZD(this.Zq, arrayOfByte2, arrayOfByte1);
          if (zkv8 != null)
            return zkv8; 
          if (str != null)
            return new Zz_p(this.Zq, (byte)19, this.Zw, this.ZS, this.ZG); 
        } else {
          return new Zz_p(this.Zq, (byte)19, this.Zw, this.ZS, this.ZG);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return new Zz_p(this.Zq, (byte)0, this.Zw, this.Zw, this.ZG);
  }
  
  private Zkv8 ZR(Zstu paramZstu) {
    String str2 = null;
    String str3 = null;
    int i = Zlt_.Zc(paramZstu, (byte)10, 0, this.Zw);
    String str1 = Zz_p.Zl();
    if (i != -1) {
      int j = Zlt_.ZT(paramZstu, (byte)58, ++i, this.Zw);
      if (j != -1) {
        str2 = Zruv.ZO(paramZstu, i, j - i).trim();
        i = j + 1;
        while (i < this.ZS && paramZstu.Zp(i) == 32) {
          i++;
          if (str1 != null)
            break; 
        } 
        j = Zlt_.ZT(paramZstu, (byte)10, i, this.ZS);
        if (j != -1)
          str3 = Zruv.ZO(paramZstu, i, j - i).trim(); 
      } 
    } 
    return new Zs16(new Zz_p(this.Zq, (byte)1, this.Zw, i, this.ZG), str2, str3);
  }
  
  private byte[] ZE(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Zmw.Zq(new byte[][] { Zmw.Zz(paramArrayOfbyte1, this.ZS, this.Zw), paramArrayOfbyte2, Zmw.Zz(paramArrayOfbyte1, this.Zw + this.ZG.length, paramArrayOfbyte1.length) });
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */