package META-INF.versions.11.com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

class Zb {
  private static final VarHandle readLongLE = MethodHandles.byteArrayViewVarHandle(long[].class, ByteOrder.LITTLE_ENDIAN);
  
  private static final VarHandle readIntLE = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.LITTLE_ENDIAN);
  
  private static final VarHandle readIntBE = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.BIG_ENDIAN);
  
  private static final VarHandle readLongBE = MethodHandles.byteArrayViewVarHandle(long[].class, ByteOrder.BIG_ENDIAN);
  
  protected static boolean ZD(char paramChar) {
    return ((char)(paramChar - 48) < '\n');
  }
  
  public static boolean Zz(char[] paramArrayOfchar, int paramInt) {
    long l1 = paramArrayOfchar[paramInt] | paramArrayOfchar[paramInt + 1] << 16L | paramArrayOfchar[paramInt + 2] << 32L | paramArrayOfchar[paramInt + 3] << 48L;
    long l2 = paramArrayOfchar[paramInt + 4] | paramArrayOfchar[paramInt + 5] << 16L | paramArrayOfchar[paramInt + 6] << 32L | paramArrayOfchar[paramInt + 7] << 48L;
    return Zo(l1, l2);
  }
  
  public static boolean ZX(CharSequence paramCharSequence, int paramInt) {
    boolean bool = true;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (b < 8) {
      char c = paramCharSequence.charAt(b + paramInt);
      bool &= ZD(c);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return bool;
  }
  
  public static boolean Zo(long paramLong1, long paramLong2) {
    long l1 = paramLong1 - 13511005043687472L;
    long l2 = paramLong2 - 13511005043687472L;
    long l3 = paramLong1 + 19703549022044230L | l1;
    long l4 = paramLong2 + 19703549022044230L | l2;
    return (((l3 | l4) & 0xFF80FF80FF80FF80L) == 0L);
  }
  
  public static boolean ZL(CharSequence paramCharSequence, int paramInt) {
    int i = 1;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    byte b = 0;
    while (b < 8) {
      i &= ('0' == paramCharSequence.charAt(b + paramInt)) ? 1 : 0;
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return i;
  }
  
  public static boolean ZB(char[] paramArrayOfchar, int paramInt) {
    long l1 = paramArrayOfchar[paramInt] | paramArrayOfchar[paramInt + 1] << 16L | paramArrayOfchar[paramInt + 2] << 32L | paramArrayOfchar[paramInt + 3] << 48L;
    long l2 = paramArrayOfchar[paramInt + 4] | paramArrayOfchar[paramInt + 5] << 16L | paramArrayOfchar[paramInt + 6] << 32L | paramArrayOfchar[paramInt + 7] << 48L;
    return ZG(l1, l2);
  }
  
  public static boolean ZG(long paramLong1, long paramLong2) {
    return (paramLong1 == 13511005043687472L && paramLong2 == 13511005043687472L);
  }
  
  public static int Zl(byte[] paramArrayOfbyte, int paramInt) {
    return readIntBE.get(paramArrayOfbyte, paramInt);
  }
  
  public static int ZW(char[] paramArrayOfchar, int paramInt) {
    long l1 = paramArrayOfchar[paramInt] | paramArrayOfchar[paramInt + 1] << 16L | paramArrayOfchar[paramInt + 2] << 32L | paramArrayOfchar[paramInt + 3] << 48L;
    long l2 = paramArrayOfchar[paramInt + 4] | paramArrayOfchar[paramInt + 5] << 16L | paramArrayOfchar[paramInt + 6] << 32L | paramArrayOfchar[paramInt + 7] << 48L;
    return ZZ(l1, l2);
  }
  
  public static int Zw(CharSequence paramCharSequence, int paramInt) {
    long l1 = paramCharSequence.charAt(paramInt) | paramCharSequence.charAt(paramInt + 1) << 16L | paramCharSequence.charAt(paramInt + 2) << 32L | paramCharSequence.charAt(paramInt + 3) << 48L;
    long l2 = paramCharSequence.charAt(paramInt + 4) | paramCharSequence.charAt(paramInt + 5) << 16L | paramCharSequence.charAt(paramInt + 6) << 32L | paramCharSequence.charAt(paramInt + 7) << 48L;
    return ZZ(l1, l2);
  }
  
  public static int ZZ(long paramLong1, long paramLong2) {
    long l1 = paramLong1 - 13511005043687472L;
    long l2 = paramLong2 - 13511005043687472L;
    long l3 = paramLong1 + 19703549022044230L | l1;
    long l4 = paramLong2 + 19703549022044230L | l2;
    return (((l3 | l4) & 0xFF80FF80FF80FF80L) != 0L) ? -1 : ((int)(l2 * 281475406208040961L >>> 48L) + (int)(l1 * 281475406208040961L >>> 48L) * 10000);
  }
  
  public static long ZU(CharSequence paramCharSequence, int paramInt) {
    long l1 = paramCharSequence.charAt(paramInt) << 48L | paramCharSequence.charAt(paramInt + 1) << 32L | paramCharSequence.charAt(paramInt + 2) << 16L | paramCharSequence.charAt(paramInt + 3);
    long l2 = paramCharSequence.charAt(paramInt + 4) << 48L | paramCharSequence.charAt(paramInt + 5) << 32L | paramCharSequence.charAt(paramInt + 6) << 16L | paramCharSequence.charAt(paramInt + 7);
    return Zu(l1, l2);
  }
  
  public static long Zu(long paramLong1, long paramLong2) {
    if (((paramLong1 | paramLong2) & 0xFF80FF80FF80FF80L) != 0L)
      return -1L; 
    long l1 = paramLong1 * 65792L;
    long l2 = paramLong2 * 65792L;
    long l3 = l1 & 0xFFFF000000000000L | (l1 & 0xFFFF0000L) << 16L | (l2 & 0xFFFF000000000000L) >>> 32L | (l2 & 0xFFFF0000L) >>> 16L;
    return Zp(l3);
  }
  
  public static long Zp(long paramLong) {
    long l1 = paramLong + 5787213827046133840L;
    long l2 = 4195730024608447034L + (paramLong ^ 0x7F7F7F7F7F7F7F7FL);
    long l3 = paramLong | 0x2020202020202020L;
    long l4 = l3 + 2242545357980376863L;
    l4 &= 0x8080808080808080L;
    long l5 = 7451037802321897319L + (l3 ^ 0x7F7F7F7F7F7F7F7FL);
    if (((l1 & l2 ^ l4 & l5) & 0x8080808080808080L) != -9187201950435737472L)
      return -1L; 
    long l6 = (l4 >>> 7L) * 255L;
    long l7 = l3 - 3472328296227680304L;
    long l8 = l7 & (l6 ^ 0xFFFFFFFFFFFFFFFFL) | l7 - (0x2727272727272727L & l6);
    long l9 = l8 | l8 >>> 4L;
    long l10 = l9 & 0xFF00FF00FF00FFL;
    long l11 = l10 | l10 >>> 8L;
    return l11 >>> 16L & 0xFFFF0000L | l11 & 0xFFFFL;
  }
  
  public static int Zt(char[] paramArrayOfchar, int paramInt) {
    long l = paramArrayOfchar[paramInt] | paramArrayOfchar[paramInt + 1] << 16L | paramArrayOfchar[paramInt + 2] << 32L | paramArrayOfchar[paramInt + 3] << 48L;
    return Za(l);
  }
  
  public static int ZM(CharSequence paramCharSequence, int paramInt) {
    long l = paramCharSequence.charAt(paramInt) | paramCharSequence.charAt(paramInt + 1) << 16L | paramCharSequence.charAt(paramInt + 2) << 32L | paramCharSequence.charAt(paramInt + 3) << 48L;
    return Za(l);
  }
  
  public static int Za(long paramLong) {
    long l1 = paramLong - 13511005043687472L;
    long l2 = paramLong + 19703549022044230L | l1;
    return ((l2 & 0xFF80FF80FF80FF80L) != 0L) ? -1 : (int)(l1 * 281475406208040961L >>> 48L);
  }
  
  public static int Z_(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = 0;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    boolean bool = true;
    while (paramInt1 < paramInt2) {
      char c = paramArrayOfchar[paramInt1];
      bool &= ZD(c);
      i = 10 * i + c - 48;
      paramInt1++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return bool ? i : -1;
  }
  
  public static int Zb(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    int i = 0;
    boolean bool = true;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (paramInt1 < paramInt2) {
      char c = paramCharSequence.charAt(paramInt1);
      bool &= ZD(c);
      i = 10 * i + c - 48;
      paramInt1++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return bool ? i : -1;
  }
  
  public static void Zd(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    readIntBE.set(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public static double Ze(double paramDouble1, double paramDouble2, double paramDouble3) {
    return Math.fma(paramDouble1, paramDouble2, paramDouble3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\11\com\fasterxml\Zz\Zb.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */