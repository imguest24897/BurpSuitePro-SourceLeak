package com.fasterxml.Zg;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zmm;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zj.Zv;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zx.Zm;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zk extends Zm {
  protected Zmd ZI;
  
  protected Zd Zj;
  
  protected boolean Zi;
  
  private static final String[] e;
  
  private static final String[] f;
  
  public Zk(Zb paramZb, Zmd paramZmd) {
    super(0);
    this.ZI = paramZmd;
    this.Zj = new Zq(paramZb, null);
  }
  
  public Zmd Zv() {
    return this.ZI;
  }
  
  public Zmk version() {
    return Zv.ZV;
  }
  
  public Zz<Zq> ZN() {
    return ZH;
  }
  
  public void close() throws IOException {
    try {
      if (!this.Zi) {
        this.Zi = true;
        this.Zj = null;
        this.Z_ = null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zl ZV() throws IOException {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: aload_0
    //   4: aload_0
    //   5: getfield Zj : Lcom/fasterxml/Zg/Zd;
    //   8: invokevirtual Zt : ()Lcom/fasterxml/Zb/Zl;
    //   11: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   14: astore_1
    //   15: aload_0
    //   16: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   19: ifnonnull -> 33
    //   22: aload_0
    //   23: iconst_1
    //   24: putfield Zi : Z
    //   27: aconst_null
    //   28: areturn
    //   29: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   32: athrow
    //   33: getstatic com/fasterxml/Zg/Zo.ZK : [I
    //   36: aload_0
    //   37: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   40: invokevirtual ordinal : ()I
    //   43: iaload
    //   44: tableswitch default -> 138, 1 -> 76, 2 -> 98, 3 -> 120, 4 -> 120
    //   76: aload_0
    //   77: aload_0
    //   78: getfield Zj : Lcom/fasterxml/Zg/Zd;
    //   81: invokevirtual Zw : ()Lcom/fasterxml/Zg/Zd;
    //   84: putfield Zj : Lcom/fasterxml/Zg/Zd;
    //   87: aload_1
    //   88: ifnonnull -> 138
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   97: athrow
    //   98: aload_0
    //   99: aload_0
    //   100: getfield Zj : Lcom/fasterxml/Zg/Zd;
    //   103: invokevirtual ZP : ()Lcom/fasterxml/Zg/Zd;
    //   106: putfield Zj : Lcom/fasterxml/Zg/Zd;
    //   109: aload_1
    //   110: ifnonnull -> 138
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   119: athrow
    //   120: aload_0
    //   121: aload_0
    //   122: getfield Zj : Lcom/fasterxml/Zg/Zd;
    //   125: invokevirtual ZG : ()Lcom/fasterxml/Zg/Zd;
    //   128: putfield Zj : Lcom/fasterxml/Zg/Zd;
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   137: athrow
    //   138: aload_0
    //   139: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   142: areturn
    // Exception table:
    //   from	to	target	type
    //   15	29	29	java/io/IOException
    //   33	91	94	java/io/IOException
    //   76	113	116	java/io/IOException
    //   98	131	134	java/io/IOException
  }
  
  public Zg Zc() throws IOException {
    String str = Zf.ZE();
    try {
      if (this.Z_ == Zl.START_OBJECT) {
        try {
          this.Zj = this.Zj.ZG();
          this.Z_ = Zl.END_OBJECT;
          if (str == null) {
            try {
              if (this.Z_ == Zl.START_ARRAY) {
                this.Zj = this.Zj.ZG();
                this.Z_ = Zl.END_ARRAY;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return (Zg)this;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return (Zg)this;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Z_ == Zl.START_ARRAY) {
        this.Zj = this.Zj.ZG();
        this.Z_ = Zl.END_ARRAY;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zg)this;
  }
  
  public String ZS() {
    Zd zd = this.Zj;
    if (this.Z_ == Zl.START_OBJECT || this.Z_ == Zl.START_ARRAY)
      zd = zd.ZG(); 
    return (zd == null) ? null : zd.Z_();
  }
  
  @Deprecated
  public String ZD() {
    return ZS();
  }
  
  public Ze ZT1() {
    return this.Zj;
  }
  
  public Zm5 Zz() {
    return Zm5.Zi;
  }
  
  public Zm5 ZQ() {
    return Zm5.Zi;
  }
  
  @Deprecated
  public Zm5 ZK() {
    return ZQ();
  }
  
  @Deprecated
  public Zm5 Zl() {
    return Zz();
  }
  
  public String ZR() {
    Zb zb;
    if (this.Z_ == null)
      return null; 
    switch (Zo.ZK[this.Z_.ordinal()]) {
      case 5:
        return this.Zj.Z_();
      case 6:
        return ZgM().Zz();
      case 7:
      case 8:
        return String.valueOf(ZgM().Zu());
      case 9:
        zb = ZgM();
        if (zb != null && zb.Zl())
          return zb.Zp(); 
        break;
    } 
    return this.Z_.ZI();
  }
  
  public char[] ZW() throws IOException {
    return ZR().toCharArray();
  }
  
  public int Zn() throws IOException {
    return ZR().length();
  }
  
  public int Zk() throws IOException {
    return 0;
  }
  
  public boolean Zi() {
    return false;
  }
  
  public com.fasterxml.Zb.Zk ZL() throws IOException {
    Zb zb = Zgw();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (zb == null) ? null : zb.ZO();
  }
  
  public Zmm Z_() throws IOException {
    com.fasterxml.Zb.Zk zk = ZL();
    try {
      if (zk == com.fasterxml.Zb.Zk.BIG_DECIMAL)
        return Zmm.BIG_DECIMAL; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zk == com.fasterxml.Zb.Zk.DOUBLE)
        return Zmm.DOUBLE64; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zk == com.fasterxml.Zb.Zk.FLOAT)
        return Zmm.FLOAT32; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zmm.UNKNOWN;
  }
  
  public BigInteger ZX() throws IOException {
    return Zgw().ZS();
  }
  
  public BigDecimal ZT() throws IOException {
    return Zgw().Zq();
  }
  
  public double ZH() throws IOException {
    return Zgw().Zg();
  }
  
  public float Zg() throws IOException {
    return (float)Zgw().Zg();
  }
  
  public int Ze() throws IOException {
    Zn zn = (Zn)Zgw();
    try {
      if (!zn.ZP())
        Z_5(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zn.ZN();
  }
  
  public long ZE() throws IOException {
    Zn zn = (Zn)Zgw();
    try {
      if (!zn.ZQ())
        Z_G(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zn.Zh();
  }
  
  public Number Zb() throws IOException {
    return Zgw().Zu();
  }
  
  public Object ZO() {
    if (!this.Zi) {
      Zb zb = ZgM();
      if (zb != null) {
        if (zb.Zy())
          return ((Zl)zb).ZI(); 
        if (zb.Zl())
          return ((Zt)zb).Zw(); 
      } 
    } 
    return null;
  }
  
  public boolean Zr() {
    if (!this.Zi) {
      Zb zb = ZgM();
      if (zb instanceof Zn)
        return ((Zn)zb).Ze(); 
    } 
    return false;
  }
  
  public byte[] Zi(Zy paramZy) throws IOException {
    Zb zb = ZgM();
    try {
      if (zb != null) {
        try {
          if (zb instanceof Zb)
            return ((Zb)zb).Zt(paramZy); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return zb.Zw();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  public int Zh(Zy paramZy, OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = Zi(paramZy);
    try {
      if (arrayOfByte != null) {
        paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
        return arrayOfByte.length;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return 0;
  }
  
  protected Zb ZgM() {
    return (this.Zi || this.Zj == null) ? null : this.Zj.ZX();
  }
  
  protected Zb Zgw() throws Zd {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZgM : ()Lcom/fasterxml/Zor/Zb;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 23
    //   9: aload_1
    //   10: invokevirtual Zd : ()Z
    //   13: ifne -> 90
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   22: athrow
    //   23: aload_1
    //   24: ifnonnull -> 42
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   33: athrow
    //   34: aconst_null
    //   35: goto -> 46
    //   38: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   41: athrow
    //   42: aload_1
    //   43: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   46: astore_2
    //   47: aload_0
    //   48: new java/lang/StringBuilder
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: sipush #23776
    //   58: sipush #-21864
    //   61: invokestatic c : (II)Ljava/lang/String;
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_2
    //   68: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   71: sipush #23777
    //   74: sipush #30686
    //   77: invokestatic c : (II)Ljava/lang/String;
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual toString : ()Ljava/lang/String;
    //   86: invokevirtual Zh : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zm0;
    //   89: athrow
    //   90: aload_1
    //   91: areturn
    // Exception table:
    //   from	to	target	type
    //   5	16	19	com/fasterxml/Zb/Zd
    //   9	27	30	com/fasterxml/Zb/Zd
    //   23	38	38	com/fasterxml/Zb/Zd
  }
  
  protected void Z_k() {
    Z_A();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '»÷q.ùè\\bü4`o1CÛUIóô`­ÂT¤Rvúò Ôï:áç_B)Ñî' Óÿ6åq@>s'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #15
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #15
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zg/Zk.e : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zg/Zk.f : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #71
    //   154: goto -> 184
    //   157: bipush #79
    //   159: goto -> 184
    //   162: bipush #89
    //   164: goto -> 184
    //   167: bipush #126
    //   169: goto -> 184
    //   172: bipush #75
    //   174: goto -> 184
    //   177: bipush #94
    //   179: goto -> 184
    //   182: bipush #13
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5CE0) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      byte b1 = 109;
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */