package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zlfp {
  private final Zkq4 Zy;
  
  private final Zlba Zn;
  
  private final Zkl6 Zw;
  
  private final Zmz6 Zo;
  
  private final Zr_4 ZC;
  
  private final Zesv ZB;
  
  private final Ztz_ ZA;
  
  private final Zsy Ze;
  
  private final Zly1 ZZ;
  
  private final Zz1i Zg;
  
  private final Zbjl Zx;
  
  private final Zsj4 ZQ = new Zsj4();
  
  private final Zg6r ZH;
  
  public Zlfp(Zkq4 paramZkq4, Zlba paramZlba, Zkl6 paramZkl6, Zmz6 paramZmz6, Zr_4 paramZr_4, Zesv paramZesv, List<Zg_8> paramList, Ztz_ paramZtz_, Zsy paramZsy, Zly1 paramZly1, Zz1i paramZz1i, Zbjl paramZbjl, boolean paramBoolean, Zz1m<Zt1o> paramZz1m) {
    this.Zy = paramZkq4;
    this.Zn = paramZlba;
    this.Zw = paramZkl6;
    this.Zo = paramZmz6;
    this.ZC = paramZr_4;
    this.ZB = paramZesv;
    this.ZA = paramZtz_;
    this.Ze = paramZsy;
    this.ZZ = paramZly1;
    this.Zg = paramZz1i;
    this.Zx = paramZbjl;
    this.ZH = new Zg6r(paramZkl6.ZB(), paramZkl6.ZH(), paramZkq4, paramList, paramBoolean, paramZz1m);
  }
  
  public void ZL(int paramInt, Zbt paramZbt) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #4
    //   17: aload_2
    //   18: aload_0
    //   19: aload_2
    //   20: aload_3
    //   21: aload #4
    //   23: <illegal opcode> accept : (Lburp/Zlfp;Lburp/Zbt;Ljava/util/Map;Ljava/util/List;)Ljava/util/function/Consumer;
    //   28: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   31: aload_0
    //   32: iload_1
    //   33: aload_0
    //   34: getfield ZQ : Lburp/Zsj4;
    //   37: aload_3
    //   38: invokevirtual ZW : (Ljava/util/Map;)Ljava/util/Map;
    //   41: aload #4
    //   43: invokevirtual Zu : (ILjava/util/Map;Ljava/util/List;)V
    //   46: return
  }
  
  private void Zk(Zer0 paramZer0, Zbt paramZbt, Map<Integer, List<Zmaj>> paramMap, List<Zbza> paramList) {
    Ztt6 ztt6 = (new Zrh3(paramZer0.Zi())).Zd();
    if (ztt6 == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    int i = ztt6.ZK();
    Zbza zbza = this.Zn.ZW(i);
    if (zbza == null)
      return; 
    if (i == zbza.Zgv() && this.ZH.ZU(zbza.Zg6())) {
      if (!this.ZQ.ZH(paramZer0)) {
        Zt(paramMap, paramZer0, ztt6);
        if (!paramList.contains(zbza))
          paramList.add(zbza); 
      } 
      paramZbt.ZX(Collections.singleton(paramZer0.Zx()), i);
    } 
  }
  
  private void Zt(Map<Integer, List<Zmaj>> paramMap, Zer0 paramZer0, Ztt6 paramZtt6) {
    paramMap.computeIfAbsent(Integer.valueOf(paramZtt6.ZK()), Zlfp::lambda$addInteraction$1);
    ((List<Zmaj>)paramMap.get(Integer.valueOf(paramZtt6.ZK()))).add(new Zmaj(paramZer0, paramZtt6));
  }
  
  private void Zu(int paramInt, Map<Integer, List<Zmaj>> paramMap, List<Zbza> paramList) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore #4
    //   5: aload_2
    //   6: invokeinterface entrySet : ()Ljava/util/Set;
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore #5
    //   18: aload #5
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 363
    //   28: aload #5
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast java/util/Map$Entry
    //   38: astore #6
    //   40: aload_0
    //   41: getfield ZH : Lburp/Zg6r;
    //   44: aload #6
    //   46: invokeinterface getKey : ()Ljava/lang/Object;
    //   51: checkcast java/lang/Integer
    //   54: aload_3
    //   55: invokevirtual ZI : (Ljava/lang/Integer;Ljava/util/List;)Lburp/Zbza;
    //   58: astore #7
    //   60: aload #7
    //   62: ifnonnull -> 77
    //   65: iconst_0
    //   66: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   69: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   72: iload #4
    //   74: ifne -> 18
    //   77: aload_0
    //   78: getfield ZH : Lburp/Zg6r;
    //   81: aload #7
    //   83: invokevirtual ZV : (Lburp/Zbza;)Lburp/Ze3n;
    //   86: astore #8
    //   88: new burp/Zb9e
    //   91: dup
    //   92: aload #8
    //   94: aload_0
    //   95: getfield Zw : Lburp/Zkl6;
    //   98: iload_1
    //   99: aload_0
    //   100: getfield Zx : Lburp/Zbjl;
    //   103: aload_0
    //   104: getfield Zy : Lburp/Zkq4;
    //   107: aload_0
    //   108: getfield Ze : Lnet/portswigger/Zsy;
    //   111: aload_0
    //   112: getfield Zg : Lburp/Zz1i;
    //   115: aload_0
    //   116: getfield Zw : Lburp/Zkl6;
    //   119: invokeinterface ZH : ()Lburp/Zey9;
    //   124: invokespecial <init> : (Lburp/Ze3n;Lburp/Zkl6;ILburp/Zbjl;Lburp/Zkq4;Lnet/portswigger/Zsy;Lburp/Zz1i;Lburp/Zey9;)V
    //   127: astore #9
    //   129: new burp/Zrgx
    //   132: dup
    //   133: aload_0
    //   134: getfield Zy : Lburp/Zkq4;
    //   137: aload_0
    //   138: getfield ZB : Lburp/Zesv;
    //   141: aload_0
    //   142: getfield Zw : Lburp/Zkl6;
    //   145: iload_1
    //   146: aload #8
    //   148: aload #9
    //   150: aload_0
    //   151: getfield Zx : Lburp/Zbjl;
    //   154: aload_0
    //   155: getfield ZC : Lburp/Zr_4;
    //   158: aload_0
    //   159: getfield Ze : Lnet/portswigger/Zsy;
    //   162: aload_0
    //   163: getfield Zg : Lburp/Zz1i;
    //   166: invokespecial <init> : (Lburp/Zkq4;Lburp/Zesv;Lburp/Zkl6;ILburp/Ze3n;Lburp/Zb9e;Lburp/Zbjl;Lburp/Zr_4;Lnet/portswigger/Zsy;Lburp/Zz1i;)V
    //   169: invokevirtual ZL : ()Ljava/util/List;
    //   172: astore #10
    //   174: aload #6
    //   176: invokeinterface getValue : ()Ljava/lang/Object;
    //   181: checkcast java/util/List
    //   184: invokeinterface iterator : ()Ljava/util/Iterator;
    //   189: astore #11
    //   191: aload #11
    //   193: invokeinterface hasNext : ()Z
    //   198: ifeq -> 289
    //   201: aload #11
    //   203: invokeinterface next : ()Ljava/lang/Object;
    //   208: checkcast burp/Zmaj
    //   211: astore #12
    //   213: aload #10
    //   215: invokeinterface iterator : ()Ljava/util/Iterator;
    //   220: astore #13
    //   222: aload #13
    //   224: invokeinterface hasNext : ()Z
    //   229: ifeq -> 284
    //   232: aload #13
    //   234: invokeinterface next : ()Ljava/lang/Object;
    //   239: checkcast burp/Zp
    //   242: astore #14
    //   244: aload #12
    //   246: getfield ZO : Lburp/Zer0;
    //   249: invokeinterface ZO : ()I
    //   254: iconst_1
    //   255: if_icmpne -> 279
    //   258: aload #14
    //   260: aload #12
    //   262: invokeinterface ZD : (Lburp/Zmaj;)Z
    //   267: ifeq -> 279
    //   270: aload #14
    //   272: aload #12
    //   274: invokeinterface ZF : (Lburp/Zmaj;)V
    //   279: iload #4
    //   281: ifne -> 222
    //   284: iload #4
    //   286: ifne -> 191
    //   289: aload #10
    //   291: invokeinterface iterator : ()Ljava/util/Iterator;
    //   296: astore #11
    //   298: aload #11
    //   300: invokeinterface hasNext : ()Z
    //   305: ifeq -> 347
    //   308: aload #11
    //   310: invokeinterface next : ()Ljava/lang/Object;
    //   315: checkcast burp/Zp
    //   318: astore #12
    //   320: aload #12
    //   322: aload_0
    //   323: getfield Zo : Lburp/Zmz6;
    //   326: aload_0
    //   327: getfield ZZ : Lburp/Zly1;
    //   330: aload_0
    //   331: getfield ZA : Lburp/Ztz_;
    //   334: invokevirtual ZA : ()J
    //   337: invokeinterface ZW : (Lburp/Zmz6;Lburp/Zly1;J)V
    //   342: iload #4
    //   344: ifne -> 298
    //   347: aload_0
    //   348: iload_1
    //   349: aload #6
    //   351: aload #7
    //   353: aload #8
    //   355: invokevirtual ZZ : (ILjava/util/Map$Entry;Lburp/Zbza;Lburp/Ze3n;)V
    //   358: iload #4
    //   360: ifne -> 18
    //   363: return
  }
  
  private void ZZ(int paramInt, Map.Entry<Integer, List<Zmaj>> paramEntry, Zbza paramZbza, Ze3n paramZe3n) {
    List<Zer0> list = Zn(paramEntry);
    Zb9e zb9e = new Zb9e(paramZe3n, this.Zw, paramInt, this.Zx, this.Zy, this.Ze, this.Zg, this.Zw.ZH());
    Zliw zliw = new Zliw(this.Zo, this.ZC, this.ZA.ZA(), paramZbza.Zg5(), this.Zw.ZB(), paramZe3n, this.ZZ);
    (new Zgk3(this.Zy, paramZe3n, zb9e, zliw)).ZZ(list);
  }
  
  private List<Zer0> Zn(Map.Entry<Integer, List<Zmaj>> paramEntry) {
    ArrayList<Zer0> arrayList = new ArrayList();
    Iterator<Zmaj> iterator = ((List)paramEntry.getValue()).iterator();
    int i = Zlp9.Zr();
    while (iterator.hasNext()) {
      Zmaj zmaj = iterator.next();
      if (zmaj.ZO.ZO() == 2)
        arrayList.add(zmaj.ZO); 
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  private static List lambda$addInteraction$1(Integer paramInteger) {
    return new ArrayList();
  }
  
  private void lambda$report$0(Zbt paramZbt, Map<Integer, List<Zmaj>> paramMap, List<Zbza> paramList, Zer0 paramZer0) {
    Zk(paramZer0, paramZbt, paramMap, paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlfp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */