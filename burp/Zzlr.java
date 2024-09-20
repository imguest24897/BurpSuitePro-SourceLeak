package burp;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzlr {
  private final Zz0n Zc;
  
  private final Zt4u ZU;
  
  private final Zkr0 ZA;
  
  private final Ztdi ZT;
  
  private final Zmrj ZI;
  
  private final Zxgc ZS;
  
  private final Zgzy Zf;
  
  private final Zkl6 Zt;
  
  private final Zgx0 Zz;
  
  private final Zl6[] ZH = new Zl6[] { new Zl6(), new Zl6() };
  
  private final Zmr ZQ = new Zmr();
  
  private final Zl2z Zu;
  
  private final Zrau Zx;
  
  private final Zbiw Zo;
  
  private final Zbtq[] ZM = new Zbtq[2];
  
  private final Zbth[] ZE = new Zbth[2];
  
  private final Zbt7[] ZP = new Zbt7[2];
  
  private final Zbtv[] ZF = new Zbtv[2];
  
  private final Zbtm[] Zw = new Zbtm[2];
  
  private Zbtb Za;
  
  private Zbte Zb;
  
  private Zbt9 ZR;
  
  private Zbt2 Zp;
  
  private final List<Zsic> Ze = new ArrayList<>();
  
  private static Zbqc[] Zl;
  
  private static final String a;
  
  public Zzlr(Window paramWindow, Zz0n paramZz0n, Zt4u paramZt4u, Zkr0 paramZkr0, Ztdi paramZtdi, Zmrj paramZmrj, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6, Zgx0 paramZgx0) {
    Zm2.ZC(Zrrh.TARGET_SITE_MAP_COMPARE_SITE_MAPS);
    this.Zc = paramZz0n;
    this.ZU = paramZt4u;
    this.ZA = paramZkr0;
    this.ZT = paramZtdi;
    this.ZI = paramZmrj;
    this.ZS = paramZxgc;
    this.Zf = paramZgzy;
    this.Zt = paramZkl6;
    this.Zz = paramZgx0;
    this.Zu = new Zl2z();
    this.Zx = paramZgx0.ZP(this.Zu, paramZxgc, paramZgzy, paramZkl6);
    this.ZM[0] = new Zbtq(this, 0);
    this.Zo = new Zl0c(this, paramWindow, a, 140, 40, this.ZM[0]);
  }
  
  private void ZC() {
    Zl6[] arrayOfZl6 = this.ZH;
    int i = arrayOfZl6.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zp();
    while (b < i) {
      Zl6 zl6 = arrayOfZl6[b];
      if (zl6.Zo != null)
        try {
          zl6.Zo.close();
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IGNORED);
        }  
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  Zl04 ZG() {
    return this.Zo.Zu();
  }
  
  Zkr0 ZX() {
    return this.ZA;
  }
  
  Ztdi ZB() {
    return this.ZT;
  }
  
  Zmrj Zx() {
    return this.ZI;
  }
  
  Zl6[] Zc() {
    return this.ZH;
  }
  
  Zl6 Zh(int paramInt) {
    return this.ZH[paramInt];
  }
  
  Zmr Zz() {
    return this.ZQ;
  }
  
  Zrau ZD() {
    return this.Zx;
  }
  
  boolean Zu() {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (this.ZR != null);
  }
  
  Zsic Zw(Zsic paramZsic) {
    Zsic zsic = this.Ze.remove(this.Ze.size() - 1);
    try {
      if (zsic instanceof Zbt7) {
        ((Zbt7)zsic).ZQ();
        return Zw(paramZsic);
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (zsic instanceof Zbt9) {
        this.Ze.clear();
        return this.Za;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zuh.Zb((zsic != null), Zqf.Zx);
    return zsic;
  }
  
  Zsic ZV(Zsic paramZsic) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic Zp : ()[Lburp/Zbqc;
    //   5: iconst_0
    //   6: istore #4
    //   8: astore_2
    //   9: iload #4
    //   11: iconst_1
    //   12: if_icmpgt -> 41
    //   15: aload_0
    //   16: iload #4
    //   18: aload_1
    //   19: invokevirtual Zi : (ILburp/Zsic;)Lburp/Zsic;
    //   22: astore_3
    //   23: aload_3
    //   24: ifnull -> 34
    //   27: goto -> 41
    //   30: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   33: athrow
    //   34: iinc #4, 1
    //   37: aload_2
    //   38: ifnull -> 9
    //   41: aload_3
    //   42: ifnonnull -> 173
    //   45: aload_0
    //   46: getfield ZH : [Lburp/Zl6;
    //   49: iconst_1
    //   50: aaload
    //   51: getfield ZI : Lburp/Zxl3;
    //   54: getstatic burp/Zxl3.PROJECT_FILE : Lburp/Zxl3;
    //   57: if_acmpne -> 84
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   66: athrow
    //   67: aload_1
    //   68: aload_0
    //   69: getfield ZF : [Lburp/Zbtv;
    //   72: iconst_1
    //   73: aaload
    //   74: if_acmpeq -> 123
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   83: athrow
    //   84: aload_0
    //   85: getfield ZH : [Lburp/Zl6;
    //   88: iconst_1
    //   89: aaload
    //   90: getfield ZI : Lburp/Zxl3;
    //   93: getstatic burp/Zxl3.REREQUEST : Lburp/Zxl3;
    //   96: if_acmpne -> 173
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   105: athrow
    //   106: aload_1
    //   107: aload_0
    //   108: getfield Zw : [Lburp/Zbtm;
    //   111: iconst_1
    //   112: aaload
    //   113: if_acmpne -> 173
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   122: athrow
    //   123: aload_0
    //   124: getfield Za : Lburp/Zbtb;
    //   127: ifnonnull -> 168
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   136: athrow
    //   137: aload_0
    //   138: new burp/Zbtb
    //   141: dup
    //   142: aload_0
    //   143: getfield Zc : Lburp/Zz0n;
    //   146: aload_0
    //   147: getfield ZU : Lburp/Zt4u;
    //   150: aload_0
    //   151: aload_0
    //   152: getfield Zo : Lburp/Zbiw;
    //   155: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zzlr;Lburp/Zbiw;)V
    //   158: putfield Za : Lburp/Zbtb;
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   167: athrow
    //   168: aload_0
    //   169: getfield Za : Lburp/Zbtb;
    //   172: astore_3
    //   173: aload_3
    //   174: ifnonnull -> 357
    //   177: aload_1
    //   178: aload_0
    //   179: getfield Za : Lburp/Zbtb;
    //   182: if_acmpne -> 238
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   191: athrow
    //   192: aload_0
    //   193: getfield Zb : Lburp/Zbte;
    //   196: ifnonnull -> 233
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   205: athrow
    //   206: aload_0
    //   207: new burp/Zbte
    //   210: dup
    //   211: aload_0
    //   212: getfield Zc : Lburp/Zz0n;
    //   215: aload_0
    //   216: getfield ZU : Lburp/Zt4u;
    //   219: aload_0
    //   220: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zzlr;)V
    //   223: putfield Zb : Lburp/Zbte;
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   232: athrow
    //   233: aload_0
    //   234: getfield Zb : Lburp/Zbte;
    //   237: astore_3
    //   238: aload_1
    //   239: aload_0
    //   240: getfield Zb : Lburp/Zbte;
    //   243: if_acmpne -> 308
    //   246: aload_0
    //   247: getfield ZR : Lburp/Zbt9;
    //   250: ifnull -> 268
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   259: athrow
    //   260: iconst_1
    //   261: goto -> 269
    //   264: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   267: athrow
    //   268: iconst_0
    //   269: istore #4
    //   271: aload_0
    //   272: aload_0
    //   273: getfield Zz : Lburp/Zgx0;
    //   276: aload_0
    //   277: aload_0
    //   278: getfield Zo : Lburp/Zbiw;
    //   281: iload #4
    //   283: aload_0
    //   284: getfield Zt : Lburp/Zkl6;
    //   287: aload_0
    //   288: getfield Zu : Lburp/Zl2z;
    //   291: invokeinterface Zd : (Lburp/Zzlr;Lburp/Zbiw;ZLburp/Zkl6;Lburp/Zl2z;)Lburp/Zbt9;
    //   296: putfield ZR : Lburp/Zbt9;
    //   299: aload_0
    //   300: getfield ZR : Lburp/Zbt9;
    //   303: astore_3
    //   304: aload_2
    //   305: ifnull -> 357
    //   308: aload_1
    //   309: aload_0
    //   310: getfield ZR : Lburp/Zbt9;
    //   313: if_acmpne -> 357
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   322: athrow
    //   323: aload_0
    //   324: invokevirtual ZC : ()V
    //   327: aload_0
    //   328: new burp/Zbt2
    //   331: dup
    //   332: aload_0
    //   333: aload_0
    //   334: getfield Zo : Lburp/Zbiw;
    //   337: invokespecial <init> : (Lburp/Zzlr;Lburp/Zbiw;)V
    //   340: putfield Zp : Lburp/Zbt2;
    //   343: aload_0
    //   344: <illegal opcode> run : (Lburp/Zzlr;)Ljava/lang/Runnable;
    //   349: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   352: aload_0
    //   353: getfield Zp : Lburp/Zbt2;
    //   356: astore_3
    //   357: aload_0
    //   358: getfield Ze : Ljava/util/List;
    //   361: aload_1
    //   362: invokeinterface add : (Ljava/lang/Object;)Z
    //   367: pop
    //   368: aload_3
    //   369: ifnull -> 380
    //   372: iconst_1
    //   373: goto -> 381
    //   376: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   379: athrow
    //   380: iconst_0
    //   381: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   384: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   387: aload_3
    //   388: areturn
    // Exception table:
    //   from	to	target	type
    //   23	30	30	java/lang/MatchException
    //   41	60	63	java/lang/MatchException
    //   45	77	80	java/lang/MatchException
    //   67	99	102	java/lang/MatchException
    //   84	116	119	java/lang/MatchException
    //   106	130	133	java/lang/MatchException
    //   123	161	164	java/lang/MatchException
    //   173	185	188	java/lang/MatchException
    //   177	199	202	java/lang/MatchException
    //   192	226	229	java/lang/MatchException
    //   238	253	256	java/lang/MatchException
    //   246	264	264	java/lang/MatchException
    //   304	316	319	java/lang/MatchException
    //   357	376	376	java/lang/MatchException
  }
  
  private Zsic Zi(int paramInt, Zsic paramZsic) {
    try {
      if (paramZsic == this.ZM[paramInt]) {
        try {
          switch (Zkkh.ZB[(this.ZH[paramInt]).ZI.ordinal()]) {
            default:
              throw new MatchException(null, null);
            case 1:
              try {
                if (this.ZF[paramInt] == null)
                  this.ZF[paramInt] = new Zbtv(this, paramInt); 
              } catch (MatchException matchException) {
                throw a(null);
              } 
            case 2:
              try {
                if (this.ZE[paramInt] == null)
                  this.ZE[paramInt] = new Zbth(this.ZU, this, paramInt); 
              } catch (MatchException matchException) {
                throw a(null);
              } 
            case 3:
              break;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        try {
          if (this.Zw[paramInt] == null)
            this.Zw[paramInt] = new Zbtm(this, paramInt); 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return this.Zw[paramInt];
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (paramZsic == this.ZE[paramInt]) {
        try {
          if ((this.ZH[paramInt]).ZI == Zxl3.PROJECT_FILE) {
            try {
              if (this.ZP[paramInt] == null)
                this.ZP[paramInt] = this.Zz.Z_(this, this.Zo, this.ZE[paramInt], paramInt, this.ZS, this.Zf, this.Zt); 
            } catch (MatchException matchException) {
              throw a(null);
            } 
            return this.ZP[paramInt];
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        Zuh.Zb(false, Zqf.Zr);
        return null;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (paramZsic == this.ZP[paramInt]) {
        try {
          if (this.ZF[paramInt] == null)
            this.ZF[paramInt] = new Zbtv(this, paramInt); 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        this.Zo.Zf(this.ZF[paramInt]);
        return this.ZF[paramInt];
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (paramZsic == this.ZF[paramInt]) {
        try {
          switch (paramInt) {
            case 0:
              try {
                if (this.ZM[paramInt + 1] == null)
                  this.ZM[paramInt + 1] = new Zbtq(this, paramInt + 1); 
              } catch (MatchException matchException) {
                throw a(null);
              } 
            case 1:
            
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        Zuh.Zv(false, Zqf.Zk, paramInt);
        return null;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return null;
  }
  
  private void lambda$goNext$0() {
    this.Zo.Zf(this.Zp);
  }
  
  public static void Zx(Zbqc[] paramArrayOfZbqc) {
    Zl = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zp() {
    return Zl;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_3
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zx : ([Lburp/Zbqc;)V
    //   13: bipush #115
    //   15: ldc 'n<.R\\r \\n* L#'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zzlr.a : Ljava/lang/String;
    //   24: goto -> 165
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 116
    //   92: bipush #94
    //   94: goto -> 123
    //   97: bipush #32
    //   99: goto -> 123
    //   102: bipush #16
    //   104: goto -> 123
    //   107: bipush #45
    //   109: goto -> 123
    //   112: iconst_4
    //   113: goto -> 123
    //   116: bipush #83
    //   118: goto -> 123
    //   121: bipush #12
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzlr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */