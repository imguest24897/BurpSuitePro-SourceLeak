package burp;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import net.portswigger.Zdo;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public final class Zrq1 {
  private static final List<String> Zj;
  
  public static Zs66 ZB(Zefx paramZefx, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    for (Zlou zlou : paramZefx.Zc()) {
      if (paramInt1 >= zlou.ZP && paramInt2 <= zlou.ZK) {
        switch (Zs6w.ZQ[zlou.Zx.ordinal()]) {
          case 1:
          
          case 2:
          
          case 3:
          
          case 4:
          
        } 
        Zuh.ZT(false, Zqf.Zk, zlou.Zx.toString());
        return Zd(paramZefx, paramInt1, paramInt2);
      } 
      if (paramInt1 >= zlou.ZE && paramInt2 <= zlou.ZV)
        return (zlou.Zx == Zrdu.XML_PARAM && ZI(paramZefx.ZD(), zlou.ZE, paramInt1)) ? Zs66.MANUAL_INSERTION_POINT : Zs66.Zm(zlou.Zx); 
      if (arrayOfZbqc != null)
        break; 
    } 
    return Zd(paramZefx, paramInt1, paramInt2);
  }
  
  private static boolean ZI(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: invokestatic Zi : ()[Lburp/Zbqc;
    //   6: iload_1
    //   7: istore #5
    //   9: astore_3
    //   10: iload #5
    //   12: iload_2
    //   13: getstatic net/portswigger/Ztu.Zh : [B
    //   16: arraylength
    //   17: isub
    //   18: if_icmpgt -> 94
    //   21: iload #4
    //   23: ifeq -> 53
    //   26: aload_0
    //   27: iload #5
    //   29: invokestatic ZP : ([BI)Z
    //   32: ifeq -> 87
    //   35: iload #5
    //   37: getstatic net/portswigger/Ztu.Zh : [B
    //   40: arraylength
    //   41: iconst_1
    //   42: isub
    //   43: iadd
    //   44: istore #5
    //   46: iconst_0
    //   47: istore #4
    //   49: aload_3
    //   50: ifnull -> 87
    //   53: iload #5
    //   55: getstatic net/portswigger/Ztu.Z_ : [B
    //   58: arraylength
    //   59: iadd
    //   60: iload_2
    //   61: if_icmpgt -> 87
    //   64: aload_0
    //   65: iload #5
    //   67: invokestatic ZJ : ([BI)Z
    //   70: ifeq -> 87
    //   73: iload #5
    //   75: getstatic net/portswigger/Ztu.Z_ : [B
    //   78: arraylength
    //   79: iconst_1
    //   80: isub
    //   81: iadd
    //   82: istore #5
    //   84: iconst_1
    //   85: istore #4
    //   87: iinc #5, 1
    //   90: aload_3
    //   91: ifnull -> 10
    //   94: iload #4
    //   96: ireturn
  }
  
  private static Zs66 Zd(Zefx paramZefx, int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zruf.Zg(paramZefx.ZD());
    return (paramInt1 >= arrayOfInt[0] && paramInt2 <= arrayOfInt[1]) ? Zs66.URL_PARAM : ((paramInt2 <= paramZefx.ZR()) ? Zs66.HEADER : Zs66.MANUAL_INSERTION_POINT);
  }
  
  public static byte[] ZD(byte[] paramArrayOfbyte, List<int[]> paramList) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfbyte.length);
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfbyte.length;
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    while (b1 < i) {
      while (b1 < i && paramArrayOfbyte[b1] != -89) {
        b1++;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (b1 >= i)
        break; 
      byteArrayOutputStream.write(paramArrayOfbyte, b2, b1 - b2);
      int j = byteArrayOutputStream.size();
      b2 = ++b1;
      while (b1 < i && paramArrayOfbyte[b1] != -89) {
        b1++;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (b1 >= i)
        break; 
      byteArrayOutputStream.write(paramArrayOfbyte, b2, b1 - b2);
      int k = byteArrayOutputStream.size();
      b2 = ++b1;
      paramList.add(new int[] { j, k });
      if (arrayOfZbqc != null)
        break; 
    } 
    byteArrayOutputStream.write(paramArrayOfbyte, b2, paramArrayOfbyte.length - b2);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static void ZB(Zefg<Zrrc> paramZefg, List<String> paramList, byte[] paramArrayOfbyte, Zr_4 paramZr_4) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    if (paramList == null)
      return; 
    for (String str : Zj) {
      byte b = 0;
      while (b < paramList.size()) {
        if (((String)paramList.get(b)).toLowerCase(Locale.ENGLISH).startsWith(str)) {
          ZQ(Zkb.Zy(paramList.remove(b)), paramArrayOfbyte, paramZefg, paramZr_4);
          paramArrayOfbyte = Zljl.Zw(paramList, paramArrayOfbyte, Zl(paramArrayOfbyte));
          b--;
        } 
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private static void ZQ(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zefg<Zrrc> paramZefg, Zr_4 paramZr_4) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    if (paramZefg == null)
      return; 
    int i = Zli.ZL(paramArrayOfbyte2, paramArrayOfbyte1, false);
    if (i == -1) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    byte b = 0;
    while (b < paramZefg.size()) {
      Zrrc zrrc = paramZefg.get(b);
      if (!ZG(zrrc, i)) {
        int j = ZJ(zrrc.startOffset(), paramArrayOfbyte1, i);
        int k = ZJ(zrrc.endOffset(), paramArrayOfbyte1, i);
        paramZefg.set(b, paramZr_4.<Zrrc>ZH(new Zl1r(j, k)));
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private static int Zl(byte[] paramArrayOfbyte) {
    int i = Zsbj.Za(paramArrayOfbyte);
    if (i < 0)
      i = paramArrayOfbyte.length; 
    return i;
  }
  
  private static boolean ZG(Zrrc paramZrrc, int paramInt) {
    return (paramZrrc.startOffset() < paramInt && paramZrrc.endOffset() < paramInt);
  }
  
  private static int ZJ(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    return ZQ(paramInt1, paramArrayOfbyte, paramInt2) ? paramInt2 : (ZV(paramInt1, paramArrayOfbyte, paramInt2) ? ZW(paramInt1, paramArrayOfbyte) : paramInt1);
  }
  
  private static boolean ZQ(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    return (paramInt1 >= paramInt2 && paramInt1 <= paramInt2 + paramArrayOfbyte.length);
  }
  
  private static boolean ZV(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    return (paramInt1 > paramInt2 + paramArrayOfbyte.length);
  }
  
  private static int ZW(int paramInt, byte[] paramArrayOfbyte) {
    return paramInt - paramArrayOfbyte.length - Zdo.Zn.length;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'w8s,&Er\tI  w8p,,I9xpYnI1rp'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #14
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #79
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: goto -> 215
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 188
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #16
    //   142: goto -> 172
    //   145: bipush #94
    //   147: goto -> 172
    //   150: bipush #90
    //   152: goto -> 172
    //   155: bipush #114
    //   157: goto -> 172
    //   160: bipush #12
    //   162: goto -> 172
    //   165: bipush #7
    //   167: goto -> 172
    //   170: bipush #111
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 93
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 89
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 39
    //   215: iconst_2
    //   216: anewarray java/lang/String
    //   219: dup
    //   220: iconst_0
    //   221: aload_0
    //   222: iconst_1
    //   223: aaload
    //   224: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   227: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   230: aastore
    //   231: dup
    //   232: iconst_1
    //   233: aload_0
    //   234: iconst_0
    //   235: aaload
    //   236: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   239: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   242: aastore
    //   243: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   246: putstatic burp/Zrq1.Zj : Ljava/util/List;
    //   249: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrq1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */