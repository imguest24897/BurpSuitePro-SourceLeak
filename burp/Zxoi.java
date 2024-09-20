package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxoi implements Zv8b, Zrae {
  private static final Zmln[] ZP;
  
  private static final Zmln[] Zk;
  
  private static final Zmln[] Zn;
  
  private static final Zmln[] Zj;
  
  private static final List<Zzua> Zz;
  
  private final Map<Zkcl, List<Zkbn>> ZH;
  
  private final Zs1n Zi;
  
  private final Zs4c Zb;
  
  private final Zz8a ZY;
  
  private final boolean ZM;
  
  private final boolean Zr;
  
  private Zkcl ZZ;
  
  private boolean Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxoi(Zs1n paramZs1n, Zs4c paramZs4c, Zz8a paramZz8a, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zi = paramZs1n;
    this.Zb = paramZs4c;
    this.ZY = paramZz8a;
    this.ZM = paramBoolean1;
    this.Zr = paramBoolean2;
    this.ZH = new HashMap<>();
    this.ZH.put(Zkcl.SCAN_CRAWL_AND_AUDIT, new ArrayList<>());
    this.ZH.put(Zkcl.SCAN_CRAWL, new ArrayList<>());
    this.ZH.put(Zkcl.SCAN_AUDIT, new ArrayList<>());
    int i = Zbiv.ZV();
    this.ZH.put(Zkcl.LIVE_AUDIT, new ArrayList<>());
    this.ZH.put(Zkcl.LIVE_PASSIVE_CRAWL, new ArrayList<>());
    this.ZH.put(Zkcl.API_AUDIT, new ArrayList<>());
    this.ZH.put(Zkcl.SOAP_API_AUDIT, new ArrayList<>());
    if (Zbqc.Zwu() == null)
      Zbiv.ZE(++i); 
  }
  
  public void Zr(Zkcl paramZkcl) {
    this.ZZ = paramZkcl;
    Zt(paramZkcl);
  }
  
  public void Zd() {
    this.Zi.Ze("");
    this.Zi.ZJ(this.ZH.get(this.ZZ));
  }
  
  public void Z_() {
    int i = Zbiv.Zd();
    this.Zi.Ze("");
    switch (Zgau.ZM[this.ZZ.ordinal()]) {
      case 1:
        this.Zi.Zq(new Zmln[] { Zmln.CRAWLING, Zmln.AUDITING });
        if (i != 0);
        return;
      case 2:
        this.Zi.ZV(Zmln.CRAWLING);
        if (i != 0);
        return;
      case 3:
      case 4:
      case 5:
      case 6:
        this.Zi.ZV(Zmln.AUDITING);
        if (i != 0);
        return;
      case 7:
        this.Zi.ZV(Zmln.LIVE_PASSIVE_CRAWLING);
        if (i != 0)
          break; 
        return;
    } 
    Zuh.Zb(false, Zqf.Zk);
  }
  
  public void ZQ(Zmln paramZmln) {
    this.Zi.Ze("");
    this.Zi.ZV(paramZmln);
  }
  
  public void Zx(Zkbn paramZkbn) {
    List<Zkbn> list = this.ZH.get(this.ZZ);
    int i = list.size();
    list.add(paramZkbn);
    this.Zi.ZB(paramZkbn, i);
    if (!paramZkbn.Ze())
      this.Ze = true; 
  }
  
  public void ZF(int paramInt) {
    this.Zi.Ze("");
    List<Zkbn> list = this.ZH.get(this.ZZ);
    if (paramInt <= 0 || paramInt > list.size() - 1)
      return; 
    Zkbn zkbn = list.get(paramInt - 1);
    list.set(paramInt - 1, list.get(paramInt));
    list.set(paramInt, zkbn);
    this.Zi.ZJ(list);
    this.Ze = true;
  }
  
  public void Zm(int paramInt) {
    this.Zi.Ze("");
    List<Zkbn> list = this.ZH.get(this.ZZ);
    if (paramInt < 0 || paramInt >= list.size() - 1)
      return; 
    Zkbn zkbn = list.get(paramInt + 1);
    list.set(paramInt + 1, list.get(paramInt));
    list.set(paramInt, zkbn);
    this.Zi.ZJ(list);
    this.Ze = true;
  }
  
  public void Zq(int paramInt) {
    this.Zi.Ze("");
    List<Zkbn> list = this.ZH.get(this.ZZ);
    if (paramInt < 0 || paramInt > list.size() - 1 || ((Zkbn)list.get(paramInt)).ZU())
      return; 
    this.Zi.Zv(paramInt);
  }
  
  public void Zw(int paramInt, String paramString, Zmf_ paramZmf_) {
    // Byte code:
    //   0: invokestatic Zd : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield ZH : Ljava/util/Map;
    //   9: aload_0
    //   10: getfield ZZ : Lburp/Zkcl;
    //   13: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   18: checkcast java/util/List
    //   21: astore #5
    //   23: iload_1
    //   24: iflt -> 40
    //   27: iload_1
    //   28: aload #5
    //   30: invokeinterface size : ()I
    //   35: iconst_1
    //   36: isub
    //   37: if_icmple -> 41
    //   40: return
    //   41: aload #5
    //   43: iload_1
    //   44: invokeinterface get : (I)Ljava/lang/Object;
    //   49: checkcast burp/Zkbn
    //   52: astore #6
    //   54: aload #6
    //   56: invokeinterface Ze : ()Z
    //   61: ifeq -> 98
    //   64: new burp/Zb8e
    //   67: dup
    //   68: aload_3
    //   69: aload #6
    //   71: invokeinterface Zw : ()Ljava/util/Set;
    //   76: iconst_0
    //   77: anewarray burp/Zmln
    //   80: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   85: checkcast [Lburp/Zmln;
    //   88: invokespecial <init> : (Lburp/Zmf_;[Lburp/Zmln;)V
    //   91: astore #7
    //   93: iload #4
    //   95: ifeq -> 174
    //   98: aload #6
    //   100: invokeinterface Zl : ()Z
    //   105: ifeq -> 143
    //   108: new burp/Zb8a
    //   111: dup
    //   112: aload_2
    //   113: aload_3
    //   114: aload #6
    //   116: invokeinterface Zw : ()Ljava/util/Set;
    //   121: iconst_0
    //   122: anewarray burp/Zmln
    //   125: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   130: checkcast [Lburp/Zmln;
    //   133: invokespecial <init> : (Ljava/lang/String;Lburp/Zmf_;[Lburp/Zmln;)V
    //   136: astore #7
    //   138: iload #4
    //   140: ifeq -> 174
    //   143: new burp/Zb8b
    //   146: dup
    //   147: aload_2
    //   148: iconst_0
    //   149: aload_3
    //   150: aload #6
    //   152: invokeinterface Zw : ()Ljava/util/Set;
    //   157: iconst_0
    //   158: anewarray burp/Zmln
    //   161: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   166: checkcast [Lburp/Zmln;
    //   169: invokespecial <init> : (Ljava/lang/String;ZLburp/Zmf_;[Lburp/Zmln;)V
    //   172: astore #7
    //   174: aload #5
    //   176: iload_1
    //   177: aload #7
    //   179: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: aload_0
    //   186: getfield Zi : Lburp/Zs1n;
    //   189: iload_1
    //   190: aload #7
    //   192: invokeinterface Zz : (ILburp/Zkbn;)V
    //   197: aload_0
    //   198: iconst_1
    //   199: putfield Ze : Z
    //   202: return
  }
  
  public void Zy(int[] paramArrayOfint) {
    this.Zi.Ze("");
    List<Zkbn> list = this.ZH.get(this.ZZ);
    ArrayList<Zkbn> arrayList = new ArrayList();
    int[] arrayOfInt = paramArrayOfint;
    int i = Zbiv.Zd();
    int j = arrayOfInt.length;
    byte b = 0;
    while (b < j) {
      int k = arrayOfInt[b];
      if (k >= 0 && k <= list.size() - 1)
        arrayList.add(list.get(k)); 
      b++;
      if (i != 0)
        break; 
    } 
    if (!arrayList.isEmpty()) {
      list.removeAll(arrayList);
      this.Zi.ZJ(list);
      this.Ze = true;
    } 
  }
  
  public void ZG() {
    this.Zi.Ze("");
    this.Zi.Zw(ZQ());
  }
  
  public void ZK(List<Zkbn> paramList) {
    List<Zkbn> list = this.ZH.get(this.ZZ);
    list.addAll(paramList);
    this.Zi.ZJ(list);
    this.Ze = true;
  }
  
  public void ZJ() {
    this.Zi.Ze("");
    this.Zi.Zt(ZQ());
  }
  
  private Zmln[] ZQ() {
    switch (Zgau.ZM[this.ZZ.ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      case 4:
      case 5:
      case 6:
      
      case 7:
      
    } 
    Zuh.ZT(false, Zqf.Zk, this.ZZ.name());
    return null;
  }
  
  public Zgyw ZH() {
    return new Zgyw(this.ZH.get(this.ZZ));
  }
  
  public boolean ZP() {
    return this.Ze;
  }
  
  public void Zp(Zk9f paramZk9f) {
    // Byte code:
    //   0: invokestatic ZV : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull -> 16
    //   8: iconst_0
    //   9: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   12: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   15: return
    //   16: aload_0
    //   17: getfield ZY : Lburp/Zz8a;
    //   20: ifnonnull -> 31
    //   23: iconst_0
    //   24: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   27: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   30: return
    //   31: aload_0
    //   32: getfield ZH : Ljava/util/Map;
    //   35: aload_0
    //   36: getfield ZZ : Lburp/Zkcl;
    //   39: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   44: checkcast java/util/List
    //   47: astore_3
    //   48: aload_3
    //   49: invokeinterface clear : ()V
    //   54: getstatic burp/Zgau.Zq : [I
    //   57: aload_1
    //   58: invokevirtual ordinal : ()I
    //   61: iaload
    //   62: tableswitch default -> 243, 1 -> 92, 2 -> 141, 3 -> 145, 4 -> 194
    //   92: aload_0
    //   93: getfield ZY : Lburp/Zz8a;
    //   96: sipush #-27955
    //   99: sipush #-20568
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokevirtual Zt : (Ljava/lang/String;)Ljava/util/Optional;
    //   108: astore #4
    //   110: aload #4
    //   112: invokevirtual isPresent : ()Z
    //   115: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   118: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   121: aload #4
    //   123: aload_3
    //   124: dup
    //   125: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   134: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   137: iload_2
    //   138: ifne -> 257
    //   141: iload_2
    //   142: ifne -> 257
    //   145: aload_0
    //   146: getfield ZY : Lburp/Zz8a;
    //   149: sipush #-27953
    //   152: sipush #18475
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual Zt : (Ljava/lang/String;)Ljava/util/Optional;
    //   161: astore #4
    //   163: aload #4
    //   165: invokevirtual isPresent : ()Z
    //   168: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   171: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   174: aload #4
    //   176: aload_3
    //   177: dup
    //   178: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   181: pop
    //   182: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   187: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   190: iload_2
    //   191: ifne -> 257
    //   194: aload_0
    //   195: getfield ZY : Lburp/Zz8a;
    //   198: sipush #-27956
    //   201: sipush #-28136
    //   204: invokestatic a : (II)Ljava/lang/String;
    //   207: invokevirtual Zt : (Ljava/lang/String;)Ljava/util/Optional;
    //   210: astore #4
    //   212: aload #4
    //   214: invokevirtual isPresent : ()Z
    //   217: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   220: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   223: aload #4
    //   225: aload_3
    //   226: dup
    //   227: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   230: pop
    //   231: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   236: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   239: iload_2
    //   240: ifne -> 257
    //   243: iconst_0
    //   244: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   247: aload_0
    //   248: getfield ZZ : Lburp/Zkcl;
    //   251: invokevirtual name : ()Ljava/lang/String;
    //   254: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   257: aload_0
    //   258: invokevirtual Zd : ()V
    //   261: return
  }
  
  public String ZC() {
    return (this.ZM && ZE()) ? a(-27954, -17399) : "";
  }
  
  private boolean ZE() {
    Zxz8 zxz8 = ZY(this.ZH.get(this.ZZ));
    return zxz8.ZmV() ? ZZ(zxz8) : Z_(zxz8);
  }
  
  public Zxz8 ZY(List<Zkbn> paramList) {
    Zxz8 zxz8 = (new Zruo()).<Zxz8>ZH(new Zz4z());
    zxz8.Zd(this.Zb.ZD(new String[] { a(-27958, -18631) }));
    Objects.requireNonNull(zxz8);
    paramList.stream().map(Zkbn::ZR).forEach(zxz8::Zd);
    return zxz8;
  }
  
  private boolean ZZ(Zxz8 paramZxz8) {
    Zzu2[] arrayOfZzu2 = Zzu2.values();
    int j = arrayOfZzu2.length;
    int i = Zbiv.ZV();
    byte b = 0;
    while (b < j) {
      Zzu2 zzu2 = arrayOfZzu2[b];
      Objects.requireNonNull(Zz);
      if (zzu2.ZD().stream().anyMatch(Zz::contains) && paramZxz8.ZE(zzu2))
        return true; 
      b++;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  private boolean Z_(Zxz8 paramZxz8) {
    return (paramZxz8.Zmw() || paramZxz8.ZmU() || paramZxz8.ZmH());
  }
  
  private void Zt(Zkcl paramZkcl) {
    int i = Zbiv.ZV();
    if (this.Zr && paramZkcl == Zkcl.SCAN_CRAWL_AND_AUDIT) {
      this.Zi.ZJ();
      if (i == 0) {
        this.Zi.ZT();
        return;
      } 
      return;
    } 
    this.Zi.ZT();
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÛxÙ@Ä´\\t³\þÊÔ?.?ek÷â£¡C+(;WNm$\UZæÃÈ³[$n7°?ªæç={æVÌÝ\\r°¢öP¤*\\blCÒ³¨6GEð2ñ"kEv<GÛ¥TXën¥ó@VWD'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #45
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #76
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
    //   67: ldc '°Ïp¶5ûâbÈ!Fÿ§¡DxÚ2í6»i`±¹\\bÃË·HÎácmô°'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #90
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
    //   128: putstatic burp/Zxoi.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zxoi.b : [Ljava/lang/String;
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
    //   212: bipush #107
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #23
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #84
    //   234: goto -> 244
    //   237: bipush #89
    //   239: goto -> 244
    //   242: bipush #70
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
    //   300: iconst_2
    //   301: anewarray burp/Zmln
    //   304: dup
    //   305: iconst_0
    //   306: getstatic burp/Zmln.CRAWLING : Lburp/Zmln;
    //   309: aastore
    //   310: dup
    //   311: iconst_1
    //   312: getstatic burp/Zmln.AUDITING : Lburp/Zmln;
    //   315: aastore
    //   316: putstatic burp/Zxoi.ZP : [Lburp/Zmln;
    //   319: iconst_1
    //   320: anewarray burp/Zmln
    //   323: dup
    //   324: iconst_0
    //   325: getstatic burp/Zmln.CRAWLING : Lburp/Zmln;
    //   328: aastore
    //   329: putstatic burp/Zxoi.Zk : [Lburp/Zmln;
    //   332: iconst_1
    //   333: anewarray burp/Zmln
    //   336: dup
    //   337: iconst_0
    //   338: getstatic burp/Zmln.AUDITING : Lburp/Zmln;
    //   341: aastore
    //   342: putstatic burp/Zxoi.Zn : [Lburp/Zmln;
    //   345: iconst_1
    //   346: anewarray burp/Zmln
    //   349: dup
    //   350: iconst_0
    //   351: getstatic burp/Zmln.LIVE_PASSIVE_CRAWLING : Lburp/Zmln;
    //   354: aastore
    //   355: putstatic burp/Zxoi.Zj : [Lburp/Zmln;
    //   358: getstatic burp/Zzua.ALL_ACTIVE_TYPES : [Lburp/Zzua;
    //   361: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   364: putstatic burp/Zxoi.Zz : Ljava/util/List;
    //   367: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF92CE) & 0xFFFF;
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
      char c = '£';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */