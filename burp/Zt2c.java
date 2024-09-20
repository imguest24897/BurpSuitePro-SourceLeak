package burp;

import net.portswigger.Zkb;

public class Zt2c {
  private static final byte[] Zd = new byte[] { 
      47, 63, 61, 36, 38, 45, 95, 58, 46, 126, 
      43, 37 };
  
  private static final byte[] Zj = new byte[] { 58, 45, 95, 126, 36, 43, 37 };
  
  private final Zx5v Zt;
  
  private final Zbnt Zn;
  
  private static boolean Zu;
  
  public Zt2c(Zx5v paramZx5v, Zbnt paramZbnt) {
    this.Zt = paramZx5v;
    this.Zn = paramZbnt;
  }
  
  public void ZI(Zlit paramZlit, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Zm4 paramZm4) {
    boolean bool = ZG();
    int i = paramInt1;
    while (i < paramInt2) {
      if (Zu(paramZlit, paramArrayOfbyte, paramInt1, i)) {
        Zsq8 zsq8 = ZE(paramZlit, paramArrayOfbyte, Zh(paramArrayOfbyte, paramInt1, i), Zw(paramArrayOfbyte, i + 1));
        if (zsq8 != null) {
          paramZm4.Zt(zsq8);
          i = zsq8.Zv;
        } 
      } 
      i++;
      if (!bool)
        break; 
    } 
  }
  
  private boolean Zu(Zlit paramZlit, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (paramInt2 >= paramArrayOfbyte.length) ? false : ((paramArrayOfbyte[paramInt2] == 47 && Zk(paramArrayOfbyte, paramInt1, paramInt2) && Zv(paramArrayOfbyte, paramInt2)) ? ZN(paramZlit, paramArrayOfbyte, paramInt1, paramInt2) : false);
  }
  
  private boolean Zk(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    boolean bool = ZG();
    if (paramInt2 == paramInt1)
      return true; 
    if (Zf(paramArrayOfbyte, paramInt1, paramInt2) || Zj(paramArrayOfbyte, paramInt1, paramInt2))
      return true; 
    while (--paramInt2 >= paramInt1) {
      if (Zx(paramArrayOfbyte, paramInt2))
        return true; 
      if (!Zt(paramArrayOfbyte, paramInt2))
        return false; 
      paramInt2--;
      if (!bool)
        break; 
    } 
    return true;
  }
  
  private boolean Zx(byte[] paramArrayOfbyte, int paramInt) {
    byte b = paramArrayOfbyte[paramInt];
    return (b == 32 || b == 10 || b == 34 || b == 39 || b == 91 || b == 40 || b == 123);
  }
  
  private boolean Zv(byte[] paramArrayOfbyte, int paramInt) {
    return (paramInt + 1 < paramArrayOfbyte.length && paramArrayOfbyte[paramInt + 1] == 47) ? false : ((Zw(paramArrayOfbyte, paramInt + 1) > paramInt + 1));
  }
  
  private boolean ZN(Zlit paramZlit, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = Zh(paramArrayOfbyte, paramInt1, paramInt2);
    int j = Zw(paramArrayOfbyte, paramInt2 + 1);
    return this.Zt.ZM(paramZlit, Zkb.Zo(paramArrayOfbyte, i, j - i), this.Zn);
  }
  
  private boolean Zf(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (paramInt2 > paramInt1) ? ((paramArrayOfbyte[paramInt2 - 1] == 46 && (paramInt2 - 1 == paramInt1 || Zx(paramArrayOfbyte, paramInt2 - 2)))) : false;
  }
  
  private boolean Zj(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (paramInt2 - 1 > paramInt1) ? ((paramArrayOfbyte[paramInt2 - 2] == 46 && paramArrayOfbyte[paramInt2 - 1] == 46 && (paramInt2 - 2 == paramInt1 || Zx(paramArrayOfbyte, paramInt2 - 3)))) : false;
  }
  
  private int Zh(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    boolean bool = ZK();
    if (Zj(paramArrayOfbyte, paramInt1, paramInt2))
      return paramInt2 - 2; 
    if (Zf(paramArrayOfbyte, paramInt1, paramInt2))
      return paramInt2 - 1; 
    while (--paramInt2 >= paramInt1) {
      if (Zx(paramArrayOfbyte, paramInt2) || !Zt(paramArrayOfbyte, paramInt2))
        return paramInt2 + 1; 
      paramInt2--;
      if (bool)
        break; 
    } 
    return paramInt2 + 1;
  }
  
  private int Zw(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = ZG();
    while (paramInt < paramArrayOfbyte.length && ZY(paramArrayOfbyte, paramInt)) {
      paramInt++;
      if (!bool)
        break; 
    } 
    return paramInt;
  }
  
  private boolean ZY(byte[] paramArrayOfbyte, int paramInt) {
    byte b = paramArrayOfbyte[paramInt];
    return (Character.isLetterOrDigit(b) || ZX(b, Zd));
  }
  
  private boolean Zt(byte[] paramArrayOfbyte, int paramInt) {
    byte b = paramArrayOfbyte[paramInt];
    return (Character.isLetterOrDigit(b) || ZX(b, Zj));
  }
  
  private boolean ZX(byte paramByte, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    boolean bool = ZG();
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      if (b1 == paramByte)
        return true; 
      b++;
      if (!bool)
        break; 
    } 
    return false;
  }
  
  private Zsq8 ZE(Zlit paramZlit, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    String str = Zkb.Zo(paramArrayOfbyte, paramInt1, paramInt2 - paramInt1);
    Zlit zlit = Zry3.ZL(str, paramZlit, this.Zn);
    return (zlit == null) ? null : new Zsq8((byte)2, zlit, Zry3.ZK(str), null, null, Zt1t.ZC(zlit.Zd_()), paramInt1, paramInt2);
  }
  
  static {
    ZS(false);
  }
  
  public static void ZS(boolean paramBoolean) {
    Zu = paramBoolean;
  }
  
  public static boolean ZK() {
    return Zu;
  }
  
  public static boolean ZG() {
    boolean bool = ZK();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */