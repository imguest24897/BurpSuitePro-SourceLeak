package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl8v {
  private static final String a;
  
  public static boolean ZJ(Zrrc paramZrrc, Object paramObject) {
    if (paramZrrc.ZF(paramObject))
      return true; 
    if (!(paramObject instanceof Zrrc))
      return false; 
    Zrrc zrrc = (Zrrc)paramObject;
    return (paramZrrc.startOffset() == zrrc.startOffset() && paramZrrc.endOffset() == zrrc.endOffset());
  }
  
  public static int ZE(Zrrc paramZrrc) {
    null = paramZrrc.startOffset();
    return 31 * null + paramZrrc.endOffset();
  }
  
  public static void ZM(List<Zl1r> paramList, int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: ifnull -> 21
    //   8: iload_1
    //   9: ifeq -> 21
    //   12: aload_0
    //   13: invokeinterface isEmpty : ()Z
    //   18: ifeq -> 22
    //   21: return
    //   22: aload_0
    //   23: invokestatic Zs : (Ljava/util/List;)V
    //   26: iconst_0
    //   27: istore_3
    //   28: iload_3
    //   29: aload_0
    //   30: invokeinterface size : ()I
    //   35: if_icmpge -> 207
    //   38: aload_0
    //   39: iload_3
    //   40: invokeinterface get : (I)Ljava/lang/Object;
    //   45: checkcast burp/Zl1r
    //   48: astore #4
    //   50: aload #4
    //   52: ifnull -> 59
    //   55: iconst_1
    //   56: goto -> 60
    //   59: iconst_0
    //   60: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   63: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   66: aload #4
    //   68: ifnonnull -> 74
    //   71: goto -> 200
    //   74: aload #4
    //   76: invokevirtual ZG : ()I
    //   79: iload_1
    //   80: if_icmpgt -> 87
    //   83: iconst_1
    //   84: goto -> 88
    //   87: iconst_0
    //   88: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   91: iload_1
    //   92: i2l
    //   93: aload #4
    //   95: invokevirtual ZR : ()I
    //   98: i2l
    //   99: aload #4
    //   101: invokevirtual ZG : ()I
    //   104: i2l
    //   105: invokestatic Zi : (ZLnet/portswigger/Zqf;JJJ)V
    //   108: aload #4
    //   110: invokevirtual ZR : ()I
    //   113: aload #4
    //   115: invokevirtual ZG : ()I
    //   118: if_icmpne -> 137
    //   121: iinc #3, -1
    //   124: aload_0
    //   125: aload #4
    //   127: invokeinterface remove : (Ljava/lang/Object;)Z
    //   132: pop
    //   133: aload_2
    //   134: ifnonnull -> 200
    //   137: iload_3
    //   138: ifle -> 200
    //   141: aload_0
    //   142: iload_3
    //   143: iconst_1
    //   144: isub
    //   145: invokeinterface get : (I)Ljava/lang/Object;
    //   150: checkcast burp/Zl1r
    //   153: astore #5
    //   155: aload #4
    //   157: aload #5
    //   159: invokestatic ZQ : (Lburp/Zl1r;Lburp/Zl1r;)Z
    //   162: ifeq -> 200
    //   165: iinc #3, -1
    //   168: aload_0
    //   169: aload #5
    //   171: invokeinterface remove : (Ljava/lang/Object;)Z
    //   176: pop
    //   177: aload_0
    //   178: aload #4
    //   180: invokeinterface remove : (Ljava/lang/Object;)Z
    //   185: pop
    //   186: aload_0
    //   187: iload_3
    //   188: aload #4
    //   190: aload #5
    //   192: invokestatic Zs : (Lburp/Zl1r;Lburp/Zl1r;)Lburp/Zl1r;
    //   195: invokeinterface add : (ILjava/lang/Object;)V
    //   200: iinc #3, 1
    //   203: aload_2
    //   204: ifnonnull -> 28
    //   207: return
  }
  
  private static Zl1r Zs(Zl1r paramZl1r1, Zl1r paramZl1r2) {
    return new Zl1r(Math.min(paramZl1r1.ZR(), paramZl1r2.ZR()), Math.max(paramZl1r1.ZG(), paramZl1r2.ZG()));
  }
  
  private static boolean ZQ(Zl1r paramZl1r1, Zl1r paramZl1r2) {
    return ((paramZl1r1.ZR() < paramZl1r2.ZG() && paramZl1r1.ZG() > paramZl1r1.ZR()) || (paramZl1r1.ZR() <= paramZl1r2.ZR() && paramZl1r2.ZG() >= paramZl1r1.ZG()));
  }
  
  private static void Zs(List<Zl1r> paramList) {
    try {
      paramList.sort(Comparator.comparingInt(Zl1r::ZR));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public static void Zm(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, List<Zl1r> paramList, boolean paramBoolean) {
    Zx(Zkb.Zy(paramString), paramArrayOfbyte, paramInt1, paramInt2, paramList, paramBoolean);
  }
  
  public static void Zx(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, List<Zl1r> paramList, boolean paramBoolean) {
    int i = Zli.ZZ(paramArrayOfbyte2, paramArrayOfbyte1, paramBoolean, paramInt1, paramInt2);
    if (i != -1)
      paramList.add(new Zl1r(i, i + paramArrayOfbyte1.length)); 
  }
  
  public static void Za(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    ZQ(paramArrayOfbyte1, paramArrayOfbyte2, paramList, true);
  }
  
  public static void ZQ(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, List<Zl1r> paramList, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = Zl1r.Zr();
    int i = 0;
    while (i < paramArrayOfbyte2.length) {
      i = Zli.ZZ(paramArrayOfbyte2, paramArrayOfbyte1, paramBoolean, i, paramArrayOfbyte2.length);
      if (i < 0)
        return; 
      paramList.add(Zrlp.Zj(i, i + paramArrayOfbyte1.length));
      i += paramArrayOfbyte1.length;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public static List<Zl1r> ZJ(String paramString, byte[] paramArrayOfbyte, boolean paramBoolean) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    ZB(paramString, paramArrayOfbyte, arrayList, paramBoolean);
    return arrayList;
  }
  
  public static void ZB(String paramString, byte[] paramArrayOfbyte, List<Zl1r> paramList, boolean paramBoolean) {
    ZQ(Zkb.Zy(paramString), paramArrayOfbyte, paramList, paramBoolean);
  }
  
  public static void ZG(byte[] paramArrayOfbyte, int paramInt, List<Zl1r> paramList, String... paramVarArgs) {
    Zbqc[] arrayOfZbqc = Zl1r.Zr();
    Zuh.Zb((paramVarArgs.length > 0), Zqf.Zr);
    String[] arrayOfString = paramVarArgs;
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString[b];
      Zl1r zl1r = Zf(str, paramArrayOfbyte, paramInt, true);
      if (zl1r != null)
        paramList.add(zl1r); 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zl1r.ZN(new Zbqc[3]); 
  }
  
  public static void ZC(String paramString, byte[] paramArrayOfbyte, int paramInt, List<Zl1r> paramList) {
    Zl1r zl1r = Zu(paramString, paramArrayOfbyte, paramInt);
    if (zl1r != null)
      paramList.add(zl1r); 
  }
  
  public static Zl1r Zu(String paramString, byte[] paramArrayOfbyte, int paramInt) {
    return Zf(paramString, paramArrayOfbyte, paramInt, false);
  }
  
  public static Zl1r Zz(byte[] paramArrayOfbyte, int paramInt) {
    return new Zl1r(paramInt, paramArrayOfbyte.length);
  }
  
  public static Zl1r Zc(byte[] paramArrayOfbyte, short paramShort) {
    Zbqc[] arrayOfZbqc = Zl1r.Zr();
    int i = Zli.ZR(paramArrayOfbyte, Zkb.Zy(a));
    if (i < 0)
      i = paramArrayOfbyte.length; 
    byte[] arrayOfByte = Zkb.Zy(String.valueOf(paramShort));
    int j = -1;
    int k = i - 3;
    while (k > 0) {
      byte[] arrayOfByte1 = { paramArrayOfbyte[k], paramArrayOfbyte[k + 1], paramArrayOfbyte[k + 2] };
      if (Zli.Zf(arrayOfByte, arrayOfByte1, false) == 0)
        j = k; 
      k--;
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    Zuh.Zb((j > 0), Zqf.Zk);
    return new Zl1r(j, i);
  }
  
  private static Zl1r Zf(String paramString, byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    Zl1r zl1r = null;
    int i = Zli.ZL(paramArrayOfbyte, Zkb.Zy(paramString), false) + 1;
    if (i > 0) {
      int j = Zli.ZU(paramArrayOfbyte, (byte)10, i, paramInt);
      if (j > 0) {
        int k = paramBoolean ? (i + paramString.length()) : i;
        zl1r = Zrlp.Zj(k, j - 1);
      } 
    } 
    return zl1r;
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc '?t'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl8v.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #8
    //   82: goto -> 111
    //   85: bipush #68
    //   87: goto -> 111
    //   90: bipush #92
    //   92: goto -> 111
    //   95: bipush #93
    //   97: goto -> 111
    //   100: iconst_2
    //   101: goto -> 111
    //   104: bipush #27
    //   106: goto -> 111
    //   109: bipush #75
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */