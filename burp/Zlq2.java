package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zlq2 {
  private final Zejc<Zg0z, Zvb> Zt;
  
  private final AtomicReference<Zs35> Zb = new AtomicReference<>(Zs35.INIT);
  
  private final AtomicReference<Zg0z> Zh = new AtomicReference<>();
  
  private final AtomicReference<Zvb> Zj = new AtomicReference<>();
  
  private final AtomicBoolean ZD = new AtomicBoolean();
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zlq2(Zejc<Zg0z, Zvb> paramZejc, Zvb paramZvb) {
    this(paramZejc);
    this.Zj.set(paramZvb);
  }
  
  private Zlq2(Zejc<Zg0z, Zvb> paramZejc) {
    this.Zt = paramZejc;
  }
  
  public Zm6s<? extends Zm75> Zq() {
    Zuh.ZT((this.Zh.get() == null), Zqf.Zr, a(-4428, -22244));
    return Zm6s.ZQ(this::lambda$init$0);
  }
  
  public Zm6s<? extends Zm75> Zt(Consumer<Zlq2> paramConsumer) {
    return Zm6s.ZQ(Za(new Zm9w(this, paramConsumer)));
  }
  
  public Zm6s<? extends Zm75> ZL() {
    return Zm6s.ZQ(Za(new Ze_g(this)));
  }
  
  public Zm6s<? extends Zm75> Zr() {
    return Zm6s.ZQ(Za(this::lambda$exit$2));
  }
  
  public Zm6s<? extends Zm75> Zk(Supplier<Zlq2> paramSupplier) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> ZG : (Lburp/Zlq2;Ljava/util/function/Supplier;)Lburp/Zz22;
    //   8: invokevirtual Za : (Lburp/Zz22;)Lburp/Zm75;
    //   11: invokestatic ZQ : (Lburp/Zm75;)Lburp/Zm6s;
    //   14: areturn
  }
  
  private Zm75 Za(Zz22 paramZz22) {
    if (this.Zh.get() != null)
      return ((Zg0z)this.Zh.get()).ZC(paramZz22); 
    Zuh.Zb(false, Zqf.Zv);
    return this::lambda$getWorkForCurrentState$5;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(a(-4432, -26165));
    stringBuilder.append(a(-4429, -9931)).append(this.Zt);
    stringBuilder.append(a(-4430, 24673)).append(this.Zh);
    stringBuilder.append(a(-4425, -12892)).append(this.Zb);
    int i = Zv84.ZB();
    stringBuilder.append('}');
    if (i == 0)
      Zbqc.Zr(new Zbqc[1]); 
    return stringBuilder.toString();
  }
  
  public void ZJ() {
    this.ZD.set(true);
  }
  
  public boolean Zc() {
    return this.ZD.get();
  }
  
  private void lambda$getWorkForCurrentState$5(Zrj paramZrj, Zlsy paramZlsy) {
    this.Zb.set(Zs35.EXIT);
  }
  
  private Zm75 lambda$finish$4(Supplier paramSupplier, Zg0z paramZg0z) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: <illegal opcode> Za : (Lburp/Zlq2;Lburp/Zg0z;Ljava/util/function/Supplier;)Lburp/Zmgr;
    //   8: areturn
  }
  
  private void lambda$finish$3(Zg0z paramZg0z, Supplier<Zlq2> paramSupplier, Zrj paramZrj, Zlsy paramZlsy) {
    this.Zt.ZJ(paramZg0z);
    Zlq2 zlq2 = paramSupplier.get();
    if (zlq2 != null)
      Zuh.Zb((zlq2 == this), Zqf.Zr); 
    ZJ();
  }
  
  private Zm75 lambda$exit$2(Zg0z paramZg0z) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Za : (Lburp/Zlq2;Lburp/Zg0z;)Lburp/Zmgr;
    //   7: areturn
  }
  
  private void lambda$exit$1(Zg0z paramZg0z, Zrj paramZrj, Zlsy paramZlsy) {
    int i = Zv84.Zn();
    try {
      paramZg0z.Zr();
      Zvb zvb = this.Zj.get();
      try {
        if (zvb == null) {
          Zuh.ZT(false, Zqf.Zr, String.format(a(-4431, 8655), new Object[] { this.Zt, paramZg0z }));
          this.Zb.set(Zs35.FINISH);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      Zg0z zg0z = (Zg0z)this.Zt.Zg(paramZg0z, zvb);
      try {
        if (zg0z == null) {
          try {
            Zuh.ZT(false, Zqf.Zr, String.format(a(-4426, -24894), new Object[] { this.Zt, zvb, paramZg0z }));
            this.Zb.set(Zs35.FINISH);
            if (i != 0) {
              this.Zh.set(zg0z);
              this.Zb.set(Zs35.ENTER);
            } 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.Zh.set(zg0z);
      this.Zb.set(Zs35.ENTER);
    } catch (Exception exception) {
      Zlfh.ZB(Zrp6.ERROR, a(-4427, 27165), new Object[] { exception, this.Zt });
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.Zb.set(Zs35.FINISH);
    } 
  }
  
  private void lambda$init$0(Zrj paramZrj, Zlsy paramZlsy) {
    this.Zh.set(this.Zt.ZH());
    this.Zb.set(Zs35.ENTER);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'U&Àöëx\\b§îÐÛ±N/Mp5F`\\t\\bbÊÑÑ7<7èå,më\\f¬óï+aä1¯?×w¿!àxÃqéúõ§¼ÄVàq,lVÔ¥Cp Ä0_L"ÁIö"ø`³?ý\\búÝIo)5\\bÈÔn²_'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #34
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #23
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '>ÆÃB¡Û´F¤Ú¢±¨HíYaÕÖëù"c­`¶'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #6
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zlq2.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlq2.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #43
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #37
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #31
    //   234: goto -> 244
    //   237: bipush #14
    //   239: goto -> 244
    //   242: bipush #62
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEEB6) & 0xFFFF;
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
      byte b1 = 62;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlq2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */