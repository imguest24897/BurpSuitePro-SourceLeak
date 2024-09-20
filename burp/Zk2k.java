package burp;

import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zlh;
import net.portswigger.browser.Zc5;
import net.portswigger.browser.Zcb;
import net.portswigger.browser.Zcy;
import net.portswigger.browser.Zd_;
import net.portswigger.browser.Zdt;
import net.portswigger.browser.Zjv;

public class Zk2k {
  private Zc5 Zt = null;
  
  private final String Zv;
  
  private Zr94 ZL;
  
  private static final String a;
  
  public Zk2k(String paramString) {
    this.Zv = paramString;
  }
  
  void Zx(Zr94 paramZr94) throws Zcb {
    String[] arrayOfString = Zb5b.ZX();
    this.ZL = paramZr94;
    if (this.Zv != null) {
      this.Zt = Zc5.Zr(this.Zv);
      byte b = 0;
      for (Zd_ zd_ : this.Zt) {
        paramZr94.Zs(b, zd_, false);
        b++;
        if (arrayOfString != null)
          break; 
      } 
      paramZr94.ZV();
    } 
  }
  
  void ZM(int paramInt, Zsd0<?> paramZsd0) {
    Object object = paramZsd0.ZC();
    ((Zc5)Zf().orElseThrow()).Zo(paramInt, (Zd_)object);
    this.ZL.Zs(paramInt, (Zd_)object, true);
  }
  
  void Zl(int paramInt, Zsd0<?> paramZsd0) {
    Object object = paramZsd0.ZC();
    ((Zc5)Zf().orElseThrow()).Zx(paramInt, (Zd_)object);
    this.ZL.Zg(paramInt, (Zd_)object);
  }
  
  public void ZW(int paramInt) {
    try {
      if (paramInt == -1)
        return; 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    ((Zc5)Zf().orElseThrow()).ZQ(paramInt);
    this.ZL.Zx(paramInt);
  }
  
  private Optional<Zc5> Zf() {
    try {
      try {
        if (this.Zt == null)
          this.Zt = Zc5.Zr(new Zdt[] { (Zdt)new Zjv() }); 
      } catch (Zcy zcy) {
        throw a(null);
      } 
      return Optional.of(this.Zt);
    } catch (Zcy zcy) {
      Zah.Zl((Throwable)zcy, Zk_.IMPOSSIBLE);
      return Optional.empty();
    } 
  }
  
  public String Zy() {
    return this.Zt.ZL();
  }
  
  public void Zp(String paramString, boolean paramBoolean) {
    try {
      this.Zt = Zc5.Zr(paramString);
      this.ZL.Zz(ZX());
      this.ZL.Zl(this.Zt, paramBoolean);
    } catch (Zcy|Zlh zcy) {
      Zah.Zl((Throwable)zcy, Zk_.USER_ERROR);
      this.ZL.ZD();
    } 
  }
  
  private String ZX() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZX : ()[Ljava/lang/String;
    //   11: aload_0
    //   12: getfield Zt : Lnet/portswigger/browser/Zc5;
    //   15: invokevirtual iterator : ()Ljava/util/Iterator;
    //   18: astore_3
    //   19: astore_1
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 158
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast net/portswigger/browser/Zd_
    //   38: astore #4
    //   40: aload #4
    //   42: instanceof net/portswigger/browser/Zjx
    //   45: ifeq -> 101
    //   48: aload #4
    //   50: checkcast net/portswigger/browser/Zjx
    //   53: astore #5
    //   55: aload_2
    //   56: aload #5
    //   58: invokevirtual Zj : ()Ljava/lang/String;
    //   61: invokestatic create : (Ljava/lang/String;)Ljava/net/URI;
    //   64: invokevirtual toURL : ()Ljava/net/URL;
    //   67: invokevirtual getHost : ()Ljava/lang/String;
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: goto -> 154
    //   77: astore #7
    //   79: aload #7
    //   81: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   84: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   87: aload_2
    //   88: aload #5
    //   90: invokevirtual Zj : ()Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_1
    //   98: ifnull -> 154
    //   101: aload #4
    //   103: instanceof net/portswigger/browser/Zjr
    //   106: ifeq -> 154
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload #4
    //   118: checkcast net/portswigger/browser/Zjr
    //   121: astore #6
    //   123: aload #6
    //   125: invokevirtual Zy : ()Z
    //   128: ifne -> 154
    //   131: aload_2
    //   132: getstatic burp/Zk2k.a : Ljava/lang/String;
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload #6
    //   140: invokevirtual ZG : ()Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aload_1
    //   155: ifnull -> 20
    //   158: aload_2
    //   159: invokevirtual toString : ()Ljava/lang/String;
    //   162: areturn
    // Exception table:
    //   from	to	target	type
    //   55	74	77	java/lang/IllegalArgumentException
    //   55	74	77	java/net/MalformedURLException
    //   79	109	112	java/lang/IllegalArgumentException
    //   123	147	150	java/lang/IllegalArgumentException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #46
    //   2: ldc '+x'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk2k.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #42
    //   87: goto -> 112
    //   90: bipush #118
    //   92: goto -> 112
    //   95: bipush #24
    //   97: goto -> 112
    //   100: bipush #7
    //   102: goto -> 112
    //   105: bipush #48
    //   107: goto -> 112
    //   110: bipush #58
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */