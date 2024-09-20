package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb0n {
  private final Ze4y Zb;
  
  private final List<Zzsd> ZQ;
  
  private final Zt0e ZE;
  
  public Zb0n(Ze4y paramZe4y, List<Zzsd> paramList, Zt0e paramZt0e) {
    this.Zb = paramZe4y;
    this.ZQ = paramList;
    this.ZE = paramZt0e;
  }
  
  public Zeeq ZH() throws Zsx4 {
    Zqf zqf = new Zqf(this.Zb, this.ZQ.size(), this.ZE);
    Zb(zqf);
    boolean bool = Zzsd.Zq();
    try {
      Zs(zqf);
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (Zsx4 zsx4) {
          throw a(null);
        } 
        Zzsd.Zt(!bool);
      } 
    } catch (Zsx4 zsx4) {
      throw a(null);
    } 
    return zqf.ZT();
  }
  
  private void Zb(Zqf paramZqf) {
    boolean bool = Zzsd.ZW();
    byte b = 0;
    while (b < this.ZQ.size()) {
      Zzsd zzsd = this.ZQ.get(b);
      for (Zg6w zg6w : zzsd.Zv()) {
        Zb84 zb84 = (zg6w.ZX instanceof Zbop) ? Zb84.SHIFT : Zb84.GO;
        int i = Zk(zg6w);
        paramZqf.ZN(b, zg6w.ZX, zb84, i);
        if (bool)
          break; 
      } 
      b++;
      if (bool)
        break; 
    } 
  }
  
  private void Zs(Zqf paramZqf) throws Zsx4 {
    // Byte code:
    //   0: new burp/Zgnt
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: aload_0
    //   8: getfield Zb : Lburp/Ze4y;
    //   11: invokevirtual Zi : (Lburp/Ze4y;)Lburp/Zgnt;
    //   14: astore_3
    //   15: invokestatic ZW : ()Z
    //   18: iconst_0
    //   19: istore #4
    //   21: istore_2
    //   22: iload #4
    //   24: aload_0
    //   25: getfield ZQ : Ljava/util/List;
    //   28: invokeinterface size : ()I
    //   33: if_icmpge -> 388
    //   36: aload_0
    //   37: getfield ZE : Lburp/Zt0e;
    //   40: iload #4
    //   42: invokevirtual ZV : (I)V
    //   45: aload_0
    //   46: getfield ZQ : Ljava/util/List;
    //   49: iload #4
    //   51: invokeinterface get : (I)Ljava/lang/Object;
    //   56: checkcast burp/Zzsd
    //   59: astore #5
    //   61: aload #5
    //   63: invokevirtual Zr : ()Ljava/util/Set;
    //   66: invokeinterface iterator : ()Ljava/util/Iterator;
    //   71: astore #6
    //   73: aload #6
    //   75: invokeinterface hasNext : ()Z
    //   80: ifeq -> 381
    //   83: aload #6
    //   85: invokeinterface next : ()Ljava/lang/Object;
    //   90: checkcast burp/Zgy_
    //   93: astore #7
    //   95: aload #7
    //   97: invokevirtual Zn : ()I
    //   100: istore #8
    //   102: aload_0
    //   103: getfield Zb : Lburp/Ze4y;
    //   106: invokeinterface Zw : ()Ljava/util/List;
    //   111: iload #8
    //   113: invokeinterface get : (I)Ljava/lang/Object;
    //   118: checkcast burp/Zl30
    //   121: astore #9
    //   123: aload_3
    //   124: aload #9
    //   126: invokevirtual ZC : ()Lburp/Zr9_;
    //   129: invokevirtual ZH : (Lburp/Zr9_;)Ljava/util/Set;
    //   132: astore #10
    //   134: aload #10
    //   136: invokeinterface iterator : ()Ljava/util/Iterator;
    //   141: astore #11
    //   143: aload #11
    //   145: invokeinterface hasNext : ()Z
    //   150: ifeq -> 377
    //   153: aload #11
    //   155: invokeinterface next : ()Ljava/lang/Object;
    //   160: checkcast burp/Ztx4
    //   163: astore #12
    //   165: aload_0
    //   166: getfield ZE : Lburp/Zt0e;
    //   169: aload #12
    //   171: invokevirtual Zl : (Lburp/Ztx4;)V
    //   174: iload #8
    //   176: ifne -> 189
    //   179: getstatic burp/Zb84.ACCEPT : Lburp/Zb84;
    //   182: goto -> 192
    //   185: invokestatic a : (Lburp/Zsx4;)Lburp/Zsx4;
    //   188: athrow
    //   189: getstatic burp/Zb84.REDUCE : Lburp/Zb84;
    //   192: astore #13
    //   194: aload_1
    //   195: iload #4
    //   197: aload #12
    //   199: invokevirtual Zc : (ILburp/Ztx4;)Lburp/Zb84;
    //   202: astore #14
    //   204: aload #14
    //   206: ifnull -> 353
    //   209: aload #14
    //   211: getstatic burp/Zb84.REDUCE : Lburp/Zb84;
    //   214: if_acmpne -> 259
    //   217: goto -> 224
    //   220: invokestatic a : (Lburp/Zsx4;)Lburp/Zsx4;
    //   223: athrow
    //   224: aload_1
    //   225: iload #4
    //   227: aload #12
    //   229: invokevirtual Zp : (ILburp/Ztx4;)I
    //   232: istore #15
    //   234: iload #15
    //   236: iload #8
    //   238: if_icmple -> 143
    //   241: aload_1
    //   242: iload #4
    //   244: aload #12
    //   246: getstatic burp/Zb84.REDUCE : Lburp/Zb84;
    //   249: iload #8
    //   251: invokevirtual ZN : (ILburp/Ztx4;Lburp/Zb84;I)Lburp/Zqf;
    //   254: pop
    //   255: iload_2
    //   256: ifeq -> 143
    //   259: aload #12
    //   261: instanceof burp/Zr9_
    //   264: ifeq -> 279
    //   267: iconst_0
    //   268: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   271: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   274: return
    //   275: invokestatic a : (Lburp/Zsx4;)Lburp/Zsx4;
    //   278: athrow
    //   279: aload_0
    //   280: aload #9
    //   282: aload #12
    //   284: checkcast burp/Zbop
    //   287: invokevirtual ZN : (Lburp/Zl30;Lburp/Zbop;)Lburp/Zb84;
    //   290: astore #15
    //   292: aload #15
    //   294: ifnonnull -> 321
    //   297: new burp/Zsxp
    //   300: dup
    //   301: aload_0
    //   302: getfield Zb : Lburp/Ze4y;
    //   305: aload #14
    //   307: aload #13
    //   309: aload_0
    //   310: getfield ZE : Lburp/Zt0e;
    //   313: invokespecial <init> : (Lburp/Ze4y;Lburp/Zb84;Lburp/Zb84;Lburp/Zt0e;)V
    //   316: athrow
    //   317: invokestatic a : (Lburp/Zsx4;)Lburp/Zsx4;
    //   320: athrow
    //   321: aload #15
    //   323: getstatic burp/Zb84.REDUCE : Lburp/Zb84;
    //   326: if_acmpne -> 349
    //   329: aload_1
    //   330: iload #4
    //   332: aload #12
    //   334: aload #15
    //   336: iload #8
    //   338: invokevirtual ZN : (ILburp/Ztx4;Lburp/Zb84;I)Lburp/Zqf;
    //   341: pop
    //   342: goto -> 349
    //   345: invokestatic a : (Lburp/Zsx4;)Lburp/Zsx4;
    //   348: athrow
    //   349: iload_2
    //   350: ifeq -> 373
    //   353: aload_1
    //   354: iload #4
    //   356: aload #12
    //   358: aload #13
    //   360: iload #8
    //   362: invokevirtual ZN : (ILburp/Ztx4;Lburp/Zb84;I)Lburp/Zqf;
    //   365: pop
    //   366: goto -> 373
    //   369: invokestatic a : (Lburp/Zsx4;)Lburp/Zsx4;
    //   372: athrow
    //   373: iload_2
    //   374: ifeq -> 143
    //   377: iload_2
    //   378: ifeq -> 73
    //   381: iinc #4, 1
    //   384: iload_2
    //   385: ifeq -> 22
    //   388: return
    // Exception table:
    //   from	to	target	type
    //   165	185	185	burp/Zsx4
    //   204	217	220	burp/Zsx4
    //   259	275	275	burp/Zsx4
    //   292	317	317	burp/Zsx4
    //   321	342	345	burp/Zsx4
    //   349	366	369	burp/Zsx4
  }
  
  private Zb84 ZN(Zl30 paramZl30, Zbop paramZbop) {
    Zgfr zgfr;
    List<Zbop> list = Zs(paramZl30.ZT());
    if (list.size() == 0)
      return Zb84.SHIFT; 
    Zbop zbop = list.get(0);
    Zl38 zl38 = this.Zb.ZH(zbop, paramZbop);
    switch (Zlq8.ZZ[zl38.ordinal()]) {
      case 1:
        zgfr = this.Zb.Zk(zbop);
        switch (Zlq8.ZF[zgfr.ordinal()]) {
          case 1:
            return Zb84.REDUCE;
          case 2:
            return Zb84.SHIFT;
        } 
        return null;
      case 2:
        return Zb84.REDUCE;
      case 3:
        return Zb84.SHIFT;
    } 
    return null;
  }
  
  private List<Zbop> Zs(List<Ztx4> paramList) {
    ArrayList<Zbop> arrayList = new ArrayList();
    Iterator<Ztx4> iterator = paramList.iterator();
    boolean bool = Zzsd.ZW();
    while (iterator.hasNext()) {
      Ztx4 ztx4 = iterator.next();
      if (ztx4 instanceof Zbop)
        arrayList.add((Zbop)ztx4); 
      if (bool)
        break; 
    } 
    return arrayList;
  }
  
  private int Zk(Zg6w paramZg6w) {
    boolean bool = Zzsd.ZW();
    byte b = 0;
    while (b < this.ZQ.size()) {
      if (this.ZQ.get(b) == paramZg6w.ZR)
        return b; 
      b++;
      if (bool)
        break; 
    } 
    Zuh.Zb(false, Zqf.Zr);
    return -1;
  }
  
  private static Zsx4 a(Zsx4 paramZsx4) {
    return paramZsx4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */