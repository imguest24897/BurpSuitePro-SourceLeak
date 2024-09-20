package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zlz;
import net.portswigger.Zz_;

public class Zsb {
  private static final Ztt4 Zw;
  
  private static final int ZL;
  
  private static final int Zz;
  
  private static final byte[] Zr;
  
  private final Zs51 Zc;
  
  private final Zb25 ZU;
  
  private final Zz_d ZS;
  
  private final String ZP;
  
  private final int Zp;
  
  private final List<Ztka> Zf;
  
  private Ztka Zq;
  
  private Ztka ZX;
  
  private int ZO;
  
  private int ZE;
  
  private boolean ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsb(Zs51 paramZs51, Zb25 paramZb25, long paramLong, String paramString, int paramInt) {
    String[] arrayOfString = Zgzu.Zk();
    this.Zq = Ztka.Zs;
    this.ZX = Ztka.Zs;
    this.ZO = 0;
    this.ZE = 0;
    this.Zc = paramZs51;
    this.ZU = paramZb25;
    this.ZS = new Zz_d(paramLong);
    this.ZP = paramString;
    this.Zp = paramInt;
    this.ZD = paramZb25.ZV();
    this.Zf = new ArrayList<>();
    if (Zbqc.Zwu() == null)
      Zgzu.ZQ(new String[1]); 
  }
  
  public Zsb Zf(byte[] paramArrayOfbyte) {
    this.Zq = Zg(paramArrayOfbyte, ZL);
    return ZX(paramArrayOfbyte);
  }
  
  public Zsb Zj(byte[] paramArrayOfbyte) {
    this.Zf.add(Zg(paramArrayOfbyte, Zz));
    return ZX(paramArrayOfbyte);
  }
  
  private Ztka Zg(byte[] paramArrayOfbyte, int paramInt) {
    int i = Zli.Zg(paramArrayOfbyte, (byte)60, false, paramInt, paramArrayOfbyte.length);
    int j = Zli.Zg(paramArrayOfbyte, (byte)62, false, paramInt, paramArrayOfbyte.length);
    int k = Zli.ZZ(paramArrayOfbyte, Zr, false, paramInt, paramArrayOfbyte.length);
    k = (k == -1) ? paramArrayOfbyte.length : k;
    return new Zrjs(this, (i == -1) ? paramInt : (paramInt + 1), (j == -1) ? k : j);
  }
  
  public Zsb ZC(byte[] paramArrayOfbyte) {
    this.ZX = (this.ZX == Ztka.Zs) ? new Zrjs(this, 0, paramArrayOfbyte.length) : new Zrjs(this, this.ZX, paramArrayOfbyte.length);
    return ZX(paramArrayOfbyte);
  }
  
  public Zsb Zp(byte[] paramArrayOfbyte) {
    return ZX(paramArrayOfbyte);
  }
  
  public Zsb ZX(byte[] paramArrayOfbyte) {
    this.ZS.write(paramArrayOfbyte);
    return this;
  }
  
  public void ZI() {
    Zet7 zet7 = this.ZS.ZK();
    String[] arrayOfString = Zgzu.Zk();
    int i = Math.max(this.ZO, this.ZE);
    List<Zen> list = ZA(zet7, i);
    if (list.isEmpty())
      return; 
    byte[] arrayOfByte1 = zet7.ZL(this.Zq.ZL(), this.Zq.Zp());
    byte[] arrayOfByte2 = zet7.ZL(this.ZX.ZL(), this.ZX.Zp());
    List<byte[]> list1 = Zt(zet7, this.Zf);
    HashSet<String> hashSet = new HashSet();
    for (Zen zen : list) {
      if (hashSet.add(zen.toString())) {
        byte[] arrayOfByte = zet7.ZL(this.ZE, zet7.ZJ());
        this.Zc.Zl(zen, arrayOfByte1, list1, arrayOfByte2, arrayOfByte);
      } 
      if (arrayOfString != null)
        break; 
    } 
    if (Zw.Zc())
      Zw.Zj(String.format(a(-29627, -21751), new Object[] { this.ZU, this.ZP, Integer.valueOf(this.Zp), Z_(zet7), Zlz.Zh(hashSet, a(-29630, -801)) })); 
    this.Zf.clear();
    this.Zq = Ztka.Zs;
    this.ZX = Ztka.Zs;
    this.ZE = this.ZS.size();
  }
  
  private static List<Zen> ZA(Zet7 paramZet7, int paramInt) {
    String[] arrayOfString = Zgzu.Zk();
    if (paramInt > 0) {
      int i = paramZet7.ZJ() - paramInt;
      byte[] arrayOfByte1 = new byte[i];
      System.arraycopy(paramZet7.ZZ(), paramInt, arrayOfByte1, 0, i);
      if (arrayOfString != null) {
        arrayOfByte1 = paramZet7.ZZ();
        return (new Zz_(arrayOfByte1)).Z_();
      } 
      return (new Zz_(arrayOfByte1)).Z_();
    } 
    byte[] arrayOfByte = paramZet7.ZZ();
    return (new Zz_(arrayOfByte)).Z_();
  }
  
  private static List<byte[]> Zt(Zet7 paramZet7, List<Ztka> paramList) {
    ArrayList<byte[]> arrayList = new ArrayList();
    String[] arrayOfString = Zgzu.Zk();
    for (Ztka ztka : paramList) {
      arrayList.add(paramZet7.ZL(ztka.ZL(), ztka.Zp()));
      if (arrayOfString != null)
        break; 
    } 
    return (List<byte[]>)arrayList;
  }
  
  private String Z_(Zet7 paramZet7) {
    return this.Zf.stream().map(paramZet7::lambda$getRecipientsForDebug$0).collect(Collectors.joining(a(-29628, -13115)));
  }
  
  void Zw() {
    this.ZO = this.ZS.size();
    this.ZD = true;
  }
  
  public boolean Zo() {
    return this.ZD;
  }
  
  private static String lambda$getRecipientsForDebug$0(Zet7 paramZet7, Ztka paramZtka) {
    return Zkb.ZG(paramZet7.ZL(paramZtka.ZL(), paramZtka.Zp()));
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '\\n±] daí\\boXjËßH'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #10
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #109
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
    //   67: ldc '¯«©M0:L§EKèy°ËyÚjÄ°Èº\\b§Õc$¦Xï²%MÔA²Ç}_â@6ºÐç¨ý"3ïËÞè}&ªØÞÿ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #77
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #45
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
    //   128: putstatic burp/Zsb.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zsb.b : [Ljava/lang/String;
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
    //   172: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 230, 5 -> 235
    //   212: bipush #67
    //   214: goto -> 242
    //   217: iconst_2
    //   218: goto -> 242
    //   221: bipush #85
    //   223: goto -> 242
    //   226: iconst_5
    //   227: goto -> 242
    //   230: bipush #26
    //   232: goto -> 242
    //   235: bipush #108
    //   237: goto -> 242
    //   240: bipush #23
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
    //   300: sipush #-29626
    //   303: invokestatic Zr : ()Lburp/Ztt4;
    //   306: putstatic burp/Zsb.Zw : Lburp/Ztt4;
    //   309: sipush #6627
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: invokevirtual length : ()I
    //   318: putstatic burp/Zsb.ZL : I
    //   321: sipush #-29625
    //   324: sipush #25293
    //   327: invokestatic a : (II)Ljava/lang/String;
    //   330: invokevirtual length : ()I
    //   333: putstatic burp/Zsb.Zz : I
    //   336: iconst_2
    //   337: newarray byte
    //   339: dup
    //   340: iconst_0
    //   341: bipush #13
    //   343: bastore
    //   344: dup
    //   345: iconst_1
    //   346: bipush #10
    //   348: bastore
    //   349: putstatic burp/Zsb.Zr : [B
    //   352: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C46) & 0xFFFF;
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
      byte b1 = 12;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */