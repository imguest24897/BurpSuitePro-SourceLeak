package burp;

import net.portswigger.Zli;
import net.portswigger.Zmw;

public class Zlt_ {
  private static int Z_;
  
  public static boolean ZH(Zstu paramZstu1, Zstu paramZstu2) {
    int i = ZN();
    if (paramZstu1 == null || paramZstu2 == null)
      return false; 
    int j = paramZstu1.Zpu();
    if (j != paramZstu2.Zpu())
      return false; 
    byte b = 0;
    while (b < j) {
      if (paramZstu1.Zp(b) != paramZstu2.Zp(b))
        return false; 
      b++;
      if (i != 0)
        break; 
    } 
    return true;
  }
  
  public static boolean ZC(Zstu paramZstu1, int paramInt1, int paramInt2, Zstu paramZstu2, int paramInt3, int paramInt4) {
    int i = Zi();
    if (paramInt2 - paramInt1 != paramInt4 - paramInt3)
      return false; 
    while (paramInt1 < paramInt2) {
      if (paramZstu1.Zp(paramInt1) != paramZstu2.Zp(paramInt3))
        return false; 
      paramInt1++;
      paramInt3++;
      if (i == 0)
        break; 
    } 
    return true;
  }
  
  public static int[] Zz(Zstu paramZstu1, int paramInt1, int paramInt2, Zstu paramZstu2, int paramInt3, int paramInt4) {
    int i = ZN();
    while (paramInt1 < paramInt2 && paramInt3 < paramInt4) {
      if (paramZstu1.Zp(paramInt1) != paramZstu2.Zp(paramInt3))
        return new int[] { paramInt1, paramInt3 }; 
      paramInt1++;
      paramInt3++;
      if (i != 0)
        break; 
    } 
    return (paramInt1 != paramInt2 || paramInt3 != paramInt4) ? new int[] { paramInt1, paramInt3 } : null;
  }
  
  public static int ZR(Zstu paramZstu1, Zstu paramZstu2, boolean paramBoolean) {
    int i = Zi();
    if (paramZstu1 == null && paramZstu2 == null)
      return 0; 
    if (paramZstu1 == null)
      return 1; 
    if (paramZstu2 == null)
      return -1; 
    int j = Math.min(paramZstu1.Zpu(), paramZstu2.Zpu());
    byte b = 0;
    while (b < j) {
      byte b1 = paramZstu1.Zp(b);
      byte b2 = paramZstu2.Zp(b);
      if (!paramBoolean) {
        b1 = Zli.Zn(b1);
        b2 = Zli.Zn(b2);
      } 
      if (b1 < b2)
        return -1; 
      if (b1 > b2)
        return 1; 
      b++;
      if (i == 0)
        break; 
    } 
    return Integer.compare(paramZstu1.Zpu(), paramZstu2.Zpu());
  }
  
  public static int Zr(Zstu paramZstu, byte[] paramArrayOfbyte) {
    return (paramZstu == null) ? -1 : Zd(paramZstu, paramArrayOfbyte, true, 0, paramZstu.Zpu());
  }
  
  public static int Zf(Zstu paramZstu, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return (paramZstu == null) ? -1 : Zd(paramZstu, paramArrayOfbyte, paramBoolean, 0, paramZstu.Zpu());
  }
  
  public static int Zr(Zstu paramZstu, byte[] paramArrayOfbyte, boolean paramBoolean, int paramInt) {
    return (paramZstu == null) ? -1 : Zd(paramZstu, paramArrayOfbyte, paramBoolean, paramInt, paramZstu.Zpu());
  }
  
  public static int Zj(Zstu paramZstu, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Zd(paramZstu, paramArrayOfbyte, true, paramInt1, paramInt2);
  }
  
  public static int Zd(Zstu paramZstu, byte[] paramArrayOfbyte, boolean paramBoolean, int paramInt1, int paramInt2) {
    int i = Zi();
    if (Zbqc.Zwu() == null)
      ZO(++i); 
    return Zzrd.ZJ(paramArrayOfbyte, !paramBoolean, false).Zi(paramZstu, paramInt1, paramInt2).ZR();
  }
  
  public static int Zq(Zstu paramZstu, byte paramByte, boolean paramBoolean, int paramInt1, int paramInt2) {
    int i = Zi();
    if (paramZstu == null)
      return -1; 
    if (!paramBoolean)
      paramByte = Zmw.ZB(paramByte); 
    int j = Math.min(paramInt2, paramZstu.Zpu());
    int k = paramInt1;
    while (k < j) {
      byte b = paramBoolean ? paramZstu.Zp(k) : Zli.Zn(paramZstu.Zp(k));
      if (b == paramByte)
        return k; 
      k++;
      if (i == 0)
        break; 
    } 
    return -1;
  }
  
  public static int ZT(Zstu paramZstu, byte paramByte, int paramInt1, int paramInt2) {
    if (paramZstu == null)
      return -1; 
    int i = Math.min(paramInt2, paramZstu.Zpu());
    while (paramInt1 < i) {
      if (paramByte == paramZstu.Zp(paramInt1++))
        return paramInt1 - 1; 
    } 
    return -1;
  }
  
  public static int Zc(Zstu paramZstu, byte paramByte, int paramInt1, int paramInt2) {
    if (paramZstu == null)
      return -1; 
    paramInt2 = Math.min(paramInt2, paramZstu.Zpu());
    while (--paramInt2 >= paramInt1) {
      if (paramByte == paramZstu.Zp(paramInt2))
        return paramInt2; 
    } 
    return -1;
  }
  
  public static int ZN(Zstu paramZstu, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = ZN();
    if (paramZstu == null || paramArrayOfbyte == null)
      return -1; 
    int j = paramArrayOfbyte.length;
    if (j == 0)
      return paramInt2; 
    int k = Math.min(paramInt2, paramZstu.Zpu());
    int m = k - j;
    byte b = paramArrayOfbyte[0];
    while (true) {
      if (m < paramInt1)
        return -1; 
      while (m > paramInt1 && paramZstu.Zp(m) != b) {
        m--;
        if (i != 0)
          break; 
      } 
      int n = m;
      byte b1 = 0;
      while (b1 < j) {
        if (paramZstu.Zp(n++) != paramArrayOfbyte[b1++]) {
          m--;
          if (i != 0)
            break; 
        } 
      } 
      break;
    } 
    return m;
  }
  
  public static int Zn(Zstu paramZstu) {
    byte[] arrayOfByte = paramZstu.ZiD();
    byte b = 0;
    int i = Zi();
    while (b < arrayOfByte.length - 1) {
      if (arrayOfByte[b] == 13 && arrayOfByte[b + 1] == 10)
        return b; 
      b++;
      if (i == 0) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    return -1;
  }
  
  public static boolean ZL(Zstu paramZstu, byte[] paramArrayOfbyte, boolean paramBoolean, int paramInt) {
    if (paramZstu == null || paramArrayOfbyte == null || paramArrayOfbyte.length > paramZstu.Zpu() - paramInt)
      return false; 
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      byte b1 = paramBoolean ? paramZstu.Zp(b + paramInt) : Zli.Zn(paramZstu.Zp(b + paramInt));
      if (b1 != paramArrayOfbyte[b])
        return false; 
    } 
    return true;
  }
  
  public static boolean ZT(Zstu paramZstu, byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte.length;
    byte b = 0;
    while (b < i) {
      if (paramZstu.Zp(paramInt++) != paramArrayOfbyte[b++])
        return false; 
    } 
    return true;
  }
  
  public static int Zz(Zstu paramZstu, int paramInt1, int paramInt2) {
    int i = Zi();
    int j = paramInt1;
    while (j < paramInt2) {
      if (paramZstu.Zp(j) > 32)
        return j; 
      j++;
      if (i == 0)
        break; 
    } 
    return paramInt2;
  }
  
  public static Zstu ZF(byte[] paramArrayOfbyte, Zr_4 paramZr_4) {
    Zstu zstu = paramZr_4.<Zstu>Zv(Zstu.Zc, paramArrayOfbyte.length);
    zstu.Zt(paramArrayOfbyte);
    return zstu;
  }
  
  public static Zstu Zv(String paramString) {
    return (paramString == null) ? null : ZB(paramString, Zyf.Zy(new byte[paramString.length()]), 0);
  }
  
  public static Zstu ZB(String paramString, Zstu paramZstu, int paramInt) {
    int i = Zi();
    if (paramString == null)
      return null; 
    int j = paramString.length();
    byte b = 0;
    while (b < j) {
      paramZstu.Zs(paramInt + b, (byte)paramString.charAt(b));
      b++;
      if (i == 0)
        break; 
    } 
    return paramZstu;
  }
  
  public static void ZO(int paramInt) {
    Z_ = paramInt;
  }
  
  public static int Zi() {
    return Z_;
  }
  
  public static int ZN() {
    int i = Zi();
    return (i == 0) ? 109 : 0;
  }
  
  static {
    if (ZN() != 0)
      ZO(86); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlt_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */