package burp;

import java.io.IOException;
import net.portswigger.Zkb;

class Zzrz {
  private final Zbw_ Za;
  
  private final Zml3 ZB;
  
  private final Zi8 ZT;
  
  private final boolean Zk;
  
  private final Zkl6 Zi;
  
  private boolean Zn;
  
  private String ZE;
  
  private int Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zzrz(Zbw_ paramZbw_, Zml3 paramZml3, Zi8 paramZi8, boolean paramBoolean1, boolean paramBoolean2, Zkl6 paramZkl6) {
    this.Za = paramZbw_;
    this.ZB = paramZml3;
    this.ZT = paramZi8;
    this.Zn = paramBoolean1;
    this.Zk = paramBoolean2;
    this.Zi = paramZkl6;
  }
  
  Zmzk ZX() throws Zxgy, Zxg5, Zz8v, IOException, Zz8b {
    String[] arrayOfString = Zz2j.ZJ();
    try {
      Z_();
      if (this.ZT.ZW()) {
        try {
          this.ZE = this.ZT.Z_;
          this.Zj = this.ZT.ZU;
          if (arrayOfString == null) {
            ZA();
            ZS();
            return this.Zi.ZB().ZY(this.ZE, this.Zj, this.Zn);
          } 
        } catch (Zxgy zxgy) {
          throw a(null);
        } 
        return this.Zi.ZB().ZY(this.ZE, this.Zj, this.Zn);
      } 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    ZA();
    ZS();
    return this.Zi.ZB().ZY(this.ZE, this.Zj, this.Zn);
  }
  
  private void ZA() throws Zz8v, IOException, Zz8b {
    Zmzk zmzk = this.ZB.ZZ();
    try {
      if (zmzk != null) {
        this.ZE = zmzk.ZJ1();
        this.Zj = zmzk.ZJO();
        this.Zn = zmzk.ZJZ();
        return;
      } 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
    try {
      if (Zy())
        return; 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
    ZJ();
  }
  
  private void ZJ() throws Zz8v {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZB : Lburp/Zml3;
    //   8: invokeinterface Zi : ()Lburp/Zz1p;
    //   13: invokevirtual ZG : ()Ljava/util/List;
    //   16: sipush #15226
    //   19: sipush #32388
    //   22: invokestatic a : (II)Ljava/lang/String;
    //   25: iconst_0
    //   26: invokestatic ZZ : (Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull -> 64
    //   34: new burp/Zz8v
    //   37: dup
    //   38: sipush #15224
    //   41: sipush #-9864
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: aload_0
    //   48: getfield ZB : Lburp/Zml3;
    //   51: invokeinterface ZC : ()[B
    //   56: invokespecial <init> : (Ljava/lang/String;[B)V
    //   59: athrow
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_2
    //   65: iconst_5
    //   66: invokevirtual substring : (I)Ljava/lang/String;
    //   69: invokevirtual trim : ()Ljava/lang/String;
    //   72: astore_2
    //   73: aload_2
    //   74: bipush #58
    //   76: invokevirtual indexOf : (I)I
    //   79: istore_3
    //   80: iload_3
    //   81: ifge -> 101
    //   84: aload_0
    //   85: aload_0
    //   86: invokevirtual Zi : ()I
    //   89: putfield Zj : I
    //   92: aload_2
    //   93: invokevirtual length : ()I
    //   96: istore_3
    //   97: aload_1
    //   98: ifnonnull -> 136
    //   101: aload_0
    //   102: aload_2
    //   103: iload_3
    //   104: iconst_1
    //   105: iadd
    //   106: invokevirtual substring : (I)Ljava/lang/String;
    //   109: invokestatic parseInt : (Ljava/lang/String;)I
    //   112: putfield Zj : I
    //   115: goto -> 136
    //   118: astore #4
    //   120: aload #4
    //   122: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   125: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   128: aload_0
    //   129: aload_0
    //   130: invokevirtual Zi : ()I
    //   133: putfield Zj : I
    //   136: aload_0
    //   137: aload_2
    //   138: iconst_0
    //   139: iload_3
    //   140: invokevirtual substring : (II)Ljava/lang/String;
    //   143: putfield ZE : Ljava/lang/String;
    //   146: return
    // Exception table:
    //   from	to	target	type
    //   30	60	60	java/lang/Exception
    //   101	115	118	java/lang/Exception
  }
  
  private int Zi() {
    return this.Zn ? 443 : 80;
  }
  
  private boolean Zy() throws Zz8v, IOException, Zz8b {
    if ((this.ZB.Zi()).ZJ) {
      Zmzk zmzk = (this.ZB.Zi()).Zo.Zdz();
      this.ZE = zmzk.ZJ1();
      this.Zj = zmzk.ZJO();
      return true;
    } 
    try {
      if (!this.Zk) {
        ZF();
        throw new Zz8v(a(15227, 23378), this.ZB.ZC());
      } 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
    return false;
  }
  
  private void ZF() throws IOException, Zz8b {
    Zb49 zb49 = new Zb49(this.ZB.Zu(), this.Za);
    Zz1p zz1p = this.ZB.Zi();
    String str = Zkb.ZG(zz1p.Zo.ZdH());
    try {
      if (zb49.ZM(str))
        throw new Zz8b(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Z_() {
    if (this.ZT.Zo)
      this.Zn = true; 
  }
  
  private void ZS() {
    if (!this.ZT.Zx())
      return; 
    if (this.ZT.Z_ != null)
      this.ZE = this.ZT.Z_; 
    if (this.ZT.ZU != 0)
      this.Zj = this.ZT.ZU; 
    if (this.ZT.Zo)
      this.Zn = true; 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ìÿQ}]ºqymr{µò`&êSÿ Çª×ÂhLûÛ8ÅÞ9']ZwqÕKÝòÔÙ¼FRdçÄ¥»9udt Ûê`N×ìçìF\\t«iù@tký¶>ã^7]­-Èq"ÃºãM¡¤åý=I!g¡ßµÇÖÈîzJÓØ]fåñOLÀÀ4¢Ý@«yäðHÅ08zËBÙÝ¯áb$\× 7KÊJ¡UÜi`lÁ{*g'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #84
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
    //   68: putstatic burp/Zzrz.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zzrz.b : [Ljava/lang/String;
    //   78: goto -> 227
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
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #88
    //   154: goto -> 184
    //   157: bipush #70
    //   159: goto -> 184
    //   162: bipush #15
    //   164: goto -> 184
    //   167: bipush #8
    //   169: goto -> 184
    //   172: bipush #79
    //   174: goto -> 184
    //   177: bipush #79
    //   179: goto -> 184
    //   182: bipush #14
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3B7A) & 0xFFFF;
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
      byte b1 = 114;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */