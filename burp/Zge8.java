package burp;

import net.portswigger.Zfc;
import net.portswigger.Zs1;

public class Zge8 {
  public final String Zo;
  
  public final String ZE;
  
  public final String Zt;
  
  public final String ZT;
  
  public final long Zh;
  
  public final int Zd;
  
  public Zge8(String paramString1, String paramString2, long paramLong, String paramString3, String paramString4, int paramInt) {
    this.Zo = paramString1;
    this.ZE = paramString2;
    this.Zt = paramString3;
    this.ZT = paramString4;
    this.Zh = paramLong;
    this.Zd = paramInt;
  }
  
  public static Zge8 ZK(Zfc paramZfc, Zs1 paramZs1) {
    return new Zge8(paramZfc.Zu + "-" + paramZfc.Zu, paramZs1.ZX, paramZs1.ZH, paramZfc.ZI, paramZfc.Ze, 0);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zge8 zge8 = (Zge8)paramObject;
    return (this.Zh == zge8.Zh && this.Zo.equals(zge8.Zo) && this.ZE.equals(zge8.ZE) && this.Zt.equals(zge8.Zt) && this.ZT.equals(zge8.ZT) && this.Zd == zge8.Zd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zge8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */