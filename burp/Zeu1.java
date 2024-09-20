package burp;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zop;

public class Zeu1 implements Ztbi {
  private static boolean ZK;
  
  public final AtomicBoolean Zk;
  
  public final String Z_;
  
  public final int ZZ;
  
  public Zl0a Zs;
  
  private final Zkvz Za;
  
  private final Zkvz ZN;
  
  private final Ztqs ZX;
  
  private final String ZR;
  
  private final boolean Ze;
  
  private String ZB;
  
  private Zop ZH;
  
  private volatile Zlz3 ZQ;
  
  private volatile boolean Zi;
  
  private volatile boolean ZV;
  
  private static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zeu1(Ztqs paramZtqs, String paramString) {
    this(paramZtqs, paramString, Zz(paramString), false);
  }
  
  public Zeu1(Ztqs paramZtqs, String paramString1, String paramString2, boolean paramBoolean) {
    this(paramZtqs, paramString1, paramString2, paramBoolean, -1, null);
  }
  
  public Zeu1(Ztqs paramZtqs, String paramString1, String paramString2, boolean paramBoolean, int paramInt, String paramString3) {
    this.ZX = paramZtqs;
    this.Z_ = paramString1;
    this.ZB = paramString2;
    this.Ze = paramBoolean;
    this.ZZ = paramInt;
    this.ZR = paramString3;
    this.Zk = new AtomicBoolean();
    this.Za = new Zkvz(true);
    this.ZN = new Zkvz(false);
  }
  
  public String Zj(Zee5 paramZee5) {
    return ZR() ? paramZee5.ZC(this.Z_) : this.Z_;
  }
  
  public void Zy(List<String[]> paramList) {
    String str = ZT();
    paramList.add(new String[] { a(26283, -13140), (ZS()).displayName });
    if (this.Z_ == null) {
      if (ZS() == Ztqs.DEVELOPER_CLASSPATH) {
        paramList.add(new String[] { a(26272, 12492), a(26281, -2604) });
        if (str != null) {
          paramList.add(new String[] { a(26282, -13444), this.Z_ });
          return;
        } 
      } 
      return;
    } 
    paramList.add(new String[] { a(26282, -13444), this.Z_ });
  }
  
  public String Zi() {
    return ZR() ? this.ZR : this.ZB;
  }
  
  public Zlz3 ZF() {
    return this.ZQ;
  }
  
  public void ZI(Zlz3 paramZlz3) {
    this.Zi = (paramZlz3 != null);
    this.ZQ = paramZlz3;
  }
  
  public void ZN(Throwable paramThrowable, Zskh paramZskh) {
    try {
      Throwable throwable = paramThrowable.getCause();
      if (throwable != null)
        paramThrowable = throwable; 
      PrintWriter printWriter = new PrintWriter(this.ZN, true);
      paramThrowable.printStackTrace(printWriter);
      printWriter.close();
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.IGNORED);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    String str = null;
    if (paramThrowable instanceof UnsupportedClassVersionError) {
      str = Zmgc.UNSUPPORTED_VERSION.ZV(paramZskh, new Object[] { this.ZB });
    } else {
      try {
        if (!ZK)
          try {
            if (paramThrowable instanceof OutOfMemoryError)
              try {
                if (ZS().Zj() || ZS().Zj()) {
                  String str1 = paramThrowable.getMessage();
                  try {
                    if (str1 != null && str1.contains(a(26302, -13017))) {
                      str = Zmgc.LOW_PERM_GEN.ZV(paramZskh, new Object[] { this.ZB, (ZS()).displayName });
                      ZK = true;
                    } 
                  } catch (OutOfMemoryError outOfMemoryError) {
                    throw a(null);
                  } 
                } 
              } catch (OutOfMemoryError outOfMemoryError) {
                throw a(null);
              }  
          } catch (OutOfMemoryError outOfMemoryError) {
            throw a(null);
          }  
      } catch (OutOfMemoryError outOfMemoryError) {
        throw a(null);
      } 
    } 
    try {
      if (str != null) {
        System.err.println(str);
        PrintWriter printWriter = new PrintWriter(this.ZN, true);
        printWriter.write(str + "\n");
        printWriter.close();
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
  
  public Ztqs ZS() {
    return this.ZX;
  }
  
  public boolean ZP() {
    return this.Zi;
  }
  
  public String ZN() {
    return this.ZB;
  }
  
  public void ZI(String paramString) {
    if (!ZR())
      this.ZB = paramString; 
  }
  
  public Zlwx Zk() {
    Zzqp zzqp = new Zzqp();
    zzqp.Zm(a(26284, -26740), (ZS()).fragment);
    zzqp.Zm(a(26296, 30251), this.Z_);
    zzqp.Zm(a(26285, -23034), this.ZB);
    zzqp.Zm(a(26299, -2450), Zkvz.ZQ[this.Za.Zj()]);
    String str = ZT();
    Object object = this.Za.ZT();
    if (object != null)
      zzqp.Zm(a(26286, -30510), ((File)object).getPath()); 
    zzqp.Zm(a(26295, -7608), Zkvz.ZQ[this.ZN.Zj()]);
    object = this.ZN.ZT();
    if (object != null)
      zzqp.Zm(a(26293, 3801), ((File)object).getPath()); 
    zzqp.Zj(a(26288, -22124), this.Zi);
    if (ZR()) {
      zzqp.ZU(a(26290, -24689), this.ZZ);
      if (this.ZR != null)
        zzqp.Zm(a(26287, 6330), this.ZR); 
    } 
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
    return zzqp;
  }
  
  public static Zeu1 Zo(Zvt paramZvt) throws Zzam {
    int i = paramZvt.Za(a(26298, -18459), -1);
    int j = paramZvt.ZE(a(26301, 3443), Ztqs.ZE());
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    Ztqs ztqs = (i != -1) ? Ztqs.Zo(j) : Ztqs.ZG(j);
    Zeu1 zeu1 = new Zeu1(ztqs, paramZvt.ZC(a(26300, -19444)), paramZvt.ZC(a(26294, 5970)), paramZvt.Z_(a(26291, 29857)), i, paramZvt.Zf(a(26297, -20631), null));
    try {
      byte b = (byte)paramZvt.ZT(a(26303, 32741), Zkvz.ZQ);
      String str = paramZvt.Zf(a(26289, 9223), null);
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      zeu1.Za.ZI(b, (str == null) ? null : new File(str));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      zeu1.Za.Zq((byte)2);
    } 
    try {
      byte b = (byte)paramZvt.ZT(a(26280, 22113), Zkvz.ZQ);
      String str = paramZvt.Zf(a(26292, 27134), null);
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      zeu1.ZN.ZI(b, (str == null) ? null : new File(str));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      zeu1.ZN.Zq((byte)2);
    } 
    return zeu1;
  }
  
  private static String Zz(String paramString) {
    return (paramString != null) ? (new File(paramString)).getName() : null;
  }
  
  public boolean Zc() {
    return this.Ze;
  }
  
  public void Zb(Zop paramZop) {
    this.ZH = paramZop;
  }
  
  public Optional<Zop> Zd() {
    return Optional.ofNullable(this.ZH);
  }
  
  public Zkvz ZU() {
    return this.Za;
  }
  
  public Zkvz ZJ() {
    return this.ZN;
  }
  
  public boolean ZR() {
    return (this.ZZ != -1);
  }
  
  public String ZE() {
    return this.ZR;
  }
  
  public boolean Zz() {
    return this.ZV;
  }
  
  public void ZH() {
    this.ZV = true;
  }
  
  public void ZB() {
    this.ZV = false;
  }
  
  public static void Zd(String paramString) {
    ZO = paramString;
  }
  
  public static String ZT() {
    return ZO;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc ' ÏøsùgßªËê\\tîj§c;rGtô,éÔ/g)ö\\bÌYOZ7HãÛÄ¢Îø¤TKj/´3üA\\t¸ñÕØ³û0ÂKHß¾Ö.Ø|Á]rFX}¯ZIIû¦dÃ²J¶¬½âæN!]ï¸ïO+o¡¨àlÌ\\n=çÉ} à¾\\né\\b¢AL©z¨JmGø¼óÓ`S*jèõÎ>,¹U¶7qÁÜÄÕÄ>'8oûeÕ6\\bÏf?þ>+Êß¯HpËèpýH9Í,ouóÂçY>ÍÎYÒ7Á0ÈIßÃÀ·b$ô]Èì, ·'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zd : (Ljava/lang/String;)V
    //   22: bipush #14
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #63
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
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
    //   72: ldc 'êl¤-pu\\n\\b*ØTþüJò'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #9
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #99
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
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
    //   133: putstatic burp/Zeu1.a : [Ljava/lang/String;
    //   136: bipush #25
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zeu1.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #78
    //   218: goto -> 248
    //   221: bipush #119
    //   223: goto -> 248
    //   226: bipush #53
    //   228: goto -> 248
    //   231: bipush #37
    //   233: goto -> 248
    //   236: bipush #40
    //   238: goto -> 248
    //   241: bipush #32
    //   243: goto -> 248
    //   246: bipush #30
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
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
    int i = (paramInt1 ^ 0x66B8) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeu1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */