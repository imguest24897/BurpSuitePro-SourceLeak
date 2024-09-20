package burp;

import java.util.Objects;

public final class Zmi3 extends Zmip {
  private String ZX;
  
  private String ZO;
  
  private static final String b;
  
  public Zmi3(String paramString, boolean paramBoolean) {
    super(Ztbo.BASIC, paramString, paramBoolean);
  }
  
  public String Zy() {
    try {
      if (Zsw8.ZP(this.ZX))
        try {
          if (Zsw8.ZP(this.ZO));
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZX + ":" + this.ZX;
  }
  
  public String ZC() {
    return Objects.toString(this.ZX, "");
  }
  
  public Zmi3 Zu(String paramString) {
    this.ZX = paramString;
    return this;
  }
  
  public String ZQ() {
    return Objects.toString(this.ZO, "");
  }
  
  public Zmi3 ZO(String paramString) {
    this.ZO = paramString;
    return this;
  }
  
  public boolean ZY() {
    return true;
  }
  
  public void ZL(Zgi paramZgi) {
    if (paramZgi instanceof Zmi3) {
      Zmi3 zmi3 = (Zmi3)paramZgi;
      Zu(zmi3.ZC());
      ZO(zmi3.ZQ());
    } 
  }
  
  public Ztcx ZE(Zgi paramZgi) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5: ifeq -> 24
    //   8: getstatic burp/Zmo.SAME_OBJECT : Lburp/Zmo;
    //   11: aload_1
    //   12: iconst_0
    //   13: anewarray java/lang/String
    //   16: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   19: areturn
    //   20: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   23: athrow
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial ZE : (Lburp/Zgi;)Lburp/Ztcx;
    //   29: astore_2
    //   30: aload_2
    //   31: invokevirtual ZLR : ()Z
    //   34: ifeq -> 43
    //   37: aload_2
    //   38: areturn
    //   39: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   42: athrow
    //   43: aload_1
    //   44: dup
    //   45: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: pop
    //   49: astore_3
    //   50: iconst_0
    //   51: istore #4
    //   53: aload_3
    //   54: iload #4
    //   56: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   61: tableswitch default -> 92, 0 -> 106, 1 -> 126, 2 -> 146, 3 -> 184
    //   92: new java/lang/MatchException
    //   95: dup
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: athrow
    //   102: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   105: athrow
    //   106: aload_3
    //   107: checkcast burp/Zmi3
    //   110: astore #5
    //   112: getstatic burp/Zmo.AUTHORIZATION_HEADER : Lburp/Zmo;
    //   115: aload_1
    //   116: iconst_0
    //   117: anewarray java/lang/String
    //   120: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   123: goto -> 193
    //   126: aload_3
    //   127: checkcast burp/Zmi1
    //   130: astore #6
    //   132: getstatic burp/Zmo.AUTHORIZATION_HEADER : Lburp/Zmo;
    //   135: aload_1
    //   136: iconst_0
    //   137: anewarray java/lang/String
    //   140: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   143: goto -> 193
    //   146: aload_3
    //   147: checkcast burp/Zmis
    //   150: astore #7
    //   152: aload #7
    //   154: invokevirtual Zl : ()Z
    //   157: ifeq -> 178
    //   160: getstatic burp/Zmo.AUTHORIZATION_HEADER : Lburp/Zmo;
    //   163: aload_1
    //   164: iconst_0
    //   165: anewarray java/lang/String
    //   168: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   171: goto -> 193
    //   174: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   177: athrow
    //   178: invokestatic ZL0 : ()Lburp/Ztcx;
    //   181: goto -> 193
    //   184: aload_3
    //   185: checkcast burp/Zmiu
    //   188: astore #8
    //   190: invokestatic ZL0 : ()Lburp/Ztcx;
    //   193: areturn
    // Exception table:
    //   from	to	target	type
    //   0	20	20	java/lang/MatchException
    //   30	39	39	java/lang/MatchException
    //   53	102	102	java/lang/MatchException
    //   152	174	174	java/lang/MatchException
  }
  
  public String ZR() {
    return b;
  }
  
  public boolean equals(Object paramObject) {
    Zmi3 zmi3;
    Zbqc[] arrayOfZbqc = Zmip.Zv();
    try {
      if (this == paramObject)
        return true; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    if (paramObject instanceof Zmi3) {
      zmi3 = (Zmi3)paramObject;
      try {
        if (arrayOfZbqc == null)
          return false; 
      } catch (MatchException matchException) {
        throw a(null);
      } 
    } else {
      return false;
    } 
    try {
      if (super.equals(paramObject))
        try {
          if (Objects.equals(this.ZX, zmi3.ZX))
            try {
              if (Objects.equals(this.ZO, zmi3.ZO));
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    Zbqc[] arrayOfZbqc = Zmip.Zv();
    try {
      if (Zbqc.Zwu() == null)
        Zmip.Zt(new Zbqc[1]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.ZX, this.ZO });
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #110
    //   2: ldc '%`Q"6{]/N>gQ.T'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmi3.b : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #9
    //   82: goto -> 111
    //   85: iconst_1
    //   86: goto -> 111
    //   89: bipush #125
    //   91: goto -> 111
    //   94: bipush #86
    //   96: goto -> 111
    //   99: bipush #47
    //   101: goto -> 111
    //   104: bipush #84
    //   106: goto -> 111
    //   109: bipush #57
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmi3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */