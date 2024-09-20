package burp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzg3 {
  private final Zzu5 Zj;
  
  private final Zgvn Zr;
  
  private final Zz_r ZH;
  
  private final Map<Zeav, Ztbg> ZD;
  
  private final Zz1h ZI;
  
  private final List<Zgl9> Zn;
  
  Zzg3(Zzu5 paramZzu5, Zgvn paramZgvn, List<Zgl9> paramList, Zz_r paramZz_r, Zz1h paramZz1h) {
    this.Zj = paramZzu5;
    this.Zr = paramZgvn;
    this.Zn = paramList;
    this.ZH = paramZz_r;
    this.ZI = paramZz1h;
    this.ZD = new HashMap<>();
  }
  
  Ze1 Z_(int paramInt, Collection<Zrdb> paramCollection, boolean paramBoolean) {
    return ZM(paramInt, paramCollection, paramBoolean, true);
  }
  
  public Ze1 ZM(int paramInt, Collection<Zrdb> paramCollection, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/util/Collection;)V
    //   8: astore #6
    //   10: invokestatic ZF : ()[I
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: aload_2
    //   18: invokespecial <init> : (Ljava/util/Collection;)V
    //   21: astore #7
    //   23: astore #5
    //   25: iload #4
    //   27: ifeq -> 237
    //   30: aload #6
    //   32: invokeinterface size : ()I
    //   37: iconst_1
    //   38: isub
    //   39: istore #8
    //   41: iload #8
    //   43: iflt -> 234
    //   46: aload #6
    //   48: iload #8
    //   50: invokeinterface get : (I)Ljava/lang/Object;
    //   55: checkcast burp/Zrdb
    //   58: astore #9
    //   60: aload #9
    //   62: invokeinterface Za6 : ()Lburp/Zvs;
    //   67: getstatic burp/Zzu2.EXTENSION_GENERATED : Lburp/Zzu2;
    //   70: if_acmpne -> 76
    //   73: goto -> 226
    //   76: iload #8
    //   78: istore #10
    //   80: iload #10
    //   82: iflt -> 226
    //   85: aload #6
    //   87: iload #10
    //   89: invokeinterface get : (I)Ljava/lang/Object;
    //   94: checkcast burp/Zrdb
    //   97: astore #11
    //   99: aload #9
    //   101: aload #11
    //   103: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   108: ifeq -> 114
    //   111: goto -> 218
    //   114: aload #9
    //   116: aload #11
    //   118: aload_0
    //   119: getfield Zr : Lburp/Zgvn;
    //   122: aload_0
    //   123: getfield ZI : Lburp/Zz1h;
    //   126: invokeinterface Zi : (Lburp/Zrdb;Lburp/Zgvn;Lburp/Zz1h;)Lburp/Zl4m;
    //   131: astore #12
    //   133: getstatic burp/Zlzc.ZY : [I
    //   136: aload #12
    //   138: getfield ZS : Lburp/Zzp1;
    //   141: invokevirtual ordinal : ()I
    //   144: iaload
    //   145: tableswitch default -> 211, 1 -> 176, 2 -> 176, 3 -> 191, 4 -> 196
    //   176: aload #7
    //   178: aload #11
    //   180: invokeinterface remove : (Ljava/lang/Object;)Z
    //   185: pop
    //   186: aload #5
    //   188: ifnull -> 218
    //   191: aload #5
    //   193: ifnull -> 218
    //   196: aload #7
    //   198: aload #9
    //   200: invokeinterface remove : (Ljava/lang/Object;)Z
    //   205: pop
    //   206: aload #5
    //   208: ifnull -> 218
    //   211: iconst_0
    //   212: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   215: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   218: iinc #10, -1
    //   221: aload #5
    //   223: ifnull -> 80
    //   226: iinc #8, -1
    //   229: aload #5
    //   231: ifnull -> 41
    //   234: aload #7
    //   236: astore_2
    //   237: new burp/Zk5n
    //   240: dup
    //   241: invokespecial <init> : ()V
    //   244: astore #8
    //   246: aload_2
    //   247: invokeinterface iterator : ()Ljava/util/Iterator;
    //   252: astore #9
    //   254: aload #9
    //   256: invokeinterface hasNext : ()Z
    //   261: ifeq -> 417
    //   264: aload #9
    //   266: invokeinterface next : ()Ljava/lang/Object;
    //   271: checkcast burp/Zrdb
    //   274: astore #10
    //   276: aload #10
    //   278: ifnonnull -> 293
    //   281: iconst_0
    //   282: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   285: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   288: aload #5
    //   290: ifnull -> 254
    //   293: aload #10
    //   295: invokeinterface Zak : ()B
    //   300: ifeq -> 307
    //   303: iconst_1
    //   304: goto -> 308
    //   307: iconst_0
    //   308: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   311: lconst_1
    //   312: aload #10
    //   314: invokeinterface Za6 : ()Lburp/Zvs;
    //   319: invokeinterface toString : ()Ljava/lang/String;
    //   324: invokestatic ZY : (ZLnet/portswigger/Zqf;JLjava/lang/String;)V
    //   327: aload #10
    //   329: invokeinterface Zaw : ()B
    //   334: ifeq -> 341
    //   337: iconst_1
    //   338: goto -> 342
    //   341: iconst_0
    //   342: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   345: ldc2_w 2
    //   348: aload #10
    //   350: invokeinterface Za6 : ()Lburp/Zvs;
    //   355: invokeinterface toString : ()Ljava/lang/String;
    //   360: invokestatic ZY : (ZLnet/portswigger/Zqf;JLjava/lang/String;)V
    //   363: aload_0
    //   364: getfield Zj : Lburp/Zzu5;
    //   367: aload #10
    //   369: invokeinterface Zh : (Lburp/Zrdb;)Lburp/Zeav;
    //   374: astore #11
    //   376: aload_0
    //   377: getfield ZD : Ljava/util/Map;
    //   380: aload #11
    //   382: aload_0
    //   383: <illegal opcode> apply : (Lburp/Zzg3;)Ljava/util/function/Function;
    //   388: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   393: checkcast burp/Ztbg
    //   396: astore #12
    //   398: aload_0
    //   399: iload_1
    //   400: aload #11
    //   402: aload #10
    //   404: aload #12
    //   406: iload_3
    //   407: aload #8
    //   409: invokevirtual Zx : (ILburp/Zeav;Lburp/Zrdb;Lburp/Ztbg;ZLburp/Zk5n;)V
    //   412: aload #5
    //   414: ifnull -> 254
    //   417: aload_0
    //   418: invokevirtual Zp : ()V
    //   421: new burp/Ze1
    //   424: dup
    //   425: aload #8
    //   427: invokevirtual ZB : ()Lburp/Zky4;
    //   430: aload_0
    //   431: getfield ZD : Ljava/util/Map;
    //   434: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   437: invokespecial <init> : (Lburp/Zky4;Ljava/util/Map;)V
    //   440: areturn
  }
  
  private void Zx(int paramInt, Zeav paramZeav, Zrdb paramZrdb, Ztbg paramZtbg, boolean paramBoolean, Zk5n paramZk5n) {
    Zuh.Zb(paramZeav.Zw(), Zqf.Zr);
    Ztbg ztbg = new Ztbg(this.ZI);
    int[] arrayOfInt = Zl9l.ZF();
    boolean bool = false;
    Iterator<Zrdb> iterator = paramZeav.Zf().iterator();
    while (!bool && iterator.hasNext()) {
      Zrdb zrdb = iterator.next();
      byte b = zrdb.Zaw();
      Zl4m zl4m = zrdb.Zi(paramZrdb, this.Zr, this.ZI);
      switch (Zlzc.ZY[zl4m.ZS.ordinal()]) {
        case 2:
          bool = true;
        case 4:
          paramZk5n.Zg(b);
          paramZk5n.Zs(paramZrdb.Zaw());
          ztbg.Zp(paramZrdb);
          ztbg.ZY(zrdb);
          bool = true;
        case 1:
          switch (Zlzc.ZU[zl4m.ZA.ordinal()]) {
            case 1:
              ztbg.ZW(zrdb);
            case 2:
              ztbg.ZL(zrdb);
            case 3:
              ztbg.ZU(zrdb);
            case 4:
              ztbg.Zs(zrdb);
              break;
          } 
          paramZk5n.Zg(b);
          paramZk5n.Zs(zrdb.Zaw());
          bool = true;
          break;
      } 
      continue;
      if (arrayOfInt != null)
        break; 
    } 
    if (!bool) {
      ztbg.Zp(paramZrdb);
      paramZk5n.Zs(paramZrdb.Zaw());
      if (paramBoolean)
        Ze(paramZrdb); 
    } 
    paramZtbg.Zv(ztbg);
    for (Zrdb zrdb : paramZtbg.Zq()) {
      this.Zj.ZW(zrdb);
      if (arrayOfInt != null)
        break; 
    } 
    if (paramBoolean)
      for (Zgl9 zgl9 : this.Zn) {
        zgl9.Zp(paramInt, ztbg);
        if (arrayOfInt != null)
          break; 
      }  
  }
  
  private void Ze(Zrdb paramZrdb) {
    paramZrdb.Za7().Zj(this::lambda$notifyNewIssueListeners$1);
    if (this.Zr != null)
      this.Zr.Zs(paramZrdb); 
  }
  
  private void Zp() {
    int[] arrayOfInt = Zl9l.ZF();
    for (Map.Entry<Zeav, Ztbg> entry : this.ZD.entrySet()) {
      Zeav zeav = (Zeav)entry.getKey();
      Ztbg ztbg = (Ztbg)entry.getValue();
      this.Zj.ZM(zeav, ztbg);
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private void lambda$notifyNewIssueListeners$1(Zgkc paramZgkc) {
    paramZgkc.Zi(this.ZH);
  }
  
  private Ztbg lambda$consolidateIssues$0(Zeav paramZeav) {
    return new Ztbg(this.ZI);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzg3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */