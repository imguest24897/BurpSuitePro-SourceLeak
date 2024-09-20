package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.DoubleAdder;
import net.portswigger.Z_g;
import net.portswigger.Zdc;
import net.portswigger.Zgu;
import net.portswigger.Zgx;
import net.portswigger.Zqf;
import net.portswigger.Zrm3;
import net.portswigger.Ztj;
import net.portswigger.Zuh;

public class Zx61 implements Zmt2 {
  private final int Zq;
  
  private final Zr5h ZE;
  
  private final Zg0s Zd;
  
  private final Zmx0 ZT;
  
  private final Zb40<String> Zh;
  
  private final Zroe ZK;
  
  private final Zerk ZY;
  
  private final Zr4r Zy;
  
  private final Zko0 Zm;
  
  private final Zgsr Zs;
  
  private final Zed2 ZO;
  
  private final AtomicReference<Zdc> Zr;
  
  private final AtomicReference<String> ZM;
  
  private final AtomicInteger Zz;
  
  private final AtomicReference<String> Zl;
  
  private final AtomicInteger ZV;
  
  private static int[] ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zx61(Zra1 paramZra1, Zzep paramZzep, Zg0s paramZg0s, Ztj paramZtj, Zzb4 paramZzb4, Zx46 paramZx46, Zbnt paramZbnt, Zmx0 paramZmx0) {
    this.Zq = paramZzep.ZPo();
    this.ZE = paramZzep;
    this.Zd = paramZg0s;
    this.ZT = paramZmx0;
    this.Zh = new Zgs8<>();
    Zl7h zl7h = paramZzep.ZnH();
    Zz1i zz1i = paramZzep.Zdm();
    this.ZK = new Zroe(this.Zq, paramZg0s, paramZzb4, paramZtj, new Zey9(paramZbnt));
    this.ZY = new Zerk(this.Zq, zl7h, zz1i, paramZra1, paramZg0s);
    int[] arrayOfInt = ZS();
    this.Zy = new Zr4r(paramZx46, paramZra1);
    this.Zm = new Zko0(zz1i, paramZra1, paramZbnt);
    this.Zs = new Zgsr(zz1i, paramZra1, paramZbnt);
    this.ZO = new Zed2(zz1i, paramZra1);
    this.Zr = new AtomicReference<>(Zdc.CRAWLING);
    this.ZM = new AtomicReference<>("");
    this.Zz = new AtomicInteger();
    this.Zl = new AtomicReference<>();
    this.ZV = new AtomicInteger();
    if (Zbqc.Zwu() == null)
      Zt(new int[1]); 
  }
  
  public Zx61(Zra1 paramZra1, Zbob paramZbob, Zg0s paramZg0s, Ztj paramZtj, Zzb4 paramZzb4, Zx46 paramZx46, Zbnt paramZbnt, Zmx0 paramZmx0) {
    this.Zq = paramZbob.ZPo();
    this.ZE = paramZbob;
    this.Zd = paramZg0s;
    this.ZT = paramZmx0;
    this.Zh = new Zgs8<>();
    Zz1i zz1i = paramZbob.Zdm();
    this.ZK = new Zroe(this.Zq, paramZg0s, paramZzb4, paramZtj, new Zey9(paramZbnt));
    this.ZY = new Zerk(this.Zq, null, zz1i, paramZra1, paramZg0s);
    this.Zy = new Zr4r(paramZx46, paramZra1);
    this.Zm = new Zko0(zz1i, paramZra1, paramZbnt);
    this.Zs = new Zgsr(zz1i, paramZra1, paramZbnt);
    this.ZO = new Zed2(zz1i, paramZra1);
    this.Zr = new AtomicReference<>(Zdc.CRAWLING);
    this.ZM = new AtomicReference<>("");
    this.Zz = new AtomicInteger();
    this.Zl = new AtomicReference<>();
    this.ZV = new AtomicInteger();
  }
  
  public Zs_1 Zf(int paramInt1, int paramInt2) {
    Zsb_ zsb_ = this.ZK.ZC(paramInt1, paramInt2);
    Zdc zdc = Zb(zsb_);
    List<Z_g> list = zsb_.Zu();
    int i = (int)this.ZE.ZPB().toSeconds();
    Zrm3 zrm3 = this.ZY.Zn(this.Zh.ZB(), this.Zl.get(), this.ZV.get(), i);
    int[] arrayOfInt = ZS();
    Zgu zgu = new Zgu(String.valueOf(this.Zq), zdc, zrm3, this.ZM.get(), Integer.valueOf(this.Zz.get()), list, this.Zy.ZS(), this.Zm.ZD(zdc), this.Zs.ZV(zdc), this.ZO.ZZ(zdc));
    this.ZT.ZH(String.format(a(8479, 32357), new Object[] { zgu.ZZ, Integer.valueOf(zrm3.ZZ), Integer.valueOf(zrm3.Zg), Integer.valueOf(zrm3.Zp), Integer.valueOf(zrm3.ZG), Integer.valueOf(zrm3.ZY), Integer.valueOf(this.ZE.Zdm().ZHU().stream().mapToInt(Zbza::ZgP).sum()) }));
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
    return Zs_1.ZY(zdc.Zv(), list.size(), (Zgx)zgu);
  }
  
  private Zdc Zb(Zsb_ paramZsb_) {
    Zdc zdc = this.Zr.get();
    return zdc.Zv() ? (paramZsb_.ZB() ? Zdc.AUDITING : zdc) : zdc;
  }
  
  public void ZT(Zlli<Zt13> paramZlli, Zlli<Zt18> paramZlli1, Zlli<Zt1o> paramZlli2) {
    Z_(paramZlli);
    ZX(paramZlli1);
    Zs(paramZlli2);
    Zg(paramZlli2);
  }
  
  public void Ze(Zlli<Zt13> paramZlli, Zlli<Zt1o> paramZlli1) {
    Z_(paramZlli);
    Zg(paramZlli1);
    Zz(paramZlli1);
  }
  
  private void Z_(Zlli<Zt13> paramZlli) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   4: aload_0
    //   5: <illegal opcode> accept : (Lburp/Zx61;)Ljava/util/function/Consumer;
    //   10: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   15: pop
    //   16: new java/util/concurrent/atomic/AtomicReference
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_2
    //   24: aload_1
    //   25: getstatic burp/Zt13.ZC : Lburp/Zlnb;
    //   28: aload_0
    //   29: aload_2
    //   30: <illegal opcode> accept : (Lburp/Zx61;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   35: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   40: pop
    //   41: aload_1
    //   42: getstatic burp/Zt13.ZV : Lburp/Zlnb;
    //   45: aload_0
    //   46: aload_2
    //   47: <illegal opcode> accept : (Lburp/Zx61;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   52: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   57: pop
    //   58: return
  }
  
  private void ZX(Zlli<Zt18> paramZlli) {
    paramZlli.ZE(Zt18.Zm, this::lambda$subscribeToCrawlEvents$5);
    paramZlli.ZE(Zt18.ZW, this::lambda$subscribeToCrawlEvents$6);
    paramZlli.ZE(Zt18.ZS, this::lambda$subscribeToCrawlEvents$8);
  }
  
  private void Zg(Zlli<Zt1o> paramZlli) {
    paramZlli.ZE(Zt1o.Ze, this::lambda$subscribeToAuditEvents$10);
    paramZlli.ZE(Zt1o.Zv, this::lambda$subscribeToAuditEvents$11);
    paramZlli.ZE(Zt1o.ZH, this::lambda$subscribeToAuditEvents$13);
    paramZlli.ZE(Zt1o.Zx, this::lambda$subscribeToAuditEvents$14);
  }
  
  private void Zs(Zlli<Zt1o> paramZlli) {
    paramZlli.ZE(Zt1o.Zd, this::lambda$subscribeToCrawlAndAuditProgressEvents$16);
  }
  
  private void Zz(Zlli<Zt1o> paramZlli) {
    paramZlli.ZE(Zt1o.Zu, this::lambda$subscribeToAuditProgressEvents$18);
  }
  
  public void ZY(Zb6l paramZb6l) {
    Zuh.Zb((paramZb6l != null), Zqf.Zk);
    if (paramZb6l != null) {
      this.ZM.set(paramZb6l.ZX());
      this.Zz.set(paramZb6l.ZR());
    } 
    Zm(Zdc.FAILED);
  }
  
  public void Zm(Zdc paramZdc) {
    this.Zr.set(paramZdc);
  }
  
  private void ZZ(String paramString) {
    this.Zl.set(paramString);
  }
  
  private void ZG(int paramInt) {
    this.ZV.set(paramInt);
  }
  
  private void Zm(String paramString) {
    this.Zh.ZO(paramString.isBlank() ? null : paramString);
  }
  
  private static void lambda$metrics$19(DoubleAdder paramDoubleAdder, Zb2e paramZb2e) {
    if (paramZb2e.ZBb() == Zb9y.ISSUE_FOUND) {
      Zrdb zrdb = paramZb2e.ZBf();
      int i = 13 - Zb3i.ZE(zrdb.Zaw(), zrdb.Zak());
      double d1 = i / 12.0D;
      double d2 = Math.pow(d1, 2.0D);
      paramDoubleAdder.add(d2);
    } 
  }
  
  private void lambda$subscribeToAuditProgressEvents$18(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeToCrawlAndAuditProgressEvents$15);
  }
  
  private void lambda$subscribeToCrawlAndAuditProgressEvents$16(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeToCrawlAndAuditProgressEvents$15);
  }
  
  private void lambda$subscribeToCrawlAndAuditProgressEvents$15(Zlj9 paramZlj9) {
    paramZlj9.Zu().ifPresent(this::ZZ);
    paramZlj9.Zk().ifPresent(this::ZG);
  }
  
  private void lambda$subscribeToAuditEvents$14(Zxr8 paramZxr8) {
    this.ZT.ZH(a(8475, -7913));
    Zm(Zdc.SUCCEEDED);
  }
  
  private void lambda$subscribeToAuditEvents$13(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeToAuditEvents$12);
  }
  
  private void lambda$subscribeToAuditEvents$12(Zb6l paramZb6l) {
    this.ZT.ZH(a(8478, -22102) + a(8478, -22102));
    ZY(paramZb6l);
  }
  
  private void lambda$subscribeToAuditEvents$11(Zxr8 paramZxr8) {
    this.ZT.ZH(a(8476, 6913));
    Zm(Zdc.AUDITING);
  }
  
  private void lambda$subscribeToAuditEvents$10(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeToCrawlEvents$4);
  }
  
  private void lambda$subscribeToCrawlEvents$8(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeToCrawlEvents$7);
  }
  
  private void lambda$subscribeToCrawlEvents$7(Zb6l paramZb6l) {
    this.ZT.ZH(a(8477, 14103) + a(8477, 14103));
    ZY(paramZb6l);
  }
  
  private void lambda$subscribeToCrawlEvents$6(Zxr8 paramZxr8) {
    this.ZT.ZH(a(8474, 22568));
  }
  
  private void lambda$subscribeToCrawlEvents$5(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeToCrawlEvents$4);
  }
  
  private void lambda$subscribeToCrawlEvents$4(Zski paramZski) {
    Zm(paramZski.ZyJ());
  }
  
  private void lambda$subscribeToTaskEvents$3(AtomicReference paramAtomicReference, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zx61;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$subscribeToTaskEvents$2(AtomicReference<Zdc> paramAtomicReference, Ztak paramZtak) {
    if (paramZtak.ZO())
      Zm(paramAtomicReference.get()); 
  }
  
  private void lambda$subscribeToTaskEvents$1(AtomicReference<Zdc> paramAtomicReference, Zxr8 paramZxr8) {
    paramAtomicReference.set(this.Zr.get());
    Zm(Zdc.PAUSED);
  }
  
  private void lambda$subscribeToTaskEvents$0(Zxr8 paramZxr8) {
    ZY(new Zb6l(Zec4.TASK_DELETED));
  }
  
  public static void Zt(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] ZS() {
    return ZL;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_2
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: ldc 'b8¨ N¢!¯é ÑK;ÛÖ>KûÌ\\r»@ýÇh,}²7ÒRù¾ÈUÖT\\,ÌTyÔ[O C^-¦Ä=Áw3ÜNé[hÜÂ\\t/þKªÿuH.:×°s\'.b×Âkè#g516|èÂº²TÅ20éI,Qç³ÂZMºb·FPyBÿ¥Jufù7Ösç×;ãG\\ri(úªª@Þ¿¥µYÃ½èáUô/<\\r|c*¦'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #14
    //   23: istore_1
    //   24: invokestatic Zt : ([I)V
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #82
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '&\\b¿_·Ü¢Ô¾\\\rË@©SZ@y ¯Ì3'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #14
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #30
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
    //   135: putstatic burp/Zx61.a : [Ljava/lang/String;
    //   138: bipush #6
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zx61.b : [Ljava/lang/String;
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
    //   220: bipush #94
    //   222: goto -> 252
    //   225: bipush #49
    //   227: goto -> 252
    //   230: bipush #9
    //   232: goto -> 252
    //   235: bipush #35
    //   237: goto -> 252
    //   240: bipush #80
    //   242: goto -> 252
    //   245: bipush #13
    //   247: goto -> 252
    //   250: bipush #16
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
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x211E) & 0xFFFF;
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
      byte b1 = 2;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx61.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */