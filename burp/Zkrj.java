package burp;

import java.awt.Component;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zm2;

public class Zkrj extends Zkro implements Zm0l {
  private static final List<Zkcl> Zc;
  
  private static final Predicate<Zgna> ZC;
  
  private final Zskh ZG;
  
  private final Zs2g Zx;
  
  private final Zg0s Za;
  
  private final Zrag Zy;
  
  private final Zbiv Ze;
  
  private final Zxwj ZZ;
  
  private final Zzkr ZA;
  
  private final Zz4b Zv;
  
  private final Zs0g Zj;
  
  private final Zl77 Zr;
  
  private final Zbnt Zk;
  
  private final Zz28 ZD;
  
  private final Zlli<Zt1s> Zg;
  
  private final Zr34 ZP;
  
  private final Supplier<Zl4w> ZK;
  
  private final Ztwv Zp;
  
  private final Zskl ZH;
  
  private final Zt8u ZS;
  
  private Zlfb ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkrj(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Zs2g paramZs2g, Zg0s paramZg0s, Zrag paramZrag, Zbiv paramZbiv, Zxwj paramZxwj, Zzkr paramZzkr, Zl77 paramZl77, Zbnt paramZbnt, Zz28 paramZz28, Zlli<Zt1s> paramZlli, Zr34 paramZr34, Supplier<Zl4w> paramSupplier, Zm6x paramZm6x, Zskl paramZskl, Zt8u paramZt8u) {
    super(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, Zeew.DASHBOARD, paramZtwv, paramZr_4, paramZl77, paramZm6x);
    this.ZG = paramZskh;
    this.Zx = paramZs2g;
    this.Za = paramZg0s;
    this.Zy = paramZrag;
    String str = Zbhz.ZK();
    this.Ze = paramZbiv;
    this.ZZ = paramZxwj;
    this.ZA = paramZzkr;
    this.Zr = paramZl77;
    this.Zk = paramZbnt;
    this.ZD = paramZz28;
    this.Zg = paramZlli;
    this.ZP = paramZr34;
    this.ZK = paramSupplier;
    this.Zp = paramZz0n.Zj();
    this.ZH = paramZskl;
    this.ZS = paramZt8u;
    this.Zj = new Zs0g(paramZt4u, this::lambda$new$1, this.ZQ, paramZtwv, this.Zf);
    this.Zv = paramZt4u.ZN().Zv9();
    paramZrag.Zi().ZE(Zt11.Zt, this::lambda$new$2);
    ZFn();
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void ZYE() {}
  
  public void ZYq() {
    Zbh6 zbh6 = ZFp();
    this.ZP.Zm(Zs70.TASKS_PATH, Zg29.PROJECT, new Zbm0(this.ZN, this.ZA, this.Zg));
    this.ZP.Zm(Zs70.TASKS_PATH, Zg29.PROJECT, new Zbm4(this.ZN));
    this.Z_ = new Zm0o[] { new Zszh(zbh6, a(-24293, 16753)) };
  }
  
  public void ZFE() {
    if (this.ZN != null)
      this.ZN.Zo(); 
  }
  
  public void ZQ() {
    if (this.ZN != null)
      this.ZN.ZF(); 
  }
  
  public int ZF1() {
    return this.Zv.ZVO();
  }
  
  public void ZA(int paramInt) {
    this.Zv.Zt(paramInt);
  }
  
  public int ZFo() {
    return this.Zv.ZV7();
  }
  
  public void ZL(int paramInt) {
    this.Zv.Zy(paramInt);
  }
  
  private Zbh6 ZFp() {
    // Byte code:
    //   0: new burp/Zbhi
    //   3: dup
    //   4: aload_0
    //   5: getfield ZK : Ljava/util/function/Supplier;
    //   8: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   11: astore_1
    //   12: new burp/Zg4s
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore_2
    //   20: new burp/Ztef
    //   23: dup
    //   24: aload_1
    //   25: aload_2
    //   26: invokespecial <init> : (Lburp/Ze00;Lburp/Zg4s;)V
    //   29: astore_3
    //   30: aload_0
    //   31: getfield Zy : Lburp/Zrag;
    //   34: invokevirtual Zi : ()Lburp/Zlli;
    //   37: astore #4
    //   39: new burp/Zt57
    //   42: dup
    //   43: aload_3
    //   44: aload_0
    //   45: getfield Zk : Lburp/Zbnt;
    //   48: aload_0
    //   49: getfield Zr : Lburp/Zl77;
    //   52: aload_0
    //   53: getfield ZG : Lburp/Zskh;
    //   56: aload_0
    //   57: getfield ZD : Lburp/Zz28;
    //   60: aload_0
    //   61: getfield Zp : Lburp/Ztwv;
    //   64: aload_0
    //   65: getfield ZH : Lburp/Zskl;
    //   68: invokespecial <init> : (Lburp/Ztef;Lburp/Zbnt;Lburp/Zvo0;Lburp/Zskh;Lburp/Zz28;Lburp/Ztwv;Lburp/Zskl;)V
    //   71: astore #5
    //   73: aload_0
    //   74: getfield ZJ : Lburp/Zt4u;
    //   77: invokevirtual ZN : ()Lburp/Zzir;
    //   80: invokeinterface Zv9 : ()Lburp/Zz4b;
    //   85: astore #6
    //   87: new burp/Zbhz
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: astore #7
    //   96: aload_0
    //   97: new burp/Zlfb
    //   100: dup
    //   101: aload_2
    //   102: aload #5
    //   104: aload #6
    //   106: aload_1
    //   107: aload_3
    //   108: aload #7
    //   110: aload_0
    //   111: getfield Zy : Lburp/Zrag;
    //   114: aload_0
    //   115: getfield ZA : Lburp/Zzkr;
    //   118: aload_0
    //   119: getfield Ze : Lburp/Zbiv;
    //   122: aload_0
    //   123: getfield Zp : Lburp/Ztwv;
    //   126: invokespecial <init> : (Lburp/Zg4s;Lburp/Zt57;Lburp/Zz4b;Lburp/Ze00;Lburp/Ztef;Lburp/Zbhz;Lburp/Zrag;Lburp/Zzkr;Lburp/Zbiv;Lburp/Ztwv;)V
    //   129: putfield ZN : Lburp/Zlfb;
    //   132: aload_1
    //   133: aload_0
    //   134: getfield ZN : Lburp/Zlfb;
    //   137: invokevirtual Zr : (Lburp/Zlfb;)V
    //   140: aload_3
    //   141: invokevirtual ZG : ()V
    //   144: new burp/Zbhq
    //   147: dup
    //   148: aload_0
    //   149: getfield ZN : Lburp/Zlfb;
    //   152: dup
    //   153: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   156: pop
    //   157: <illegal opcode> run : (Lburp/Zlfb;)Ljava/lang/Runnable;
    //   162: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   165: astore #8
    //   167: aload #4
    //   169: getstatic burp/Zt11.Zm : Lburp/Zlnb;
    //   172: aload_0
    //   173: aload #8
    //   175: <illegal opcode> accept : (Lburp/Zkrj;Lburp/Zbhq;)Ljava/util/function/Consumer;
    //   180: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   185: pop
    //   186: aload #4
    //   188: getstatic burp/Zt11.ZW : Lburp/Zlnb;
    //   191: aload_0
    //   192: aload #8
    //   194: <illegal opcode> accept : (Lburp/Zkrj;Lburp/Zbhq;)Ljava/util/function/Consumer;
    //   199: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   204: pop
    //   205: new burp/Zbh6
    //   208: dup
    //   209: aload_1
    //   210: aload #7
    //   212: aload #8
    //   214: aload_0
    //   215: getfield ZS : Lburp/Zt8u;
    //   218: invokespecial <init> : (Lburp/Zbhi;Lburp/Zbhz;Lburp/Zbhq;Lburp/Zt8u;)V
    //   221: areturn
  }
  
  public void ZYO() {}
  
  public void Zd(Zmf_ paramZmf_) {}
  
  public void Zl(Zg4j paramZg4j) {}
  
  public void ZI(Ztj1 paramZtj1, Zgna paramZgna, Zskh paramZskh, Zrbm paramZrbm, Zg09 paramZg09, Zkg9 paramZkg9, Supplier<Zbs1> paramSupplier, Zlli<Zt1x> paramZlli, Zl2h paramZl2h, Zlli<Zt10> paramZlli1, boolean paramBoolean) {
    if (this.ZN != null)
      this.ZN.ZI(paramZtj1, paramZgna, paramZskh, paramZrbm, paramZg09, paramZkg9, paramSupplier, paramZlli, paramZl2h, paramZlli1, paramBoolean); 
  }
  
  private void Zw(Ztj1 paramZtj1) {
    String str = Zbhz.ZK();
    if (paramZtj1.Zh() == ZF1()) {
      ZA(-1);
      if (str == null) {
        if (paramZtj1.Zh() == ZFo())
          ZL(-1); 
        return;
      } 
      return;
    } 
    if (paramZtj1.Zh() == ZFo())
      ZL(-1); 
  }
  
  public void ZH(Zz4b paramZz4b, Ztg8 paramZtg8, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    String str = Zbhz.ZK();
    if (!paramZlc8.Zq(paramFloat1, a(-24296, -3910)))
      return; 
    Zx0z zx0z = new Zx0z(this.ZA, this.ZJ.ZN().Zv9(), paramZtg8);
    Ztor ztor = zx0z.Zr(paramZz4b.ZVq());
    Objects.requireNonNull(paramZtg8);
    List list = paramZz4b.ZV_().stream().filter(ZC).filter(ZT(paramZz4b)).map(paramZtg8::Zw).sorted(Comparator.comparingInt(Zgna::ZPo)).toList();
    Objects.requireNonNull(paramZtg8);
    List<Zb2e> list1 = (List)paramZz4b.ZVQ().stream().map(paramZtg8::Zw).collect(Collectors.toList());
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (Zgna zgna : list) {
      int i = this.ZZ.ZL();
      hashMap.put(Integer.valueOf(zgna.ZPo()), Integer.valueOf(i));
      zgna.Zzv(i);
      zgna.ZzT(ztor.Zh(zgna.ZPm()));
      paramFloat1 += paramFloat2;
      if (!paramZlc8.Zq(paramFloat1, a(-24295, -29742)) || str == null)
        break; 
    } 
    this.Zv.Zt(((Integer)hashMap.getOrDefault(Integer.valueOf(paramZz4b.ZVO()), Integer.valueOf(this.Zv.ZVO()))).intValue());
    this.Zv.Zy(((Integer)hashMap.getOrDefault(Integer.valueOf(paramZz4b.ZV7()), Integer.valueOf(this.Zv.ZV7()))).intValue());
    if (!list1.isEmpty()) {
      int i;
      int j;
      synchronized (this.Za) {
        i = this.Za.size();
        j = i;
        for (Zb2e zb2e : list1) {
          int k = zb2e.ZBG();
          zb2e.Zoy(((Integer)hashMap.getOrDefault(Integer.valueOf(k), Integer.valueOf(k))).intValue());
          zb2e.ZoF(j++);
          this.Za.add(zb2e);
          paramFloat1 += paramFloat2;
          if (!paramZlc8.Zq(paramFloat1, a(-24295, -29742)) || str == null)
            break; 
        } 
      } 
      this.Zx.Za(list1, i, j - 1);
    } 
    list.forEach(this::lambda$importData$5);
  }
  
  private Predicate<Zgna> ZT(Zz4b paramZz4b) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zz4b;
    //   4: invokeinterface ZVO : ()I
    //   9: iconst_m1
    //   10: if_icmpne -> 27
    //   13: aload_1
    //   14: invokeinterface ZVO : ()I
    //   19: iconst_m1
    //   20: if_icmpeq -> 27
    //   23: iconst_1
    //   24: goto -> 28
    //   27: iconst_0
    //   28: istore_2
    //   29: aload_0
    //   30: getfield Zv : Lburp/Zz4b;
    //   33: invokeinterface ZV7 : ()I
    //   38: iconst_m1
    //   39: if_icmpne -> 56
    //   42: aload_1
    //   43: invokeinterface ZV7 : ()I
    //   48: iconst_m1
    //   49: if_icmpeq -> 56
    //   52: iconst_1
    //   53: goto -> 57
    //   56: iconst_0
    //   57: istore_3
    //   58: aload_1
    //   59: iload_2
    //   60: iload_3
    //   61: <illegal opcode> test : (Lburp/Zz4b;ZZ)Ljava/util/function/Predicate;
    //   66: areturn
  }
  
  public Zs0g ZFR() {
    return this.Zj;
  }
  
  public void ZV(Component paramComponent) {
    this.ZN.Zr(paramComponent);
  }
  
  public Zlfb ZFw() {
    return this.ZN;
  }
  
  private void ZFn() {
    String str = Zbhz.ZK();
    for (Zek3 zek3 : this.Za) {
      byte b = zek3.ZaP();
      if (b != Zmtd.NONE.index)
        Zm2.Zi(Zv8r.SCANNER_ISSUE_ACTIVITY_HIGHLIGHT, b); 
      if (str == null)
        break; 
    } 
  }
  
  private static boolean lambda$instantScanTasksFilter$6(Zz4b paramZz4b, boolean paramBoolean1, boolean paramBoolean2, Zgna paramZgna) {
    return ((paramZgna.ZPo() != paramZz4b.ZVO() || paramBoolean1) && (paramZgna.ZPo() != paramZz4b.ZV7() || paramBoolean2));
  }
  
  private void lambda$importData$5(Zgna paramZgna) {
    this.Ze.ZW().Zc(this, paramZgna);
  }
  
  private void lambda$buildDashboardPanel$4(Zbhq paramZbhq, Zxr8 paramZxr8) {
    paramZbhq.Z_();
    this.ZN.Zr();
  }
  
  private void lambda$buildDashboardPanel$3(Zbhq paramZbhq, Zxr8 paramZxr8) {
    paramZbhq.ZZ();
    this.ZN.ZL();
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zw);
  }
  
  private Zx8n lambda$new$1() {
    return this;
  }
  
  private static boolean lambda$static$0(Zgna paramZgna) {
    return !Zc.contains(paramZgna.ZNs());
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '²ÐqTú®,îú=\\tí}j'¥\\t¤¾'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #67
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
    //   69: putstatic burp/Zkrj.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zkrj.b : [Ljava/lang/String;
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
    //   152: bipush #74
    //   154: goto -> 184
    //   157: bipush #81
    //   159: goto -> 184
    //   162: bipush #29
    //   164: goto -> 184
    //   167: bipush #46
    //   169: goto -> 184
    //   172: bipush #127
    //   174: goto -> 184
    //   177: bipush #12
    //   179: goto -> 184
    //   182: bipush #102
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
    //   227: iconst_4
    //   228: anewarray burp/Zkcl
    //   231: dup
    //   232: iconst_0
    //   233: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   236: aastore
    //   237: dup
    //   238: iconst_1
    //   239: getstatic burp/Zkcl.LIVE_PASSIVE_CRAWL : Lburp/Zkcl;
    //   242: aastore
    //   243: dup
    //   244: iconst_2
    //   245: getstatic burp/Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT : Lburp/Zkcl;
    //   248: aastore
    //   249: dup
    //   250: iconst_3
    //   251: getstatic burp/Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT : Lburp/Zkcl;
    //   254: aastore
    //   255: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   258: putstatic burp/Zkrj.Zc : Ljava/util/List;
    //   261: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   266: putstatic burp/Zkrj.ZC : Ljava/util/function/Predicate;
    //   269: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA119) & 0xFFFF;
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
      byte b1 = 36;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */