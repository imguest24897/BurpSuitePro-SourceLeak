package net.portswigger;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executors;

public class Zli {
  public static final byte[] Zj = new byte[0];
  
  private static final Zz4 ZB = new Zz4(Executors.newCachedThreadPool());
  
  private static int[] Zy;
  
  public static boolean ZQ(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int[] arrayOfInt = ZX();
    if (paramArrayOfbyte1 == null || paramArrayOfbyte2 == null)
      return false; 
    if (paramArrayOfbyte1.length != paramArrayOfbyte2.length)
      return false; 
    byte b = 0;
    while (b < paramArrayOfbyte1.length) {
      if (paramArrayOfbyte1[b] != paramArrayOfbyte2[b])
        return false; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public static boolean ZI(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4) {
    int[] arrayOfInt = ZX();
    if (paramInt2 - paramInt1 != paramInt4 - paramInt3)
      return false; 
    while (paramInt1 < paramInt2) {
      if (paramArrayOfbyte1[paramInt1] != paramArrayOfbyte2[paramInt3])
        return false; 
      paramInt1++;
      paramInt3++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public static int Zz(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return (paramArrayOfbyte == null) ? -1 : Zr(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramBoolean, 0);
  }
  
  public static int Zr(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    int[] arrayOfInt = ZX();
    if (paramArrayOfbyte == null)
      return -1; 
    byte b = 0;
    while (b < paramInt2) {
      byte b1 = paramArrayOfbyte[paramInt1 + b];
      paramInt3 = 31 * paramInt3 + (paramBoolean ? b1 : Zn(b1));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return paramInt3;
  }
  
  public static int Zf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean) {
    int[] arrayOfInt = ZX();
    if (paramArrayOfbyte1 == null && paramArrayOfbyte2 == null)
      return 0; 
    if (paramArrayOfbyte1 == null)
      return 1; 
    if (paramArrayOfbyte2 == null)
      return -1; 
    int i = Math.min(paramArrayOfbyte1.length, paramArrayOfbyte2.length);
    byte b = 0;
    while (b < i) {
      byte b1 = paramArrayOfbyte1[b];
      byte b2 = paramArrayOfbyte2[b];
      if (!paramBoolean) {
        b1 = Zn(b1);
        b2 = Zn(b2);
      } 
      if (b1 < b2)
        return -1; 
      if (b1 > b2)
        return 1; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return Integer.compare(paramArrayOfbyte1.length, paramArrayOfbyte2.length);
  }
  
  public static int ZR(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return (paramArrayOfbyte1 == null) ? -1 : ZZ(paramArrayOfbyte1, paramArrayOfbyte2, true, 0, paramArrayOfbyte1.length);
  }
  
  public static int ZL(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean) {
    return (paramArrayOfbyte1 == null) ? -1 : ZZ(paramArrayOfbyte1, paramArrayOfbyte2, paramBoolean, 0, paramArrayOfbyte1.length);
  }
  
  public static int ZG(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt) {
    return (paramArrayOfbyte1 == null) ? -1 : ZZ(paramArrayOfbyte1, paramArrayOfbyte2, paramBoolean, paramInt, paramArrayOfbyte1.length);
  }
  
  public static int Zw(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    return ZZ(paramArrayOfbyte1, paramArrayOfbyte2, true, paramInt1, paramInt2);
  }
  
  public static int ZZ(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt1, int paramInt2) {
    return ZB.ZA(paramArrayOfbyte2, paramBoolean).Zh(new Zt6(paramArrayOfbyte1), paramInt1, paramInt2);
  }
  
  public static int Zt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZX : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: ifnull -> 13
    //   9: aload_1
    //   10: ifnonnull -> 15
    //   13: iconst_m1
    //   14: ireturn
    //   15: aload_1
    //   16: arraylength
    //   17: istore #5
    //   19: iload #5
    //   21: ifne -> 26
    //   24: iload_2
    //   25: ireturn
    //   26: iload_3
    //   27: aload_0
    //   28: arraylength
    //   29: invokestatic min : (II)I
    //   32: istore #6
    //   34: iload #6
    //   36: iload #5
    //   38: isub
    //   39: istore #7
    //   41: aload_1
    //   42: iconst_0
    //   43: baload
    //   44: istore #8
    //   46: iload_2
    //   47: iload #7
    //   49: if_icmpgt -> 68
    //   52: aload_0
    //   53: iload_2
    //   54: baload
    //   55: iload #8
    //   57: if_icmpeq -> 68
    //   60: iinc #2, 1
    //   63: aload #4
    //   65: ifnonnull -> 46
    //   68: iload_2
    //   69: iload #7
    //   71: if_icmple -> 76
    //   74: iconst_m1
    //   75: ireturn
    //   76: iload_2
    //   77: iconst_1
    //   78: iadd
    //   79: istore #9
    //   81: iconst_1
    //   82: istore #10
    //   84: iload #10
    //   86: iload #5
    //   88: if_icmpge -> 134
    //   91: aload_0
    //   92: iload #9
    //   94: iinc #9, 1
    //   97: baload
    //   98: aload_1
    //   99: iload #10
    //   101: iinc #10, 1
    //   104: baload
    //   105: if_icmpeq -> 84
    //   108: aload_0
    //   109: iload #9
    //   111: iconst_1
    //   112: isub
    //   113: baload
    //   114: aload_1
    //   115: iload #10
    //   117: iconst_1
    //   118: isub
    //   119: baload
    //   120: invokestatic Zt : (BB)Z
    //   123: ifne -> 84
    //   126: iinc #2, 1
    //   129: aload #4
    //   131: ifnonnull -> 46
    //   134: iload_2
    //   135: ireturn
  }
  
  private static boolean Zt(byte paramByte1, byte paramByte2) {
    return ((paramByte1 == 32 || paramByte1 == 9 || paramByte1 == 13 || paramByte1 == 10) && (paramByte2 == 32 || paramByte2 == 9 || paramByte2 == 13 || paramByte2 == 10));
  }
  
  public static int Zg(byte[] paramArrayOfbyte, byte paramByte, boolean paramBoolean, int paramInt1, int paramInt2) {
    int[] arrayOfInt = ZX();
    if (paramArrayOfbyte == null)
      return -1; 
    if (!paramBoolean)
      paramByte = Zmw.ZB(paramByte); 
    int i = Math.min(paramInt2, paramArrayOfbyte.length);
    int j = paramInt1;
    while (j < i) {
      byte b = paramBoolean ? paramArrayOfbyte[j] : Zn(paramArrayOfbyte[j]);
      if (b == paramByte)
        return j; 
      j++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  public static int ZU(byte[] paramArrayOfbyte, byte paramByte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      return -1; 
    int i = Math.min(paramInt2, paramArrayOfbyte.length);
    while (paramInt1 < i) {
      if (paramByte == paramArrayOfbyte[paramInt1++])
        return paramInt1 - 1; 
    } 
    return -1;
  }
  
  public static int ZD(byte[] paramArrayOfbyte, byte paramByte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      return -1; 
    paramInt2 = Math.min(paramInt2, paramArrayOfbyte.length);
    while (--paramInt2 >= paramInt1) {
      if (paramByte == paramArrayOfbyte[paramInt2])
        return paramInt2; 
    } 
    return -1;
  }
  
  public static int ZV(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    int[] arrayOfInt = ZX();
    if (paramArrayOfbyte1 == null || paramArrayOfbyte2 == null)
      return -1; 
    int i = paramArrayOfbyte2.length;
    if (i == 0)
      return paramInt2; 
    int j = Math.min(paramInt2, paramArrayOfbyte1.length);
    int k = j - i;
    byte b = paramArrayOfbyte2[0];
    while (true) {
      if (k < paramInt1)
        return -1; 
      while (k > paramInt1 && paramArrayOfbyte1[k] != b) {
        k--;
        if (arrayOfInt == null)
          break; 
      } 
      int m = k;
      byte b1 = 0;
      while (b1 < i) {
        if (paramArrayOfbyte1[m++] != paramArrayOfbyte2[b1++]) {
          k--;
          if (arrayOfInt == null)
            break; 
        } 
      } 
      break;
    } 
    return k;
  }
  
  public static int Zt(byte[] paramArrayOfbyte) {
    byte b = 0;
    int[] arrayOfInt = ZX();
    while (b < paramArrayOfbyte.length - 1) {
      if (paramArrayOfbyte[b] == 13 && paramArrayOfbyte[b + 1] == 10)
        return b; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  public static boolean ZC(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt) {
    int[] arrayOfInt = ZX();
    if (paramArrayOfbyte1 == null || paramArrayOfbyte2 == null || paramArrayOfbyte2.length > paramArrayOfbyte1.length - paramInt)
      return false; 
    byte b = 0;
    while (b < paramArrayOfbyte2.length) {
      byte b1 = paramBoolean ? paramArrayOfbyte1[b + paramInt] : Zn(paramArrayOfbyte1[b + paramInt]);
      if (b1 != paramArrayOfbyte2[b])
        return false; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public static boolean ZB(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    int i = paramArrayOfbyte2.length;
    byte b = 0;
    while (b < i) {
      if (paramArrayOfbyte1[paramInt++] != paramArrayOfbyte2[b++])
        return false; 
    } 
    return true;
  }
  
  public static byte Zn(byte paramByte) {
    if (paramByte < 91 && paramByte > 64)
      paramByte = (byte)(paramByte + 32); 
    return paramByte;
  }
  
  public static boolean Z_(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = paramArrayOfbyte;
    int[] arrayOfInt = ZX();
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      if ((b1 < 32 && b1 != 10 && b1 != 13 && b1 != 9) || b1 >= Byte.MAX_VALUE)
        return false; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public static byte[] Zq(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    if (paramArrayOfbyte1 != null)
      byteArrayOutputStream.write(paramArrayOfbyte1, 0, paramArrayOfbyte1.length); 
    if (paramArrayOfbyte2 != null)
      byteArrayOutputStream.write(paramArrayOfbyte2, 0, paramArrayOfbyte2.length); 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static void Zq(int[] paramArrayOfint) {
    Zy = paramArrayOfint;
  }
  
  public static int[] ZX() {
    return Zy;
  }
  
  static {
    Zq(new int[4]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zli.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */