package burp;

import java.util.Objects;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zk71 extends Zk7s {
  private final Zlof ZB;
  
  private final Zkit ZJ;
  
  private final Zkit ZK;
  
  private final Zgpi Zc;
  
  private final Zgpi ZN;
  
  private final Zl2m ZQ;
  
  private final Ze24 ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zk71(Ztew paramZtew, Zlof paramZlof, Zkit paramZkit1, Zkit paramZkit2, Zgpi paramZgpi1, Zgpi paramZgpi2, Zl2m paramZl2m, Ze24 paramZe24) {
    super(paramZtew);
    this.ZB = paramZlof;
    this.ZJ = paramZkit1;
    this.ZK = paramZkit2;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      this.Zc = paramZgpi1;
      this.ZN = paramZgpi2;
      this.ZQ = paramZl2m;
      this.ZI = paramZe24;
      if (Zbqc.Zwu() == null)
        Ztgq.ZF(new String[5]); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
  }
  
  public boolean ZQ() {
    return this.ZI.Zg();
  }
  
  public boolean Zs(Zm31 paramZm31) {
    return this.ZI.ZA(paramZm31);
  }
  
  protected Consumer<Ztew> Zd(Zeki paramZeki) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk71;Lburp/Zeki;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zb(Zek9 paramZek9) {
    boolean bool = this.ZJ.Zi(this.Zc, paramZek9);
    try {
      this.ZK.ZH(this.ZN, paramZek9, bool);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  public void Za(Zek2 paramZek2) {
    byte b = this.ZJ.ZL(this.Zc, paramZek2);
    try {
      this.ZK.Zc(this.ZN, paramZek2, b);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  public void ZZ(Zekq paramZekq) {
    char c = this.ZJ.Zi(this.Zc, paramZekq);
    try {
      this.ZK.Zi(this.ZN, paramZekq, c);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  public void Zt(Zekh paramZekh) {
    double d = this.ZJ.ZL(this.Zc, paramZekh);
    try {
      this.ZK.Zn(this.ZN, paramZekh, d);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  public void Zv(Zek7 paramZek7) {
    float f = this.ZJ.ZU(this.Zc, paramZek7);
    try {
      this.ZK.Zj(this.ZN, paramZek7, f);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  public void ZZ(Zekv paramZekv) {
    int i = this.ZJ.Zx(this.Zc, paramZekv);
    try {
      this.ZK.ZM(this.ZN, paramZekv, i);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  public void Zb(Zekm paramZekm) {
    long l = this.ZJ.ZL(this.Zc, paramZekm);
    try {
      this.ZK.ZV(this.ZN, paramZekm, l);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  protected Consumer<Ztew> ZA(Zeke<? extends Zgpi> paramZeke) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk71;Lburp/Zeke;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void ZV(Zeka paramZeka) {
    Zzvg zzvg = this.ZJ.<Zzvg>ZJ(this.Zc, paramZeka);
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    String str = (zzvg == null) ? null : zzvg.toString();
    try {
      if (Zszd.ZL)
        ZG(zzvg); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      this.ZK.Zn(this.ZN, paramZeka, str);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  public void Zr(Zekd paramZekd) {
    Zl5u zl5u = this.ZJ.<Zl5u>ZJ(this.Zc, paramZekd);
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    String str = (zl5u == null) ? null : zl5u.toString();
    try {
      if (str == null && paramZekd.Zg())
        str = Objects.toString(this.ZJ.Zg(this.Zc, paramZekd.Zu(), false), null); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      if (Zszd.ZL)
        Zp(zl5u); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      this.ZK.ZR(this.ZN, paramZekd, str);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  protected Consumer<Ztew> ZS(Zekb paramZekb) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk71;Lburp/Zekb;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zp(Zekg paramZekg) {
    short s = this.ZJ.ZQ(this.Zc, paramZekg);
    try {
      this.ZK.ZE(this.ZN, paramZekg, s);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  protected Consumer<Ztew> Zm(Zekk<? extends Zgpi> paramZekk) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> accept : (Lburp/Zk71;Lburp/Zekk;)Ljava/util/function/Consumer;
    //   7: areturn
  }
  
  public void Zs(Zekc paramZekc) {
    Zsdr zsdr = this.ZJ.<Zsdr>ZJ(this.Zc, paramZekc);
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    String str = (zsdr == null) ? null : zsdr.toString();
    try {
      if (Zszd.ZL)
        Zr(zsdr); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      this.ZK.Zi(this.ZN, paramZekc, str);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  private void Zr(Zsdr paramZsdr) {
    try {
      if (paramZsdr != null) {
        this.ZQ.ZU(paramZsdr);
        Ze4r ze4r = this.ZJ.<Ze4r>ZA(paramZsdr, Zk_l.ZI);
        this.ZQ.ZU(ze4r);
      } 
    } catch (Exception exception) {
      Zah.ZU(exception, a(-16953, 1620), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZG(Zzvg paramZzvg) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      if (paramZzvg != null) {
        this.ZQ.ZU(paramZzvg);
        Zefg zefg = (Zefg)this.ZJ.ZJ(paramZzvg, Zk_f.Zm);
        this.ZQ.ZU(zefg);
        Zgpi zgpi = (Zgpi)this.ZJ.ZA(zefg, ((Zl_p)zefg.ZF()).ZU);
        this.ZQ.ZU(zgpi);
        for (Ze4r ze4r : zefg) {
          this.ZQ.ZU(ze4r);
          if (arrayOfString == null)
            break; 
        } 
      } 
    } catch (Exception exception) {
      Zah.ZU(exception, a(-16955, -16015), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zp(Zl5u paramZl5u) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      if (paramZl5u != null) {
        this.ZQ.ZU(paramZl5u);
        Zz3i zz3i = this.ZJ.<Zz3i>ZJ(paramZl5u, Zk3i.ZF);
        while (zz3i != null) {
          this.ZQ.ZU(zz3i);
          Ze4r ze4r = this.ZJ.<Ze4r>ZA(zz3i, Zk39.Zx);
          try {
            if (ze4r != null)
              this.ZQ.ZU(ze4r); 
          } catch (Exception exception) {
            throw a(null);
          } 
          zz3i = zz3i.ZT5();
          if (arrayOfString == null)
            break; 
        } 
      } 
    } catch (Exception exception) {
      Zah.ZU(exception, a(-16954, -25778), Zk_.UNEXPECTED);
    } 
  }
  
  private void lambda$deferredVisitSingleArrayListField$3(Zekk<Zefg> paramZekk, Ztew paramZtew) {
    Zefg zefg1 = this.ZJ.<Zefg>ZJ(this.Zc, (Zekb<Zefg>)paramZekk);
    Zefg zefg2 = paramZtew.<Zefg>Zc(zefg1);
    try {
      this.ZK.Zq(this.ZN, (Zekb<Zefg>)paramZekk, zefg2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  private void lambda$deferredVisitPersistableObjectField$2(Zekb<Object> paramZekb, Ztew paramZtew) {
    Object object1 = this.ZJ.ZJ(this.Zc, paramZekb);
    Object object2 = paramZtew.Zc(object1);
    try {
      this.ZK.Zq(this.ZN, paramZekb, object2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  private void lambda$deferredVisitMultipleArrayListField$1(Zeke<Zefg> paramZeke, Ztew paramZtew) {
    Zefg zefg1 = this.ZJ.<Zefg>ZJ(this.Zc, (Zekb<Zefg>)paramZeke);
    Zefg zefg2 = paramZtew.<Zefg>Zc(zefg1);
    try {
      this.ZK.Zq(this.ZN, (Zekb<Zefg>)paramZeke, zefg2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
  }
  
  private void lambda$deferredVisitArrayField$0(Zeki<Object> paramZeki, Ztew paramZtew) {
    Ze34 ze34 = (Ze34)this.ZJ.ZA(this.Zc, paramZeki);
    Ze34<Object> ze341 = paramZtew.<Ze34>Zc(ze34);
    try {
      this.ZK.ZQ(this.ZN, paramZeki, ze341);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZB.ZK(throwable);
    } 
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
    //   8: ldc 'ÍÈõry8a®aIfjZJ Óy!Ñº»ªË°³Rêb,µ'à¤}9gyLÈ©%ÿ£=yØ1¬\\rä\\bÑü¨\\t{Û?¤!_Ë«1uÆï\\bÌéÿºH5î)®Í] Ìk9Jí·Ã@µ*=µ¾ú¼t ¤»¿^W¥Ù"!kº®´Q¾Áã¤\\fØ¬¢ºð¿GÙD ¯ÊðTÜG¹Á'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #65
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #103
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
    //   69: putstatic burp/Zk71.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zk71.b : [Ljava/lang/String;
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
    //   152: bipush #59
    //   154: goto -> 184
    //   157: bipush #71
    //   159: goto -> 184
    //   162: bipush #71
    //   164: goto -> 184
    //   167: bipush #41
    //   169: goto -> 184
    //   172: bipush #105
    //   174: goto -> 184
    //   177: bipush #28
    //   179: goto -> 184
    //   182: bipush #101
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
    int i = (paramInt1 ^ 0xFFFFBDC7) & 0xFFFF;
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
      byte b1 = 17;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk71.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */