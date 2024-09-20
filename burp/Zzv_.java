package burp;

import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;

public class Zzv_ implements Zxlu {
  private final Zxs7 Zh;
  
  private final Zmhe ZN;
  
  private final Ze3n ZV;
  
  private final Zms4 ZP;
  
  private byte[] Zx;
  
  private static final String a;
  
  public Zzv_(Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zms4 paramZms4) {
    this.Zh = paramZxs7;
    this.ZN = paramZmhe;
    this.ZV = paramZe3n;
    this.ZP = paramZms4;
  }
  
  public Zsqx<Zrdb> Zr() {
    String str = this.ZP.ZA();
    int[] arrayOfInt = this.ZP.ZH();
    if (str == null || arrayOfInt == null)
      return null; 
    byte[] arrayOfByte1 = Zkb.Zy(str);
    byte[] arrayOfByte2 = Zkb.Zy(String.valueOf(arrayOfInt[0] * arrayOfInt[1]));
    byte[] arrayOfByte3 = Zkb.Zy(str + str + a + arrayOfInt[0] + "*");
    Zlvf zlvf = this.ZN.ZK(Zri7.ZJ(new Zrrb(arrayOfByte3, (byte)0)), Zlp5.Zc().Zd(true));
    Zzud zzud = zlvf.ZM();
    byte[] arrayOfByte4 = Zk(zzud, arrayOfByte1, arrayOfByte2);
    if (arrayOfByte4 == null)
      return null; 
    Zvow zvow = this.ZV.Zt().Zp(zlvf.ZY().ZE()).ZK(arrayOfByte4).ZK(zlvf.ZY().ZO()).Zf(Zi(arrayOfByte4, arrayOfByte1, arrayOfByte2));
    return Zzw6.Zt(this.ZV.Za(), this.ZV.ZN(), zvow, this.Zh, (byte)11, (byte)1, arrayOfByte3, this.Zx);
  }
  
  private byte[] Zk(Zzud paramZzud, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_1
    //   5: invokeinterface ZV : ()Ljava/util/List;
    //   10: invokespecial <init> : (Ljava/util/Collection;)V
    //   13: astore #4
    //   15: aload #4
    //   17: invokestatic reverse : (Ljava/util/List;)V
    //   20: aload #4
    //   22: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   27: aload_0
    //   28: aload_2
    //   29: aload_3
    //   30: <illegal opcode> test : (Lburp/Zzv_;[B[B)Ljava/util/function/Predicate;
    //   35: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   40: invokeinterface findFirst : ()Ljava/util/Optional;
    //   45: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   50: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   53: aconst_null
    //   54: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast [B
    //   60: areturn
  }
  
  private boolean Ze(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int[] arrayOfInt = Zrso.Za();
    int i = Z_(paramArrayOfbyte1, paramArrayOfbyte2);
    if (i == -1)
      return false; 
    int j = Z_(paramArrayOfbyte1, paramArrayOfbyte3);
    if (j == -1)
      return false; 
    int k = j - i + paramArrayOfbyte2.length;
    boolean bool = (k >= 0) ? true : false;
    if (bool) {
      int m = i + paramArrayOfbyte2.length;
      if (j - m < 10) {
        this.Zx = Zmw.Zz(paramArrayOfbyte1, i, j + paramArrayOfbyte3.length);
        if (arrayOfInt == null) {
          this.Zx = Zmw.Zq(new byte[][] { paramArrayOfbyte2, Zmw.Zz(paramArrayOfbyte1, i, i + 10), paramArrayOfbyte3 });
          return bool;
        } 
        return bool;
      } 
    } else {
      return bool;
    } 
    this.Zx = Zmw.Zq(new byte[][] { paramArrayOfbyte2, Zmw.Zz(paramArrayOfbyte1, i, i + 10), paramArrayOfbyte3 });
    return bool;
  }
  
  private Zl1r Zi(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int i = Z_(paramArrayOfbyte1, paramArrayOfbyte2);
    int j = Z_(paramArrayOfbyte1, paramArrayOfbyte3);
    return new Zl1r(i, j + paramArrayOfbyte3.length);
  }
  
  private int Z_(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Zli.Zt(paramArrayOfbyte1, paramArrayOfbyte2, 0, paramArrayOfbyte1.length);
  }
  
  private static byte[] lambda$getResponseWithReflection$1(Zb6q paramZb6q) {
    return paramZb6q.Za().ZiD();
  }
  
  private boolean lambda$getResponseWithReflection$0(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zb6q paramZb6q) {
    return Ze(paramZb6q.Za().ZiD(), paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  static {
    // Byte code:
    //   0: bipush #90
    //   2: ldc 'UI'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzv_.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_5
    //   81: goto -> 111
    //   84: bipush #46
    //   86: goto -> 111
    //   89: bipush #104
    //   91: goto -> 111
    //   94: bipush #11
    //   96: goto -> 111
    //   99: bipush #65
    //   101: goto -> 111
    //   104: bipush #7
    //   106: goto -> 111
    //   109: bipush #13
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzv_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */