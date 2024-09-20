package com.fasterxml.Zj;

import com.fasterxml.Zm.Zf;
import com.fasterxml.Zm.Zr;
import com.fasterxml.Zo.Zr;
import com.fasterxml.Zo.Zza;
import com.fasterxml.Zo.Zzi;
import com.fasterxml.Zor.Zm;
import java.io.Serializable;

public class Zb implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zza[] Zt;
  
  protected static final com.fasterxml.Zo.Zb[] ZN;
  
  protected static final Zm[] ZM;
  
  protected static final Zzi[] ZD;
  
  protected static final Zr[] Zn;
  
  protected final Zza[] ZZ;
  
  protected final Zr[] Zc;
  
  protected final com.fasterxml.Zo.Zb[] ZS;
  
  protected final Zm[] ZH;
  
  protected final Zzi[] Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb() {
    this(null, null, null, null, null);
  }
  
  protected Zb(Zza[] paramArrayOfZza, Zr[] paramArrayOfZr, com.fasterxml.Zo.Zb[] paramArrayOfZb, Zm[] paramArrayOfZm, Zzi[] paramArrayOfZzi) {
    try {
      this.ZZ = (paramArrayOfZza == null) ? Zt : paramArrayOfZza;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.Zc = (paramArrayOfZr == null) ? Zn : paramArrayOfZr;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.ZS = (paramArrayOfZb == null) ? ZN : paramArrayOfZb;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.ZH = (paramArrayOfZm == null) ? ZM : paramArrayOfZm;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zs = (paramArrayOfZzi == null) ? ZD : paramArrayOfZzi;
  }
  
  public Zb ZF(Zza paramZza) {
    try {
      if (paramZza == null)
        throw new IllegalArgumentException(a(-30548, -11997)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zza[] arrayOfZza = (Zza[])Zr.Ze((Object[])this.ZZ, paramZza);
    return new Zb(arrayOfZza, this.Zc, this.ZS, this.ZH, this.Zs);
  }
  
  public Zb ZM(Zr paramZr) {
    try {
      if (paramZr == null)
        throw new IllegalArgumentException(a(-30552, -3082)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zr[] arrayOfZr = (Zr[])Zr.Ze((Object[])this.Zc, paramZr);
    return new Zb(this.ZZ, arrayOfZr, this.ZS, this.ZH, this.Zs);
  }
  
  public Zb Zh(com.fasterxml.Zo.Zb paramZb) {
    try {
      if (paramZb == null)
        throw new IllegalArgumentException(a(-30549, -13955)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    com.fasterxml.Zo.Zb[] arrayOfZb = (com.fasterxml.Zo.Zb[])Zr.Ze((Object[])this.ZS, paramZb);
    return new Zb(this.ZZ, this.Zc, arrayOfZb, this.ZH, this.Zs);
  }
  
  public Zb Zj(Zm paramZm) {
    try {
      if (paramZm == null)
        throw new IllegalArgumentException(a(-30550, 10093)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zm[] arrayOfZm = (Zm[])Zr.Ze((Object[])this.ZH, paramZm);
    return new Zb(this.ZZ, this.Zc, this.ZS, arrayOfZm, this.Zs);
  }
  
  public Zb Zy(Zzi paramZzi) {
    try {
      if (paramZzi == null)
        throw new IllegalArgumentException(a(-30551, 20309)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zzi[] arrayOfZzi = (Zzi[])Zr.Ze((Object[])this.Zs, paramZzi);
    return new Zb(this.ZZ, this.Zc, this.ZS, this.ZH, arrayOfZzi);
  }
  
  public boolean ZE() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zc.length > 0);
  }
  
  public boolean ZQ() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZS.length > 0);
  }
  
  public boolean ZA() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZH.length > 0);
  }
  
  public boolean ZS() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zs.length > 0);
  }
  
  public Iterable<Zza> ZJ() {
    return (Iterable<Zza>)new Zf((Object[])this.ZZ);
  }
  
  public Iterable<Zr> Zy() {
    return (Iterable<Zr>)new Zf((Object[])this.Zc);
  }
  
  public Iterable<com.fasterxml.Zo.Zb> Zn() {
    return (Iterable<com.fasterxml.Zo.Zb>)new Zf((Object[])this.ZS);
  }
  
  public Iterable<Zm> ZU() {
    return (Iterable<Zm>)new Zf((Object[])this.ZH);
  }
  
  public Iterable<Zzi> Zq() {
    return (Iterable<Zzi>)new Zf((Object[])this.Zs);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'x\¸Ê!Q´hänYI F#ÑÕPYF_ùW¤]ðÅÕä°(÷\\rnãÐwí3!óL¨©üÒ'Pä'tìßÞÄÕ4âP+H'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #33
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #17
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
    //   67: ldc ''ÈÊ=e8¾+cU­T[ÌÁ®+ý¹]°2ÙÄ¡]J»CÆÄ:ÉqúÎÃ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #25
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #49
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
    //   128: putstatic com/fasterxml/Zj/Zb.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zj/Zb.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 258
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 235
    //   212: bipush #27
    //   214: goto -> 242
    //   217: iconst_2
    //   218: goto -> 242
    //   221: bipush #31
    //   223: goto -> 242
    //   226: bipush #80
    //   228: goto -> 242
    //   231: iconst_4
    //   232: goto -> 242
    //   235: bipush #85
    //   237: goto -> 242
    //   240: bipush #39
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 164
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 160
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 98
    //   300: iconst_0
    //   301: anewarray com/fasterxml/Zo/Zza
    //   304: putstatic com/fasterxml/Zj/Zb.Zt : [Lcom/fasterxml/Zo/Zza;
    //   307: iconst_0
    //   308: anewarray com/fasterxml/Zo/Zb
    //   311: putstatic com/fasterxml/Zj/Zb.ZN : [Lcom/fasterxml/Zo/Zb;
    //   314: iconst_0
    //   315: anewarray com/fasterxml/Zor/Zm
    //   318: putstatic com/fasterxml/Zj/Zb.ZM : [Lcom/fasterxml/Zor/Zm;
    //   321: iconst_0
    //   322: anewarray com/fasterxml/Zo/Zzi
    //   325: putstatic com/fasterxml/Zj/Zb.ZD : [Lcom/fasterxml/Zo/Zzi;
    //   328: iconst_1
    //   329: anewarray com/fasterxml/Zo/Zr
    //   332: dup
    //   333: iconst_0
    //   334: new com/fasterxml/Zs/Zfm
    //   337: dup
    //   338: invokespecial <init> : ()V
    //   341: aastore
    //   342: putstatic com/fasterxml/Zj/Zb.Zn : [Lcom/fasterxml/Zo/Zr;
    //   345: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF88A8) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */