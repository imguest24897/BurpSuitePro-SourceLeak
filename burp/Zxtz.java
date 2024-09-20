package burp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxtz {
  private final Zbiw ZX;
  
  private final Zbr_ Zn;
  
  final Zbr0 Zk;
  
  private final Zbr4 Zq;
  
  private final Zbrp ZJ;
  
  private final CountDownLatch ZH;
  
  private final Zxei Zi;
  
  private final Zkit Ze;
  
  private final Zk8l ZY;
  
  private final Zgbj Za;
  
  private final Ztg4 Zu;
  
  private final Zl0 ZQ;
  
  private final String ZU;
  
  volatile boolean ZG;
  
  volatile Zsic ZA;
  
  private static String ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zxtz Zn(Zxei paramZxei, Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, Zl0 paramZl0, String paramString1, String paramString2) {
    return new Zxtz(paramZxei, paramZkit, paramZk8l, paramZgbj, paramZtg4, paramZl0, paramString1, null, paramString2, true);
  }
  
  public Zxtz(Zxei paramZxei, Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, Zl0 paramZl0, String paramString1, Zl04 paramZl04, String paramString2) {
    this(paramZxei, paramZkit, paramZk8l, paramZgbj, paramZtg4, paramZl0, paramString1, paramZl04, paramString2, false);
  }
  
  private Zxtz(Zxei paramZxei, Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, Zl0 paramZl0, String paramString1, Zl04 paramZl04, String paramString2, boolean paramBoolean) {
    this.Zi = paramZxei;
    this.Ze = paramZkit;
    this.ZY = paramZk8l;
    this.Za = paramZgbj;
    this.Zu = paramZtg4;
    this.ZQ = paramZl0;
    this.ZU = paramString1;
    this.Zn = new Zbr_(this, paramBoolean);
    this.Zk = new Zbr0(this);
    this.Zq = new Zbr4(this, paramBoolean);
    this.ZJ = new Zbrp(this);
    this.ZH = new CountDownLatch(1);
    this.ZX = new Zl0a(paramZl04, paramString2, 80, 16, this.Zn);
  }
  
  public Zl04 Zp() {
    return this.ZX.Zu();
  }
  
  public void ZF() {
    try {
      this.ZH.await();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
  }
  
  private void ZR() {
    this.ZH.countDown();
  }
  
  Zsic ZS(Zsic paramZsic) {
    if (paramZsic == this.Zn)
      return Zr(); 
    if (paramZsic == this.Zk) {
      this.ZA = this.Zq;
      this.ZG = true;
      this.ZX.Zf(this.Zq);
      return this.Zq;
    } 
    if (paramZsic == this.Zq) {
      ZE();
      return null;
    } 
    Zuh.Zb(false, Zqf.Zr);
    ZR();
    return null;
  }
  
  private void ZE() {
    String str = ZS();
    if (this.Za != null) {
      this.Za.ZK(false);
      if (str == null) {
        this.Zi.ZH(Zmg9.PROJECT_WIZARD_EXITED);
        return;
      } 
      return;
    } 
    this.Zi.ZH(Zmg9.PROJECT_WIZARD_EXITED);
  }
  
  private Zsic Zr() {
    String str = this.Zn.ZW.getText();
    try {
      if (Zs(str))
        return this.Zn; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      File file = ZJ(str);
      this.Zk.Zp(this.Ze, this.ZY, this.Zu, file, file.getName(), this.ZU);
      return this.Zk;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.Zn.ZJ.setText(exception.getMessage());
      return this.Zn;
    } 
  }
  
  boolean Zu(String paramString) {
    return this.Ze.Zd().equals(paramString);
  }
  
  void Zf(String paramString) {
    this.ZA = this.ZJ;
    this.ZG = true;
    this.ZJ.ZZ(Zrgs.PROJECT_DATA_RECOVERY_ERROR_CAPTION.ZN(new Object[0]));
    this.ZJ.ZJ(paramString);
    this.ZX.Zf(this.ZJ);
  }
  
  Zsic ZZ() {
    this.ZX.ZU(true);
    Zt2m.Zn(Zp());
    this.ZX.ZS();
    ZR();
    return null;
  }
  
  Zsic ZQ(Zsic paramZsic) {
    return Zx6o.ZY(Zp(), a(-17732, 20575)) ? ZZ() : paramZsic;
  }
  
  private boolean Zs(String paramString) {
    File file = this.ZQ.Zg(Zg1o.ZX(paramString));
    return (file.exists() && !Zx6o.ZY(Zp(), a(-17729, -4528) + a(-17729, -4528) + file.getAbsolutePath()));
  }
  
  private File ZJ(String paramString) throws IOException {
    File file = this.ZQ.Zg(Zg1o.ZX(paramString));
    try {
      if (file.exists())
        try {
          if (!file.delete())
            throw new IOException(a(-17731, -12557)); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return file;
  }
  
  public static void ZZ(String paramString) {
    ZI = paramString;
  }
  
  public static String ZS() {
    return ZI;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'XwkLbc'
    //   10: ldc 'üørþ\\r Ô}¹ ¥ûÀ\\tt($äV^S6¸rÓ:£è|· ð-BàéïM¾4½\\f\\f½1¶}*ìÂÖôh¦,ZÌ£ô§c«|Â'sÙZT_DñÌeþÿvB6¿Bzª3|à|e'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic ZZ : (Ljava/lang/String;)V
    //   22: bipush #41
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #17
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc 'cêë.A©(.Û3-ÿ?É¿ú"ªÅ\\nðèÕæªhªwéÐYk­ÁÂµ_¤òìýDùßrF'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #13
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #41
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 146
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
    //   133: putstatic burp/Zxtz.a : [Ljava/lang/String;
    //   136: iconst_4
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zxtz.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #117
    //   218: goto -> 248
    //   221: bipush #93
    //   223: goto -> 248
    //   226: bipush #100
    //   228: goto -> 248
    //   231: bipush #122
    //   233: goto -> 248
    //   236: bipush #127
    //   238: goto -> 248
    //   241: bipush #116
    //   243: goto -> 248
    //   246: bipush #98
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
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
    int i = (paramInt1 ^ 0xFFFFBABD) & 0xFFFF;
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
      byte b1 = 97;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxtz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */