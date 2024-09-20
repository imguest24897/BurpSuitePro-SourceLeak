package burp;

import java.awt.Component;
import java.util.Locale;
import javax.swing.SwingUtilities;
import net.portswigger.browser.Zct;

public class Zkyv extends Zkyq {
  private final Zzep ZH;
  
  private final Zmoy ZV;
  
  private volatile boolean ZY;
  
  private volatile int Zr;
  
  private volatile int Z_;
  
  private volatile int ZO;
  
  private volatile int ZL;
  
  private volatile String ZI;
  
  private volatile Zebg Zz;
  
  private volatile Zct ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkyv(Ztj1 paramZtj1, Zzep paramZzep, Zmoy paramZmoy, Ztef paramZtef) {
    super(paramZtj1, paramZmoy, paramZtef);
    this.ZH = paramZzep;
    this.ZV = paramZmoy;
  }
  
  protected boolean Zc(String paramString) {
    return (this.ZI != null && this.ZI.toLowerCase(Locale.ENGLISH).contains(paramString));
  }
  
  public void Zp(Component paramComponent) {
    this.ZV.ZL(paramComponent, this.Ze, this.ZH);
  }
  
  public void Zq() {
    SwingUtilities.invokeLater(this::lambda$refreshDetails$0);
  }
  
  public void ZS(Zlli<Zt13> paramZlli, Zlli<Zt18> paramZlli1, Zlli<Zt1o> paramZlli2) {
    String str = Zmoy.ZW();
    ZF(paramZlli);
    if (!this.ZH.ZnH().ZVg()) {
      paramZlli1.ZE(Zt18.ZD, this::lambda$subscribeTo$1);
      paramZlli1.ZE(Zt18.ZW, this::lambda$subscribeTo$2);
      paramZlli1.ZE(Zt18.ZS, this::lambda$subscribeTo$4);
    } 
    paramZlli1.ZE(Zt18.ZY, this::lambda$subscribeTo$5);
    paramZlli1.ZE(Zt18.Zt, this::lambda$subscribeTo$6);
    paramZlli1.ZE(Zt18.Zf, this::lambda$subscribeTo$7);
    paramZlli1.ZE(Zt18.ZT, this::lambda$subscribeTo$8);
    paramZlli1.ZE(Zt18.Zp, this::lambda$subscribeTo$9);
    paramZlli2.ZE(Zt1o.Zx, this::lambda$subscribeTo$10);
    paramZlli2.ZE(Zt1o.ZH, this::lambda$subscribeTo$12);
    paramZlli2.ZE(Zt1o.ZD, this::lambda$subscribeTo$13);
    paramZlli2.ZE(Zt1o.Zd, this::lambda$subscribeTo$14);
    paramZlli2.ZE(Zt1o.Zt, this::lambda$subscribeTo$15);
    paramZlli2.ZE(Zt1o.Zc, this::lambda$subscribeTo$9);
    if (str == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private void ZQ() {
    this.ZY = true;
    this.ZV.Zp(this.ZY);
  }
  
  private void ZE() {
    this.ZY = false;
    this.ZV.Zp(this.ZY);
    Zc();
    ZT();
    Zd();
  }
  
  private void Zi(int paramInt) {
    this.Zr = paramInt;
    this.ZV.ZD(paramInt);
  }
  
  private void ZT() {
    ZR(0);
  }
  
  private void ZR(int paramInt) {
    this.Z_ = paramInt;
    this.ZV.Ze(paramInt);
  }
  
  private void Zd() {
    ZF(0);
  }
  
  private void ZF(int paramInt) {
    this.ZO = Math.max(paramInt - 1, 0);
    this.ZV.ZR(this.ZO);
  }
  
  private void ZI(Zlj9 paramZlj9) {
    if (!ZY()) {
      paramZlj9.Zu().ifPresent(this::ZA);
      paramZlj9.Zk().ifPresent(this::ZM);
    } 
  }
  
  private void ZA(String paramString) {
    this.ZI = paramString;
    this.ZV.ZC(paramString);
  }
  
  private void Zx(Zebg paramZebg) {
    this.Zz = paramZebg;
    this.ZV.Zu(paramZebg.ZaK(), paramZebg.ZaU(), paramZebg.Za8(), paramZebg.Zab());
  }
  
  private void ZA() {
    ZM(Math.max(0, this.ZL));
  }
  
  private void ZM(int paramInt) {
    this.ZL = paramInt;
    this.ZV.ZN(paramInt);
  }
  
  private void Zc() {
    Zg((Zct)null);
  }
  
  private void Zg(Zct paramZct) {
    this.ZN = paramZct;
    this.ZV.ZI(paramZct);
  }
  
  private void Zb(String paramString) {
    this.ZV.ZW(paramString);
  }
  
  protected void Zh() {
    if (!this.ZH.Zdm().ZHv().isEmpty())
      super.Zh(); 
  }
  
  protected void Zp() {
    super.Zp();
    ZA();
    ZA(a(-11149, 28964));
  }
  
  private void lambda$subscribeTo$15(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zx);
  }
  
  private void lambda$subscribeTo$14(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZI);
  }
  
  private void lambda$subscribeTo$13(Zxr8 paramZxr8) {
    Zh();
  }
  
  private void lambda$subscribeTo$12(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$11);
  }
  
  private void lambda$subscribeTo$11(Zb6l paramZb6l) {
    ZP();
    ZA(a(-11150, 16255) + a(-11150, 16255));
  }
  
  private void lambda$subscribeTo$10(Zxr8 paramZxr8) {
    ZP();
    ZA(a(-11151, -20216));
    ZM(100);
  }
  
  private void lambda$subscribeTo$9(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zb);
  }
  
  private void lambda$subscribeTo$8(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zg);
  }
  
  private void lambda$subscribeTo$7(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZF);
  }
  
  private void lambda$subscribeTo$6(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZR);
  }
  
  private void lambda$subscribeTo$5(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zi);
  }
  
  private void lambda$subscribeTo$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$3);
  }
  
  private void lambda$subscribeTo$3(Zb6l paramZb6l) {
    ZP();
    ZA(a(-11152, -7228) + a(-11152, -7228));
    ZE();
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    ZE();
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    ZQ();
  }
  
  private void lambda$refreshDetails$0() {
    if (ZX())
      this.ZV.Zs(); 
    if (ZY())
      this.ZV.Zm(); 
    this.ZV.Zp(this.ZY);
    this.ZV.ZD(this.Zr);
    this.ZV.Ze(this.Z_);
    this.ZV.ZR(this.ZO);
    if (this.Zz != null)
      this.ZV.Zu(this.Zz.ZaK(), this.Zz.ZaU(), this.Zz.Za8(), this.Zz.Zab()); 
    this.ZV.Zx(this.Ze.Zs());
    this.ZV.ZA(this.Ze.Zz());
    this.ZV.ZN(this.ZL);
    this.ZV.ZC(this.ZI);
    this.ZV.ZI(this.ZN);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '#3è>F®Xx¥ÛÍûÎÎ[0w'
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
    //   67: ldc 'ô6¬üÑÒí@]'3¸ÓÏR§gñ~Y'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #11
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
    //   128: putstatic burp/Zkyv.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zkyv.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #117
    //   214: goto -> 244
    //   217: bipush #33
    //   219: goto -> 244
    //   222: bipush #22
    //   224: goto -> 244
    //   227: bipush #89
    //   229: goto -> 244
    //   232: bipush #60
    //   234: goto -> 244
    //   237: bipush #32
    //   239: goto -> 244
    //   242: bipush #66
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD473) & 0xFFFF;
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
      byte b1 = 49;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */