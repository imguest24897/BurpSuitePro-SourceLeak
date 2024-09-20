package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zt40 implements Zm9n {
  private static final Pattern Zr;
  
  private final Zg3o Zj;
  
  private final Zmhe ZH;
  
  private final Zkq4 ZC;
  
  private final Ze3n Zo;
  
  private final Zxs7 Zh;
  
  private final Zbnt ZZ;
  
  private final Zlk4 Zz;
  
  private Ztzo ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt40(Zmhe paramZmhe, Zkq4 paramZkq4, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt) {
    this.ZH = paramZmhe;
    this.ZC = paramZkq4;
    this.Zo = paramZe3n;
    this.Zh = paramZxs7;
    Zbqc[] arrayOfZbqc = Zrig.ZC();
    this.ZZ = paramZbnt;
    this.Zz = Za();
    this.Zj = new Zg3o(paramZmhe, paramZkq4, paramZe3n, paramZxs7, paramZbnt, this.Zz.ZH(Zlk4.THOROUGH));
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_FilePathTraversal;
  }
  
  public boolean Zf() {
    return Ze7p.Zn(this.Zh, this.ZC, this.Zo.Zz());
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    this.ZE = new Ztzo(this.Zo.ZL().Za(), this.ZZ);
    Zsqx<Zrdb> zsqx = null;
    if (this.ZC.ZS(Zzu2.FILE_PATH_TRAVERSAL, Zr3z.PATH_TRAVERSAL_FILE_RETRIEVAL)) {
      zsqx = Zs();
      if (zsqx != null)
        paramZz4_.Zz(zsqx); 
    } 
    if (this.ZC.Zr(Zzu2.FILE_PATH_MANIPULATION)) {
      Zsqx<Zrdb> zsqx1 = null;
      if (!Ze7p.Zt(this.Zh) && !Zu())
        zsqx1 = this.Zj.Zh(); 
      if (ZS(zsqx, zsqx1))
        paramZz4_.Zz(zsqx1); 
    } 
  }
  
  private boolean Zu() {
    return (this.Zh.ZI() != null && (this.Zh.ZI().toLowerCase(Locale.ENGLISH).startsWith(a(23832, 797)) || this.Zh.ZI().toLowerCase(Locale.ENGLISH).startsWith(a(23833, -12561))));
  }
  
  private boolean ZS(Zsqx<Zrdb> paramZsqx1, Zsqx<Zrdb> paramZsqx2) {
    return ((paramZsqx1 == null && paramZsqx2 != null) || this.Zj.Zm());
  }
  
  private Zsqx<Zrdb> Zs() {
    Zsqx<Zrdb> zsqx = ZM((byte)0);
    return (zsqx != null) ? zsqx : ZM((byte)1);
  }
  
  private Zsqx<Zrdb> ZM(byte paramByte) {
    List<String> list = Zrig.ZW(this.Zh.ZI(), paramByte, this.Zz);
    Iterator<String> iterator = list.iterator();
    Zbqc[] arrayOfZbqc = Zrig.ZC();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Zsqx<Zrdb> zsqx = Zu(str, paramByte);
      if (zsqx != null)
        return zsqx; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  private Zsqx<Zrdb> Zu(String paramString, byte paramByte) {
    Zsqx<Zrdb> zsqx = Zy(paramString, paramByte, (byte)0);
    if (zsqx != null && paramByte == 1) {
      String str = paramString.replace(Zxt6.FILENAME_PASSWD_UNIX.ZX(), Zxt6.FILENAME_SHADOW_UNIX.ZX());
      Zsqx<Zrdb> zsqx1 = Zy(str, (byte)1, (byte)1);
      if (zsqx1 != null)
        return zsqx1; 
    } 
    return zsqx;
  }
  
  private Zsqx<Zrdb> Zy(String paramString, byte paramByte1, byte paramByte2) {
    byte[] arrayOfByte = Zkb.Zy(paramString);
    Zlvf zlvf = this.ZH.ZK(Zri7.ZJ(new Zrrb(arrayOfByte, (byte)0)), Zlp5.Zc().Zd(false));
    Zb6q zb6q = zlvf.ZM().ZT();
    if (!Zs2k.Zb(this.Zo.ZL(), zb6q))
      return null; 
    Zstu zstu = zb6q.Za();
    List<int[]> list = this.ZE.ZH(zstu, paramByte1);
    if (!list.isEmpty()) {
      if (Zi(paramString, paramByte1))
        return null; 
      List<int[]> list1 = this.ZE.ZO(zstu, paramByte1);
      return !list1.isEmpty() ? Z_(arrayOfByte, zlvf.ZY(), zstu, list1, (byte)2) : Z_(arrayOfByte, zlvf.ZY(), zstu, list, paramByte2);
    } 
    return null;
  }
  
  private Zsqx<Zrdb> Z_(byte[] paramArrayOfbyte, Zs2i paramZs2i, Zstu paramZstu, List<int[]> paramList, byte paramByte) {
    Zvow zvow = this.Zo.ZI().Zp(paramZs2i.ZE()).ZK(paramZs2i.ZO()).Zu(paramZstu).Z_(Zrlp.Zc(paramList));
    return Zgrw.ZL(this.Zo.Za(), this.Zo.ZN(), zvow, paramByte, paramArrayOfbyte, this.Zh);
  }
  
  private boolean Zi(String paramString, byte paramByte) {
    byte[] arrayOfByte = ZC(paramString);
    Zlvf zlvf = this.ZH.ZK(Zri7.ZJ(new Zrrb(arrayOfByte, (byte)0)), Zlp5.Zc().Zd(false));
    return (this.ZE.ZH(zlvf.ZM().Zl(), paramByte).size() > 0);
  }
  
  private byte[] ZC(String paramString) {
    Zxt6[] arrayOfZxt6 = Zxt6.values();
    int i = arrayOfZxt6.length;
    Zbqc[] arrayOfZbqc = Zrig.ZC();
    byte b = 0;
    while (b < i) {
      Zxt6 zxt6 = arrayOfZxt6[b];
      if (paramString.contains(zxt6.ZX()))
        return ZA(paramString, zxt6); 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    Zuh.ZT(false, Zqf.Zr, paramString);
    return Zkb.Zy(paramString + "X");
  }
  
  private byte[] ZA(String paramString, Zxt6 paramZxt6) {
    return Zkb.Zy(paramString.replace(paramZxt6.ZX(), paramZxt6.ZX() + "X"));
  }
  
  public String toString() {
    return Zp().name();
  }
  
  private Zlk4 Za() {
    if (this.ZC.ZqT().ZH(Zlk4.THOROUGH))
      return Zlk4.THOROUGH; 
    String str = this.Zh.ZI();
    return (str.isEmpty() || this.Zo.Zz()) ? Zlk4.THOROUGH : (Zr.matcher(str).matches() ? Zlk4.THOROUGH : this.ZC.ZqT());
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ëÆöí¶cAçò&+ö×\\r¿Õò¨j¶øôë©ñÇj_ï/\\nï\\f³SB­Q×Ý'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #24
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
    //   69: putstatic burp/Zt40.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zt40.b : [Ljava/lang/String;
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
    //   152: bipush #38
    //   154: goto -> 184
    //   157: bipush #54
    //   159: goto -> 184
    //   162: bipush #69
    //   164: goto -> 184
    //   167: bipush #98
    //   169: goto -> 184
    //   172: bipush #125
    //   174: goto -> 184
    //   177: bipush #24
    //   179: goto -> 184
    //   182: bipush #120
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
    //   227: sipush #23835
    //   230: sipush #-19204
    //   233: invokestatic a : (II)Ljava/lang/String;
    //   236: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   239: putstatic burp/Zt40.Zr : Ljava/util/regex/Pattern;
    //   242: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D19) & 0xFFFF;
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
      byte b1 = 53;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt40.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */