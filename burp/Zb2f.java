package burp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.function.Supplier;
import javax.net.ssl.SSLHandshakeException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb2f implements Runnable {
  private final Zrgd Zp;
  
  private final Zbw_<?> ZS;
  
  private final Zi8 ZQ;
  
  private final boolean ZL;
  
  private final Zgb6 ZM;
  
  private final Zskh Zv;
  
  private final Ztwv ZX;
  
  private final Zxrx Zd;
  
  private final Zs8u ZR;
  
  private final Zrpo Zz;
  
  private final String Ze;
  
  final Zz2j Zu;
  
  final Zziw ZZ;
  
  private boolean Zl;
  
  private Zlam Zk;
  
  private Zswq Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb2f(Zrgd paramZrgd, Zbw_<?> paramZbw_, Socket paramSocket, Zi8 paramZi8, boolean paramBoolean1, boolean paramBoolean2, Zs9s paramZs9s, Supplier<InetAddress> paramSupplier, Zxoo paramZxoo, Ze6o paramZe6o, Zgb6 paramZgb6, Zskh paramZskh, Ztwv paramZtwv, Zxrx paramZxrx, Zs8u paramZs8u, String paramString) {
    Zuh.Zv((paramZskh != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZbw_ != null), Zqf.Zx, 2L);
    this.Zp = paramZrgd;
    this.ZS = paramZbw_;
    this.ZQ = paramZi8;
    this.Zl = paramBoolean1;
    this.ZL = paramBoolean2;
    this.ZM = paramZgb6;
    this.Zv = paramZskh;
    this.ZX = paramZtwv;
    this.Zd = paramZxrx;
    this.ZR = paramZs8u;
    this.Ze = paramString;
    this.Zu = new Zz2j(paramZe6o);
    this.ZZ = new Zziw(this.Zu, paramSocket, paramZs9s, paramZxoo, paramSupplier);
    this.Zz = new Zlci(paramZbw_.ZFM(), paramZbw_.ZFY());
  }
  
  public void run() {
    try {
      ZU();
      ZC();
      ZJ();
      Zz();
      Zx();
      Zh();
      Zd();
      ZV();
      ZB();
      Zs();
      Z_();
    } catch (Zz8b zz8b) {
      Zah.Zl(zz8b, Zk_.IGNORED);
    } catch (Zz8e zz8e) {
      Zah.Zl(zz8e, Zk_.IGNORED);
      ZV(zz8e);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      ZI(throwable);
    } 
  }
  
  void Zh() throws Zz8v, Zz8b {
    Zkl6 zkl6 = this.Zb.ZP();
    (new Zxkr(this.Zp, this.ZS, this.ZM, zkl6, this.Ze)).ZL(this.ZZ);
  }
  
  private void Z_() {
    try {
      ZQ();
      Zr();
      Zu();
      Zd();
      Zy();
    } catch (Zz8b|Zs2o zz8b) {
      Zah.Zl(zz8b, Zk_.IGNORED);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      ZI(throwable);
    } 
  }
  
  void Zy(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) {
    Zi8 zi8 = new Zi8(paramString, paramInt, false);
    this.Zd.ZA(paramSocket, zi8, paramBoolean, this.ZZ.ZL());
  }
  
  void ZU() throws IOException, Zz8v, Zz8e {
    Zlww zlww = new Zlww(this.ZZ, this.ZS, this.ZL, this.Zv, this.Zp);
    try {
      zlww.Zg();
    } catch (SSLHandshakeException sSLHandshakeException) {
      Zah.Zl(sSLHandshakeException, Zk_.IGNORED);
      (new Zk8v(sSLHandshakeException, this.ZQ, zlww.Zt(), this.ZZ.ZR(), this.ZS)).Z_();
    } 
    this.Zk = zlww.ZK();
    byte[] arrayOfByte = this.Zk.ZI();
    this.Zb = this.ZR.ZX(arrayOfByte);
    this.Zu.ZN(arrayOfByte);
    this.Zu.Zn(this.Zb.ZP().ZB());
    this.Zu.Zf(this.Zb.ZP().ZH());
    if (this.ZL) {
      Zky_ zky_ = zlww.Zt();
      this.ZZ.Zj(zky_.ZC());
      this.Zl = zky_.ZU();
    } 
  }
  
  private void ZC() {
    if (!Zbsd.Zz.get())
      Zm2.ZC(Zrrh.PROXY_EXTERNAL_BROWSER_USED); 
  }
  
  void ZJ() throws Zz8v {
    Zz1p zz1p = this.Zu.Zk();
    try {
      if (zz1p.Zh == null)
        throw new Zz8v(a(24315, 14881), this.ZZ.ZC()); 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
    try {
      if (zz1p.Zo == null)
        throw new Zz8v(a(24312, -20007), this.ZZ.ZC()); 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
  }
  
  void Zz() throws Zz8h, IOException, Zxgy, Zxg5 {
    if (ZI()) {
      Zm7w zm7w = this.Zb.ZU(this.ZS, this.ZM);
      zm7w.Zc(this, this.ZZ, this.ZQ);
      throw new Zz8b();
    } 
  }
  
  void ZV() throws Zz8h, IOException {
    try {
      if (this.ZS.ZFM().Zl9()) {
        Zm2.ZC(Zrrh.PROXY_OPTIONS_MISC_DISABLE_BROWSER_INTERFACE);
        return;
      } 
    } catch (Zz8h zz8h) {
      throw a(null);
    } 
    Ztv2 ztv2 = ZP();
    try {
      ztv2.ZA();
      if (ztv2.ZW())
        throw new Zz8b(); 
    } catch (Zz8h zz8h) {
      throw a(null);
    } 
    byte[] arrayOfByte = ztv2.Zl();
    try {
      if (arrayOfByte != null)
        this.Zu.ZN(arrayOfByte); 
    } catch (Zz8h zz8h) {
      throw a(null);
    } 
  }
  
  Ztv2 ZP() {
    return new Ztv2(this.ZZ, this.Zk, this.ZS);
  }
  
  void Zx() throws Zxgy, Zxg5, Zz8v, IOException, Zz8b {
    Zkl6 zkl6 = this.Zb.ZP();
    Zmzk zmzk = (new Zzrz(this.ZS, this.ZZ, this.ZQ, this.Zl, this.ZL, zkl6)).ZX();
    try {
      this.Zu.ZF(zmzk);
      if (zmzk.ZJZ())
        this.Zl = true; 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    try {
      if (!zmzk.equals((this.Zu.Zk()).Zo.Zdz()))
        this.Zu.ZJ(new Zax(zmzk, (this.Zu.Zk()).Zo.ZdH())); 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
  }
  
  void ZB() {
    Zkl6 zkl6 = this.Zb.ZP();
    Zslz zslz = new Zslz(this.ZZ, (Zbw_)this.ZS, zkl6, this.ZM);
    zslz.ZE();
    this.Zu.ZN(zslz.ZW());
  }
  
  void Zs() {
    Zlbg zlbg = new Zlbg(this.Zu.Zm());
    Zz1p zz1p = this.Zu.Zk();
    Zlit zlit = (zz1p == null) ? null : zz1p.Zo;
    if (this.ZS.ZJ(zlbg, true, zlit))
      this.Zu.Zs(zlbg.ZY()); 
  }
  
  void ZQ() {
    this.Zb.Zo().Za(this.ZZ, this.Zu);
  }
  
  void Zr() throws Zz87 {
    this.Zb.ZO().Zb(this.ZZ, this.Zu);
  }
  
  void Zu() {
    Zgsq zgsq = this.Zu.ZM();
    this.Zb.Zo().ZT(this.ZZ, this.Zu.ZP(), Zgsq.Zj(zgsq));
  }
  
  void Zd() throws Zz8v, Zz8b {
    Zkl6 zkl6 = this.Zb.ZP();
    (new Zxkg(this.Zp, this.ZS, this.ZM, zkl6)).ZL(this.ZZ);
  }
  
  void Zy() throws Zz8h, IOException, Zs2o {
    this.Zb.Zs().Zt(this.Zu, this.ZZ);
  }
  
  void ZV(Zz8e paramZz8e) {
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zkl6 zkl6 = (this.Zb == null) ? this.ZR.ZX(this.ZZ.ZC()).ZP() : this.Zb.ZP();
    try {
      (new Zgg1(this.ZS, paramZz8e, this.ZQ, zkl6.ZB(), this.ZX)).ZR();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      ZI(throwable);
    } 
  }
  
  void ZI(Throwable paramThrowable) {
    this.Zz.ZM(paramThrowable, this.ZZ.Zu());
  }
  
  private boolean ZI() {
    return (!this.Zl && a(24313, 19435).equalsIgnoreCase((this.Zu.Zk()).Zb));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¯ÐÚñN)Í\\n>ñ©ßYQ\\f0dåPUJRGÕ;Ó³ÝùÙe7\\r¨ZÈO¬-¹&3ûÄ2&ÜIgr~jcKRöËrs\\nTQt¹&\\b'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #96
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
    //   69: putstatic burp/Zb2f.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zb2f.b : [Ljava/lang/String;
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
    //   152: bipush #99
    //   154: goto -> 184
    //   157: bipush #117
    //   159: goto -> 184
    //   162: bipush #8
    //   164: goto -> 184
    //   167: bipush #88
    //   169: goto -> 184
    //   172: bipush #102
    //   174: goto -> 184
    //   177: bipush #72
    //   179: goto -> 184
    //   182: bipush #12
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
    int i = (paramInt1 ^ 0x5EF9) & 0xFFFF;
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
      char c = 'ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */