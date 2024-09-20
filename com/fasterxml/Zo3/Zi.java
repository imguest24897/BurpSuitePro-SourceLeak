package com.fasterxml.Zo3;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zc.Zv;
import com.fasterxml.Zm.Zl;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zyc;
import java.io.IOException;

public class Zi extends Zt {
  private static final long serialVersionUID = 1L;
  
  protected final Zyc Zw;
  
  protected final boolean Zr;
  
  protected final String ZP = (this.ZU == null) ? String.format(c(25750, 4654), new Object[] { this.ZH }) : String.format(c(25748, 11988), new Object[] { this.ZH, this.ZU.ZT() });
  
  private static final String[] e;
  
  private static final String[] f;
  
  public Zi(Zi paramZi, Zo paramZo) {
    super(paramZi, paramZo);
    this.Zw = paramZi.Zw;
    this.Zr = paramZi.Zr;
  }
  
  public Zi(Zk paramZk1, Zz paramZz, String paramString, boolean paramBoolean1, Zk paramZk2, Zyc paramZyc, boolean paramBoolean2) {
    super(paramZk1, paramZz, paramString, paramBoolean1, paramZk2);
    this.Zw = paramZyc;
    this.Zr = paramBoolean2;
  }
  
  public Zt Zf(Zo paramZo) {
    return (paramZo == this.ZU) ? this : new Zi(this, paramZo);
  }
  
  public Zyc Zz() {
    return this.Zw;
  }
  
  public Object ZC(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual ZP : ()Z
    //   8: ifeq -> 35
    //   11: aload_1
    //   12: invokevirtual ZJ : ()Ljava/lang/Object;
    //   15: astore #4
    //   17: aload #4
    //   19: ifnull -> 35
    //   22: aload_0
    //   23: aload_1
    //   24: aload_2
    //   25: aload #4
    //   27: invokevirtual ZG : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;)Ljava/lang/Object;
    //   30: areturn
    //   31: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   34: athrow
    //   35: aload_1
    //   36: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   39: astore #4
    //   41: aload #4
    //   43: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   46: if_acmpne -> 59
    //   49: aload_1
    //   50: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   53: astore #4
    //   55: aload_3
    //   56: ifnull -> 90
    //   59: aload #4
    //   61: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   64: if_acmpeq -> 90
    //   67: goto -> 74
    //   70: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   73: athrow
    //   74: aload_0
    //   75: aload_1
    //   76: aload_2
    //   77: aconst_null
    //   78: aload_0
    //   79: getfield ZP : Ljava/lang/String;
    //   82: invokevirtual Zp : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zm/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   85: areturn
    //   86: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   89: athrow
    //   90: aconst_null
    //   91: astore #5
    //   93: aload_2
    //   94: getstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   97: invokevirtual Zm : (Lcom/fasterxml/Zor/Zy9;)Z
    //   100: istore #6
    //   102: aload #4
    //   104: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   107: if_acmpne -> 225
    //   110: aload_1
    //   111: invokevirtual ZS : ()Ljava/lang/String;
    //   114: astore #7
    //   116: aload_1
    //   117: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   120: pop
    //   121: aload #7
    //   123: aload_0
    //   124: getfield ZH : Ljava/lang/String;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifne -> 164
    //   133: iload #6
    //   135: ifeq -> 190
    //   138: goto -> 145
    //   141: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   144: athrow
    //   145: aload #7
    //   147: aload_0
    //   148: getfield ZH : Ljava/lang/String;
    //   151: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   154: ifeq -> 190
    //   157: goto -> 164
    //   160: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   163: athrow
    //   164: aload_1
    //   165: invokevirtual Zd : ()Ljava/lang/String;
    //   168: astore #8
    //   170: aload #8
    //   172: ifnull -> 190
    //   175: aload_0
    //   176: aload_1
    //   177: aload_2
    //   178: aload #5
    //   180: aload #8
    //   182: invokevirtual ZG : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zm/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   185: areturn
    //   186: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   189: athrow
    //   190: aload #5
    //   192: ifnonnull -> 202
    //   195: aload_2
    //   196: aload_1
    //   197: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zm/Zl;
    //   200: astore #5
    //   202: aload #5
    //   204: aload #7
    //   206: invokevirtual ZY : (Ljava/lang/String;)V
    //   209: aload #5
    //   211: aload_1
    //   212: invokevirtual ZE : (Lcom/fasterxml/Zb/Zg;)V
    //   215: aload_1
    //   216: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   219: astore #4
    //   221: aload_3
    //   222: ifnull -> 102
    //   225: aload_0
    //   226: aload_1
    //   227: aload_2
    //   228: aload #5
    //   230: aload_0
    //   231: getfield ZP : Ljava/lang/String;
    //   234: invokevirtual Zp : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zm/Zl;Ljava/lang/String;)Ljava/lang/Object;
    //   237: areturn
    // Exception table:
    //   from	to	target	type
    //   17	31	31	java/io/IOException
    //   55	67	70	java/io/IOException
    //   59	86	86	java/io/IOException
    //   116	138	141	java/io/IOException
    //   133	157	160	java/io/IOException
    //   170	186	186	java/io/IOException
  }
  
  protected Object ZG(Zg paramZg, Zyg paramZyg, Zl paramZl, String paramString) throws IOException {
    Zv zv;
    Zyo<Object> zyo = ZU(paramZyg, paramString);
    try {
      if (this.Z_) {
        if (paramZl == null)
          paramZl = paramZyg.Zb(paramZg); 
        paramZl.ZY(paramZg.ZS());
        paramZl.ZD(paramString);
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    if (paramZl != null) {
      paramZg.Zo();
      zv = Zv.Zn(false, paramZl.Zv(paramZg), paramZg);
    } 
    try {
      if (zv.Zh() != Zl.END_OBJECT)
        zv.ZV(); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return zyo.deserialize((Zg)zv, paramZyg);
  }
  
  protected Object Zp(Zg paramZg, Zyg paramZyg, Zl paramZl, String paramString) throws IOException {
    if (!Ze()) {
      Object object = Zt.Zg(paramZg, paramZyg, this.Za);
      try {
        if (object != null)
          return object; 
      } catch (IOException iOException) {
        throw c(null);
      } 
      try {
        if (paramZg.Zs())
          return super.Zy(paramZg, paramZyg); 
      } catch (IOException iOException) {
        throw c(null);
      } 
      try {
        if (paramZg.ZL(Zl.VALUE_STRING) && paramZyg.Zg(Zyp.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
          String str = paramZg.ZR().trim();
          try {
            if (str.isEmpty())
              return null; 
          } catch (IOException iOException) {
            throw c(null);
          } 
        } 
      } catch (IOException iOException) {
        throw c(null);
      } 
    } 
    Zyo<Object> zyo = ZT(paramZyg);
    try {
      if (zyo == null) {
        try {
        
        } catch (IOException iOException) {
          throw c(null);
        } 
        Zk zk = this.Zr ? ZB(paramZyg, paramString) : this.Za;
        try {
          if (zk == null)
            return null; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        zyo = paramZyg.ZC(zk, this.ZU);
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    if (paramZl != null) {
      paramZl.Zh();
      paramZg = paramZl.Zv(paramZg);
      paramZg.ZV();
    } 
    return zyo.deserialize(paramZg, paramZyg);
  }
  
  public Object Zy(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.START_ARRAY))
        return ZF(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return ZC(paramZg, paramZyg);
  }
  
  private static IOException c(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '{Ó)y¶ó5gsx"<ÞÕÇéY<®¸jÃâeP<´tÂ85@}X\\fXr$î)Ê_ÁÙÏSÃQëöÇÖ ÅldÓ-Á9éÄ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #54
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #123
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'hÍÀë|ªi~ãúYÍÜ,öìE¦Ñ ñ6â¼Å2¹ïÑ$kdA¦\\rGáÜ) ¿ÆâSGÿÏÉScoa>e­5Üo¬½þÑ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #29
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #98
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic com/fasterxml/Zo3/Zi.e : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zo3/Zi.f : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #73
    //   219: goto -> 244
    //   222: bipush #121
    //   224: goto -> 244
    //   227: bipush #98
    //   229: goto -> 244
    //   232: bipush #117
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #10
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6497) & 0xFFFF;
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
      byte b1 = 122;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */