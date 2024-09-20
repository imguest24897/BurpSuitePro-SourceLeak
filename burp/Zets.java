package burp;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zets extends Zet0 {
  private static final String b;
  
  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #8
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: iload_3
    //   9: iload #4
    //   11: iload #5
    //   13: iload #6
    //   15: iload #7
    //   17: invokespecial getTreeCellRendererComponent : (Ljavax/swing/JTree;Ljava/lang/Object;ZZZIZ)Ljava/awt/Component;
    //   20: pop
    //   21: aload_2
    //   22: instanceof burp/Zz_1
    //   25: ifne -> 34
    //   28: aload_0
    //   29: areturn
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_2
    //   35: checkcast burp/Zz_1
    //   38: astore #9
    //   40: aload #9
    //   42: invokevirtual Z_ : ()Ljava/lang/Object;
    //   45: checkcast burp/Zxya
    //   48: astore #10
    //   50: aload_0
    //   51: iconst_4
    //   52: invokevirtual setHorizontalTextPosition : (I)V
    //   55: aload_0
    //   56: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   59: invokevirtual ZV : ()Ljava/awt/Font;
    //   62: invokevirtual setFont : (Ljava/awt/Font;)V
    //   65: aload_0
    //   66: aload #10
    //   68: invokevirtual ZZ : ()Ljava/lang/String;
    //   71: invokevirtual setText : (Ljava/lang/String;)V
    //   74: aload_0
    //   75: aload_0
    //   76: aload #9
    //   78: iload #4
    //   80: invokevirtual Zz : (Lburp/Zz_1;Z)Ljavax/swing/ImageIcon;
    //   83: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   86: aload #10
    //   88: invokevirtual ZX : ()Z
    //   91: ifeq -> 108
    //   94: aload_0
    //   95: aload #10
    //   97: getfield ZK : Ljava/lang/String;
    //   100: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   103: aload #8
    //   105: ifnonnull -> 190
    //   108: aload #10
    //   110: invokevirtual Zv : ()Z
    //   113: ifeq -> 149
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: aload #10
    //   126: invokevirtual Zq : ()Lburp/Zlit;
    //   129: invokeinterface toString : ()Ljava/lang/String;
    //   134: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   137: aload #8
    //   139: ifnonnull -> 190
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload_0
    //   150: aload #10
    //   152: getfield Zl : Ljava/lang/String;
    //   155: ifnonnull -> 182
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload #10
    //   167: invokevirtual Zq : ()Lburp/Zlit;
    //   170: invokeinterface toString : ()Ljava/lang/String;
    //   175: goto -> 187
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: aload #10
    //   184: getfield Zl : Ljava/lang/String;
    //   187: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   190: aload #10
    //   192: getfield ZH : Z
    //   195: ifeq -> 220
    //   198: aload_0
    //   199: getstatic burp/Zlkk.MAP_NODE_ERROR : Lburp/Zlkk;
    //   202: invokevirtual ZS : ()Ljava/awt/Color;
    //   205: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   208: aload #8
    //   210: ifnonnull -> 341
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: aload #9
    //   222: invokevirtual Zi : ()Z
    //   225: ifeq -> 257
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   234: athrow
    //   235: aload_0
    //   236: getstatic burp/Zlkk.MAP_NODE_REQUESTED : Lburp/Zlkk;
    //   239: invokevirtual ZS : ()Ljava/awt/Color;
    //   242: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   245: aload #8
    //   247: ifnonnull -> 341
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: aload #9
    //   259: invokevirtual Zb : ()Z
    //   262: ifne -> 302
    //   265: goto -> 272
    //   268: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   271: athrow
    //   272: aload #10
    //   274: invokevirtual Zt : ()Z
    //   277: ifne -> 302
    //   280: goto -> 287
    //   283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   286: athrow
    //   287: aload #10
    //   289: invokevirtual ZF : ()Z
    //   292: ifeq -> 324
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   301: athrow
    //   302: aload_0
    //   303: getstatic burp/Zlkk.MAP_NODE_NOT_REQUESTED : Lburp/Zlkk;
    //   306: invokevirtual ZS : ()Ljava/awt/Color;
    //   309: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   312: aload #8
    //   314: ifnonnull -> 341
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   323: athrow
    //   324: aload_0
    //   325: getstatic burp/Zlkk.MAP_NODE_EMPTY : Lburp/Zlkk;
    //   328: invokevirtual ZS : ()Ljava/awt/Color;
    //   331: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: goto -> 354
    //   344: astore #11
    //   346: aload #11
    //   348: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   351: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   354: aload_0
    //   355: areturn
    // Exception table:
    //   from	to	target	type
    //   5	30	30	java/lang/Exception
    //   55	341	344	java/lang/Exception
    //   94	116	119	java/lang/Exception
    //   108	142	145	java/lang/Exception
    //   123	158	161	java/lang/Exception
    //   149	178	178	java/lang/Exception
    //   190	213	216	java/lang/Exception
    //   198	228	231	java/lang/Exception
    //   220	250	253	java/lang/Exception
    //   235	265	268	java/lang/Exception
    //   257	280	283	java/lang/Exception
    //   272	295	298	java/lang/Exception
    //   287	317	320	java/lang/Exception
    //   302	334	337	java/lang/Exception
  }
  
  ImageIcon Zz(Zz_1 paramZz_1, boolean paramBoolean) {
    Zxya zxya = (Zxya)paramZz_1.Z_();
    if (zxya.ZX())
      return zxya.Zq().Zdr() ? Zg_k.Zk(Zbpk.SECURE_HOST, zxya.Zf, zxya.ZW, ZE()) : Zg_k.Zk(Zbpk.INSECURE_HOST, zxya.Zf, zxya.ZW, ZE()); 
    if (zxya.Zv())
      return paramBoolean ? Zg_k.Zk(Zbpk.OPEN_FOLDER, zxya.Zf, zxya.ZW, ZE()) : Zg_k.Zk(Zbpk.CLOSED_FOLDER, zxya.Zf, zxya.ZW, ZE()); 
    if (zxya.ZF())
      return b.equalsIgnoreCase(zxya.Zr) ? Zg_k.Zk(Zbpk.POST_REQUEST, zxya.Zf, zxya.ZW, ZE()) : Zg_k.Zk(Zbpk.GET_QUERY, zxya.Zf, zxya.ZW, ZE()); 
    if (!paramZz_1.isLeaf())
      return Zg_k.Zk(Zbpk.DYNAMIC_PAGE, zxya.Zf, zxya.ZW, ZE()); 
    switch (zxya.ZY) {
      case 0:
      case 1:
      case 2:
      case 256:
      case 257:
      case 261:
      case 768:
      case 769:
      case 1025:
      case 1026:
      case 1280:
      case 1536:
      case 1537:
        return Zg_k.Zk(Zbpk.DEFAULT, zxya.Zf, zxya.ZW, ZE());
      case 259:
      case 260:
        return Zg_k.Zk(Zbpk.SCRIPT, zxya.Zf, zxya.ZW, ZE());
      case 512:
      case 513:
      case 514:
      case 515:
      case 516:
      case 517:
        return Zg_k.Zk(Zbpk.IMAGE, zxya.Zf, zxya.ZW, ZE());
      case 262:
        return Zg_k.Zk(Zbpk.XML, zxya.Zf, zxya.ZW, ZE());
      case 258:
        return Zg_k.Zk(Zbpk.CSS, zxya.Zf, zxya.ZW, ZE());
    } 
    Zuh.Zv(false, Zqf.Zk, zxya.ZY);
    return null;
  }
  
  protected boolean ZE() {
    return true;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc 'l}?'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zets.b : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #63
    //   82: goto -> 112
    //   85: bipush #84
    //   87: goto -> 112
    //   90: bipush #45
    //   92: goto -> 112
    //   95: bipush #104
    //   97: goto -> 112
    //   100: bipush #66
    //   102: goto -> 112
    //   105: bipush #7
    //   107: goto -> 112
    //   110: bipush #27
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zets.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */