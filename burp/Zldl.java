package burp;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zby;
import net.portswigger.Zgn;
import net.portswigger.Zk_;
import net.portswigger.Zny;
import net.portswigger.Zrx3;
import net.portswigger.Zs4;
import net.portswigger.Zvu;

public class Zldl implements Ztu3, Zedo {
  private final Zs4 ZU;
  
  private final Zgdu Zm;
  
  private final Zby<?> ZK;
  
  private final Zzvf Zv;
  
  private final Zmx0 Za;
  
  private final Zbxg Zw;
  
  private final Zgae Zi;
  
  private final Zr18 ZF;
  
  private volatile Zgn Zy;
  
  private volatile Zrwj ZV;
  
  private volatile int ZH;
  
  private volatile String Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zldl(Zs4 paramZs4, Zgdu paramZgdu, Zra1 paramZra1, Zem0 paramZem0, Zg1j paramZg1j, Zt90 paramZt90, Zlnv paramZlnv, Zr18 paramZr18, Zmx0 paramZmx0, Ztwv paramZtwv) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield ZH : I
    //   9: invokestatic Zg : ()I
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield Zo : Ljava/lang/String;
    //   17: istore #11
    //   19: aload_0
    //   20: aload_1
    //   21: putfield ZU : Lnet/portswigger/Zs4;
    //   24: aload_0
    //   25: aload_2
    //   26: putfield Zm : Lburp/Zgdu;
    //   29: aload_0
    //   30: aload #9
    //   32: putfield Za : Lburp/Zmx0;
    //   35: aload_3
    //   36: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   39: if_acmpne -> 116
    //   42: aload_0
    //   43: aconst_null
    //   44: putfield ZF : Lburp/Zr18;
    //   47: aload_0
    //   48: aconst_null
    //   49: putfield Zi : Lburp/Zgae;
    //   52: aload_0
    //   53: aload #4
    //   55: new burp/Ztgn
    //   58: dup
    //   59: aload_2
    //   60: invokespecial <init> : (Lburp/Zgdu;)V
    //   63: new net/portswigger/Zzk
    //   66: dup
    //   67: sipush #22828
    //   70: sipush #-29693
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: invokespecial <init> : (Ljava/lang/String;)V
    //   79: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   82: aload #8
    //   84: invokestatic ZI : (Lburp/Zem0;Lnet/portswigger/Zs_;Ljava/util/List;Lburp/Zr18;)Lnet/portswigger/Zby;
    //   87: putfield ZK : Lnet/portswigger/Zby;
    //   90: iload #11
    //   92: ifne -> 306
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: iconst_2
    //   103: anewarray burp/Zbqc
    //   106: invokestatic Zr : ([Lburp/Zbqc;)V
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload_0
    //   117: aload #8
    //   119: putfield ZF : Lburp/Zr18;
    //   122: aload_3
    //   123: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_SERVER : Lburp/Zra1;
    //   126: if_acmpne -> 180
    //   129: aload_0
    //   130: aload #4
    //   132: aload #5
    //   134: invokevirtual ZO : ()Ljava/lang/String;
    //   137: aload #8
    //   139: aload #6
    //   141: aload #7
    //   143: new net/portswigger/Zzk
    //   146: dup
    //   147: sipush #22826
    //   150: sipush #-5212
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   162: invokestatic ZJ : (Lburp/Zem0;Ljava/lang/String;Lburp/Zr18;Lburp/Zt90;Lburp/Zlnv;Ljava/util/List;)Lnet/portswigger/Zby;
    //   165: putfield ZK : Lnet/portswigger/Zby;
    //   168: iload #11
    //   170: ifne -> 280
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: aload_3
    //   181: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_AGENT : Lburp/Zra1;
    //   184: if_acmpne -> 249
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload_0
    //   195: aload #4
    //   197: aload #5
    //   199: invokevirtual ZO : ()Ljava/lang/String;
    //   202: aload #8
    //   204: aload #6
    //   206: aload #7
    //   208: new net/portswigger/Zzk
    //   211: dup
    //   212: sipush #22824
    //   215: sipush #-30835
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: invokespecial <init> : (Ljava/lang/String;)V
    //   224: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   227: aload #10
    //   229: aload #9
    //   231: invokestatic ZD : (Lburp/Zem0;Ljava/lang/String;Lburp/Zr18;Lburp/Zt90;Lburp/Zlnv;Ljava/util/List;Lburp/Ztwv;Lburp/Zmx0;)Lnet/portswigger/Zby;
    //   234: putfield ZK : Lnet/portswigger/Zby;
    //   237: iload #11
    //   239: ifne -> 280
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   248: athrow
    //   249: new java/lang/IllegalStateException
    //   252: dup
    //   253: aload_3
    //   254: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   257: sipush #22825
    //   260: sipush #11150
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: swap
    //   267: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   272: invokespecial <init> : (Ljava/lang/String;)V
    //   275: athrow
    //   276: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   279: athrow
    //   280: aload_0
    //   281: new burp/Zgae
    //   284: dup
    //   285: aload_3
    //   286: aload_2
    //   287: aload #8
    //   289: aload_0
    //   290: getfield Za : Lburp/Zmx0;
    //   293: aload_0
    //   294: getfield ZK : Lnet/portswigger/Zby;
    //   297: getfield ZA : Lnet/portswigger/Ztj;
    //   300: invokespecial <init> : (Lburp/Zra1;Lburp/Zgdu;Lburp/Zr18;Lburp/Zmx0;Lnet/portswigger/Ztj;)V
    //   303: putfield Zi : Lburp/Zgae;
    //   306: aload #4
    //   308: ldc net/portswigger/Ztj
    //   310: aload_0
    //   311: getfield ZK : Lnet/portswigger/Zby;
    //   314: getfield ZA : Lnet/portswigger/Ztj;
    //   317: invokevirtual Za : (Ljava/lang/Class;Ljava/lang/Object;)Lburp/Zem0;
    //   320: pop
    //   321: aload_0
    //   322: new burp/Zzvf
    //   325: dup
    //   326: aload_0
    //   327: getfield ZK : Lnet/portswigger/Zby;
    //   330: aload #4
    //   332: aload_0
    //   333: getfield Za : Lburp/Zmx0;
    //   336: invokespecial <init> : (Lnet/portswigger/Zby;Lburp/Zem0;Lburp/Zmx0;)V
    //   339: putfield Zv : Lburp/Zzvf;
    //   342: aload_0
    //   343: new burp/Zbxg
    //   346: dup
    //   347: new net/portswigger/Zt_
    //   350: dup
    //   351: invokespecial <init> : ()V
    //   354: iconst_1
    //   355: invokevirtual ZL : (Z)Lnet/portswigger/Zt_;
    //   358: aload_0
    //   359: getfield ZK : Lnet/portswigger/Zby;
    //   362: getfield ZA : Lnet/portswigger/Ztj;
    //   365: aload_3
    //   366: invokespecial <init> : (Lnet/portswigger/Zt_;Lnet/portswigger/Ztj;Lburp/Zra1;)V
    //   369: putfield Zw : Lburp/Zbxg;
    //   372: aload #4
    //   374: ldc burp/Zbxg
    //   376: aload_0
    //   377: getfield Zw : Lburp/Zbxg;
    //   380: invokevirtual Za : (Ljava/lang/Class;Ljava/lang/Object;)Lburp/Zem0;
    //   383: pop
    //   384: return
    // Exception table:
    //   from	to	target	type
    //   19	95	98	java/lang/IllegalStateException
    //   42	109	112	java/lang/IllegalStateException
    //   116	173	176	java/lang/IllegalStateException
    //   129	187	190	java/lang/IllegalStateException
    //   180	242	245	java/lang/IllegalStateException
    //   194	276	276	java/lang/IllegalStateException
  }
  
  public String Zq() {
    return this.ZU.Zi().Zx().ZK(32);
  }
  
  public static String ZI(String paramString) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance(a(22827, 14067));
      messageDigest.update(Zny.ZI(paramString));
      return Base64.getEncoder().encodeToString(messageDigest.digest());
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      Zah.Zl(noSuchAlgorithmException, Zk_.UNEXPECTED);
      throw new IllegalStateException(a(22830, -744), noSuchAlgorithmException);
    } 
  }
  
  public synchronized void ZT() {
    int i = Zgdu.Zg();
    try {
      if (!this.Zm.Zo()) {
        try {
          if (ZR())
            ZY(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (ZR())
        try {
          if (Zs()) {
            try {
              this.Zy.close();
              if (i == 0)
                return; 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!this.Zw.ZV())
        this.Zw.Zw(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      try {
        Zg(this.Zm);
        this.Zo = null;
        if (this.Zi != null) {
          this.ZV = this.Zi.Zt(this.Zy.Zw());
          this.ZV.ZP();
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      try {
        Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
        this.Zo = iOException.getMessage();
        this.Za.ZH(a(22829, 20513));
        if (this.ZF != null)
          this.ZF.Z_(Zmg9.API_STARTUP_FAILED); 
      } catch (IOException iOException1) {
        throw a(null);
      } 
    } 
  }
  
  public synchronized void ZY() {
    try {
      if (this.Zy != null) {
        this.Zy.close();
        this.Zy = null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.ZV != null) {
        this.ZV.Zz();
        this.ZV = null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zw.Zs();
  }
  
  public synchronized String Zn() {
    return this.Zo;
  }
  
  public synchronized boolean ZR() {
    try {
      if (this.Zy != null)
        try {
          if (this.Zy.ZQ());
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public void Zt2() {
    ZT();
  }
  
  private boolean Zs() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (Zt() != this.ZH);
  }
  
  private int Zt() {
    Zzqi zzqi = this.Zm.ZF();
    return Objects.hash(new Object[] { Integer.valueOf(zzqi.ZQ), zzqi.Zj, zzqi.Zf });
  }
  
  public void ZE() {
    try {
      if (this.ZV != null)
        this.ZV.ZS(Zrx3.READY); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private void Zg(Zgdu paramZgdu) throws IOException {
    this.ZH = Zt();
    this.Zy = this.Zv.ZI(paramZgdu);
    Thread thread = new Thread((Runnable)this.Zy);
    try {
      thread.setPriority(10);
      thread.start();
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = (this.ZK.ZX instanceof Zvu) ? (((Zvu)this.ZK.ZX).Zl.Zw() + "/") : "";
    this.Za.ZH(String.format(a(22831, -21291), new Object[] { this.Zy.Zw(), str }));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'æ2©hh²B ï¢âáfÜ/:ëQ;Lú<7sîÍvû:®0pè¤òïB/´>µª.jÊMeÖýùA÷æðwlZåFÄ5í©ñ)á\\b0~nè­!W'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #11
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '"egdëÐæßÿüW,\\n1À¨ªä\\tKz4oºäåÇL+`cø¬Kl>fj¶Kuµñ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #29
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zldl.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zldl.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #107
    //   214: goto -> 243
    //   217: bipush #73
    //   219: goto -> 243
    //   222: bipush #112
    //   224: goto -> 243
    //   227: bipush #47
    //   229: goto -> 243
    //   232: iconst_3
    //   233: goto -> 243
    //   236: bipush #77
    //   238: goto -> 243
    //   241: bipush #25
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5928) & 0xFFFF;
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
      byte b1 = 105;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */