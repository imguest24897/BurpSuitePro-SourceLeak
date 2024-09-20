package burp;

import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;
import net.portswigger.Zsy;
import net.portswigger.Ztu;

class Zg_l {
  private final Zsy ZS;
  
  private final Zmhe Zb;
  
  private byte[] Zh;
  
  Zs2i Zl;
  
  Zg_l(Zsy paramZsy, Zmhe paramZmhe) {
    this.ZS = paramZsy;
    this.Zb = paramZmhe;
  }
  
  public Zku6 ZX(byte paramByte) {
    byte[] arrayOfByte1 = Zf();
    this.Zh = Zf();
    byte[] arrayOfByte2 = Zmw.Zq(new byte[][] { arrayOfByte1, Zvv.ZF, this.Zh });
    String str = Zmuh.Zb();
    this.Zl = this.Zb.Z_(arrayOfByte2, paramByte);
    if (Zbqc.Zwu() == null)
      Zmuh.ZX("sTEATc"); 
    return (new Ztsh(this.Zb, paramByte, arrayOfByte2, (byte)1, (byte)2)).ZQ(Zxar.Zg(arrayOfByte1));
  }
  
  boolean Za(int paramInt, Zstu paramZstu, Zxs8 paramZxs8) {
    int i = Zlt_.Zr(paramZstu, this.Zh, false, paramInt);
    if (i == -1)
      return false; 
    byte[] arrayOfByte = paramZstu.Zb(paramInt, i + this.Zh.length).ZiD();
    int j = Zli.ZR(Ztu.ZM(arrayOfByte), Zvv.ZF);
    if (j == -1)
      return false; 
    paramZxs8.Zm(arrayOfByte, paramInt);
    return true;
  }
  
  private byte[] Zf() {
    return Zkb.Zy(this.ZS.Zi().ZG().ZK(5));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */