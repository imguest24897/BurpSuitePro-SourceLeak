package burp;

import java.util.Objects;
import javax.swing.text.Segment;
import javax.swing.text.TabExpander;

public class Zska {
  public char[] ZG = new char[0];
  
  public int Zd = 0;
  
  public int ZA = 0;
  
  public Zska ZO;
  
  public Zska Zo;
  
  private int Zv;
  
  private int ZK;
  
  private int ZM;
  
  private boolean ZR = false;
  
  private int Zz = 0;
  
  private boolean ZL;
  
  private Zzzm Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zska ZK() {
    return new Zska();
  }
  
  public Zska() {
    ZY(0);
    this.Zv = 0;
  }
  
  public Zska(Segment paramSegment, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this(paramSegment.array, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public Zska(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  private Zska(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this();
    ZG(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt4);
    Zi(paramInt5);
  }
  
  public Zska(Zska paramZska) {
    this();
    Zc(paramZska);
  }
  
  public Zska ZX(int paramInt) {
    Zska zska = new Zska(this);
    zska.ZH(paramInt);
    return zska;
  }
  
  public Zska Zb(int paramInt) {
    return ZC(paramInt - this.Zv);
  }
  
  public Zska ZC(int paramInt) {
    Zska zska = new Zska(this);
    zska.ZA = paramInt;
    return zska;
  }
  
  public boolean Zx(char paramChar) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    int i = this.Zd;
    while (i < this.Zd + this.ZA) {
      try {
        if (this.ZG[i] == paramChar)
          return true; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  public int ZY(char paramChar) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    int i = this.Zd;
    while (i < this.Zd + this.ZA) {
      try {
        if (this.ZG[i] == paramChar)
          return i - this.Zd; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return -1;
  }
  
  public int Za(char paramChar) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    int i = this.Zd + this.ZA - 1;
    while (i >= this.Zd) {
      try {
        if (this.ZG[i] == paramChar)
          return i - this.Zd; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i--;
      if (arrayOfZbqc != null)
        break; 
    } 
    return -1;
  }
  
  public char Zg(int paramInt) {
    return this.ZG[this.Zd + paramInt];
  }
  
  public boolean Zc(int paramInt) {
    try {
      if (paramInt >= ZJ())
        try {
          if (paramInt < ZJ() + this.ZA);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public void Zc(Zska paramZska) {
    this.ZG = paramZska.Zd();
    this.Zd = paramZska.Zl();
    this.ZA = paramZska.Za();
    this.Zv = paramZska.ZJ();
    ZY(paramZska.ZX());
    this.ZM = paramZska.ZO();
    this.ZR = paramZska.ZC();
    this.Zz = paramZska.ZV();
    this.ZL = paramZska.Zj();
    this.Zu = paramZska.Zu;
  }
  
  public void Zb(Zska paramZska) {
    try {
      if (paramZska != null) {
        this.ZR = paramZska.ZC();
        this.Zz = paramZska.ZV();
        this.ZL = paramZska.Zj();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int Zo(int paramInt) {
    return paramInt + this.Zd - ZJ();
  }
  
  public int ZF() {
    return this.Zv + this.ZA;
  }
  
  public int ZO() {
    return this.ZM;
  }
  
  public String Zu() {
    try {
      if (this.ZG == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZG() ? new String(this.ZG, this.Zd, this.ZA) : null;
  }
  
  public int ZJ() {
    return this.Zv;
  }
  
  public char[] Zd() {
    return this.ZG;
  }
  
  public int Zl() {
    return this.Zd;
  }
  
  public int ZX() {
    return this.ZK;
  }
  
  public float ZB(Zmgn paramZmgn, TabExpander paramTabExpander, float paramFloat, Zzkh paramZzkh) {
    return Zm(paramZmgn, paramTabExpander, paramFloat, Float.MAX_VALUE, paramZzkh).ZU();
  }
  
  public Zgus Zm(Zmgn paramZmgn, TabExpander paramTabExpander, float paramFloat1, float paramFloat2, Zzkh paramZzkh) {
    return Zn(this.ZA, paramZmgn, paramTabExpander, paramFloat1, paramFloat2, paramZzkh);
  }
  
  private Zgus Zn(int paramInt, Zmgn paramZmgn, TabExpander paramTabExpander, float paramFloat1, float paramFloat2, Zzkh paramZzkh) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore #7
    //   5: fload #4
    //   7: fstore #8
    //   9: aload #6
    //   11: ifnull -> 348
    //   14: aload_0
    //   15: invokevirtual ZG : ()Z
    //   18: ifeq -> 348
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   27: athrow
    //   28: aload_0
    //   29: getfield Zd : I
    //   32: istore #9
    //   34: aload_0
    //   35: getfield Zd : I
    //   38: iload_1
    //   39: iadd
    //   40: istore #10
    //   42: iload #9
    //   44: istore #11
    //   46: iload #11
    //   48: iload #10
    //   50: if_icmpge -> 348
    //   53: fload #8
    //   55: fstore #12
    //   57: aload_2
    //   58: invokevirtual ZE : ()Z
    //   61: ifeq -> 161
    //   64: aload_0
    //   65: getfield ZG : [C
    //   68: iload #11
    //   70: caload
    //   71: invokestatic ZN : (C)Z
    //   74: ifeq -> 109
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   83: athrow
    //   84: fload #12
    //   86: aload_0
    //   87: getfield ZG : [C
    //   90: iload #11
    //   92: caload
    //   93: aload #6
    //   95: invokestatic ZI : (CLburp/Zzkh;)Lburp/Zs5o;
    //   98: invokevirtual Zq : ()F
    //   101: fadd
    //   102: fstore #12
    //   104: aload #7
    //   106: ifnull -> 302
    //   109: aload_2
    //   110: invokevirtual Zb : ()Z
    //   113: ifeq -> 137
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   122: athrow
    //   123: aload_0
    //   124: invokevirtual Zj : ()Z
    //   127: ifne -> 302
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   136: athrow
    //   137: fload #12
    //   139: aload #6
    //   141: aload_0
    //   142: getfield ZG : [C
    //   145: iload #11
    //   147: caload
    //   148: invokeinterface Zm : (C)F
    //   153: fadd
    //   154: fstore #12
    //   156: aload #7
    //   158: ifnull -> 302
    //   161: aload_2
    //   162: invokevirtual Zb : ()Z
    //   165: ifeq -> 189
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   174: athrow
    //   175: aload_0
    //   176: invokevirtual Zj : ()Z
    //   179: ifne -> 302
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   188: athrow
    //   189: aload_0
    //   190: getfield ZG : [C
    //   193: iload #11
    //   195: caload
    //   196: bipush #9
    //   198: if_icmpne -> 224
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   207: athrow
    //   208: aload_3
    //   209: fload #8
    //   211: iconst_0
    //   212: invokeinterface nextTabStop : (FI)F
    //   217: fstore #12
    //   219: aload #7
    //   221: ifnull -> 302
    //   224: aload_0
    //   225: getfield ZG : [C
    //   228: iload #11
    //   230: caload
    //   231: invokestatic Zc : (C)Z
    //   234: ifeq -> 263
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   243: athrow
    //   244: fload #12
    //   246: aload #6
    //   248: ldc 56320
    //   250: invokeinterface Zm : (C)F
    //   255: fadd
    //   256: fstore #12
    //   258: aload #7
    //   260: ifnull -> 302
    //   263: aload_0
    //   264: getfield ZG : [C
    //   267: iload #11
    //   269: caload
    //   270: invokestatic ZR : (C)Z
    //   273: ifne -> 302
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   282: athrow
    //   283: fload #12
    //   285: aload #6
    //   287: aload_0
    //   288: getfield ZG : [C
    //   291: iload #11
    //   293: caload
    //   294: invokeinterface Zm : (C)F
    //   299: fadd
    //   300: fstore #12
    //   302: fload #12
    //   304: fload #4
    //   306: fsub
    //   307: fload #5
    //   309: fcmpl
    //   310: iflt -> 336
    //   313: new burp/Zgus
    //   316: dup
    //   317: iconst_1
    //   318: fload #8
    //   320: fload #4
    //   322: fsub
    //   323: iload #11
    //   325: iload #9
    //   327: isub
    //   328: invokespecial <init> : (ZFI)V
    //   331: areturn
    //   332: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   335: athrow
    //   336: fload #12
    //   338: fstore #8
    //   340: iinc #11, 1
    //   343: aload #7
    //   345: ifnull -> 46
    //   348: new burp/Zgus
    //   351: dup
    //   352: iconst_0
    //   353: fload #8
    //   355: fload #4
    //   357: fsub
    //   358: iload_1
    //   359: invokespecial <init> : (ZFI)V
    //   362: areturn
    // Exception table:
    //   from	to	target	type
    //   9	21	24	java/lang/IllegalArgumentException
    //   57	77	80	java/lang/IllegalArgumentException
    //   104	116	119	java/lang/IllegalArgumentException
    //   109	130	133	java/lang/IllegalArgumentException
    //   156	168	171	java/lang/IllegalArgumentException
    //   161	182	185	java/lang/IllegalArgumentException
    //   175	201	204	java/lang/IllegalArgumentException
    //   219	237	240	java/lang/IllegalArgumentException
    //   258	276	279	java/lang/IllegalArgumentException
    //   302	332	332	java/lang/IllegalArgumentException
  }
  
  public boolean ZQ(char[] paramArrayOfchar) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    if (this.ZA == paramArrayOfchar.length) {
      byte b = 0;
      while (b < this.ZA) {
        try {
          if (this.ZG[this.Zd + b] != paramArrayOfchar[b])
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
      return true;
    } 
    return false;
  }
  
  public boolean ZE(int paramInt, char[] paramArrayOfchar) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    try {
      if (ZX() == paramInt && this.ZA == paramArrayOfchar.length) {
        byte b = 0;
        while (b < this.ZA) {
          try {
            if (this.ZG[this.Zd + b] != paramArrayOfchar[b])
              return false; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          b++;
          if (arrayOfZbqc != null)
            break; 
        } 
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean ZO(int paramInt, String paramString) {
    try {
      if (ZX() == paramInt)
        try {
          if (this.ZA == paramString.length())
            try {
              if (paramString.equals(Zu()));
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean ZD() {
    try {
      if (ZX() >= 1)
        try {
          if (ZX() <= 5);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean ZI() {
    try {
      if (ZX() == 23)
        try {
          if (Zp('{'));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean ZQ() {
    try {
      if (ZX() == 23)
        try {
          if (Zp('}'));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean ZG() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (ZX() > 0);
  }
  
  public boolean Zp(char paramChar) {
    try {
      if (this.ZA == 1)
        try {
          if (this.ZG[this.Zd] == paramChar);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zm(int paramInt, char paramChar) {
    try {
      if (ZX() == paramInt)
        try {
          if (Zp(paramChar));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean ZE() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (ZX() == 22);
  }
  
  public int Za() {
    return this.ZA;
  }
  
  public void ZH(int paramInt) {
    try {
      if (paramInt < ZJ() || paramInt >= ZJ() + this.ZA) {
        int j = ZJ() + this.ZA - 1;
        int k = ZJ();
        int m = paramInt;
        throw new IllegalArgumentException(a(-30275, -10634) + a(-30275, -10634) + m + a(-30276, -3349) + k + "-");
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = paramInt - ZJ();
    this.Zv = paramInt;
    this.Zd += i;
    this.ZA -= i;
  }
  
  public void ZG(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.ZG = paramArrayOfchar;
    this.Zd = paramInt1;
    this.ZA = paramInt2 - paramInt1 + 1;
    ZY(paramInt4);
    this.Zv = paramInt3;
  }
  
  public void Zi(int paramInt) {
    this.ZM = paramInt;
  }
  
  public void ZY(int paramInt) {
    this.ZK = paramInt;
  }
  
  public void Zx(boolean paramBoolean) {
    this.ZR = paramBoolean;
  }
  
  public boolean ZC() {
    return this.ZR;
  }
  
  public void ZQ(int paramInt) {
    this.Zz = paramInt;
  }
  
  public int ZV() {
    return this.Zz;
  }
  
  public void Z_(boolean paramBoolean) {
    this.ZL = paramBoolean;
  }
  
  public boolean Zj() {
    return this.ZL;
  }
  
  public void ZR(Zzzm paramZzzm) {
    this.Zu = paramZzzm;
  }
  
  public boolean ZO(Zzzm paramZzzm) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zu == paramZzzm);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (!(paramObject instanceof Zska))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zska zska = (Zska)paramObject;
    try {
      if (this.Zv == zska.Zv)
        try {
          if (this.ZK == zska.ZX());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public String toString() {
    return super.toString();
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.Zv), Integer.valueOf(this.ZK) });
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 't¢ÐØÁ7P©Ü¾ØAZ°*½'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #59
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zska.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zska.b : [Ljava/lang/String;
    //   78: goto -> 226
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #88
    //   154: goto -> 183
    //   157: bipush #49
    //   159: goto -> 183
    //   162: iconst_4
    //   163: goto -> 183
    //   166: bipush #17
    //   168: goto -> 183
    //   171: bipush #28
    //   173: goto -> 183
    //   176: bipush #122
    //   178: goto -> 183
    //   181: bipush #21
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF89BD) & 0xFFFF;
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
      byte b1 = 103;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zska.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */