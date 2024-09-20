package burp;

import net.portswigger.Zkb;

public class Zlki {
  public static byte[] Zy(byte[] paramArrayOfbyte) {
    return ZO(paramArrayOfbyte, new char[] { '\\', 'u', '0', '0' });
  }
  
  public static String Zf(String paramString) {
    return Zkb.ZG(Zy(Zkb.Zy(paramString)));
  }
  
  public static byte[] Zu(byte[] paramArrayOfbyte) {
    return ZO(paramArrayOfbyte, new char[] { '\\', 'x' });
  }
  
  public static String Zn(String paramString) {
    return Zkb.ZG(Zu(Zkb.Zy(paramString)));
  }
  
  public static byte[] ZY(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZV : ()Z
    //   11: aload_0
    //   12: astore_3
    //   13: istore_1
    //   14: aload_3
    //   15: arraylength
    //   16: istore #4
    //   18: iconst_0
    //   19: istore #5
    //   21: iload #5
    //   23: iload #4
    //   25: if_icmpge -> 71
    //   28: aload_3
    //   29: iload #5
    //   31: baload
    //   32: istore #6
    //   34: iload #6
    //   36: invokestatic ZR : (B)Z
    //   39: ifeq -> 52
    //   42: aload_2
    //   43: iload #6
    //   45: invokevirtual write : (I)V
    //   48: iload_1
    //   49: ifne -> 64
    //   52: aload_2
    //   53: bipush #92
    //   55: invokevirtual write : (I)V
    //   58: aload_2
    //   59: iload #6
    //   61: invokevirtual write : (I)V
    //   64: iinc #5, 1
    //   67: iload_1
    //   68: ifne -> 21
    //   71: aload_2
    //   72: invokevirtual toByteArray : ()[B
    //   75: areturn
  }
  
  public static String ZG(String paramString) {
    return Zkb.ZG(ZY(Zkb.Zy(paramString)));
  }
  
  private static byte[] ZO(byte[] paramArrayOfbyte, char... paramVarArgs) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZV : ()Z
    //   11: aload_0
    //   12: astore #4
    //   14: aload #4
    //   16: arraylength
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: istore_2
    //   23: iload #6
    //   25: iload #5
    //   27: if_icmpge -> 106
    //   30: aload #4
    //   32: iload #6
    //   34: baload
    //   35: istore #7
    //   37: iload #7
    //   39: invokestatic ZR : (B)Z
    //   42: ifeq -> 55
    //   45: aload_3
    //   46: iload #7
    //   48: invokevirtual write : (I)V
    //   51: iload_2
    //   52: ifne -> 99
    //   55: aload_1
    //   56: astore #8
    //   58: aload #8
    //   60: arraylength
    //   61: istore #9
    //   63: iconst_0
    //   64: istore #10
    //   66: iload #10
    //   68: iload #9
    //   70: if_icmpge -> 93
    //   73: aload #8
    //   75: iload #10
    //   77: caload
    //   78: istore #11
    //   80: aload_3
    //   81: iload #11
    //   83: invokevirtual write : (I)V
    //   86: iinc #10, 1
    //   89: iload_2
    //   90: ifne -> 66
    //   93: aload_3
    //   94: iload #7
    //   96: invokestatic Ze : (Ljava/io/ByteArrayOutputStream;B)V
    //   99: iinc #6, 1
    //   102: iload_2
    //   103: ifne -> 23
    //   106: aload_3
    //   107: invokevirtual toByteArray : ()[B
    //   110: areturn
  }
  
  private static boolean ZR(byte paramByte) {
    return ((paramByte >= 48 && paramByte <= 57) || (paramByte >= 65 && paramByte <= 90) || (paramByte >= 97 && paramByte <= 122));
  }
  
  public static String Zx(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    Zmcs zmcs = new Zmcs();
    boolean bool = Ztbx.ZV();
    Zzih zzih = new Zzih(new Zlbm(paramString), new Zrcn());
    while (zzih.ZD < zzih.Zp) {
      stringBuilder.append(zmcs.Zx(zzih));
      zzih.ZD++;
      if (!bool)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlki.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */