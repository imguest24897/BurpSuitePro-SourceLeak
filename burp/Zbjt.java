package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

public class Zbjt {
  private final Zek_ Zp;
  
  private final int ZW;
  
  private final int Zg;
  
  private final boolean Zh;
  
  private final byte[] ZS;
  
  private final int ZT;
  
  private int Zk;
  
  private int Zn;
  
  private int Zz;
  
  private static boolean Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbjt(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = ZA();
    try {
      this.ZS = new byte[paramInt];
      System.arraycopy(paramArrayOfbyte, 0, this.ZS, 0, paramInt);
      this.ZT = paramInt;
      if ((paramArrayOfbyte[2] & 0x80) == 128)
        throw new Zs_c(a(5617, 20618), paramArrayOfbyte); 
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
    try {
      if (paramInt < 12)
        throw new Zs_c(a(5624, -13907), paramArrayOfbyte); 
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
    try {
      this.Zg = (paramArrayOfbyte[2] & 0x78) >> 3;
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
    try {
      this.Zh = ((paramArrayOfbyte[2] & 0x1) == 1);
      this.ZW = paramArrayOfbyte[4] << 8 | paramArrayOfbyte[5];
      if (this.ZW != 1)
        throw new Zmfs(a(5629, 14258)); 
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
    this.Zk = 12;
    List<Ze2x> list = Zq();
    try {
      this.Zp = new Zek_(list);
      if (this.Zz != 1)
        throw new Zmfs(a(5631, -27397) + a(5631, -27397)); 
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
    try {
      if (bool)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
  }
  
  public String toString() {
    return this.Zp.toString() + a(5625, 20883) + this.Zg + a(5627, -30065) + this.ZW + a(5616, -26477) + this.Zh;
  }
  
  private List<Ze2x> Zq() {
    int i = this.Zk;
    byte b = ZT();
    ArrayList<Ze2x> arrayList = new ArrayList();
    boolean bool = Zg();
    while (b > 0) {
      try {
        if (this.Zk + b >= this.ZT)
          throw new Zs_c(a(5628, 28027), this.ZS); 
      } catch (Zs_c zs_c) {
        throw a(null);
      } 
      String str = Zkb.Zo(this.ZS, this.Zk, b);
      try {
        if (!Ze2x.Ze(str))
          throw new Zs_c(a(5630, 15905), Zkb.Zy(str)); 
      } catch (Zs_c zs_c) {
        throw a(null);
      } 
      arrayList.add(new Ze2x(i, str));
      this.Zk += b;
      i = this.Zk;
      b = ZT();
      if (!bool)
        break; 
    } 
    this.Zn = (ZK(ZT()) << 8) + ZK(ZT());
    this.Zz = (ZT() << 8) + ZT();
    return arrayList;
  }
  
  private byte ZT() {
    try {
      if (this.Zk >= this.ZT)
        throw new Zs_c(a(5626, -7851), this.ZS); 
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
    byte b = this.ZS[this.Zk];
    this.Zk++;
    return b;
  }
  
  public byte[] Z_() {
    return this.ZS;
  }
  
  public int ZO() {
    return this.Zk;
  }
  
  public int ZF() {
    return this.Zn;
  }
  
  private static int ZK(byte paramByte) {
    return 0xFF & paramByte;
  }
  
  String ZQ() {
    return this.Zp.Zl();
  }
  
  boolean Zq(String paramString) {
    return this.Zp.Zj(paramString);
  }
  
  String ZU() {
    return this.Zp.ZU();
  }
  
  int ZO(String paramString) {
    return this.Zp.Zm(paramString);
  }
  
  Iterable<String> Ze() {
    return (Iterable<String>)this.Zp.ZJ.stream().map(Zbjt::lambda$labels$0).collect(Collectors.toList());
  }
  
  private static Integer[] lambda$offsets$2(int paramInt) {
    return new Integer[paramInt];
  }
  
  private static Integer lambda$offsets$1(Ze2x paramZe2x) {
    return Integer.valueOf(paramZe2x.Zs);
  }
  
  private static String lambda$labels$0(Ze2x paramZe2x) {
    return paramZe2x.ZS;
  }
  
  public static void ZZ(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean ZA() {
    return Z_;
  }
  
  public static boolean Zg() {
    boolean bool = ZA();
    try {
      if (!bool)
        return true; 
    } catch (Zs_c zs_c) {
      throw a(null);
    } 
    return false;
  }
  
  private static Zs_c a(Zs_c paramZs_c) {
    return paramZs_c;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '-èõòÛ|ÀÞ-$hæ\\n\\tí¤½´*NÞöHcÆRÞ­±giDyÍßWù1zK×e;o}¸ËQáq°k§¯ Ìã{p#\\t~cOdê®½O«1î5lÄOP=¿Ðîi®Æuø.¼ôêÉÛ>Tê¾#u´pK;,ÒOØbU­KR4¬SX1J¾0ÙÊ§CÊÄõ½0Wö&aæÆÊlyé£õxb<ä%yºucîI^p4×ëµ\\rÌ«yl fgþºAÆ§Mµ&Å '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_0
    //   19: bipush #8
    //   21: istore_1
    //   22: invokestatic ZZ : (Z)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #105
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc ''¤kQN¼(¬-)¡0¼M*x´WWBÐìÄ\\bgÑ¤¬'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #21
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #9
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zbjt.a : [Ljava/lang/String;
    //   136: bipush #10
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zbjt.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #65
    //   218: goto -> 248
    //   221: bipush #18
    //   223: goto -> 248
    //   226: bipush #16
    //   228: goto -> 248
    //   231: bipush #8
    //   233: goto -> 248
    //   236: bipush #50
    //   238: goto -> 248
    //   241: bipush #12
    //   243: goto -> 248
    //   246: bipush #94
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x15F9) & 0xFFFF;
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
      byte b1 = 11;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */