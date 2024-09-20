package burp;

import java.util.List;

public class Zs_6 implements Zmhe {
  private final Zbph ZS;
  
  private final Zbnt Zh;
  
  private final Zey9 ZD;
  
  private final Ze3n ZT;
  
  private final Ze3n ZQ;
  
  private final Zl_e ZY;
  
  private final Zxs7 ZU;
  
  private final Zz1m<Zt1o> Zi;
  
  private Zxs7 Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zs_6(Zbph paramZbph, Zbnt paramZbnt, Zey9 paramZey9, Ze3n paramZe3n1, Ze3n paramZe3n2, Zxs7 paramZxs7, Zz1m<Zt1o> paramZz1m) {
    this.ZS = paramZbph;
    this.Zh = paramZbnt;
    this.ZD = paramZey9;
    this.ZT = paramZe3n1;
    this.ZQ = paramZe3n2;
    this.Zg = paramZxs7;
    this.ZU = paramZxs7;
    this.Zi = paramZz1m;
    this.ZY = Zl_e.ZU(paramZe3n1, paramZe3n2);
  }
  
  public Zlvf Zb() {
    Zsxd zsxd1 = this.ZT.Zr();
    Zsxd zsxd2 = this.ZQ.Zr();
    return ZD(this.ZT, zsxd1, Zs2i.Zl(zsxd1.Zz().ZR()), this.ZQ, zsxd2, this.Zi, this.ZU);
  }
  
  public Zlvf ZZ(Zlp5 paramZlp5) {
    Zsxd zsxd1 = this.ZT.Zr(Zlv5.Zp(paramZlp5)).ZBB();
    Zsxd zsxd2 = this.ZQ.Zr(Zlv5.ZK(paramZlp5)).ZBB();
    return ZD(this.ZT, zsxd1, Zs2i.Zl(zsxd1.Zz().ZR()), this.ZQ, zsxd2, this.Zi, this.ZU);
  }
  
  public Zlvf ZK(Zri7 paramZri7, Zlp5 paramZlp5) {
    String str = Ze3n.Zy();
    if (this.ZT.Zu()) {
      Zil zil1;
      Zi6 zi6 = new Zi6(paramZlp5.ZP(), paramZri7.ZJ(), this.ZT, this.Zg, this.Zh, this.ZD);
      if (str == null) {
        zil1 = new Zil(paramZlp5.ZP(), paramZri7.ZJ(), this.ZT, this.Zg, this.Zh, this.ZD);
        Zsxd zsxd5 = this.ZT.Zr(Zlv5.Zp(paramZlp5).Za(zil1.Zc())).ZBB();
        this.Zg = zil1.ZN();
        Zs2i zs2i2 = zil1.Zx();
        Zsxd zsxd6 = this.ZQ.Zr(Zlv5.ZK(paramZlp5)).ZBB();
        return ZD(this.ZT, zsxd5, zs2i2, this.ZQ, zsxd6, this.Zi, this.ZU);
      } 
      Zsxd zsxd3 = this.ZT.Zr(Zlv5.Zp(paramZlp5).Za(zil1.Zc())).ZBB();
      this.Zg = zil1.ZN();
      Zs2i zs2i1 = zil1.Zx();
      Zsxd zsxd4 = this.ZQ.Zr(Zlv5.ZK(paramZlp5)).ZBB();
      return ZD(this.ZT, zsxd3, zs2i1, this.ZQ, zsxd4, this.Zi, this.ZU);
    } 
    Zil zil = new Zil(paramZlp5.ZP(), paramZri7.ZJ(), this.ZT, this.Zg, this.Zh, this.ZD);
    Zsxd zsxd1 = this.ZT.Zr(Zlv5.Zp(paramZlp5).Za(zil.Zc())).ZBB();
    this.Zg = zil.ZN();
    Zs2i zs2i = zil.Zx();
    Zsxd zsxd2 = this.ZQ.Zr(Zlv5.ZK(paramZlp5)).ZBB();
    return ZD(this.ZT, zsxd1, zs2i, this.ZQ, zsxd2, this.Zi, this.ZU);
  }
  
  private static Zlvf ZD(Ze3n paramZe3n1, Zsxd paramZsxd1, Zs2i paramZs2i, Ze3n paramZe3n2, Zsxd paramZsxd2, Zz1m<Zt1o> paramZz1m, Zxs7 paramZxs7) {
    paramZz1m.ZD(new Zxr8(Zt1o.ZM, Zx50.Zt(paramZxs7)));
    return new Zglj(paramZs2i.ZE(), paramZe3n1, paramZs2i, new Zsex(paramZsxd1), paramZe3n2, new Zsex(paramZsxd2));
  }
  
  public Zmzk ZB() {
    return this.ZT.Za();
  }
  
  public Zs2i Z_(byte[] paramArrayOfbyte, byte paramByte) {
    return this.Zg.<Zs2i>Zk(new Zrrb(paramArrayOfbyte, paramByte));
  }
  
  public Zefx Zy() {
    return this.ZT.ZA();
  }
  
  public Zb6q ZQ() {
    List<Zb6q> list = this.ZQ.Zi();
    return list.get(list.size() - 1);
  }
  
  public Zmhe Zg() {
    return new Zs_6(this.ZS, this.Zh, this.ZD, this.ZT, this.ZQ, this.Zg, this.Zi);
  }
  
  public String ZO() {
    return this.ZT.ZN();
  }
  
  public List<Zb6q> ZN() {
    return this.ZQ.Zi();
  }
  
  public int Zn() {
    return this.ZT.ZM().Zgv();
  }
  
  public <T> T Zq(T paramT1, T paramT2) {
    return paramT2;
  }
  
  public Ze3n ZH() {
    return this.ZT;
  }
  
  public Zxs7 Zx() {
    return this.Zg;
  }
  
  public Zvow ZX() {
    return this.ZT.ZI();
  }
  
  public boolean ZR() {
    return this.ZY.ZR();
  }
  
  public boolean ZU() {
    return this.ZY.ZU();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(a(5470, 3491));
    stringBuilder.append(a(5468, -1076)).append(this.ZT.ZM().ZgY());
    stringBuilder.append(a(5471, -32583)).append(this.ZQ.ZM().ZgY());
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '«}×h/'×yÆ*ïÀùÏ3c^=2<dzÆ\\fL¥NÈ%8ù»í'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #16
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #78
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
    //   69: putstatic burp/Zs_6.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zs_6.b : [Ljava/lang/String;
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
    //   152: bipush #77
    //   154: goto -> 184
    //   157: bipush #77
    //   159: goto -> 184
    //   162: bipush #112
    //   164: goto -> 184
    //   167: bipush #107
    //   169: goto -> 184
    //   172: bipush #22
    //   174: goto -> 184
    //   177: bipush #93
    //   179: goto -> 184
    //   182: bipush #76
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
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x155E) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */