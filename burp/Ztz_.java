package burp;

import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztz_ {
  private static final Pattern Zn;
  
  private final Ze_7 ZV;
  
  private final Zbnt Zx;
  
  private final Zmtq Zs;
  
  private final Zm6e Zu;
  
  private final Zxpt Zd;
  
  private final Zrgd ZP;
  
  private final Zey9 ZL;
  
  private final AtomicLong Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztz_(Ze_7 paramZe_7, Zbnt paramZbnt, Zmtq paramZmtq, Zm6e paramZm6e, Zxpt paramZxpt, Zrgd paramZrgd, Zey9 paramZey9) {
    this.ZV = paramZe_7;
    this.Zx = paramZbnt;
    this.Zs = paramZmtq;
    this.Zu = paramZm6e;
    this.Zd = paramZxpt;
    this.ZP = paramZrgd;
    this.ZL = paramZey9;
    this.Zt = new AtomicLong();
  }
  
  public void Zl(Zes1 paramZes1) throws Zxgy, Zxg5, UnknownHostException, Zxro {
    Zefx zefx = Za(paramZes1, a(-22950, 15354));
    Zg3d zg3d = this.ZV.ZX(zefx);
    try {
      if (zg3d.Zx() instanceof UnknownHostException)
        throw (UnknownHostException)zg3d.Zx(); 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    try {
      if (zg3d.Zb() == Zvom.CONNECTION_FAILED)
        throw new Zxro(zefx.ZT()); 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    this.Zd.Zd(zg3d);
  }
  
  public List<Zer0> ZY(Zes1 paramZes1) throws Zxro, UnknownHostException, Zxgy, Zxg5 {
    Zefx zefx = Za(paramZes1, a(-22951, 5237) + a(-22951, 5237));
    Zg3d zg3d = this.ZV.ZX(zefx);
    try {
      if (zg3d.Zx() instanceof UnknownHostException)
        throw (UnknownHostException)zg3d.Zx(); 
    } catch (Ze0d ze0d) {
      throw a(null);
    } 
    try {
      if (zg3d.Zb() != Zvom.CONNECTION_FAILED)
        try {
          if (!zg3d.ZI()) {
            this.Zd.Zd(zg3d);
            ZH(zg3d);
            List<String> list = zg3d.Ze().Zm();
            try {
              if (zg3d.Ze().Ze() < 300 && list.contains(a(-22952, -20107))) {
                Zstu zstu = zg3d.Ze().Zt();
                try {
                  if (zstu != null)
                    try {
                      if (zstu.Zpu() > 1)
                        try {
                          return (new Zssd(zstu.Zis())).Zk();
                        } catch (Ze0d ze0d) {
                          Zah.Zl(ze0d, Zk_.UNEXPECTED);
                          Zuh.Zb(false, Zqf.Zk);
                        }  
                    } catch (Zxro zxro) {
                      throw a(null);
                    }  
                } catch (Ze0d ze0d) {
                  throw a(null);
                } 
              } 
            } catch (Ze0d ze0d) {
              throw a(null);
            } 
            return Collections.emptyList();
          } 
          throw new Zxro(zefx.ZT());
        } catch (Ze0d ze0d) {
          throw a(null);
        }  
    } catch (Ze0d ze0d) {
      throw a(null);
    } 
    throw new Zxro(zefx.ZT());
  }
  
  private void ZH(Zg3d paramZg3d) {
    int i = Zlp9.Zr();
    try {
      if (paramZg3d.Zb() == Zvom.NO_RESPONSE_DATA)
        return; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    for (String str : paramZg3d.Ze().Zm()) {
      Matcher matcher = Zn.matcher(str);
      try {
        if (matcher.matches() && matcher.groupCount() == 1)
          try {
            long l = Long.parseLong(matcher.group(1));
            this.Zt.set(l - this.ZP.ZX() - paramZg3d.ZS().toMillis());
          } catch (NumberFormatException numberFormatException) {
            Zah.Zl(numberFormatException, Zk_.UNEXPECTED);
            Zuh.ZT(false, Zqf.Zk, matcher.group(1));
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
  }
  
  private Zefx Za(Zes1 paramZes1, String paramString) throws Zxgy, Zxg5 {
    Zmzk zmzk = this.Zx.ZY(paramZes1.Zx, paramZes1.Zl, paramZes1.Zg);
    byte[] arrayOfByte = this.Zu.ZO().Zf(new Zax(zmzk, Zkb.Zy(paramString))).ZK(Zxk3.HTTP_V11).Zw(a(-22949, -13825)).Zr().ZiD();
    return this.ZL.ZY(zmzk, arrayOfByte);
  }
  
  public long ZA() {
    return this.Zt.get();
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'DÙÑ×Ý=CÔ\\fô+Ö´yt¤M®õ .õ8t&±©~äsÖå¥$'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #55
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
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
    //   66: ldc ']m×%ä8÷-6u-ÀU>zÃ#·ÌÊØù·kÐ£íîzôÖ¹z*¯Õý+*üJOÅÝÁ·r3ypÀ¿þ'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #30
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #55
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Ztz_.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Ztz_.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 254
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 236, 0 -> 208, 1 -> 212, 2 -> 217, 3 -> 222, 4 -> 227, 5 -> 231
    //   208: iconst_4
    //   209: goto -> 238
    //   212: bipush #92
    //   214: goto -> 238
    //   217: bipush #104
    //   219: goto -> 238
    //   222: bipush #36
    //   224: goto -> 238
    //   227: iconst_4
    //   228: goto -> 238
    //   231: bipush #127
    //   233: goto -> 238
    //   236: bipush #72
    //   238: ixor
    //   239: ixor
    //   240: i2c
    //   241: castore
    //   242: iinc #6, 1
    //   245: dup
    //   246: ifne -> 254
    //   249: dup2
    //   250: dup_x1
    //   251: goto -> 163
    //   254: dup2_x1
    //   255: pop2
    //   256: dup_x2
    //   257: iload #6
    //   259: if_icmpgt -> 159
    //   262: pop
    //   263: new java/lang/String
    //   266: dup_x1
    //   267: swap
    //   268: invokespecial <init> : ([C)V
    //   271: invokevirtual intern : ()Ljava/lang/String;
    //   274: swap
    //   275: pop
    //   276: swap
    //   277: tableswitch default -> 38, 0 -> 97
    //   296: sipush #-22945
    //   299: sipush #-22544
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   308: putstatic burp/Ztz_.Zn : Ljava/util/regex/Pattern;
    //   311: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA65B) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztz_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */