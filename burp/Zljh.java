package burp;

import java.util.ArrayList;
import java.util.Collection;

class Zljh {
  private static final byte[] ZP = new byte[0];
  
  private static final byte[] ZV = new byte[] { 49, 48, 46 };
  
  private static final byte[] ZL = new byte[] { 49, 55, 50, 46 };
  
  private static final byte[] Zo = new byte[] { 49, 57, 50, 46, 49, 54, 56, 46 };
  
  private static final Zrpi<byte[]> ZM = ZX();
  
  private final Ze3n Zx;
  
  private int Za;
  
  private int ZX;
  
  Zljh(Ze3n paramZe3n) {
    this.Zx = paramZe3n;
  }
  
  Ztk8 Zt(int paramInt) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: new java/util/TreeSet
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #4
    //   17: iload_1
    //   18: bipush #15
    //   20: isub
    //   21: istore #5
    //   23: invokestatic Ze : ()I
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield Za : I
    //   31: istore_2
    //   32: aload_0
    //   33: getfield Zx : Lburp/Ze3n;
    //   36: invokevirtual ZL : ()Lburp/Zb6q;
    //   39: invokeinterface Za : ()Lburp/Zstu;
    //   44: astore #6
    //   46: aload_0
    //   47: getfield Za : I
    //   50: iload #5
    //   52: if_icmpge -> 279
    //   55: aload_0
    //   56: iload #5
    //   58: invokevirtual ZT : (I)V
    //   61: aload_0
    //   62: getfield Za : I
    //   65: ifle -> 108
    //   68: aload #6
    //   70: aload_0
    //   71: getfield Za : I
    //   74: iconst_1
    //   75: isub
    //   76: invokeinterface Zp : (I)B
    //   81: invokestatic isDigit : (I)Z
    //   84: ifeq -> 108
    //   87: aload_0
    //   88: dup
    //   89: getfield Za : I
    //   92: iconst_2
    //   93: iadd
    //   94: putfield Za : I
    //   97: iload_2
    //   98: ifne -> 46
    //   101: iconst_4
    //   102: anewarray burp/Zbqc
    //   105: invokestatic Zr : ([Lburp/Zbqc;)V
    //   108: aload_0
    //   109: invokevirtual Zt : ()[B
    //   112: astore #7
    //   114: aload #7
    //   116: getstatic burp/Zljh.ZP : [B
    //   119: if_acmpne -> 136
    //   122: aload_0
    //   123: dup
    //   124: getfield Za : I
    //   127: iconst_2
    //   128: iadd
    //   129: putfield Za : I
    //   132: iload_2
    //   133: ifne -> 46
    //   136: aload_0
    //   137: aload #7
    //   139: invokevirtual ZD : ([B)Z
    //   142: ifeq -> 148
    //   145: goto -> 46
    //   148: aload #6
    //   150: aload_0
    //   151: getfield ZX : I
    //   154: invokeinterface Zp : (I)B
    //   159: invokestatic isDigit : (I)Z
    //   162: ifne -> 181
    //   165: aload #6
    //   167: aload_0
    //   168: getfield ZX : I
    //   171: invokeinterface Zp : (I)B
    //   176: bipush #46
    //   178: if_icmpne -> 193
    //   181: aload_0
    //   182: aload_0
    //   183: getfield ZX : I
    //   186: putfield Za : I
    //   189: iload_2
    //   190: ifne -> 46
    //   193: aload #6
    //   195: aload_0
    //   196: getfield Za : I
    //   199: aload_0
    //   200: getfield ZX : I
    //   203: aload_0
    //   204: getfield Za : I
    //   207: isub
    //   208: invokestatic ZO : (Lburp/Zstu;II)Ljava/lang/String;
    //   211: astore #8
    //   213: aload_0
    //   214: aload #8
    //   216: invokevirtual Zj : (Ljava/lang/String;)Z
    //   219: ifeq -> 265
    //   222: aload #4
    //   224: aload #8
    //   226: invokeinterface add : (Ljava/lang/Object;)Z
    //   231: pop
    //   232: aload_3
    //   233: aload #8
    //   235: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   240: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   245: checkcast java/util/Collection
    //   248: aload_0
    //   249: getfield Za : I
    //   252: aload_0
    //   253: getfield ZX : I
    //   256: invokestatic Zj : (II)Lburp/Zl1r;
    //   259: invokeinterface add : (Ljava/lang/Object;)Z
    //   264: pop
    //   265: aload_0
    //   266: aload_0
    //   267: getfield ZX : I
    //   270: iconst_1
    //   271: iadd
    //   272: putfield Za : I
    //   275: iload_2
    //   276: ifne -> 46
    //   279: aload #4
    //   281: invokeinterface size : ()I
    //   286: aload_3
    //   287: invokeinterface size : ()I
    //   292: if_icmpne -> 299
    //   295: iconst_1
    //   296: goto -> 300
    //   299: iconst_0
    //   300: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   303: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   306: new burp/Zgq
    //   309: dup
    //   310: invokespecial <init> : ()V
    //   313: astore #7
    //   315: aload #4
    //   317: invokeinterface iterator : ()Ljava/util/Iterator;
    //   322: astore #8
    //   324: aload #8
    //   326: invokeinterface hasNext : ()Z
    //   331: ifeq -> 399
    //   334: aload #8
    //   336: invokeinterface next : ()Ljava/lang/Object;
    //   341: checkcast java/lang/String
    //   344: astore #9
    //   346: aload_0
    //   347: getfield Zx : Lburp/Ze3n;
    //   350: invokevirtual Zt : ()Lburp/Zvow;
    //   353: aload_3
    //   354: aload #9
    //   356: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   361: checkcast java/util/Collection
    //   364: invokevirtual Z_ : (Ljava/util/Collection;)Lburp/Zvow;
    //   367: astore #10
    //   369: aload #7
    //   371: aload_0
    //   372: getfield Zx : Lburp/Ze3n;
    //   375: invokevirtual Za : ()Lburp/Zmzk;
    //   378: aload_0
    //   379: getfield Zx : Lburp/Ze3n;
    //   382: invokevirtual ZN : ()Ljava/lang/String;
    //   385: aload #10
    //   387: aload #9
    //   389: invokestatic ZN : (Lburp/Zmzk;Ljava/lang/String;Lburp/Zvow;Ljava/lang/String;)Lburp/Zsqx;
    //   392: invokevirtual Zu : (Lburp/Zsqx;)V
    //   395: iload_2
    //   396: ifne -> 324
    //   399: aload #7
    //   401: invokestatic Zy : (Lburp/Zgq;)Lburp/Ztk8;
    //   404: areturn
  }
  
  private void ZT(int paramInt) {
    int i = Zrqp.Ze();
    Zstu zstu = this.Zx.ZL().Za();
    while (this.Za < paramInt && zstu.Zp(this.Za) != 49) {
      this.Za++;
      if (i == 0)
        break; 
    } 
  }
  
  private byte[] Zt() {
    return ZM.Zo(this.Zx.ZL().Za(), this.Za).orElse(ZP);
  }
  
  private boolean ZD(byte[] paramArrayOfbyte) {
    int i = Zrqp.ZZ();
    Zstu zstu = this.Zx.ZL().Za();
    byte b = (paramArrayOfbyte == Zo) ? 2 : 3;
    this.ZX = this.Za + paramArrayOfbyte.length;
    while (b > 0) {
      int j = this.ZX;
      while (this.ZX - j < 3 && Character.isDigit(zstu.Zp(this.ZX))) {
        this.ZX++;
        if (i != 0)
          break; 
      } 
      if (this.ZX - j == 0) {
        this.Za = this.ZX;
        return true;
      } 
      int k = Integer.parseInt(Zruv.ZO(zstu, j, this.ZX - j));
      if (paramArrayOfbyte == ZL && b == 3) {
        if (k < 16 || k > 31) {
          this.Za = this.ZX;
          return true;
        } 
      } else if (k < 0 || k > 255) {
        this.Za = this.ZX;
        return true;
      } 
      if (--b > 0) {
        if (zstu.Zp(this.ZX) != 46) {
          this.Za = this.ZX;
          return true;
        } 
        this.ZX++;
      } 
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private boolean Zj(String paramString) {
    return !paramString.equals(this.Zx.Za().ZJ1());
  }
  
  private static Zrpi<byte[]> ZX() {
    Zrpi<byte[]> zrpi = new Zrpi();
    zrpi.ZG(ZV, ZV);
    zrpi.ZG(ZL, ZL);
    zrpi.ZG(Zo, Zo);
    return zrpi;
  }
  
  private static Collection lambda$checkForPrivateIPAddresses$0(String paramString) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */