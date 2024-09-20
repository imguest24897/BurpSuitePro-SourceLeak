package burp;

import java.awt.BorderLayout;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class Zbyn extends Zbqc implements Zmov, Zgdq, Zs41, Zrnm, Zt3_ {
  private final Zkr6 ZN;
  
  private final Zr_4 ZW;
  
  private final Zr_4 ZA;
  
  private final Zbma ZB;
  
  private final Zbmk ZG;
  
  private final Zs3_ Zz;
  
  private final Zbme Zm;
  
  private final Zm0o[] ZP;
  
  private final List<Zg0> ZJ;
  
  private final Ztg8 Zs;
  
  private final Zx80 ZK;
  
  private final Zx_2 Zx;
  
  private final boolean ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbyn(Zkr6 paramZkr6, Zz0n paramZz0n, Zt4u paramZt4u, Zt84 paramZt84, Supplier<Zbiv> paramSupplier, Zgb6 paramZgb6, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr_4 paramZr_43, Zbnt paramZbnt1, Zbnt paramZbnt2, Zey9 paramZey9, Ztg8 paramZtg8, Zxaw paramZxaw, Zm0o paramZm0o, Zx80 paramZx80, Zl11 paramZl11, Zkvu paramZkvu, boolean paramBoolean1, boolean paramBoolean2, Zm6x paramZm6x) {
    this.ZN = paramZkr6;
    this.Zs = paramZtg8;
    this.ZW = paramZr_41;
    this.ZA = paramZr_42;
    this.ZK = paramZx80;
    this.ZT = paramBoolean2;
    this.Zx = paramZkvu.ZV(this);
    int i = Zbyw.Zx();
    this.Zz = paramZkvu.ZN();
    Zb0h zb0h = paramZz0n.ZD();
    Zmvs zmvs = paramZkvu.ZT();
    Zesr zesr = paramZkvu.Zn();
    Ztec ztec = paramZkvu.Zx();
    Zedf zedf = paramZkvu.ZB();
    Zr6x zr6x = paramZkvu.Zv();
    Zrk3 zrk3 = paramZkvu.Zb();
    Zghj zghj = paramZkvu.Zl();
    Ztow ztow = paramZkvu.Zp();
    this.ZB = new Zbma(this, paramSupplier, paramZgb6, zb0h, paramZbnt1, paramZtwv, paramZt4u.Ze(), paramZr_42, paramZr_41, paramZkr6, paramBoolean1, paramZm6x);
    Objects.requireNonNull(zr6x);
    this.Zm = new Zbme(paramZxaw, this.ZB, paramBoolean1, paramZgb6, paramZbnt2, paramZey9, zb0h, paramZtwv, new Zgrk(paramZl11, paramZgb6, paramZkr6.ZY4(), zr6x::Zy), paramZt84, paramZr_42);
    Objects.requireNonNull(paramZkr6);
    Objects.requireNonNull(this.Zx);
    this.ZG = new Zbmk(this.Zm, this.ZB, paramZkr6, paramZz0n, paramZt4u, paramZr_42, new Zx09(paramZr_43, paramZr_42, paramZtg8), paramZkr6::Zfc, paramBoolean1, this.Zx::ZB, paramZxaw);
    this.ZJ = List.of(new Zg0[] { 
          this.Zx, this.ZB, this.Zm, this.ZG, this.Zz, zmvs, zesr, ztec, zedf, zrk3, 
          zr6x, zghj, ztow });
    setLayout(new BorderLayout());
    Zlte zlte = Zrxv.Zp().ZD(!paramBoolean1).ZW();
    zlte.setName(a(11917, -24898));
    add(zlte.ZO(), a(11912, 20742));
    Zby_ zby_ = new Zby_(this.Zx, this.ZB);
    Zszh zszh = new Zszh(zby_, a(11914, -18195));
    Zsz7 zsz71 = new Zsz7(this.ZG, a(11913, -19362));
    Zrx6[] arrayOfZrx6 = { this.Zz, zmvs, zesr, ztec, zedf, this.Zm, zrk3, zr6x, zghj, ztow };
    Zsz7 zsz72 = new Zsz7(arrayOfZrx6, a(11915, 462));
    this.ZP = new Zm0o[] { zszh, zsz71, paramZm0o, zsz72 };
    zlte.add(zszh.Zq(), zszh.Z_());
    zlte.add(zsz71.Zq(), zsz71.Z_());
    zlte.add(paramZm0o.Zq(), paramZm0o.Z_());
    zlte.add(zsz72.Zq(), zsz72.Z_());
    if (Zbqc.Zwu() == null)
      Zbyw.ZN(++i); 
  }
  
  public Zm0o[] Zv() {
    return this.ZP;
  }
  
  public void ZE(int paramInt) {
    switch (Zg5t.Zp[this.Zx.ZB().ordinal()]) {
      case 1:
      case 2:
        this.ZG.Zt(Math.max(1, paramInt));
        break;
    } 
    this.ZG.ZS();
  }
  
  public void Zr(Zejb paramZejb) {
    // Byte code:
    //   0: invokestatic Zx : ()I
    //   3: istore_2
    //   4: getstatic burp/Zg5t.Zp : [I
    //   7: aload_1
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: tableswitch default -> 74, 1 -> 56, 2 -> 56, 3 -> 44, 4 -> 44
    //   44: aload_0
    //   45: getfield ZG : Lburp/Zbmk;
    //   48: iconst_1
    //   49: invokevirtual Zt : (I)V
    //   52: iload_2
    //   53: ifeq -> 74
    //   56: aload_0
    //   57: getfield ZG : Lburp/Zbmk;
    //   60: iconst_1
    //   61: aload_0
    //   62: getfield ZB : Lburp/Zbma;
    //   65: invokevirtual ZQ : ()I
    //   68: invokestatic max : (II)I
    //   71: invokevirtual Zt : (I)V
    //   74: aload_0
    //   75: getfield ZG : Lburp/Zbmk;
    //   78: invokevirtual ZS : ()V
    //   81: return
  }
  
  public void ZJ(Zxpp paramZxpp, Zstu paramZstu, List<int[]> paramList) {
    Zstu zstu = paramZxpp.ZwZ();
    String str = (zstu == null) ? null : zstu.Zis();
    this.ZB.ZO(str);
    this.ZB.Zu(paramZxpp.ZwB());
    this.ZB.Zy(paramZstu, paramList);
  }
  
  public void ZI(Zgxp paramZgxp) {
    this.Zm.Zq(paramZgxp);
  }
  
  private Zr_4 Zb() {
    return this.Zz.ZC() ? this.ZW : this.ZA;
  }
  
  public Zsh8 ZX() {
    return ZL(this.ZA);
  }
  
  public Zxw4 Zf() {
    Zr_4 zr_4 = Zb();
    return ZJ(zr_4);
  }
  
  public Zxw4 ZW() {
    Zsh8 zsh8 = ZL(this.ZA);
    Zip zip = this.ZK.Ze();
    return new Zxw4(zsh8, zip);
  }
  
  private Zxw4 ZJ(Zr_4 paramZr_4) {
    Zsh8 zsh8 = ZL(paramZr_4);
    Zip zip = this.ZK.Zo();
    return new Zxw4(zsh8, zip);
  }
  
  private Zsh8 ZL(Zr_4 paramZr_4) {
    Zsh8 zsh8 = paramZr_4.<Zsh8>ZH(new Zsy9());
    Zw(zsh8, paramZr_4, (Collection)this.ZJ);
    return zsh8;
  }
  
  public void Zs(Zsh8 paramZsh8, Zr23 paramZr23) {
    Zr_4 zr_4 = paramZsh8.ZPz();
    Zw(paramZsh8, zr_4, Collections.singletonList(paramZr23));
  }
  
  private void Zw(Zsh8 paramZsh8, Zr_4 paramZr_4, Collection<? extends Zr23> paramCollection) {
    Zka8 zka8 = new Zka8(paramZsh8, paramZr_4, this.Zs);
    paramCollection.forEach(zka8::lambda$updateConfigurationFromUserInterface$0);
  }
  
  public Zm3l Zr() {
    return this.ZB.ZJ();
  }
  
  public void Zb(Zsh8 paramZsh8) {
    this.ZJ.forEach(paramZsh8::lambda$applyConfigurationToUserInterface$1);
  }
  
  public void Zo(Zxw4 paramZxw4) {
    Zb(paramZxw4.ZF);
    this.ZK.Zd(paramZxw4.Zl);
  }
  
  public boolean ZM() {
    return this.ZT;
  }
  
  public void ZP(Zb_j paramZb_j) {
    this.ZJ.forEach(paramZb_j::lambda$saveUserSettings$2);
  }
  
  public void Zs(Zb_j paramZb_j) {
    this.ZJ.forEach(paramZb_j::lambda$loadUserSettings$3);
  }
  
  public void ZNH() {
    this.ZJ.forEach(Zgdq::ZNH);
  }
  
  public void Zn() {
    this.ZK.Zn();
  }
  
  public void Zu() {
    this.ZK.Zu();
  }
  
  public void ZS() {
    this.ZK.Zt();
  }
  
  private static void lambda$loadUserSettings$3(Zb_j paramZb_j, Zg0 paramZg0) {
    paramZg0.Zs(paramZb_j);
  }
  
  private static void lambda$saveUserSettings$2(Zb_j paramZb_j, Zg0 paramZg0) {
    paramZg0.ZP(paramZb_j);
  }
  
  private static void lambda$applyConfigurationToUserInterface$1(Zsh8 paramZsh8, Zg0 paramZg0) {
    paramZg0.Zr(paramZsh8);
  }
  
  private static void lambda$updateConfigurationFromUserInterface$0(Zsh8 paramZsh8, Zr23 paramZr23) {
    paramZr23.ZX(paramZsh8);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '^uïÜY\\f'À\\n²\\bd_ 6S¹m'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #97
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
    //   67: ldc 'Jà¶ ÜuÓx$<TªGåm.8HÈú¹Ì9N¡¬'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #116
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
    //   128: putstatic burp/Zbyn.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbyn.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #73
    //   214: goto -> 243
    //   217: bipush #9
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #12
    //   228: goto -> 243
    //   231: bipush #57
    //   233: goto -> 243
    //   236: bipush #39
    //   238: goto -> 243
    //   241: bipush #78
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2E89) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */