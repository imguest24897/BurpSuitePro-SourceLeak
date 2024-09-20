package burp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zst {
  private final Zg4y ZW;
  
  private final Collection<Zrp0> Zz;
  
  private final Zr47 ZX;
  
  private final Zxjt ZK;
  
  private final Zmv7 ZB;
  
  private final Zrk2 ZF;
  
  public Zst(Zg4y paramZg4y, Zlka paramZlka, Collection<Zrp0> paramCollection, Zr47 paramZr47, Zxjt paramZxjt, Zmv7 paramZmv7) {
    this.ZW = paramZg4y;
    this.Zz = paramCollection;
    this.ZX = paramZr47;
    this.ZK = paramZxjt;
    this.ZB = paramZmv7;
    this.ZF = new Zrk2(paramZg4y, paramZlka, paramZmv7);
  }
  
  public List<Ztc6> ZM(Ztsv paramZtsv, Zm8l paramZm8l, int paramInt) {
    return Zd(paramZtsv, paramZm8l, paramInt, false);
  }
  
  public List<Ztc6> Zt(Ztsv paramZtsv, Zm8l paramZm8l, int paramInt) {
    return Zd(paramZtsv, paramZm8l, paramInt, true);
  }
  
  private List<Ztc6> Zd(Ztsv paramZtsv, Zm8l paramZm8l, int paramInt, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = Ztc6.ZG();
    Zb01 zb01 = new Zb01();
    Zszw zszw = paramZtsv.ZMX() ? this.ZW.ZV9() : paramZtsv.ZMr();
    Zeu9 zeu9 = paramZtsv.ZMX() ? this.ZK : paramZtsv.ZMY();
    Zejm zejm = Zh(zeu9, zszw, paramZm8l, zb01);
    Queue queue = (Queue)zejm.ZYo().stream().map(zszw::lambda$findMatches$0).collect(Collectors.toCollection(LinkedList::new));
    LinkedList linkedList = new LinkedList();
    List<Ztc6> list = (List)zejm.ZYm().stream().map(zszw::lambda$findMatches$0).collect(Collectors.toList());
    if (paramBoolean && !list.isEmpty())
      return list; 
    byte b = 1;
    while (!queue.isEmpty() && b++ < paramInt) {
      for (Ztc6 ztc6 : queue) {
        Zxs9 zxs9 = ztc6.ZV();
        Zejm zejm1 = Zh(zxs9.ZXh(), zxs9.ZXq(), paramZm8l, zb01);
        Objects.requireNonNull(ztc6);
        Objects.requireNonNull(linkedList);
        zejm1.ZYo().stream().map(ztc6::ZZ).forEach(linkedList::add);
        Objects.requireNonNull(ztc6);
        Objects.requireNonNull(list);
        zejm1.ZYm().stream().map(ztc6::ZZ).forEach(list::add);
        if (arrayOfZbqc != null)
          break; 
      } 
      if (paramBoolean && !list.isEmpty()) {
        Zuh.Zb((list.stream().mapToInt(Ztc6::Zr).distinct().count() == 1L), Zqf.Zr);
        return list;
      } 
      queue.clear();
      queue.addAll(linkedList);
      linkedList.clear();
      if (arrayOfZbqc != null)
        break; 
    } 
    return list;
  }
  
  private Zejm Zh(Zeu9 paramZeu9, Zszw paramZszw, Zm8l paramZm8l, Zb01 paramZb01) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #6
    //   9: new java/util/ArrayList
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #7
    //   18: aload #4
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual ZD : (Lburp/Zeu9;Lburp/Zszw;)V
    //   25: invokestatic ZG : ()[Lburp/Zbqc;
    //   28: aload_1
    //   29: invokeinterface ZHV : ()Ljava/util/List;
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #8
    //   41: astore #5
    //   43: aload #8
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 255
    //   53: aload #8
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Zrp0
    //   63: astore #9
    //   65: aload_3
    //   66: aload #9
    //   68: aload_2
    //   69: invokeinterface ZS : (Lburp/Zrp0;Lburp/Zszw;)Z
    //   74: ifeq -> 135
    //   77: aload_0
    //   78: getfield ZX : Lburp/Zr47;
    //   81: aload #9
    //   83: invokeinterface ZE : (Lburp/Zrp0;)Lburp/Zlru;
    //   88: astore #10
    //   90: aload_0
    //   91: getfield ZW : Lburp/Zg4y;
    //   94: aload #9
    //   96: aload #10
    //   98: invokeinterface Zz : (Lburp/Zrp0;Lburp/Zlru;)Ljava/util/Optional;
    //   103: aload_2
    //   104: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   107: checkcast burp/Zszw
    //   110: astore #11
    //   112: aload #7
    //   114: new burp/Zxs9
    //   117: dup
    //   118: aconst_null
    //   119: aload #9
    //   121: aload #10
    //   123: aload_2
    //   124: aload #11
    //   126: invokespecial <init> : (Lburp/Zeu9;Lburp/Zrp0;Lburp/Zlru;Lburp/Zszw;Lburp/Zszw;)V
    //   129: invokeinterface add : (Ljava/lang/Object;)Z
    //   134: pop
    //   135: aload_0
    //   136: getfield Zz : Ljava/util/Collection;
    //   139: aload #9
    //   141: invokeinterface contains : (Ljava/lang/Object;)Z
    //   146: ifeq -> 178
    //   149: aload_0
    //   150: getfield ZB : Lburp/Zmv7;
    //   153: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   156: getstatic burp/Zlq7.IGNORE_DOORWAY : Lburp/Zlq7;
    //   159: iconst_1
    //   160: anewarray java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload #9
    //   167: aastore
    //   168: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   173: aload #5
    //   175: ifnull -> 250
    //   178: aload_0
    //   179: getfield ZF : Lburp/Zrk2;
    //   182: aload #9
    //   184: aload_2
    //   185: invokevirtual ZJ : (Lburp/Zrp0;Lburp/Zszw;)Ljava/util/List;
    //   188: invokeinterface iterator : ()Ljava/util/Iterator;
    //   193: astore #10
    //   195: aload #10
    //   197: invokeinterface hasNext : ()Z
    //   202: ifeq -> 250
    //   205: aload #10
    //   207: invokeinterface next : ()Ljava/lang/Object;
    //   212: checkcast burp/Zxs9
    //   215: astore #11
    //   217: aload #4
    //   219: aload #11
    //   221: invokevirtual ZXh : ()Lburp/Zeu9;
    //   224: aload #11
    //   226: invokevirtual ZXq : ()Lburp/Zszw;
    //   229: invokevirtual ZW : (Lburp/Zeu9;Lburp/Zszw;)Z
    //   232: ifne -> 245
    //   235: aload #6
    //   237: aload #11
    //   239: invokeinterface add : (Ljava/lang/Object;)Z
    //   244: pop
    //   245: aload #5
    //   247: ifnull -> 195
    //   250: aload #5
    //   252: ifnull -> 43
    //   255: new burp/Zejm
    //   258: dup
    //   259: aload #6
    //   261: aload #7
    //   263: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
    //   266: areturn
  }
  
  private static Ztc6 lambda$findMatches$0(Zszw paramZszw, Zxs9 paramZxs9) {
    return Ztc6.ZD(paramZszw, List.of(paramZxs9));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zst.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */