package burp;

import java.util.Arrays;

public class Zsku implements Zkhs {
  private final Zbw_ Za;
  
  private final Zbnt ZL;
  
  private final Zm6x Zb;
  
  private final Zzxx ZD;
  
  Zsku(Zbw_ paramZbw_, Zbnt paramZbnt, Zm6x paramZm6x, Zzxx paramZzxx) {
    this.Za = paramZbw_;
    this.ZL = paramZbnt;
    this.Zb = paramZm6x;
    this.ZD = paramZzxx;
  }
  
  public void Zb(Zml3 paramZml3, Zz2j paramZz2j) throws Zz87 {
    Zmzk zmzk1 = paramZz2j.Zx();
    byte[] arrayOfByte1 = paramZz2j.ZA();
    Zbx3 zbx3 = new Zbx3(paramZml3, this.Za, true, arrayOfByte1, paramZz2j.ZM(), this.ZL, this.Za.ZFa().ZM(), this.Zb, this.ZD);
    zbx3.Zl();
    byte[] arrayOfByte2 = zbx3.Zz();
    try {
      if (arrayOfByte2 != arrayOfByte1)
        try {
          if (!Arrays.equals(arrayOfByte2, arrayOfByte1))
            paramZz2j.ZQ(arrayOfByte2); 
        } catch (Zz87 zz87) {
          throw a(null);
        }  
    } catch (Zz87 zz87) {
      throw a(null);
    } 
    paramZz2j.Zl(zbx3.ZP());
    Zmzk zmzk2 = zbx3.Z_();
    try {
      if (!zmzk1.equals(zmzk2))
        paramZz2j.ZF(zmzk2); 
    } catch (Zz87 zz87) {
      throw a(null);
    } 
  }
  
  private static Zz87 a(Zz87 paramZz87) {
    return paramZz87;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */