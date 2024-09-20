package burp;

import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztwt {
  private final Zez3 Zq;
  
  private final List<Zez3> ZY;
  
  private final List<Zxkf> ZN;
  
  private final Zbnt Zw;
  
  private final Map<String, List<Zxkf>> Zj;
  
  private final Set<String> Zf;
  
  private int Zb;
  
  private static int Zk;
  
  public Ztwt(Zez3 paramZez3, List<Zez3> paramList, List<Zxkf> paramList1, Zbnt paramZbnt, Map<String, List<Zxkf>> paramMap, Set<String> paramSet) {
    this.Zq = paramZez3;
    this.ZY = paramList;
    this.ZN = paramList1;
    this.Zw = paramZbnt;
    this.Zj = paramMap;
    int i = Zn();
    this.Zf = paramSet;
    if (Zbqc.Zwu() == null)
      ZL(++i); 
  }
  
  public int ZD() {
    try {
      Zebn zebn = new Zebn(this);
      this.Zq.Zk(zebn);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return this.Zb;
  }
  
  private void ZG(Zez3 paramZez3) {
    if (paramZez3.ZkP() > 0) {
      Zl90 zl90 = new Zl90(this);
      paramZez3.ZK(zl90);
    } 
  }
  
  private void Za(Zmxt paramZmxt) {
    int i = Z_();
    switch (paramZmxt.Zqf().Z_F()) {
      case 258:
      case 259:
      case 512:
      case 513:
      case 514:
      case 515:
      case 516:
      case 517:
      case 768:
      case 769:
      case 1026:
      case 1536:
      case 1537:
        if (i == 0);
        return;
      case 0:
      case 1:
      case 2:
      case 256:
      case 257:
      case 260:
      case 261:
      case 262:
      case 1025:
      case 1280:
        this.ZY.add(paramZmxt);
        if (i == 0)
          break; 
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, paramZmxt.Zqf().Z_F());
    this.ZY.add(paramZmxt);
  }
  
  private void Zz(Zmxt paramZmxt) {
    Zxkf zxkf = new Zxkf(paramZmxt);
    this.ZN.add(zxkf);
    Zl94 zl94 = new Zl94(this, zxkf);
    paramZmxt.ZK(zl94);
    zxkf.ZF = zxkf.ZE.size();
  }
  
  private void Zd(Zg6u paramZg6u, Zxkf paramZxkf) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: aload_1
    //   6: invokevirtual Zh : (Lburp/Zg6u;)V
    //   9: aload_1
    //   10: invokeinterface Zxo : ()Lburp/Zrf_;
    //   15: ifnull -> 51
    //   18: aload_1
    //   19: invokeinterface Zxo : ()Lburp/Zrf_;
    //   24: invokeinterface Z_O : ()Ljava/lang/String;
    //   29: ifnull -> 51
    //   32: aload_2
    //   33: getfield Zi : Ljava/util/TreeSet;
    //   36: aload_1
    //   37: invokeinterface Zxo : ()Lburp/Zrf_;
    //   42: invokeinterface Z_O : ()Ljava/lang/String;
    //   47: invokevirtual add : (Ljava/lang/Object;)Z
    //   50: pop
    //   51: aload_1
    //   52: invokeinterface Zos : ()Lburp/Zstu;
    //   57: astore #5
    //   59: aload #5
    //   61: ifnull -> 89
    //   64: aload_1
    //   65: invokeinterface Zod : ()Lburp/Zmzk;
    //   70: aload #5
    //   72: iconst_2
    //   73: aload_0
    //   74: getfield Zw : Lburp/Zbnt;
    //   77: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   80: getfield ZV : Ljava/util/List;
    //   83: astore #4
    //   85: iload_3
    //   86: ifeq -> 133
    //   89: aload_1
    //   90: invokeinterface ZlL : ()Lburp/Zlit;
    //   95: invokeinterface ZdC : ()[B
    //   100: astore #6
    //   102: aload #6
    //   104: ifnonnull -> 115
    //   107: iconst_0
    //   108: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   111: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   114: return
    //   115: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   118: aload #6
    //   120: iconst_0
    //   121: aload #6
    //   123: arraylength
    //   124: getstatic burp/Zsba.URL_ENCODED : Lburp/Zsba;
    //   127: aconst_null
    //   128: invokestatic Zm : (Lburp/Zrdu;[BIILburp/Zsba;Ljava/lang/String;)Ljava/util/List;
    //   131: astore #4
    //   133: aload #4
    //   135: invokeinterface iterator : ()Ljava/util/Iterator;
    //   140: astore #6
    //   142: aload #6
    //   144: invokeinterface hasNext : ()Z
    //   149: ifeq -> 340
    //   152: aload #6
    //   154: invokeinterface next : ()Ljava/lang/Object;
    //   159: checkcast burp/Zt8g
    //   162: astore #7
    //   164: getstatic burp/Ztkt.Zw : [I
    //   167: aload #7
    //   169: invokeinterface ZbQ : ()Lburp/Zrdu;
    //   174: invokevirtual ordinal : ()I
    //   177: iaload
    //   178: tableswitch default -> 336, 1 -> 208, 2 -> 208, 3 -> 208, 4 -> 208
    //   208: aload_2
    //   209: getfield ZE : Ljava/util/Map;
    //   212: aload #7
    //   214: invokeinterface Zns : ()Ljava/lang/String;
    //   219: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   224: ifne -> 336
    //   227: aload_2
    //   228: getfield ZE : Ljava/util/Map;
    //   231: aload #7
    //   233: invokeinterface Zns : ()Ljava/lang/String;
    //   238: aload #7
    //   240: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   245: pop
    //   246: aload_0
    //   247: dup
    //   248: getfield Zb : I
    //   251: iconst_1
    //   252: iadd
    //   253: putfield Zb : I
    //   256: aload_0
    //   257: getfield Zj : Ljava/util/Map;
    //   260: aload #7
    //   262: invokeinterface Zns : ()Ljava/lang/String;
    //   267: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   272: checkcast java/util/List
    //   275: astore #8
    //   277: aload #8
    //   279: ifnonnull -> 327
    //   282: new java/util/ArrayList
    //   285: dup
    //   286: invokespecial <init> : ()V
    //   289: astore #8
    //   291: aload_0
    //   292: getfield Zj : Ljava/util/Map;
    //   295: aload #7
    //   297: invokeinterface Zns : ()Ljava/lang/String;
    //   302: aload #8
    //   304: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   309: pop
    //   310: aload_0
    //   311: getfield Zf : Ljava/util/Set;
    //   314: aload #7
    //   316: invokeinterface Zns : ()Ljava/lang/String;
    //   321: invokeinterface add : (Ljava/lang/Object;)Z
    //   326: pop
    //   327: aload #8
    //   329: aload_2
    //   330: invokeinterface add : (Ljava/lang/Object;)Z
    //   335: pop
    //   336: iload_3
    //   337: ifeq -> 142
    //   340: return
  }
  
  public static void ZL(int paramInt) {
    Zk = paramInt;
  }
  
  public static int Zn() {
    return Zk;
  }
  
  public static int Z_() {
    int i = Zn();
    return (i == 0) ? 72 : 0;
  }
  
  static {
    if (Z_() == 0)
      ZL(32); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */