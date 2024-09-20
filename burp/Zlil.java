package burp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlil implements Zk5_, Cloneable, Zgd8<Zmk5> {
  private final Zbnt ZO;
  
  private final Zr_4 Zj;
  
  private final Ze5r<Ztpb, Zk9_> ZY;
  
  private final Zmk5 Zv;
  
  private static String[] Zo;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zlil(int paramInt, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this(paramZr_4.<Zmk5>ZH(new Zkqs()), paramZbnt, paramZr_4);
    this.Zv.ZbW(a(16399, 6119) + a(16399, 6119));
    ZE();
  }
  
  public Zlil(Zmk5 paramZmk5, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this.Zv = paramZmk5;
    this.Zj = paramZr_4;
    this.ZO = paramZbnt;
    this.ZY = Zj(paramZmk5);
  }
  
  private void ZE() {
    this.Zv.Zd((long)(Math.random() * 9.223372036854776E18D));
  }
  
  public String toString() {
    return this.Zv.Zuh();
  }
  
  public Zlil ZU() {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      Zxpa zxpa = new Zxpa(byteArrayOutputStream);
      zxpa.ZX(a(16387, 9743), this);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
      Zxyn zxyn = new Zxyn(byteArrayInputStream, a(16388, 29575), this.Zj);
      Zlil zlil = ZV(a(16388, 29575), zxyn, this.ZO, this.Zj);
      try {
        zlil.ZE();
        if (!zlil.Zs().endsWith(a(16398, -26357)))
          zlil.ZJ(zlil.Zs() + zlil.Zs()); 
      } catch (Exception exception) {
        throw a(null);
      } 
      return zlil;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    paramZs4f.Zb("i", 0);
    paramZs4f.ZE("s", this.Zv.Zus());
    paramZs4f.ZL("d", this.Zv.Zuh());
    String[] arrayOfString = Za();
    synchronized (this.ZY.ZB()) {
      for (Ztpb ztpb : this.ZY) {
        paramZs4f.ZX(a(16389, -22008), ztpb);
        if (arrayOfString == null)
          break; 
      } 
    } 
  }
  
  public static Zlil ZV(String paramString, Zgyp paramZgyp, Zbnt paramZbnt, Zr_4 paramZr_4) throws IOException, Ze27 {
    String[] arrayOfString = Za();
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    zgyp.ZM("i");
    Zmk5 zmk5 = paramZr_4.<Zmk5>ZH(new Zkqs());
    zmk5.Zd(zgyp.Zv("s").longValue());
    zmk5.ZbW(zgyp.ZW("d"));
    Zlil zlil = new Zlil(zmk5, paramZbnt, paramZr_4);
    do {
      Ztpb ztpb = Ztpb.ZG(a(16391, -24011), zgyp, paramZbnt, paramZr_4);
      if (ztpb == null)
        break; 
      zlil.ZY.Ze(ztpb);
    } while (arrayOfString != null);
    zgyp.ZE();
    return zlil;
  }
  
  public long ZQ() {
    return this.Zv.Zus();
  }
  
  String Zs() {
    return this.Zv.Zuh();
  }
  
  void ZJ(String paramString) {
    this.Zv.ZbW(paramString);
  }
  
  Ze5r<Ztpb, Zk9_> Zf() {
    return this.ZY;
  }
  
  public void Zs(List<Zeo2> paramList) {
    String[] arrayOfString = Za();
    synchronized (this.ZY.ZB()) {
      this.ZY.ZF();
      for (Zeo2 zeo2 : paramList) {
        this.ZY.Ze(new Ztpb(zeo2, this.Zj));
        if (arrayOfString == null)
          break; 
      } 
    } 
    Zks.Zp(this.ZY.Za(), this.ZO, this.Zj);
  }
  
  public Ztpb ZX(int paramInt) {
    return this.ZY.ZV(paramInt);
  }
  
  boolean ZV() {
    return this.ZY.ZQ();
  }
  
  void Zr(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ze5r;
    //   4: iload_1
    //   5: iload_2
    //   6: <illegal opcode> accept : (II)Ljava/util/function/Consumer;
    //   11: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   14: return
  }
  
  public int Ze() {
    return this.ZY.ZG();
  }
  
  public int Zv(Ztpb paramZtpb) {
    return this.ZY.Zo(paramZtpb);
  }
  
  void Zy() {
    Zks.Zp(this.ZY.Za(), this.ZO, this.Zj);
  }
  
  public Zmk5 ZL() {
    return this.Zv;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zlil zlil = (Zlil)paramObject;
    return this.Zv.equals(zlil.Zv);
  }
  
  private Ze5r<Ztpb, Zk9_> Zj(Zmk5 paramZmk5) {
    ArrayList<Ztpb> arrayList = new ArrayList();
    Zefg<Zk9_> zefg = paramZmk5.ZuT();
    String[] arrayOfString = Za();
    if (zefg != null)
      try {
        for (Zk9_ zk9_ : zefg) {
          try {
            arrayList.add(new Ztpb(zk9_, this.Zj));
          } catch (Throwable throwable) {
            Zah.Zl(throwable, Zk_.UNEXPECTED);
          } 
          if (arrayOfString == null)
            break; 
        } 
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      }  
    return new Ze5r<>(arrayList, zefg);
  }
  
  public Zlwx ZD() {
    // Byte code:
    //   0: new burp/Zzqp
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_2
    //   9: sipush #16386
    //   12: sipush #6206
    //   15: invokestatic a : (II)Ljava/lang/String;
    //   18: aload_0
    //   19: getfield Zv : Lburp/Zmk5;
    //   22: invokeinterface Zus : ()J
    //   27: invokevirtual Zp : (Ljava/lang/String;J)V
    //   30: aload_2
    //   31: sipush #16385
    //   34: sipush #18139
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: aload_0
    //   41: getfield Zv : Lburp/Zmk5;
    //   44: invokeinterface Zuh : ()Ljava/lang/String;
    //   49: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)V
    //   52: aload_2
    //   53: sipush #16394
    //   56: sipush #26162
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: invokevirtual Zm : (Ljava/lang/String;)Lburp/Zzqw;
    //   65: astore_3
    //   66: invokestatic Za : ()[Ljava/lang/String;
    //   69: aload_0
    //   70: getfield ZY : Lburp/Ze5r;
    //   73: invokevirtual ZB : ()Ljava/lang/Object;
    //   76: dup
    //   77: astore #4
    //   79: monitorenter
    //   80: astore_1
    //   81: aload_0
    //   82: getfield ZY : Lburp/Ze5r;
    //   85: invokevirtual iterator : ()Ljava/util/Iterator;
    //   88: astore #5
    //   90: aload #5
    //   92: invokeinterface hasNext : ()Z
    //   97: ifeq -> 125
    //   100: aload #5
    //   102: invokeinterface next : ()Ljava/lang/Object;
    //   107: checkcast burp/Ztpb
    //   110: astore #6
    //   112: aload_3
    //   113: aload #6
    //   115: invokevirtual Zi : ()Lburp/Zlwx;
    //   118: invokevirtual Zx : (Lburp/Zlwx;)V
    //   121: aload_1
    //   122: ifnonnull -> 90
    //   125: aload #4
    //   127: monitorexit
    //   128: goto -> 139
    //   131: astore #7
    //   133: aload #4
    //   135: monitorexit
    //   136: aload #7
    //   138: athrow
    //   139: aload_2
    //   140: areturn
    // Exception table:
    //   from	to	target	type
    //   81	128	131	finally
    //   131	136	131	finally
  }
  
  public static Zlil Zi(Zvt paramZvt, Zbnt paramZbnt, Zr_4 paramZr_4) throws Zzam {
    return new Zlil(Zi(paramZvt, paramZr_4), paramZbnt, paramZr_4);
  }
  
  private static Zmk5 Zi(Zvt paramZvt, Zr_4 paramZr_4) throws Zzam {
    Zmk5 zmk5 = paramZr_4.<Zmk5>ZH(new Zkqs());
    zmk5.Zd(paramZvt.ZU(a(16396, -18913)));
    String[] arrayOfString = Za();
    zmk5.ZbW(paramZvt.ZC(a(16384, 4558)));
    List<Zlwx> list = paramZvt.ZE(a(16397, -25416));
    for (Zlwx zlwx : list) {
      try {
        if (zlwx.Zq())
          zmk5.ZuT().add(Ztpb.Zf(zlwx.Zf(), paramZr_4).Zf()); 
      } catch (Zzam zzam) {
        throw a(null);
      } 
      if (arrayOfString == null)
        break; 
    } 
    return zmk5;
  }
  
  private static void lambda$itemIndexChanged$0(int paramInt1, int paramInt2, Ztpb paramZtpb) {
    paramZtpb.ZB(paramInt1, paramInt2);
  }
  
  public static void Zs(String[] paramArrayOfString) {
    Zo = paramArrayOfString;
  }
  
  public static String[] Za() {
    return Zo;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_3
    //   8: anewarray java/lang/String
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc 'êUÐ\\t,¼ÇG7»­]Â¶\\r\\t_\\r³©Ý2qíùYxÚ×åzUR!`Æ\6ãô`ümãOnm8Å5¤Ä¼Yuì§-úÒB¤\\r^×-Æ+'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic Zs : ([Ljava/lang/String;)V
    //   25: bipush #7
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #112
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 149
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'qÑa^cóL'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: iconst_5
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #119
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zlil.b : [Ljava/lang/String;
    //   138: bipush #13
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zlil.c : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #100
    //   222: goto -> 252
    //   225: bipush #18
    //   227: goto -> 252
    //   230: bipush #123
    //   232: goto -> 252
    //   235: bipush #116
    //   237: goto -> 252
    //   240: bipush #108
    //   242: goto -> 252
    //   245: bipush #18
    //   247: goto -> 252
    //   250: bipush #74
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4006) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = '';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlil.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */