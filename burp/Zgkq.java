package burp;

import java.util.List;
import java.util.Optional;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zmw;
import net.portswigger.Zsy;

public class Zgkq implements Zs0k {
  private static final Pattern Zv;
  
  private final Zsoh ZK;
  
  private final Ztpx Zg;
  
  private final Ze3n Zu;
  
  private final Zsv5 ZM;
  
  private final Zk9m ZI;
  
  private final Zgsh ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zgkq(Zsoh paramZsoh, Ztpx paramZtpx, Ze3n paramZe3n, Zsv5 paramZsv5, Zk9m paramZk9m, Zgsh paramZgsh) {
    this.ZK = paramZsoh;
    this.Zg = paramZtpx;
    this.Zu = paramZe3n;
    this.ZM = paramZsv5;
    this.ZI = paramZk9m;
    this.ZR = paramZgsh;
  }
  
  public void ZE(Zerr paramZerr) {
    Zbqc[] arrayOfZbqc = Zroa.Zp();
    try {
      if (this.ZI.Zw() == Zlwb.MUST_USE_HTTP2 || this.ZR.Zq() == Zlwb.MUST_USE_HTTP2) {
        Zxgd zxgd = this.ZM.ZI().ZY(Zgkq::lambda$checkForBehaviour$0);
        byte b = 0;
        while (b < 8) {
          try {
            Zsex zsex = new Zsex(this.ZK.ZD(Ztao.Zc(this.Zg, this.Zu.ZM(), this.Zu.ZA().ZD()).Zx(zxgd).Zz(false).ZA()));
            boolean bool = Zx(this.Zu, this.ZM, this.ZI, this.ZR, paramZerr, zsex);
            if (bool)
              return; 
          } catch (Zscd zscd) {
            Zah.Zl(Zscg.Zg(zscd), Zk_.COMMON_RUNTIME_FAILURE);
          } 
          b++;
          if (arrayOfZbqc == null)
            break; 
        } 
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private static boolean Zx(Ze3n paramZe3n, Zsv5 paramZsv5, Zk9m paramZk9m, Zgsh paramZgsh, Zerr paramZerr, Zzud paramZzud) {
    // Byte code:
    //   0: aload #5
    //   2: invokeinterface ZT : ()Lburp/Zb6q;
    //   7: invokeinterface Zs : ()I
    //   12: istore #6
    //   14: aload #5
    //   16: invokeinterface Zl : ()Lburp/Zstu;
    //   21: invokeinterface Zis : ()Ljava/lang/String;
    //   26: iload #6
    //   28: invokevirtual substring : (I)Ljava/lang/String;
    //   31: astore #7
    //   33: iload #6
    //   35: aload #7
    //   37: invokestatic ZE : (ILjava/lang/String;)Ljava/util/Optional;
    //   40: astore #8
    //   42: aload #8
    //   44: invokevirtual isPresent : ()Z
    //   47: ifeq -> 164
    //   50: aload #8
    //   52: invokevirtual get : ()Ljava/lang/Object;
    //   55: checkcast burp/Zl1r
    //   58: astore #9
    //   60: aload #4
    //   62: getstatic burp/Zroa.REQUEST_TUNNELLING : Lburp/Zroa;
    //   65: iconst_2
    //   66: anewarray burp/Zvow
    //   69: dup
    //   70: iconst_0
    //   71: aload_0
    //   72: invokevirtual Zt : ()Lburp/Zvow;
    //   75: aload_1
    //   76: invokevirtual Zp : ()Lburp/Zefx;
    //   79: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   82: aload_1
    //   83: invokevirtual Zp : ()Lburp/Zefx;
    //   86: aload_2
    //   87: aload_3
    //   88: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   93: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   96: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   99: aload_1
    //   100: invokevirtual ZM : ()Lburp/Zb6q;
    //   103: invokevirtual Zo : (Lburp/Zb6q;)Lburp/Zvow;
    //   106: aastore
    //   107: dup
    //   108: iconst_1
    //   109: aload_0
    //   110: invokevirtual Zt : ()Lburp/Zvow;
    //   113: aload #5
    //   115: invokeinterface Z_ : ()Lburp/Zefx;
    //   120: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   123: aload #5
    //   125: invokeinterface Z_ : ()Lburp/Zefx;
    //   130: aload_2
    //   131: aload_3
    //   132: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   137: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   140: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   143: aload #5
    //   145: invokeinterface Zl : ()Lburp/Zstu;
    //   150: invokevirtual Zu : (Lburp/Zstu;)Lburp/Zvow;
    //   153: aload #9
    //   155: invokevirtual Zf : (Lburp/Zl1r;)Lburp/Zvow;
    //   158: aastore
    //   159: invokevirtual ZP : (Lburp/Zroa;[Lburp/Zvow;)V
    //   162: iconst_1
    //   163: ireturn
    //   164: iconst_0
    //   165: ireturn
  }
  
  public static Optional<Zl1r> ZE(int paramInt, String paramString) {
    Matcher matcher = Zv.matcher(paramString);
    if (matcher.find()) {
      MatchResult matchResult = matcher.toMatchResult();
      return Optional.of(new Zl1r(paramInt + matchResult.start(), paramInt + matchResult.end()));
    } 
    return Optional.empty();
  }
  
  private static List lambda$checkForAndReportTunnelledResponse$1(Zk9m paramZk9m, Zgsh paramZgsh, Zr6q paramZr6q) {
    return paramZk9m.Zw(Zyf.Zy(paramZr6q.ZD()), paramZgsh);
  }
  
  private static Zefx lambda$checkForBehaviour$0(Zefx paramZefx) {
    paramZefx = paramZefx.Zr(a(24383, -12991));
    Zsy zsy = new Zsy();
    String str1 = zsy.Zi().Zx().ZK(8);
    String str2 = zsy.Zi().Zx().ZK(8);
    String str3 = zsy.Zi().Zx().ZK(8);
    byte[] arrayOfByte1 = Zkb.Zy(String.format(a(24382, -24708), new Object[] { str1, str2, str3 }));
    byte[] arrayOfByte2 = Zmw.Zq(new byte[][] { paramZefx.Zw(), arrayOfByte1 });
    paramZefx = paramZefx.ZZ(arrayOfByte2);
    return Zgyj.Zp(paramZefx);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'àðüáîÐmL½Åù;(#3{&|.ð~4èù#²Â]ÐoJÖýN½w\\n±$ÚÒùÐÖT§¢'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #117
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
    //   69: putstatic burp/Zgkq.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zgkq.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #100
    //   154: goto -> 183
    //   157: iconst_1
    //   158: goto -> 183
    //   161: bipush #22
    //   163: goto -> 183
    //   166: bipush #74
    //   168: goto -> 183
    //   171: bipush #95
    //   173: goto -> 183
    //   176: bipush #32
    //   178: goto -> 183
    //   181: bipush #55
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: sipush #24380
    //   229: sipush #-16543
    //   232: invokestatic a : (II)Ljava/lang/String;
    //   235: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   238: putstatic burp/Zgkq.Zv : Ljava/util/regex/Pattern;
    //   241: return
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5F3E) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */