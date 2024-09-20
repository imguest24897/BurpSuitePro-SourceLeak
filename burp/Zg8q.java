package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zg8q extends Zbqc implements Zg90 {
  private final Ztwv Za;
  
  private Zgeh ZZ;
  
  private final Ze4m ZB;
  
  private final Zbnt Zl;
  
  private final Zr_4 ZH;
  
  private Zrl_ Z_;
  
  private final Zt84 Zi;
  
  private final Zey9 Ztn;
  
  private final Zmzk Zh;
  
  private final byte[] ZA;
  
  private String ZtA;
  
  private Zs68 Zm;
  
  private final Zbkv Zz;
  
  private boolean Zn;
  
  private final Zzdy Zb;
  
  private final Zzdy Zj;
  
  private Zm99 ZX;
  
  private static final byte[] Zd;
  
  private ButtonGroup Zw;
  
  private ButtonGroup ZG;
  
  private ButtonGroup Zr;
  
  private Zzdy Zy;
  
  private Zzdy ZV;
  
  private Zzdy Zt;
  
  private Ze01 Zg;
  
  private Ze01 ZC;
  
  private Ze01 Zs;
  
  private Zm2o Zv;
  
  private Zm99 ZL;
  
  private Zbqc Zc;
  
  private Zbqc ZK;
  
  private Zbqc ZW;
  
  private Zbqc Zk;
  
  private Zbqc ZY;
  
  private Zbqc ZO;
  
  private Zbqc ZD;
  
  private Zm9v ZQ;
  
  private Zm9v Zo;
  
  private Zm9v ZI;
  
  private Zbqc Zf;
  
  private Zmg2 ZN;
  
  private Zmg2 Zu;
  
  private Zmg2 ZR;
  
  private Zmg2 Zq;
  
  private Zbqc ZT;
  
  private Zbqc ZJ;
  
  private Zgff Zx;
  
  private Zgff ZP;
  
  private Zl8w ZF;
  
  private Zgff ZU;
  
  private Zgff ZM;
  
  private Zgff ZE;
  
  private static Zbqc[] ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg8q(String paramString, Zkk3 paramZkk3, Ze4m paramZe4m, Zmzk paramZmzk, byte[] paramArrayOfbyte, Zt84 paramZt84, Zgb6 paramZgb6, Zbnt paramZbnt, Zb0h paramZb0h, Ztwv paramZtwv, Zr_4 paramZr_4, Zey9 paramZey9) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Z_ : ()[Lburp/Zbqc;
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield Zn : Z
    //   12: astore #13
    //   14: aload_0
    //   15: aload_3
    //   16: putfield ZB : Lburp/Ze4m;
    //   19: aload_0
    //   20: aload #4
    //   22: putfield Zh : Lburp/Zmzk;
    //   25: aload_0
    //   26: aload #5
    //   28: putfield ZA : [B
    //   31: aload_0
    //   32: aload #6
    //   34: putfield Zi : Lburp/Zt84;
    //   37: aload_0
    //   38: aload #8
    //   40: putfield Zl : Lburp/Zbnt;
    //   43: aload_0
    //   44: aload #10
    //   46: putfield Za : Lburp/Ztwv;
    //   49: aload_0
    //   50: aload #11
    //   52: putfield ZH : Lburp/Zr_4;
    //   55: aload_0
    //   56: aload #12
    //   58: putfield Ztn : Lburp/Zey9;
    //   61: aload_0
    //   62: aload #6
    //   64: invokeinterface ZeG : ()Lburp/Zs68;
    //   69: putfield Zm : Lburp/Zs68;
    //   72: aload #6
    //   74: invokeinterface ZcV : ()[B
    //   79: astore #14
    //   81: aload_0
    //   82: getfield Zm : Lburp/Zs68;
    //   85: ifnonnull -> 108
    //   88: aload #14
    //   90: ifnull -> 108
    //   93: aload_0
    //   94: aconst_null
    //   95: aload #14
    //   97: getstatic burp/Zt0k.HTML_HEAD_ANALYSIS : Lburp/Zt0k;
    //   100: aload #8
    //   102: invokestatic ZK : (Lburp/Zz1p;[BLburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   105: putfield Zm : Lburp/Zs68;
    //   108: aload_0
    //   109: invokevirtual ZM : ()V
    //   112: aload_0
    //   113: getfield Zy : Lburp/Zzdy;
    //   116: aload_0
    //   117: getfield Zn : Z
    //   120: invokevirtual setSelected : (Z)V
    //   123: aload_0
    //   124: getfield ZF : Lburp/Zl8w;
    //   127: aload_1
    //   128: sipush #7497
    //   131: sipush #22845
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: swap
    //   138: sipush #7508
    //   141: sipush #20618
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   152: invokevirtual setText : (Ljava/lang/String;)V
    //   155: new javax/swing/ButtonGroup
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: astore #15
    //   164: aload_0
    //   165: new burp/Zzdy
    //   168: dup
    //   169: sipush #7537
    //   172: sipush #-7517
    //   175: invokestatic a : (II)Ljava/lang/String;
    //   178: invokespecial <init> : (Ljava/lang/String;)V
    //   181: putfield Zb : Lburp/Zzdy;
    //   184: aload #15
    //   186: aload_0
    //   187: getfield Zb : Lburp/Zzdy;
    //   190: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   193: aload_0
    //   194: getfield Zb : Lburp/Zzdy;
    //   197: new javax/swing/border/EmptyBorder
    //   200: dup
    //   201: iconst_0
    //   202: iconst_5
    //   203: iconst_0
    //   204: iconst_5
    //   205: invokespecial <init> : (IIII)V
    //   208: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   211: aload_0
    //   212: getfield Zb : Lburp/Zzdy;
    //   215: iconst_1
    //   216: invokevirtual setOpaque : (Z)V
    //   219: aload_0
    //   220: getfield Zb : Lburp/Zzdy;
    //   223: aload_0
    //   224: <illegal opcode> actionPerformed : (Lburp/Zg8q;)Ljava/awt/event/ActionListener;
    //   229: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   232: aload_0
    //   233: new burp/Zzdy
    //   236: dup
    //   237: sipush #7499
    //   240: sipush #6149
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokespecial <init> : (Ljava/lang/String;)V
    //   249: putfield Zj : Lburp/Zzdy;
    //   252: aload #15
    //   254: aload_0
    //   255: getfield Zj : Lburp/Zzdy;
    //   258: invokevirtual add : (Ljavax/swing/AbstractButton;)V
    //   261: aload_0
    //   262: getfield Zj : Lburp/Zzdy;
    //   265: new javax/swing/border/EmptyBorder
    //   268: dup
    //   269: iconst_0
    //   270: iconst_5
    //   271: iconst_0
    //   272: iconst_5
    //   273: invokespecial <init> : (IIII)V
    //   276: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   279: aload_0
    //   280: getfield Zj : Lburp/Zzdy;
    //   283: iconst_1
    //   284: invokevirtual setOpaque : (Z)V
    //   287: aload_0
    //   288: getfield Zj : Lburp/Zzdy;
    //   291: aload_0
    //   292: <illegal opcode> actionPerformed : (Lburp/Zg8q;)Ljava/awt/event/ActionListener;
    //   297: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   300: aload_0
    //   301: getfield ZJ : Lburp/Zbqc;
    //   304: new burp/Zsn_
    //   307: dup
    //   308: aload_0
    //   309: getfield Zb : Lburp/Zzdy;
    //   312: aload_0
    //   313: getfield ZJ : Lburp/Zbqc;
    //   316: invokestatic createEtchedBorder : ()Ljavax/swing/border/Border;
    //   319: invokespecial <init> : (Ljava/awt/Component;Ljavax/swing/JComponent;Ljavax/swing/border/Border;)V
    //   322: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   325: aload_0
    //   326: getfield ZT : Lburp/Zbqc;
    //   329: new burp/Zsn_
    //   332: dup
    //   333: aload_0
    //   334: getfield Zj : Lburp/Zzdy;
    //   337: aload_0
    //   338: getfield ZT : Lburp/Zbqc;
    //   341: invokestatic createEtchedBorder : ()Ljavax/swing/border/Border;
    //   344: invokespecial <init> : (Ljava/awt/Component;Ljavax/swing/JComponent;Ljavax/swing/border/Border;)V
    //   347: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   350: aload_0
    //   351: new burp/Zbkv
    //   354: dup
    //   355: iconst_0
    //   356: aload #7
    //   358: aload #9
    //   360: aload #10
    //   362: invokespecial <init> : (ZLburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;)V
    //   365: putfield Zz : Lburp/Zbkv;
    //   368: aload_0
    //   369: getfield Zz : Lburp/Zbkv;
    //   372: iconst_1
    //   373: invokevirtual ZY : (Z)V
    //   376: aload_0
    //   377: getfield Zz : Lburp/Zbkv;
    //   380: invokevirtual ZJ : ()V
    //   383: aload_0
    //   384: getfield Zz : Lburp/Zbkv;
    //   387: bipush #100
    //   389: bipush #20
    //   391: invokestatic Zf : (Ljava/awt/Component;II)V
    //   394: aload #14
    //   396: ifnonnull -> 494
    //   399: aload_0
    //   400: getfield Zs : Lburp/Ze01;
    //   403: sipush #7516
    //   406: sipush #15791
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: invokevirtual setText : (Ljava/lang/String;)V
    //   415: aload_0
    //   416: new burp/Zm99
    //   419: dup
    //   420: sipush #7515
    //   423: sipush #14832
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokespecial <init> : (Ljava/lang/String;)V
    //   432: putfield ZX : Lburp/Zm99;
    //   435: aload_0
    //   436: getfield ZX : Lburp/Zm99;
    //   439: iconst_1
    //   440: invokevirtual setOpaque : (Z)V
    //   443: aload_0
    //   444: getfield ZX : Lburp/Zm99;
    //   447: iconst_0
    //   448: invokevirtual setHorizontalAlignment : (I)V
    //   451: aload_0
    //   452: getfield ZX : Lburp/Zm99;
    //   455: bipush #100
    //   457: bipush #20
    //   459: invokestatic Zf : (Ljava/awt/Component;II)V
    //   462: aload_0
    //   463: getfield Zf : Lburp/Zbqc;
    //   466: aload_0
    //   467: getfield ZX : Lburp/Zm99;
    //   470: sipush #7502
    //   473: sipush #7213
    //   476: invokestatic a : (II)Ljava/lang/String;
    //   479: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   482: aload #13
    //   484: ifnonnull -> 538
    //   487: iconst_3
    //   488: anewarray burp/Zbqc
    //   491: invokestatic Zr : ([Lburp/Zbqc;)V
    //   494: aload_0
    //   495: getfield Zf : Lburp/Zbqc;
    //   498: aload_0
    //   499: getfield Zz : Lburp/Zbkv;
    //   502: sipush #7502
    //   505: sipush #7213
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   514: aload_0
    //   515: getfield Zz : Lburp/Zbkv;
    //   518: aload #14
    //   520: aload_0
    //   521: getfield Zm : Lburp/Zs68;
    //   524: invokevirtual ZA : ([BLburp/Zs68;)V
    //   527: aload_0
    //   528: aload_0
    //   529: getfield Zz : Lburp/Zbkv;
    //   532: invokevirtual Zp : ()Ljava/lang/String;
    //   535: putfield ZtA : Ljava/lang/String;
    //   538: aload_0
    //   539: getfield Zz : Lburp/Zbkv;
    //   542: aload_0
    //   543: invokevirtual Z_ : (Lburp/Zg90;)V
    //   546: aload_0
    //   547: new burp/Zgeh
    //   550: dup
    //   551: aload_2
    //   552: aload_0
    //   553: getfield Zz : Lburp/Zbkv;
    //   556: invokespecial <init> : (Lburp/Zkk3;Lburp/Zbkv;)V
    //   559: putfield ZZ : Lburp/Zgeh;
    //   562: aload_0
    //   563: aload_0
    //   564: getfield ZZ : Lburp/Zgeh;
    //   567: invokevirtual Zl : (Lburp/Zgeh;)V
    //   570: aload_0
    //   571: invokevirtual Zz : ()V
    //   574: aload_0
    //   575: iconst_0
    //   576: invokevirtual ZJ : (Z)[I
    //   579: pop
    //   580: return
  }
  
  public Zkk3 ZF() {
    return (this.ZZ == null) ? null : this.ZZ.Zm();
  }
  
  private void Zl(Zgeh paramZgeh) {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zb : Lburp/Zzdy;
    //   8: aload_1
    //   9: invokevirtual ZL : ()Z
    //   12: ifne -> 19
    //   15: iconst_1
    //   16: goto -> 20
    //   19: iconst_0
    //   20: invokevirtual setSelected : (Z)V
    //   23: aload_0
    //   24: getfield Zj : Lburp/Zzdy;
    //   27: aload_1
    //   28: invokevirtual ZL : ()Z
    //   31: invokevirtual setSelected : (Z)V
    //   34: aload_1
    //   35: invokevirtual Zk : ()B
    //   38: lookupswitch default -> 84, 0 -> 64, 1 -> 76
    //   64: aload_0
    //   65: getfield ZR : Lburp/Zmg2;
    //   68: iconst_1
    //   69: invokevirtual setSelected : (Z)V
    //   72: aload_2
    //   73: ifnonnull -> 84
    //   76: aload_0
    //   77: getfield Zq : Lburp/Zmg2;
    //   80: iconst_1
    //   81: invokevirtual setSelected : (Z)V
    //   84: aload_1
    //   85: invokevirtual Zw : ()B
    //   88: lookupswitch default -> 136, 0 -> 116, 1 -> 128
    //   116: aload_0
    //   117: getfield ZN : Lburp/Zmg2;
    //   120: iconst_1
    //   121: invokevirtual setSelected : (Z)V
    //   124: aload_2
    //   125: ifnonnull -> 136
    //   128: aload_0
    //   129: getfield Zu : Lburp/Zmg2;
    //   132: iconst_1
    //   133: invokevirtual setSelected : (Z)V
    //   136: aload_1
    //   137: invokevirtual Zg : ()Ljava/lang/String;
    //   140: astore_3
    //   141: aload_0
    //   142: getfield ZM : Lburp/Zgff;
    //   145: aload_3
    //   146: invokestatic Z_ : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokevirtual setText : (Ljava/lang/String;)V
    //   152: aload_1
    //   153: invokevirtual ZX : ()I
    //   156: istore #4
    //   158: aload_0
    //   159: getfield ZE : Lburp/Zgff;
    //   162: iload #4
    //   164: ifge -> 172
    //   167: ldc ''
    //   169: goto -> 177
    //   172: iload #4
    //   174: invokestatic toString : (I)Ljava/lang/String;
    //   177: invokevirtual setText : (Ljava/lang/String;)V
    //   180: aload_1
    //   181: invokevirtual ZI : ()Ljava/lang/String;
    //   184: astore #5
    //   186: aload_0
    //   187: getfield Zx : Lburp/Zgff;
    //   190: aload #5
    //   192: invokestatic Z_ : (Ljava/lang/String;)Ljava/lang/String;
    //   195: invokevirtual setText : (Ljava/lang/String;)V
    //   198: aload_1
    //   199: invokevirtual Zu : ()I
    //   202: istore #6
    //   204: aload_0
    //   205: getfield ZP : Lburp/Zgff;
    //   208: iload #6
    //   210: ifge -> 218
    //   213: ldc ''
    //   215: goto -> 223
    //   218: iload #6
    //   220: invokestatic toString : (I)Ljava/lang/String;
    //   223: invokevirtual setText : (Ljava/lang/String;)V
    //   226: aload_1
    //   227: invokevirtual ZW : ()Ljava/lang/String;
    //   230: astore #7
    //   232: aload_0
    //   233: getfield ZU : Lburp/Zgff;
    //   236: aload #7
    //   238: ifnonnull -> 246
    //   241: ldc ''
    //   243: goto -> 248
    //   246: aload #7
    //   248: invokevirtual setText : (Ljava/lang/String;)V
    //   251: aload_0
    //   252: getfield ZV : Lburp/Zzdy;
    //   255: aload_1
    //   256: invokevirtual ZR : ()Z
    //   259: invokevirtual setSelected : (Z)V
    //   262: aload_0
    //   263: getfield Zt : Lburp/Zzdy;
    //   266: aload_1
    //   267: invokevirtual ZU : ()Z
    //   270: invokevirtual setSelected : (Z)V
    //   273: return
  }
  
  public static String ZQ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i = paramInt1;
    Zbqc[] arrayOfZbqc = Z_();
    while (i < paramInt2) {
      byte b = paramArrayOfbyte[i];
      switch (b) {
        case 10:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(110);
        case 13:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(114);
        case 92:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(92);
        default:
        
      } 
      i++;
      continue;
      if (arrayOfZbqc == null)
        break; 
    } 
    return Zkb.ZG(byteArrayOutputStream.toByteArray());
  }
  
  private static String Z_(String paramString) {
    return ZQ(paramString, 0, paramString.length());
  }
  
  public static String ZQ(String paramString, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramInt1;
    Zbqc[] arrayOfZbqc = Z_();
    while (i < paramInt2) {
      char c = paramString.charAt(i);
      switch (c) {
        case '\n':
          stringBuilder.append(a(7492, -17375));
        case '\r':
          stringBuilder.append(a(7509, -26657));
        case '\\':
          stringBuilder.append(a(7506, -21626));
        default:
          stringBuilder.append(c);
          break;
      } 
      i++;
      continue;
      if (arrayOfZbqc == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static String ZV(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i = paramInt1;
    Zbqc[] arrayOfZbqc = Z_();
    while (i < paramInt2) {
      byte b = paramArrayOfbyte[i];
      switch (b) {
        case 10:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(110);
        case 13:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(114);
        case 33:
        case 36:
        case 38:
        case 40:
        case 41:
        case 42:
        case 43:
        case 44:
        case 45:
        case 46:
        case 58:
        case 63:
        case 91:
        case 92:
        case 93:
        case 94:
        case 123:
        case 124:
        case 125:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(b);
        default:
        
      } 
      i++;
      continue;
      if (arrayOfZbqc == null)
        break; 
    } 
    return Zkb.ZG(byteArrayOutputStream.toByteArray());
  }
  
  private static String Zb(String paramString, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramInt1;
    Zbqc[] arrayOfZbqc = Z_();
    while (i < paramInt2) {
      char c = paramString.charAt(i);
      switch (c) {
        case '\n':
          stringBuilder.append(a(7513, 10544));
        case '\r':
          stringBuilder.append(a(7504, 3757));
        case '!':
        case '$':
        case '&':
        case '(':
        case ')':
        case '*':
        case '+':
        case ',':
        case '-':
        case '.':
        case ':':
        case '?':
        case '[':
        case '\\':
        case ']':
        case '^':
        case '{':
        case '|':
        case '}':
          stringBuilder.append('\\');
          stringBuilder.append(c);
        default:
          stringBuilder.append(c);
          break;
      } 
      i++;
      continue;
      if (arrayOfZbqc == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static String Zn(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Z_();
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      try {
        try {
          if (c == '\\') {
            switch (paramString.charAt(b + 1)) {
              case 'n':
                stringBuilder.append('\n');
                b++;
              case 'r':
                stringBuilder.append('\r');
                b++;
              case '\\':
                stringBuilder.append('\\');
                b++;
              default:
                stringBuilder.append(c);
                break;
            } 
            b++;
            continue;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private int Zm(int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Z_();
    if (paramInt2 < 6)
      paramInt2 = 5; 
    if (paramInt1 - paramInt2 > 0) {
      Zz00 zz00 = Zk(paramInt1 - paramInt2);
      while (paramInt1 - paramInt2 > 0) {
        if (++paramInt2 > 200)
          return 200; 
        Zz00 zz001 = Zk(paramInt1 - paramInt2);
        switch (zz00.ordinal()) {
          case 0:
          
          case 1:
            switch (zz001.ordinal()) {
              case 0:
                return paramInt2;
              case 1:
                if (arrayOfZbqc == null)
                  return paramInt2; 
                break;
              case 2:
                return paramInt2;
            } 
          case 2:
            switch (zz001.ordinal()) {
              case 0:
                return paramInt2;
            } 
            break;
        } 
        zz00 = zz001;
        continue;
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return Math.min(paramInt1, paramInt2);
  }
  
  private int Zx(int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Z_();
    if (paramInt2 < 6)
      paramInt2 = 5; 
    if (paramInt1 + paramInt2 < this.ZtA.length()) {
      Zz00 zz00 = Zk(paramInt1 + paramInt2);
      while (paramInt1 + paramInt2 + 1 < this.ZtA.length()) {
        if (++paramInt2 > 200)
          return 200; 
        Zz00 zz001 = Zk(paramInt1 + paramInt2);
        switch (zz00.ordinal()) {
          case 0:
          
          case 1:
            switch (zz001.ordinal()) {
              case 0:
                return paramInt2;
              case 1:
                if (arrayOfZbqc == null)
                  return paramInt2 + 1; 
                break;
              case 2:
                return paramInt2 + 1;
            } 
          case 2:
            switch (zz001.ordinal()) {
              case 0:
                return paramInt2;
            } 
            break;
        } 
        zz00 = zz001;
        continue;
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return Math.min(this.ZtA.length() - paramInt1, paramInt2);
  }
  
  private Zz00 Zk(int paramInt) {
    char c = this.ZtA.charAt(paramInt);
    return Character.isWhitespace(c) ? Zz00.WHITESPACE : (Character.isLetterOrDigit(c) ? Zz00.ALPHANUM : Zz00.MARKUP);
  }
  
  public void Zf(int[] paramArrayOfint) {
    try {
      try {
        if (this.Zn) {
          try {
            if (this.ZZ == null || paramArrayOfint == null)
              return; 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      int i = paramArrayOfint[0];
      int j = paramArrayOfint[1];
      int k = 0;
      if (this.ZZ.ZU()) {
        k = Math.max(this.Zm.Zk, 0);
        i = Math.max(i, this.Zm.Zk);
      } 
      if (j <= i)
        return; 
      int m = i - k;
      m = ZV(i, k, m);
      String str1 = Zk(i, j);
      ZB(str1);
      String str2 = ZZ(i, m, str1);
      this.ZZ.Zn(this.ZtA.substring(i - m, i));
      this.ZZ.Zr(str1);
      Zc(i);
      ZC(j - i);
      try {
        this.ZZ.Zf(str2);
        this.ZI.setText("");
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.USER_ERROR);
        this.ZI.setText(exception.getMessage());
      } 
      ZJ(true);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZC(int paramInt) {
    Zv(paramInt);
    this.ZZ.ZX(paramInt);
    this.ZQ.setText("");
  }
  
  private void Zc(int paramInt) {
    Zp(paramInt);
    this.ZZ.ZH(paramInt);
    this.Zo.setText("");
  }
  
  private void Zv(int paramInt) {
    this.ZP.setText(Integer.toString(paramInt));
  }
  
  private String ZZ(int paramInt1, int paramInt2, String paramString) {
    String str = Zb(this.ZtA, paramInt1 - paramInt2, paramInt1) + Zb(this.ZtA, paramInt1 - paramInt2, paramInt1) + a(7536, 4226);
    this.ZU.setText(str);
    return str;
  }
  
  private void ZB(String paramString) {
    String str = ZQ(paramString, 0, paramString.length());
    this.Zx.setText(str);
  }
  
  private String Zk(int paramInt1, int paramInt2) {
    String str = null;
    if (paramInt2 + 6 > this.ZtA.length() && paramInt2 < this.ZtA.length()) {
      if (paramInt2 == Zsw8.Zx(this.ZtA, this.ZtA.substring(paramInt2), paramInt1, this.ZtA.length()))
        str = this.ZtA.substring(paramInt2); 
    } else {
      int i = -1;
      int j;
      for (j = Zx(paramInt2, 0); j < 200 && j + paramInt2 <= this.ZtA.length() && j != i; j = Zx(paramInt2, j)) {
        i = j;
        if (paramInt2 == Zsw8.Zx(this.ZtA, this.ZtA.substring(paramInt2, paramInt2 + j), paramInt1, paramInt2 + j)) {
          str = this.ZtA.substring(paramInt2, paramInt2 + j);
          break;
        } 
      } 
    } 
    if (str == null)
      str = ""; 
    return str;
  }
  
  private void Zp(int paramInt) {
    this.ZE.setText(Integer.toString(paramInt));
  }
  
  private int ZV(int paramInt1, int paramInt2, int paramInt3) {
    Zbqc[] arrayOfZbqc = Z_();
    if (paramInt3 > 6) {
      paramInt3 = Zm(paramInt1, 0);
      while (paramInt3 <= paramInt1 && paramInt3 < 200 && paramInt1 - paramInt3 != Zsw8.Zx(this.ZtA, this.ZtA.substring(paramInt1 - paramInt3, paramInt1), paramInt2, paramInt1)) {
        paramInt3 = Zm(paramInt1, paramInt3);
        if (arrayOfZbqc == null)
          break; 
      } 
      if (paramInt3 >= 200)
        paramInt3 = 0; 
    } 
    String str = ZQ(this.ZtA, paramInt1 - paramInt3, paramInt1);
    this.ZM.setText(str);
    return paramInt3;
  }
  
  private void Zz() {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zb : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 224
    //   14: aload_0
    //   15: getfield ZU : Lburp/Zgff;
    //   18: iconst_0
    //   19: invokevirtual setEnabled : (Z)V
    //   22: aload_0
    //   23: getfield ZI : Lburp/Zm9v;
    //   26: iconst_0
    //   27: invokevirtual setVisible : (Z)V
    //   30: aload_0
    //   31: getfield ZV : Lburp/Zzdy;
    //   34: iconst_0
    //   35: invokevirtual setEnabled : (Z)V
    //   38: aload_0
    //   39: getfield ZR : Lburp/Zmg2;
    //   42: iconst_1
    //   43: invokevirtual setEnabled : (Z)V
    //   46: aload_0
    //   47: getfield Zq : Lburp/Zmg2;
    //   50: iconst_1
    //   51: invokevirtual setEnabled : (Z)V
    //   54: aload_0
    //   55: getfield ZN : Lburp/Zmg2;
    //   58: iconst_1
    //   59: invokevirtual setEnabled : (Z)V
    //   62: aload_0
    //   63: getfield Zu : Lburp/Zmg2;
    //   66: iconst_1
    //   67: invokevirtual setEnabled : (Z)V
    //   70: aload_0
    //   71: getfield ZR : Lburp/Zmg2;
    //   74: invokevirtual isSelected : ()Z
    //   77: ifeq -> 108
    //   80: aload_0
    //   81: getfield ZM : Lburp/Zgff;
    //   84: iconst_1
    //   85: invokevirtual setEnabled : (Z)V
    //   88: aload_0
    //   89: getfield ZE : Lburp/Zgff;
    //   92: iconst_0
    //   93: invokevirtual setEnabled : (Z)V
    //   96: aload_0
    //   97: getfield Zo : Lburp/Zm9v;
    //   100: iconst_0
    //   101: invokevirtual setVisible : (Z)V
    //   104: aload_1
    //   105: ifnonnull -> 132
    //   108: aload_0
    //   109: getfield ZM : Lburp/Zgff;
    //   112: iconst_0
    //   113: invokevirtual setEnabled : (Z)V
    //   116: aload_0
    //   117: getfield ZE : Lburp/Zgff;
    //   120: iconst_1
    //   121: invokevirtual setEnabled : (Z)V
    //   124: aload_0
    //   125: getfield Zo : Lburp/Zm9v;
    //   128: iconst_1
    //   129: invokevirtual setVisible : (Z)V
    //   132: aload_0
    //   133: getfield ZN : Lburp/Zmg2;
    //   136: invokevirtual isSelected : ()Z
    //   139: ifeq -> 170
    //   142: aload_0
    //   143: getfield Zx : Lburp/Zgff;
    //   146: iconst_1
    //   147: invokevirtual setEnabled : (Z)V
    //   150: aload_0
    //   151: getfield ZP : Lburp/Zgff;
    //   154: iconst_0
    //   155: invokevirtual setEnabled : (Z)V
    //   158: aload_0
    //   159: getfield ZQ : Lburp/Zm9v;
    //   162: iconst_0
    //   163: invokevirtual setVisible : (Z)V
    //   166: aload_1
    //   167: ifnonnull -> 194
    //   170: aload_0
    //   171: getfield Zx : Lburp/Zgff;
    //   174: iconst_0
    //   175: invokevirtual setEnabled : (Z)V
    //   178: aload_0
    //   179: getfield ZP : Lburp/Zgff;
    //   182: iconst_1
    //   183: invokevirtual setEnabled : (Z)V
    //   186: aload_0
    //   187: getfield ZQ : Lburp/Zm9v;
    //   190: iconst_1
    //   191: invokevirtual setVisible : (Z)V
    //   194: aload_0
    //   195: getfield ZC : Lburp/Ze01;
    //   198: aload_0
    //   199: invokevirtual Zv : ()Z
    //   202: ifeq -> 216
    //   205: aload_0
    //   206: invokevirtual Zc : ()Z
    //   209: ifeq -> 216
    //   212: iconst_1
    //   213: goto -> 217
    //   216: iconst_0
    //   217: invokevirtual setEnabled : (Z)V
    //   220: aload_1
    //   221: ifnonnull -> 339
    //   224: aload_0
    //   225: getfield ZR : Lburp/Zmg2;
    //   228: iconst_0
    //   229: invokevirtual setEnabled : (Z)V
    //   232: aload_0
    //   233: getfield Zq : Lburp/Zmg2;
    //   236: iconst_0
    //   237: invokevirtual setEnabled : (Z)V
    //   240: aload_0
    //   241: getfield ZN : Lburp/Zmg2;
    //   244: iconst_0
    //   245: invokevirtual setEnabled : (Z)V
    //   248: aload_0
    //   249: getfield Zu : Lburp/Zmg2;
    //   252: iconst_0
    //   253: invokevirtual setEnabled : (Z)V
    //   256: aload_0
    //   257: getfield ZM : Lburp/Zgff;
    //   260: iconst_0
    //   261: invokevirtual setEnabled : (Z)V
    //   264: aload_0
    //   265: getfield ZE : Lburp/Zgff;
    //   268: iconst_0
    //   269: invokevirtual setEnabled : (Z)V
    //   272: aload_0
    //   273: getfield Zx : Lburp/Zgff;
    //   276: iconst_0
    //   277: invokevirtual setEnabled : (Z)V
    //   280: aload_0
    //   281: getfield ZP : Lburp/Zgff;
    //   284: iconst_0
    //   285: invokevirtual setEnabled : (Z)V
    //   288: aload_0
    //   289: getfield Zo : Lburp/Zm9v;
    //   292: iconst_0
    //   293: invokevirtual setVisible : (Z)V
    //   296: aload_0
    //   297: getfield ZQ : Lburp/Zm9v;
    //   300: iconst_0
    //   301: invokevirtual setVisible : (Z)V
    //   304: aload_0
    //   305: getfield ZU : Lburp/Zgff;
    //   308: iconst_1
    //   309: invokevirtual setEnabled : (Z)V
    //   312: aload_0
    //   313: getfield ZI : Lburp/Zm9v;
    //   316: iconst_1
    //   317: invokevirtual setVisible : (Z)V
    //   320: aload_0
    //   321: getfield ZV : Lburp/Zzdy;
    //   324: iconst_1
    //   325: invokevirtual setEnabled : (Z)V
    //   328: aload_0
    //   329: getfield ZC : Lburp/Ze01;
    //   332: aload_0
    //   333: invokevirtual Zf : ()Z
    //   336: invokevirtual setEnabled : (Z)V
    //   339: return
  }
  
  private boolean Zv() {
    String str = this.Zo.getText();
    return "".equals((str == null) ? "" : str.trim());
  }
  
  private boolean Zc() {
    String str = this.ZQ.getText();
    return "".equals((str == null) ? "" : str.trim());
  }
  
  private boolean Zf() {
    String str = this.ZI.getText();
    return "".equals((str == null) ? "" : str.trim());
  }
  
  private int[] ZJ(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZtA : Ljava/lang/String;
    //   8: ifnull -> 18
    //   11: aload_0
    //   12: getfield ZZ : Lburp/Zgeh;
    //   15: ifnonnull -> 20
    //   18: aconst_null
    //   19: areturn
    //   20: aload_0
    //   21: getfield ZZ : Lburp/Zgeh;
    //   24: aload_0
    //   25: getfield ZtA : Ljava/lang/String;
    //   28: aload_0
    //   29: getfield Zm : Lburp/Zs68;
    //   32: getfield Zk : I
    //   35: invokevirtual Zs : (Ljava/lang/String;I)[I
    //   38: astore_3
    //   39: aload_3
    //   40: ifnonnull -> 57
    //   43: aload_0
    //   44: getfield Zz : Lburp/Zbkv;
    //   47: invokestatic emptyList : ()Ljava/util/List;
    //   50: invokevirtual Zy : (Ljava/util/List;)V
    //   53: aload_2
    //   54: ifnonnull -> 94
    //   57: aload_0
    //   58: getfield Zz : Lburp/Zbkv;
    //   61: new burp/Zzta
    //   64: dup
    //   65: aload_3
    //   66: iconst_0
    //   67: iaload
    //   68: aload_3
    //   69: iconst_1
    //   70: iaload
    //   71: invokespecial <init> : (II)V
    //   74: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   77: invokevirtual Zy : (Ljava/util/List;)V
    //   80: iload_1
    //   81: ifeq -> 94
    //   84: aload_0
    //   85: getfield Zz : Lburp/Zbkv;
    //   88: aload_3
    //   89: iconst_0
    //   90: iaload
    //   91: invokevirtual ZY : (I)V
    //   94: aload_3
    //   95: areturn
  }
  
  private void ZM() {
    this.Zw = new ButtonGroup();
    this.ZG = new ButtonGroup();
    this.Zr = new ButtonGroup();
    this.ZF = new Zl8w();
    this.Zt = new Zzdy();
    this.Zy = new Zzdy();
    this.Zs = new Ze01();
    this.Zv = new Zm2o();
    this.Zf = new Zbqc();
    this.ZO = new Zbqc();
    this.ZJ = new Zbqc();
    this.ZW = new Zbqc();
    this.Zc = new Zbqc();
    this.ZR = new Zmg2();
    this.Zq = new Zmg2();
    this.ZL = new Zm99();
    this.ZN = new Zmg2();
    this.Zu = new Zmg2();
    this.ZK = new Zbqc();
    this.ZM = new Zgff();
    this.ZE = new Zgff();
    this.Zo = new Zm9v();
    this.Zx = new Zgff();
    this.ZP = new Zgff();
    this.ZQ = new Zm9v();
    this.ZT = new Zbqc();
    this.Zk = new Zbqc();
    this.ZU = new Zgff();
    this.ZY = new Zbqc();
    this.ZV = new Zzdy();
    this.ZI = new Zm9v();
    this.ZD = new Zbqc();
    this.ZC = new Ze01();
    this.Zg = new Ze01();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZF, gridBagConstraints);
    this.Zt.setText(a(7510, -9902));
    this.Zt.addActionListener(this::ZN);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    add(this.Zt, gridBagConstraints);
    this.Zy.setText(a(7517, -10443));
    this.Zy.addActionListener(this::ZI);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    add(this.Zy, gridBagConstraints);
    this.Zs.setText(a(7512, 7953));
    this.Zs.setToolTipText(a(7498, 7877));
    this.Zs.addActionListener(this::ZO);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 22;
    add(this.Zs, gridBagConstraints);
    this.Zv.Zi(Zk97.DESKTOP_FUNCTIONS_RESPONSE_EXTRACTION);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zv, gridBagConstraints);
    this.Zf.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zf, gridBagConstraints);
    this.ZO.setLayout(new GridLayout(1, 2, 10, 0));
    this.ZJ.setBorder(BorderFactory.createTitledBorder(""));
    this.ZJ.setLayout(new BorderLayout());
    this.ZW.setBorder(BorderFactory.createEmptyBorder(15, 10, 0, 10));
    this.ZW.setLayout(new BorderLayout(5, 0));
    this.Zc.setLayout(new GridLayout(6, 1, 0, 2));
    this.ZG.add(this.ZR);
    this.ZR.setText(a(7511, 21566));
    this.ZR.addActionListener(this::ZZ);
    this.Zc.add(this.ZR);
    this.ZG.add(this.Zq);
    this.Zq.setText(a(7501, -23943));
    this.Zq.addActionListener(this::Zu);
    this.Zc.add(this.Zq);
    this.Zc.add(this.ZL);
    this.Zr.add(this.ZN);
    this.ZN.setText(a(7490, -30938));
    this.ZN.addActionListener(this::Zc);
    this.Zc.add(this.ZN);
    this.Zr.add(this.Zu);
    this.Zu.setText(a(7496, -23340));
    this.Zu.addActionListener(this::Zl);
    this.Zc.add(this.Zu);
    this.ZW.add(this.Zc, a(7503, 25364));
    this.ZK.setLayout(new GridLayout(6, 1, 0, 5));
    this.ZM.ZH(Zlw9.SEARCH_TERM);
    this.ZM.setName(a(7489, 12197));
    this.ZM.addKeyListener(new Zsoj(this));
    this.ZK.add(this.ZM);
    this.ZE.ZH(Zlw9.NUMBER);
    this.ZE.setEnabled(false);
    this.ZE.addKeyListener(new Zznb(this));
    this.ZK.add(this.ZE);
    this.Zo.setHorizontalAlignment(4);
    this.Zo.setText("");
    this.ZK.add(this.Zo);
    this.Zx.ZH(Zlw9.SEARCH_TERM);
    this.Zx.setName(a(7507, 2662));
    this.Zx.setEnabled(false);
    this.Zx.addKeyListener(new Zzy6(this));
    this.ZK.add(this.Zx);
    this.ZP.ZH(Zlw9.NUMBER);
    this.ZP.setEnabled(false);
    this.ZP.addKeyListener(new Zehz(this));
    this.ZK.add(this.ZP);
    this.ZQ.setHorizontalAlignment(4);
    this.ZQ.setText("");
    this.ZK.add(this.ZQ);
    this.ZW.add(this.ZK, a(7519, 11610));
    this.ZJ.add(this.ZW, a(7493, -23786));
    this.ZO.add(this.ZJ);
    this.ZT.setBorder(BorderFactory.createTitledBorder(""));
    this.ZT.setLayout(new BorderLayout());
    this.Zk.setBorder(BorderFactory.createEmptyBorder(15, 10, 0, 10));
    this.Zk.setLayout(new GridLayout(6, 1, 0, 5));
    this.ZU.ZH(Zlw9.SEARCH_TERM);
    this.ZU.addKeyListener(new Zv_(this));
    this.Zk.add(this.ZU);
    this.ZY.setLayout(new BorderLayout());
    this.ZV.setText(a(7518, -27225));
    this.ZV.addActionListener(this::ZM);
    this.ZY.add(this.ZV, a(7494, -3560));
    this.ZI.setText("");
    this.ZY.add(this.ZI, a(7514, -30850));
    this.Zk.add(this.ZY);
    this.ZT.add(this.Zk, a(7488, 19063));
    this.ZO.add(this.ZT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZO, gridBagConstraints);
    this.ZD.setLayout(new GridLayout(1, 2, 5, 0));
    this.ZC.setText(a(7505, -19557));
    this.ZC.addActionListener(this::Zj);
    this.ZD.add(this.ZC);
    this.Zg.setText(a(7500, -16209));
    this.Zg.addActionListener(this::ZE);
    this.ZD.add(this.Zg);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 26;
    add(this.ZD, gridBagConstraints);
  }
  
  private void Za() {
    this.ZZ.Zr();
    Zz();
    ZJ(true);
    this.Zj.setSelected(false);
    this.ZT.revalidate();
    this.ZT.validate();
    this.ZT.repaint();
  }
  
  private void ZT() {
    this.ZZ.ZP();
    Zz();
    ZJ(true);
    this.Zb.setSelected(false);
    this.ZJ.revalidate();
    this.ZJ.validate();
    this.ZJ.repaint();
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    this.ZZ.ZB((byte)0);
    Zz();
    ZJ(true);
    this.ZM.requestFocus();
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    this.ZZ.ZB((byte)1);
    Zz();
    ZJ(true);
    this.ZE.requestFocus();
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.ZZ.ZV((byte)0);
    Zz();
    ZJ(true);
    this.Zx.requestFocus();
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.ZZ.ZV((byte)1);
    Zz();
    ZJ(true);
    this.ZP.requestFocus();
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    this.ZZ.Zq(this.ZV.isSelected());
    ZJ(true);
  }
  
  private void Zy(KeyEvent paramKeyEvent) {
    this.ZZ.Zn(Zn(this.ZM.getText()));
    int[] arrayOfInt = ZJ(true);
    if (arrayOfInt != null)
      Zc(arrayOfInt[0]); 
  }
  
  private void ZG(KeyEvent paramKeyEvent) {
    String str = this.ZE.getText();
    try {
      int i = Integer.parseInt(str);
      try {
        if (i < 0)
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZZ.ZH(i);
      this.Zo.setText("");
      this.ZC.setEnabled(Zc());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZZ.ZH(-1);
      this.Zo.setText(a(7495, -20974));
      this.ZC.setEnabled(false);
    } 
    ZJ(true);
  }
  
  private void Zw(KeyEvent paramKeyEvent) {
    String str = this.ZP.getText();
    try {
      int i = Integer.parseInt(str);
      try {
        if (i < 1)
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZZ.ZX(i);
      this.ZQ.setText("");
      this.ZC.setEnabled(Zv());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZZ.ZX(-1);
      this.ZQ.setText(a(7491, -17072));
      this.ZC.setEnabled(false);
    } 
    ZJ(true);
  }
  
  private void Zk(KeyEvent paramKeyEvent) {
    try {
      this.ZZ.Zf(this.ZU.getText());
      this.ZI.setText("");
      this.ZC.setEnabled(true);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZI.setText(exception.getMessage());
      this.ZC.setEnabled(false);
    } 
    ZJ(true);
  }
  
  private void Zm(KeyEvent paramKeyEvent) {
    this.ZZ.Zr(Zn(this.Zx.getText()));
    int[] arrayOfInt = ZJ(true);
    if (arrayOfInt != null)
      ZC(arrayOfInt[1] - arrayOfInt[0]); 
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    this.Zn = this.Zy.isSelected();
    if (this.Zn)
      Zf(this.Zz.ZB()); 
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    this.ZZ.Za(this.Zt.isSelected());
    ZJ(true);
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: dup
    //   6: astore_3
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield Z_ : Lburp/Zrl_;
    //   12: ifnonnull -> 45
    //   15: aload_0
    //   16: new burp/Zrl_
    //   19: dup
    //   20: aload_0
    //   21: invokespecial <init> : (Lburp/Zg8q;)V
    //   24: putfield Z_ : Lburp/Zrl_;
    //   27: aload_0
    //   28: getfield Za : Lburp/Ztwv;
    //   31: aload_0
    //   32: getfield Z_ : Lburp/Zrl_;
    //   35: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   40: pop
    //   41: aload_2
    //   42: ifnonnull -> 50
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield Z_ : Lburp/Zrl_;
    //   50: aload_3
    //   51: monitorexit
    //   52: goto -> 62
    //   55: astore #4
    //   57: aload_3
    //   58: monitorexit
    //   59: aload #4
    //   61: athrow
    //   62: return
    // Exception table:
    //   from	to	target	type
    //   8	52	55	finally
    //   55	59	55	finally
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    Window window = Zt2m.ZF(this);
    window.setVisible(false);
    window.dispose();
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    this.ZZ = null;
    Zj(paramActionEvent);
  }
  
  private void lambda$new$1(ActionEvent paramActionEvent) {
    ZT();
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    Za();
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '4^Eü4ª|å=N1R5[_òSñy¦zveî±Æ½!¹I\\të«ýÍmÔÈW¤rCì%ý@À ­+)\\f2ì±rQ_ÚOsh\\tÁGh¸qcê¦°}ùåtÂ±@^ã<4Þ%Ë>thÁÓ û#ÐÍÇ¦ º«ñOUÚB»çõï­A!AF¦¤±æ¢~ï{íçæaH\úL"ÿý@õ¦´ âÐI¼%Á2FOQÝwÛÈN·¨æ_>W©³U(u}à»µöÑ £åU'®á3Ë©æ¼Æ[ÄuFÊ<§éí¿\\nÜØDNÊhÓ©ÛvÍkÕ¡ÆJz¨T;\\bÈûÿânpÔ³n~.Hdùæ,_)¶:¯¬ð\ÔdÒ.G*I.kqª>ºA6xå?¬@]xJu}ªø\\bã]¥ehÃÀ lYøi4bé&zK wÕ½Ô(©bUÀÔY(#¶ã×k³{,¦ùN¥c¦ ?MÇ1@L`­$Í|S9[®ÐCÔâGý$:k§ÝFI^²ØGâqäúwJg¡Nõ\\n{­{>,Qj·È0d\\bd:b@PÜAlûÂi`æí'6ë&·dè,Ú·]ü6>V\Oçµ)cgpj$»0=ø\\n=B¦ltá*ïi|R×iðÌnÉß¬cì[xNÄùÆÊK*èÂÜÑÃïÉöÛ»t¥¿º](*ÞÞÄ[ËÈ}¯yL¨|º²ï( Á_áöPý(yílý-«F3E\\nÃ÷h«Û+N¸s®£÷Ë­ðk*÷ì¶ÙÂçÚ¼ËAO,}ýQ$=o~[HÚ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_1
    //   19: anewarray burp/Zbqc
    //   22: iconst_2
    //   23: istore_1
    //   24: invokestatic ZB : ([Lburp/Zbqc;)V
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #14
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '¾¨(g}'ø¶ÜF¬@CWÝ?éáÇ'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #20
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #10
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zg8q.a : [Ljava/lang/String;
    //   138: bipush #34
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zg8q.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #81
    //   222: goto -> 252
    //   225: bipush #39
    //   227: goto -> 252
    //   230: bipush #52
    //   232: goto -> 252
    //   235: bipush #125
    //   237: goto -> 252
    //   240: bipush #113
    //   242: goto -> 252
    //   245: bipush #59
    //   247: goto -> 252
    //   250: bipush #110
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: bipush #16
    //   310: newarray byte
    //   312: dup
    //   313: iconst_0
    //   314: bipush #48
    //   316: bastore
    //   317: dup
    //   318: iconst_1
    //   319: bipush #49
    //   321: bastore
    //   322: dup
    //   323: iconst_2
    //   324: bipush #50
    //   326: bastore
    //   327: dup
    //   328: iconst_3
    //   329: bipush #51
    //   331: bastore
    //   332: dup
    //   333: iconst_4
    //   334: bipush #52
    //   336: bastore
    //   337: dup
    //   338: iconst_5
    //   339: bipush #53
    //   341: bastore
    //   342: dup
    //   343: bipush #6
    //   345: bipush #54
    //   347: bastore
    //   348: dup
    //   349: bipush #7
    //   351: bipush #55
    //   353: bastore
    //   354: dup
    //   355: bipush #8
    //   357: bipush #56
    //   359: bastore
    //   360: dup
    //   361: bipush #9
    //   363: bipush #57
    //   365: bastore
    //   366: dup
    //   367: bipush #10
    //   369: bipush #97
    //   371: bastore
    //   372: dup
    //   373: bipush #11
    //   375: bipush #98
    //   377: bastore
    //   378: dup
    //   379: bipush #12
    //   381: bipush #99
    //   383: bastore
    //   384: dup
    //   385: bipush #13
    //   387: bipush #100
    //   389: bastore
    //   390: dup
    //   391: bipush #14
    //   393: bipush #101
    //   395: bastore
    //   396: dup
    //   397: bipush #15
    //   399: bipush #102
    //   401: bastore
    //   402: putstatic burp/Zg8q.Zd : [B
    //   405: return
  }
  
  public static void ZB(Zbqc[] paramArrayOfZbqc) {
    ZS = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Z_() {
    return ZS;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1D51) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'ö';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */