package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zz9f implements Zslu, Zt5e, Zm3g {
  private final String ZP;
  
  private final int Zt;
  
  private final Zslu ZE;
  
  final Zeek Zk;
  
  private Zlor Ze;
  
  private final List<Zt5e> Zg = new ArrayList<>();
  
  private boolean ZM;
  
  private static final List<String> ZK;
  
  private static final List<String> Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zz9f(String paramString, int paramInt, Zeek paramZeek, Zr_4 paramZr_41, Zr_4 paramZr_42, Zslu paramZslu, Zr1j paramZr1j) {
    Zuh.Zb((paramZslu != null), Zqf.Zv);
    this.ZP = paramString;
    this.Zt = paramInt;
    this.Zk = paramZeek;
    this.ZE = paramZslu;
    try {
      Zl34 zl341 = paramZeek.ZC8();
      Zl34 zl342 = paramZeek.ZCh();
      this.Ze = new Zlor(zl341, zl342, paramZr_41, paramZr_42, paramZr1j);
      paramZslu.ZH(this);
      this.Ze.ZH(this);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
  
  public int Z_x() {
    return this.Zk.ZCG();
  }
  
  public void ZA(int paramInt) {
    this.Zk.ZHW(paramInt);
    ZC(this);
  }
  
  public Zlor Z_N() {
    return this.Ze;
  }
  
  public boolean ZER() {
    return this.Ze.ZER();
  }
  
  public void ZmL(boolean paramBoolean) {
    this.Ze.ZmL(paramBoolean);
  }
  
  public boolean ZG(Zlit paramZlit) {
    Zuh.Zb((this.ZE != null), Zqf.Zr);
    switch (this.Zk.ZCG()) {
      case 0:
        return false;
      case 1:
        return true;
      case 2:
        return this.ZE.ZG(paramZlit);
      case 3:
        return this.Ze.ZG(paramZlit);
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zk.ZCG());
    return false;
  }
  
  public boolean ZB(Zmzk paramZmzk) {
    Zuh.Zb((this.ZE != null), Zqf.Zr);
    switch (this.Zk.ZCG()) {
      case 0:
        return false;
      case 1:
        return true;
      case 2:
        return this.ZE.ZB(paramZmzk);
      case 3:
        return this.Ze.ZB(paramZmzk);
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zk.ZCG());
    return false;
  }
  
  public boolean ZH(Zlit paramZlit) {
    Zuh.Zb((this.ZE != null), Zqf.Zr);
    switch (this.Zk.ZCG()) {
      case 0:
        return false;
      case 1:
        return false;
      case 2:
        return this.ZE.ZH(paramZlit);
      case 3:
        return this.Ze.ZH(paramZlit);
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zk.ZCG());
    return false;
  }
  
  public boolean ZF(Zlit paramZlit) {
    Zuh.Zb((this.ZE != null), Zqf.Zr);
    switch (this.Zk.ZCG()) {
      case 0:
        return false;
      case 1:
        return true;
      case 2:
        return this.ZE.ZF(paramZlit);
      case 3:
        return this.Ze.ZF(paramZlit);
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zk.ZCG());
    return false;
  }
  
  public void Zl(Zlit[] paramArrayOfZlit) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    if (this.Zk.ZCG() == 2) {
      this.ZE.Zl(paramArrayOfZlit);
      if (arrayOfZbqc != null) {
        this.Ze.Zl(paramArrayOfZlit);
        return;
      } 
      return;
    } 
    this.Ze.Zl(paramArrayOfZlit);
  }
  
  public void Zi(Zlit[] paramArrayOfZlit) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    if (this.Zk.ZCG() == 2) {
      this.ZE.Zi(paramArrayOfZlit);
      if (arrayOfZbqc != null) {
        this.Ze.Zi(paramArrayOfZlit);
        return;
      } 
      return;
    } 
    this.Ze.Zi(paramArrayOfZlit);
  }
  
  public void ZH(Zt5e paramZt5e) {
    this.Zg.add(paramZt5e);
  }
  
  public void Z_(Zt5e paramZt5e) {
    Zuh.Zb(this.Zg.contains(paramZt5e), Zqf.Zr);
    this.Zg.remove(paramZt5e);
  }
  
  public int ZAy() {
    return this.ZE.ZAy();
  }
  
  public boolean Z_z() {
    switch (this.Zk.ZCG()) {
      case 0:
        return true;
      case 1:
        return false;
      case 2:
        return false;
      case 3:
        return this.Ze.Zc3();
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zk.ZCG());
    return false;
  }
  
  public void ZC(Zz28 paramZz28) {
    // Byte code:
    //   0: invokestatic Zcp : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZM : Z
    //   8: ifeq -> 16
    //   11: return
    //   12: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   15: athrow
    //   16: aload_1
    //   17: aload_0
    //   18: if_acmpeq -> 76
    //   21: aload_1
    //   22: aload_0
    //   23: getfield Ze : Lburp/Zlor;
    //   26: if_acmpne -> 56
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield Zk : Lburp/Zeek;
    //   40: invokeinterface ZCG : ()I
    //   45: iconst_3
    //   46: if_icmpeq -> 76
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_0
    //   57: getfield Zk : Lburp/Zeek;
    //   60: invokeinterface ZCG : ()I
    //   65: iconst_2
    //   66: if_icmpne -> 129
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload_0
    //   77: getfield Zg : Ljava/util/List;
    //   80: invokeinterface iterator : ()Ljava/util/Iterator;
    //   85: astore_3
    //   86: aload_3
    //   87: invokeinterface hasNext : ()Z
    //   92: ifeq -> 118
    //   95: aload_3
    //   96: invokeinterface next : ()Ljava/lang/Object;
    //   101: checkcast burp/Zt5e
    //   104: astore #4
    //   106: aload #4
    //   108: aload_0
    //   109: invokeinterface ZC : (Lburp/Zz28;)V
    //   114: aload_2
    //   115: ifnull -> 86
    //   118: goto -> 129
    //   121: astore_3
    //   122: aload_3
    //   123: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   126: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   129: return
    // Exception table:
    //   from	to	target	type
    //   4	12	12	java/lang/Exception
    //   16	29	32	java/lang/Exception
    //   21	49	52	java/lang/Exception
    //   36	69	72	java/lang/Exception
    //   76	118	121	java/lang/Exception
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zz9f zz9f = (Zz9f)paramObject;
    return (this.ZM != zz9f.ZM) ? false : ((this.Zt != zz9f.Zt) ? false : (((this.Zk != null) ? !this.Zk.equals(zz9f.Zk) : (zz9f.Zk != null)) ? false : (!this.Zg.equals(zz9f.Zg) ? false : (((this.Ze != null) ? !this.Ze.equals(zz9f.Ze) : (zz9f.Ze != null)) ? false : (!((this.ZE != null) ? !this.ZE.equals(zz9f.ZE) : (zz9f.ZE != null)))))));
  }
  
  public int hashCode() {
    return 0;
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.ZM = true;
    paramZmf_.ZK();
    this.Zk.ZHW(paramZmf_.ZM(Zzkm.Zx(new String[] { this.ZP, a(10694, -22494) }), ZK, this.Zk.ZCG()));
    boolean bool = this.Ze.Zi(paramZmf_, this.ZP);
    this.ZM = false;
    if (bool || paramZmf_.Zb())
      ZC(this); 
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Zr(Zzkm.Zx(new String[] { this.ZP, a(10691, 3039) }), ZK, this.Zk.ZCG());
    this.Ze.Zf(paramZg4j, this.ZP);
  }
  
  public void Zi(Zzqp paramZzqp) {
    paramZzqp.Zm(a(10697, 2399), Zu.get(this.Zk.ZCG()));
    this.Ze.Zy(paramZzqp, a(10688, 28071), a(10702, 20604), a(10716, -30185));
  }
  
  public static Zeek ZT(Zvt paramZvt, Zr_4 paramZr_4) throws Zzam {
    int i = paramZvt.ZE(a(10696, -27544), Zu);
    Zl34 zl341 = Zg0o.Zk(paramZvt, a(10701, -1474), a(10693, 5632), paramZr_4, true);
    Zl34 zl342 = Zg0o.Zk(paramZvt, a(10688, 28071), a(10690, -14280), paramZr_4, false);
    return paramZr_4.<Zeek>ZH(new Zr1(i, zl341, zl342));
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ý¢:»I+Íß·.?_¡ÇW¶º[<~=$é¬\\fr\\n²\OkØ|ì±óU0úPí\\t±\\t²ÛÌ=µÄøÈI\\tDó8ndÜ&?zmÐø=N-Â¢­y\\n0\\rN«#±U´2±ÎXºEþ\\f0ðYDrÔHÝ3òåù6 ¹Ã-(ó\\tóOñ\ÇÌJ¨®5æFÃÿ¼;¦åL¢b´£ÿû¼²U\\f\bÔÃWâÓ×'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
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
    //   68: ldc '[gD9¨´iÂÓ äíNþ_©«®¨ç'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #18
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #98
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
    //   129: putstatic burp/Zz9f.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zz9f.b : [Ljava/lang/String;
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
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #21
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #65
    //   239: goto -> 244
    //   242: bipush #103
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
    //   300: iconst_4
    //   301: anewarray java/lang/String
    //   304: dup
    //   305: iconst_0
    //   306: sipush #10692
    //   309: sipush #10671
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: aastore
    //   316: dup
    //   317: iconst_1
    //   318: sipush #10700
    //   321: sipush #-10238
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: aastore
    //   328: dup
    //   329: iconst_2
    //   330: sipush #10698
    //   333: sipush #19365
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: aastore
    //   340: dup
    //   341: iconst_3
    //   342: sipush #10717
    //   345: sipush #6563
    //   348: invokestatic a : (II)Ljava/lang/String;
    //   351: aastore
    //   352: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   355: putstatic burp/Zz9f.ZK : Ljava/util/List;
    //   358: iconst_4
    //   359: anewarray java/lang/String
    //   362: dup
    //   363: iconst_0
    //   364: sipush #10689
    //   367: sipush #2963
    //   370: invokestatic a : (II)Ljava/lang/String;
    //   373: aastore
    //   374: dup
    //   375: iconst_1
    //   376: sipush #10703
    //   379: sipush #13698
    //   382: invokestatic a : (II)Ljava/lang/String;
    //   385: aastore
    //   386: dup
    //   387: iconst_2
    //   388: sipush #10695
    //   391: sipush #1971
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: aastore
    //   398: dup
    //   399: iconst_3
    //   400: sipush #10699
    //   403: sipush #-7573
    //   406: invokestatic a : (II)Ljava/lang/String;
    //   409: aastore
    //   410: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   413: putstatic burp/Zz9f.Zu : Ljava/util/List;
    //   416: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x29CC) & 0xFFFF;
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
      byte b1 = 78;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz9f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */