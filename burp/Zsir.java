package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsir {
  private Zstu ZP;
  
  private String ZB;
  
  private Zstu Zj;
  
  private int Zm;
  
  private short Ze;
  
  private short ZH = 0;
  
  private String ZZ;
  
  private long Z_;
  
  private byte Zg = 0;
  
  private byte Zb = 0;
  
  private short ZD;
  
  private Zlit Zz;
  
  private boolean ZK;
  
  private Zs73 Zr;
  
  private Zrf_ Zi;
  
  public void Zd(Zez3 paramZez3) {
    Zk5s zk5s = new Zk5s(this);
    paramZez3.Zk(zk5s);
    ZT();
  }
  
  private void ZT() {
    if (this.Zi == null || this.Zr == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    Zstu zstu1 = this.Zi.Z__();
    if (zstu1 == null || this.ZP == null || zstu1.Zpu() != this.ZP.Zpu())
      this.Zi.ZY(this.ZP); 
    Zstu zstu2 = this.Zi.Z_B();
    if (zstu2 == null || this.Zj == null || zstu2.Zpu() != this.Zj.Zpu())
      this.Zi.Zm(this.Zj); 
    String str1 = this.Zi.Z_O();
    if (str1 == null || !str1.equalsIgnoreCase(this.ZB))
      this.Zi.Zlq(this.ZB); 
    String str2 = this.Zi.Z_I();
    if (str2 == null || !str2.equals(this.ZZ))
      this.Zi.ZlI(this.ZZ); 
    Zlit zlit = this.Zr.ZTR();
    if (zlit == null || !zlit.equals(this.Zz))
      this.Zr.ZK(this.Zz); 
    this.Zi.Zwr(this.Zm);
    this.Zi.ZT(this.Ze);
    this.Zi.Zl(this.ZH);
    this.Zi.ZE(this.Z_);
    this.Zr.Zy(this.Zb);
    this.Zr.ZU(this.Zg);
    this.Zr.ZC(this.ZD);
    if (this.ZK)
      this.Zr.ZTh().clear(); 
  }
  
  public Zsir Zp(Zstu paramZstu, String paramString) {
    ZG(paramZstu, paramString, 0L);
    return this;
  }
  
  public Zsir ZG(Zstu paramZstu, String paramString, long paramLong) {
    this.ZP = paramZstu;
    this.ZB = paramString;
    this.Z_ = paramLong;
    return this;
  }
  
  public Zsir ZV(Zstu paramZstu, int paramInt, short paramShort1, short paramShort2, String paramString, long paramLong) {
    this.Zj = paramZstu;
    this.Zm = paramInt;
    this.Ze = paramShort1;
    this.ZH = paramShort2;
    this.ZZ = paramString;
    this.Z_ = paramLong;
    return this;
  }
  
  public Zsir ZZ(byte paramByte1, byte paramByte2) {
    ZG(paramByte1, paramByte2, (short)0, null);
    return this;
  }
  
  public Zsir ZG(byte paramByte1, byte paramByte2, short paramShort, Zlit paramZlit) {
    this.Zg = paramByte1;
    this.Zb = paramByte2;
    this.ZD = paramShort;
    this.Zz = paramZlit;
    return this;
  }
  
  public static String ZO(Zs68 paramZs68) {
    if (paramZs68.Zd != null) {
      String str = Ztnx.ZN(paramZs68.Zd);
      if (str != null)
        return str.trim().intern(); 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsir.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */