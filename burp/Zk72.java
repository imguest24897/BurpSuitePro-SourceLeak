package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk72 implements Zm3g, Zedo {
  private final Zkrn ZG;
  
  private final Zeh6 Zu;
  
  private final Ztwv ZS;
  
  private final Zr_4 ZD;
  
  private final Ze5u Ze;
  
  private final Zsob Zq;
  
  private final Zxli Zd;
  
  private final List<Zzyu> Zn;
  
  private final Zvoo Z_;
  
  private final Zefg<Zlx1> ZQ;
  
  private final Zefg<Zzb7> ZW;
  
  private final Zryt ZH;
  
  private final Zbc9 ZL;
  
  private final Zxg0 ZP;
  
  private final Zbe7 ZU;
  
  private final Zbem Zz;
  
  private final Zbeb Zs;
  
  private final Zbev ZF;
  
  private final Zbee Zp;
  
  private final Zr2m Zc;
  
  private Zmvm ZE;
  
  private Zrsj ZN;
  
  private Zroz ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zk72(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zz_r paramZz_r, Zgb6 paramZgb6, Zrek paramZrek, Zkl6 paramZkl6, Zkrn paramZkrn, Zkvh paramZkvh, Zeh6 paramZeh6, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zzaf paramZzaf, Zkn paramZkn, Zzzt paramZzzt, Zbc9 paramZbc9, Zxg0 paramZxg0, Zg3s paramZg3s, Zm6v paramZm6v, Zr34 paramZr34, Zm6x paramZm6x, Zz37 paramZz37) {
    Zuh.Zv((paramZerg != null), Zqf.Zv, 0L);
    Zuh.Zv((paramZz_r != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZkrn != null), Zqf.Zv, 2L);
    Zuh.Zv((paramZeh6 != null), Zqf.Zv, 4L);
    Zuh.Zv((paramZr_4 != null), Zqf.Zv, 6L);
    Zuh.Zv((paramZkvh != null), Zqf.Zv, 9L);
    this.ZG = paramZkrn;
    this.Zu = paramZeh6;
    this.ZS = paramZtwv;
    this.ZD = paramZr_4;
    this.ZQ = paramZeh6.Ziv();
    this.ZW = paramZeh6.ZiT();
    this.ZL = paramZbc9;
    this.ZP = paramZxg0;
    this.Zn = new ArrayList<>();
    this.Zq = new Zsob(this.ZQ);
    this.Zc = new Zr2m(this.Zn, this.Zq);
    Zbnt zbnt = paramZkl6.ZB();
    Zlvg zlvg = new Zlvg(this::lambda$new$0);
    this.Z_ = new Zvoo(paramZkvh, zlvg);
    this.Ze = new Zzk6(this.Z_, this.Zc);
    Objects.requireNonNull(paramZgb6);
    Ze47 ze47 = new Ze47(paramZkl6.ZM(), paramZgb6::ZcC);
    Zs5l zs5l = new Zs5l(this.Zn, this.Zq);
    Zey9 zey9 = paramZkl6.ZH();
    Zbj4 zbj4 = new Zbj4(paramZgb6, zbnt, paramZr_4, ze47, zey9);
    Zmer zmer = new Zmer(paramZgb6);
    Objects.requireNonNull(paramZkrn);
    Zs2x zs2x = new Zs2x(paramZz0n, paramZt4u, paramZr_4, paramZrek, zbnt, paramZtwv, paramZtyg, paramZgq7, paramZerg, paramZkrn::ZY4, ze47, zey9, paramZm6x, paramZz37);
    Zrxb zrxb = zs2x.Zd(zs5l);
    Objects.requireNonNull(paramZkrn);
    Zln_ zln_ = new Zln_(paramZr_4, paramZz_r, paramZgb6, zbnt, paramZkl6.Zt(), paramZtwv, paramZkn, paramZzaf, this.Z_, paramZkrn::ZY4, paramZz0n, ze47, zs5l, zbj4, zmer, zey9, zrxb);
    Zku zku = new Zku(paramZtyg, paramZgq7, paramZerg, paramZtwv, paramZz0n.ZU(), paramZr_4, zbnt, paramZg3s, paramZzzt, zey9, paramZkl6, paramZm6x);
    this.Zd = new Zxli(paramZeh6, zln_, zku);
    Zj();
    this.ZH = new Zryt(paramZz0n, zln_, zku, paramZzzt, zey9);
    Zr1m zr1m = paramZm6v.ZL(this);
    this.ZU = new Zbe7(zr1m, this.Z_);
    this.Zz = new Zbem(zr1m, this.Z_);
    this.Zs = new Zbeb(zr1m, this.Z_);
    this.Zp = new Zbee(zr1m, this.Z_);
    this.ZF = new Zbev(this::lambda$new$1, this.Z_);
    paramZr34.ZM(Zs70.REPEATER_PATH, Zg29.PROJECT, this.ZU);
    paramZr34.ZM(Zs70.REPEATER_PATH, Zg29.PROJECT, this.Zz);
    paramZr34.ZM(Zs70.REPEATER_PATH, Zg29.PROJECT, this.Zs);
    paramZr34.ZM(Zs70.REPEATER_PATH, Zg29.PROJECT, this.ZF);
    paramZr34.ZM(Zs70.REPEATER_PATH, Zg29.USER, this.Zp);
    if (i == 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private void Zj() {
    int i = Zsob.ZI();
    int j = 0;
    try {
      for (Zlx1 zlx1 : this.ZQ) {
        try {
          Zzyu zzyu = this.Zd.ZX(zlx1);
          this.Zn.add(zzyu);
          j = Zn(j, zzyu.ZS());
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.UNEXPECTED);
        } 
        if (i != 0)
          break; 
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    if (this.Zn.isEmpty()) {
      this.ZQ.clear();
      this.Zq.Zb();
      Ztpl ztpl = this.Zd.Zn();
      try {
        this.Zn.add(ztpl);
        this.ZQ.add(ztpl.Zf());
        this.Zq.ZQ();
        if (i != 0) {
          try {
            if (this.Zu.ZEC() == 0)
              this.Zu.ZIs(Math.max(j, this.Zn.size())); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return;
    } 
    try {
      if (this.Zu.ZEC() == 0)
        this.Zu.ZIs(Math.max(j, this.Zn.size())); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  public void ZH() {
    Objects.requireNonNull(this.ZF);
    this.ZI = new Zroz(this.Zq, this.Zn, this.Zu, this.Z_, this.ZD, this.ZF::ZQ);
    Zss0 zss0 = new Zss0(this.Zu, this.Zd, this.ZS, this.ZI);
    this.ZE = new Ze3r(this.ZG, this.Z_, this.Zn, this.Zu, this.Zq, zss0, this.ZL, this.ZP, this.ZI);
    this.Zc.Zc(this.ZE);
    this.ZN = this.ZI;
    this.ZF.ZQ();
  }
  
  public void ZN(Zbx0 paramZbx0) {
    Zepo.<Zzyu>Zj(this.Zn).forEach(paramZbx0::lambda$doSearch$2);
  }
  
  public Zztv ZI() {
    return this.Ze.Zt();
  }
  
  public void ZA() {
    Zzyu zzyu = this.Zc.Zw();
    if (zzyu != null)
      zzyu.ZE(); 
  }
  
  public Ztpl Zh(Zmzk paramZmzk, Zbr paramZbr, Zgsq paramZgsq, String paramString1, Zr6e paramZr6e, String paramString2) {
    return ZH(paramZmzk, paramZbr, paramZgsq, paramString1, paramZr6e, paramString2, true);
  }
  
  public Ztpl ZH(Zmzk paramZmzk, Zbr paramZbr, Zgsq paramZgsq, String paramString1, Zr6e paramZr6e, String paramString2, boolean paramBoolean) {
    Ztpl ztpl = Ze(paramString1, paramZr6e);
    ztpl.ZY(paramZmzk);
    ztpl.Za(paramZbr, paramZgsq);
    ztpl.Ze(paramString2);
    this.ZE.Zi(paramBoolean);
    if (paramBoolean)
      this.ZI.Zw(ztpl); 
    return ztpl;
  }
  
  public void ZU(Zkmj paramZkmj, Zr6e paramZr6e) {
    Zzyu zzyu = this.Zd.Zi(paramZkmj);
    this.ZN.Zh(null, zzyu, paramZr6e, false);
    this.ZE.ZM(zzyu);
    this.ZE.Zi(true);
  }
  
  private Ztpl Ze(String paramString, Zr6e paramZr6e) {
    int i = Zsob.ZI();
    if (ZN()) {
      Ztpl ztpl1 = (Ztpl)this.Zn.getFirst();
      if (paramString != null)
        ztpl1.ZB(paramString); 
      this.ZE.ZQ(ztpl1);
      if (i != 0) {
        if (paramString == null)
          paramString = (this.Zu.ZEH()).Ze; 
        ztpl1 = this.Zd.Zo(paramString);
        this.ZN.Zh(null, ztpl1, paramZr6e, false);
        this.ZE.ZM(ztpl1);
        ztpl1.ZN(false);
        return ztpl1;
      } 
      ztpl1.ZN(false);
      return ztpl1;
    } 
    if (paramString == null)
      paramString = (this.Zu.ZEH()).Ze; 
    Ztpl ztpl = this.Zd.Zo(paramString);
    this.ZN.Zh(null, ztpl, paramZr6e, false);
    this.ZE.ZM(ztpl);
    ztpl.ZN(false);
    return ztpl;
  }
  
  private boolean ZN() {
    return (this.Zn.size() == 1 && ((Zzyu)this.Zn.getFirst()).Zu() == 0 && !((Zzyu)this.Zn.getFirst()).Zk());
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zuh.Zb((this.ZE != null), Zqf.Zx);
    if (this.ZE == null)
      return; 
    this.Z_.Zl(paramZg4j);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.Z_.Zd(paramZmf_);
    Zt2();
  }
  
  public void Zt2() {
    this.Ze.Zt2();
    this.ZU.Zt2();
    this.Zz.Zt2();
    this.Zs.Zt2();
    this.Zp.Zt2();
    if (this.ZE != null)
      this.ZE.Zt2(); 
  }
  
  public void Ze(Zr_4 paramZr_4, Zzir paramZzir, Ztg8 paramZtg8, Zeom paramZeom, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    int i = Zsob.Zl();
    Zeh6 zeh6 = paramZzir.Zvj();
    if (!paramZlc8.Zq(paramFloat1, a(-8238, 14702)) || zeh6.Ziv().isEmpty())
      return; 
    int j = this.Zu.ZEC();
    Zxy4 zxy4 = this.ZH.Zs(paramZr_4, paramZzir, paramZeom, this.ZE, paramZtg8);
    if (ZN()) {
      this.ZE.ZT();
      this.Zq.Zb();
      this.ZW.clear();
      this.Zn.clear();
      this.ZQ.clear();
      this.Zu.ZIs(0);
    } 
    for (Zlx1 zlx1 : zeh6.Ziv()) {
      if (zlx1.ZqH()) {
        zlx1.Zn(zxy4);
        j = Zn(j, zlx1.ZGA());
      } 
      paramFloat1 += paramFloat2;
      if (!paramZlc8.Zq(paramFloat1, a(-8237, -17561)) || i == 0)
        break; 
    } 
    this.Zu.ZIs(j);
  }
  
  public void ZB(Zzyu paramZzyu) {
    this.ZI.Zw(paramZzyu);
  }
  
  private static int Zn(int paramInt, String paramString) {
    try {
      paramInt = Math.max(paramInt, Integer.parseInt(paramString));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    return paramInt;
  }
  
  private static void lambda$doSearch$2(Zbx0 paramZbx0, Zzyu paramZzyu) {
    paramZzyu.Zs(paramZbx0);
  }
  
  private Zrsj lambda$new$1() {
    return this.ZN;
  }
  
  private void lambda$new$0() {
    Zzyu zzyu = this.Zc.Zw();
    if (zzyu != null)
      zzyu.Zc(); 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'òppªÜ<zf\\bti ÆX9ê'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #23
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
    //   69: putstatic burp/Zk72.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zk72.b : [Ljava/lang/String;
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
    //   152: bipush #85
    //   154: goto -> 184
    //   157: bipush #52
    //   159: goto -> 184
    //   162: bipush #25
    //   164: goto -> 184
    //   167: bipush #123
    //   169: goto -> 184
    //   172: bipush #27
    //   174: goto -> 184
    //   177: bipush #78
    //   179: goto -> 184
    //   182: bipush #95
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
    int i = (paramInt1 ^ 0xFFFFDFD3) & 0xFFFF;
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
      byte b1 = 14;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk72.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */