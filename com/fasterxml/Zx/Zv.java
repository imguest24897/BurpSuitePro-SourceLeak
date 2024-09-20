package com.fasterxml.Zx;

import burp.Zbqc;
import burp.Zv8r;
import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zi;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zq.Zb;
import com.fasterxml.Zq.Zf;
import com.fasterxml.Zq.Zs;
import com.fasterxml.Zv9;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public abstract class Zv extends Zf {
  protected static final int ZL;
  
  protected Zmd ZC;
  
  protected int ZE;
  
  protected final Zv9 Zb;
  
  protected boolean Zz;
  
  protected Zf Zo;
  
  protected boolean Zy;
  
  private static final String[] c;
  
  private static final String[] d;
  
  protected Zv(int paramInt, Zmd paramZmd, Zv9 paramZv9) {
    this.ZE = paramInt;
    this.ZC = paramZmd;
    int[] arrayOfInt = Zv8r.Zn();
    this.Zb = paramZv9;
    Zs zs = Zi.STRICT_DUPLICATE_DETECTION.Zw(paramInt) ? Zs.Zd(this) : null;
    this.Zo = Zf.Zu(zs);
    this.Zz = Zi.WRITE_NUMBERS_AS_STRINGS.Zw(paramInt);
    if (Zbqc.Zwu() == null)
      Zv8r.Zb(new int[2]); 
  }
  
  public Zmk version() {
    return Zb.Zk;
  }
  
  public void Z_(Object paramObject) {
    if (this.Zo != null)
      this.Zo.Z_(paramObject); 
  }
  
  public final boolean Za(Zi paramZi) {
    return ((this.ZE & paramZi.Zf()) != 0);
  }
  
  public int Za() {
    return this.ZE;
  }
  
  public Zf Zf(Zi paramZi) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zf : ()I
    //   4: istore_3
    //   5: invokestatic Zn : ()[I
    //   8: aload_0
    //   9: dup
    //   10: getfield ZE : I
    //   13: iload_3
    //   14: iconst_m1
    //   15: ixor
    //   16: iand
    //   17: putfield ZE : I
    //   20: astore_2
    //   21: iload_3
    //   22: getstatic com/fasterxml/Zx/Zv.ZL : I
    //   25: iand
    //   26: ifeq -> 81
    //   29: aload_1
    //   30: getstatic com/fasterxml/Zb/Zi.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zb/Zi;
    //   33: if_acmpne -> 45
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield Zz : Z
    //   41: aload_2
    //   42: ifnull -> 81
    //   45: aload_1
    //   46: getstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   49: if_acmpne -> 62
    //   52: aload_0
    //   53: iconst_0
    //   54: invokevirtual ZP : (I)Lcom/fasterxml/Zb/Zf;
    //   57: pop
    //   58: aload_2
    //   59: ifnull -> 81
    //   62: aload_1
    //   63: getstatic com/fasterxml/Zb/Zi.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zi;
    //   66: if_acmpne -> 81
    //   69: aload_0
    //   70: aload_0
    //   71: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   74: aconst_null
    //   75: invokevirtual ZY : (Lcom/fasterxml/Zq/Zs;)Lcom/fasterxml/Zq/Zf;
    //   78: putfield Zo : Lcom/fasterxml/Zq/Zf;
    //   81: aload_0
    //   82: areturn
  }
  
  @Deprecated
  public Zf ZG(int paramInt) {
    int i = paramInt ^ this.ZE;
    this.ZE = paramInt;
    if (i != 0)
      ZE(paramInt, i); 
    return this;
  }
  
  public Zf ZK(int paramInt1, int paramInt2) {
    int i = this.ZE;
    int j = i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2;
    int k = i ^ j;
    if (k != 0) {
      this.ZE = j;
      ZE(j, k);
    } 
    return this;
  }
  
  protected void ZE(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zn : ()[I
    //   3: astore_3
    //   4: iload_2
    //   5: getstatic com/fasterxml/Zx/Zv.ZL : I
    //   8: iand
    //   9: ifne -> 13
    //   12: return
    //   13: aload_0
    //   14: getstatic com/fasterxml/Zb/Zi.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zb/Zi;
    //   17: iload_1
    //   18: invokevirtual Zw : (I)Z
    //   21: putfield Zz : Z
    //   24: getstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   27: iload_2
    //   28: invokevirtual Zw : (I)Z
    //   31: ifeq -> 61
    //   34: getstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   37: iload_1
    //   38: invokevirtual Zw : (I)Z
    //   41: ifeq -> 55
    //   44: aload_0
    //   45: bipush #127
    //   47: invokevirtual ZP : (I)Lcom/fasterxml/Zb/Zf;
    //   50: pop
    //   51: aload_3
    //   52: ifnull -> 61
    //   55: aload_0
    //   56: iconst_0
    //   57: invokevirtual ZP : (I)Lcom/fasterxml/Zb/Zf;
    //   60: pop
    //   61: getstatic com/fasterxml/Zb/Zi.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zi;
    //   64: iload_2
    //   65: invokevirtual Zw : (I)Z
    //   68: ifeq -> 122
    //   71: getstatic com/fasterxml/Zb/Zi.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zi;
    //   74: iload_1
    //   75: invokevirtual Zw : (I)Z
    //   78: ifeq -> 110
    //   81: aload_0
    //   82: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   85: invokevirtual ZB : ()Lcom/fasterxml/Zq/Zs;
    //   88: ifnonnull -> 122
    //   91: aload_0
    //   92: aload_0
    //   93: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   96: aload_0
    //   97: invokestatic Zd : (Lcom/fasterxml/Zb/Zf;)Lcom/fasterxml/Zq/Zs;
    //   100: invokevirtual ZY : (Lcom/fasterxml/Zq/Zs;)Lcom/fasterxml/Zq/Zf;
    //   103: putfield Zo : Lcom/fasterxml/Zq/Zf;
    //   106: aload_3
    //   107: ifnull -> 122
    //   110: aload_0
    //   111: aload_0
    //   112: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   115: aconst_null
    //   116: invokevirtual ZY : (Lcom/fasterxml/Zq/Zs;)Lcom/fasterxml/Zq/Zf;
    //   119: putfield Zo : Lcom/fasterxml/Zq/Zf;
    //   122: return
  }
  
  public Ze Zz() {
    return (Ze)this.Zo;
  }
  
  public void ZB(Object paramObject) throws IOException {
    try {
      ZJ();
      if (paramObject != null)
        Z_(paramObject); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void Zm(Zj paramZj) throws IOException {
    ZY(paramZj.ZV());
  }
  
  public void Zr(Zj paramZj) throws IOException {
    ZD(paramZj.ZV());
  }
  
  public void Ze(String paramString) throws IOException {
    Zk(b(-1083, -4235));
    ZM(paramString);
  }
  
  public void Zh(Zj paramZj) throws IOException {
    Zk(b(-1080, -2874));
    Zg(paramZj);
  }
  
  public int ZE(Zy paramZy, InputStream paramInputStream, int paramInt) throws IOException {
    ZY();
    return 0;
  }
  
  public void ZZ(Object paramObject) throws IOException {
    int[] arrayOfInt = Zv8r.Zn();
    try {
      if (paramObject == null) {
        try {
          ZT();
          if (arrayOfInt != null) {
            try {
              if (this.ZC != null) {
                this.ZC.ZZ(this, paramObject);
                return;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            Zz(paramObject);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZC != null) {
        this.ZC.ZZ(this, paramObject);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zz(paramObject);
  }
  
  public abstract void flush() throws IOException;
  
  public void close() throws IOException {
    try {
      if (!this.Zy) {
        try {
          if (this.Zb != null)
            this.Zb.close(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.Zy = true;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public boolean ZU() {
    return this.Zy;
  }
  
  protected abstract void ZS();
  
  protected abstract void Zk(String paramString) throws IOException;
  
  protected String Zz(BigDecimal paramBigDecimal) throws IOException {
    int i;
    if (Zi.WRITE_BIGDECIMAL_AS_PLAIN.Zw(this.ZE)) {
      i = paramBigDecimal.scale();
      try {
        if (i >= -9999) {
          try {
            if (i > 9999) {
              Zr(String.format(b(-1075, -15314), new Object[] { Integer.valueOf(i), Integer.valueOf(9999), Integer.valueOf(9999) }));
              return paramBigDecimal.toPlainString();
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramBigDecimal.toPlainString();
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } else {
      return paramBigDecimal.toString();
    } 
    Zr(String.format(b(-1075, -15314), new Object[] { Integer.valueOf(i), Integer.valueOf(9999), Integer.valueOf(9999) }));
    return paramBigDecimal.toPlainString();
  }
  
  protected final int Zh(int paramInt1, int paramInt2) throws IOException {
    try {
      if (paramInt2 < 56320 || paramInt2 > 57343) {
        String str = String.format(b(-1076, 16784), new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        Zr(str);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (paramInt1 << 10) + paramInt2 + -56613888;
  }
  
  protected void ZX(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      if (paramArrayOfbyte == null)
        Zr(b(-1079, -887)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = paramArrayOfbyte.length;
    int j = paramInt1 + paramInt2;
    int k = paramInt1 | paramInt2 | j | i - j;
    try {
      if (k < 0)
        Zr(String.format(b(-1077, 24412), new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) })); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected void Zs(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    try {
      if (paramArrayOfchar == null)
        Zr(b(-1084, -14042)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = paramArrayOfchar.length;
    int j = paramInt1 + paramInt2;
    int k = paramInt1 | paramInt2 | j | i - j;
    try {
      if (k < 0)
        Zr(String.format(b(-1078, 30668), new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) })); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected void Zp(String paramString, int paramInt1, int paramInt2) throws IOException {
    try {
      if (paramString == null)
        Zr(b(-1074, 18072)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = paramString.length();
    int j = paramInt1 + paramInt2;
    int k = paramInt1 | paramInt2 | j | i - j;
    try {
      if (k < 0)
        Zr(String.format(b(-1073, -16559), new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) })); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '[U©jÉ g¹çypáH:}5¡<º¶õ;^åã5´^?Jïj¯üþIØs/õ×ùÛ\\bBîÀçR^r?:ªÓúvxäÃÖ0«ùj.µ\\nõ$\\fÊPâ\\fòk:ô²þ`Éþ·°×\\bÃu\\rýçÐõÚýÍÐØ ×ëÒ¿ÍØ)$«ìnE¸÷°ê¿`0¢~º'gÓRÝªàÖ +¾VrÌE§Ô<i¿2â4s»Q£j~ëóIDA»SÒ!ºüÔø %Ô«¬±\\b|AîÅ&y½q\\n<KÆ [sbQ­©¥ë´DT#UÏä%Îhö¿{qóò;ºPÿGó6¢ËA,Õö¡­o3íú0 ¥¼lXi±ß¢1dÃ¦åi\\rHLõHa«¸])dyï!yà¬{PrâÛZ¾8XD£EM©ÈáÉÿhíQK8wÒBJIëëÖóë13ú4©Àê\\f]oMîû(\\tÍý´ªàgÑzITZ,ÿ¸[ÉFëSÌè*¡%MÊîÍÞ~>RKÊÁÚ_RÔ«eý¬W{d^Ã¤âXs¹±»gë08ÂÚ[\\tÆß'ÍñÏ\\f4õùÍ\\rÝü±m³r(·Dk¿kU§Èü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #59
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #84
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
    //   68: ldc 'TïÝNf"ù¼dâëÛÂ Ïx¦ê-þÎOÌDàÚ)åº¥\ÂËtçÂçÐK'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #33
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #66
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
    //   129: putstatic com/fasterxml/Zx/Zv.c : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zx/Zv.d : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #89
    //   214: goto -> 243
    //   217: bipush #106
    //   219: goto -> 243
    //   222: bipush #96
    //   224: goto -> 243
    //   227: bipush #54
    //   229: goto -> 243
    //   232: bipush #15
    //   234: goto -> 243
    //   237: iconst_3
    //   238: goto -> 243
    //   241: bipush #91
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
    //   300: getstatic com/fasterxml/Zb/Zi.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zb/Zi;
    //   303: invokevirtual Zf : ()I
    //   306: getstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   309: invokevirtual Zf : ()I
    //   312: ior
    //   313: getstatic com/fasterxml/Zb/Zi.STRICT_DUPLICATE_DETECTION : Lcom/fasterxml/Zb/Zi;
    //   316: invokevirtual Zf : ()I
    //   319: ior
    //   320: putstatic com/fasterxml/Zx/Zv.ZL : I
    //   323: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFBCC) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = '»';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zx\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */