package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zrum {
  private final Zes3 ZJ;
  
  private final Zs89 Zd;
  
  private final Zxpd ZU;
  
  private final List<Zb3t> Zo;
  
  private final Zkr1<Zsws> ZB;
  
  private final Zb3t Zl;
  
  public Zrum(Zes3 paramZes3, Zb3t paramZb3t, Zs89 paramZs89, Zxpd paramZxpd) {
    this.ZJ = paramZes3;
    boolean bool = Zrn9.Zn();
    this.Zd = paramZs89;
    this.ZU = paramZxpd;
    this.ZB = new Zkr1<>();
    this.Zo = new ArrayList<>();
    this.Zl = paramZb3t;
    this.ZB.Zy(new Zsws(paramZb3t));
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zkal Zx() {
    // Byte code:
    //   0: invokestatic Zn : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZB : Lburp/Zkr1;
    //   8: invokevirtual ZP : ()Ljava/lang/Object;
    //   11: ifnull -> 155
    //   14: aload_0
    //   15: getfield ZU : Lburp/Zxpd;
    //   18: invokevirtual ZZ : ()V
    //   21: aload_0
    //   22: getfield ZB : Lburp/Zkr1;
    //   25: invokevirtual ZP : ()Ljava/lang/Object;
    //   28: checkcast burp/Zsws
    //   31: astore_2
    //   32: aload_2
    //   33: invokevirtual hasNext : ()Z
    //   36: ifne -> 51
    //   39: aload_0
    //   40: getfield ZB : Lburp/Zkr1;
    //   43: invokevirtual Zc : ()Ljava/lang/Object;
    //   46: pop
    //   47: iload_1
    //   48: ifeq -> 4
    //   51: aload_2
    //   52: invokevirtual ZG : ()Lburp/Zgbi;
    //   55: astore_3
    //   56: aload_0
    //   57: invokevirtual Zi : ()Z
    //   60: ifeq -> 66
    //   63: goto -> 4
    //   66: aload_3
    //   67: invokeinterface ZX : ()Lburp/Zesp;
    //   72: astore #4
    //   74: aconst_null
    //   75: astore #5
    //   77: aload #4
    //   79: getstatic burp/Zxc6.TaintSink : Lburp/Zxc6;
    //   82: invokeinterface ZO : (Lburp/Zxc6;)Ljava/lang/Object;
    //   87: ifnull -> 96
    //   90: aload_0
    //   91: invokevirtual Zh : ()Lburp/Zkal;
    //   94: astore #5
    //   96: aload_0
    //   97: aload #4
    //   99: invokevirtual ZM : (Lburp/Zesp;)Z
    //   102: ifeq -> 119
    //   105: aload_0
    //   106: aload_0
    //   107: invokevirtual Zh : ()Lburp/Zkal;
    //   110: invokevirtual ZN : (Lburp/Zkal;)Z
    //   113: ifeq -> 119
    //   116: goto -> 4
    //   119: aload_0
    //   120: aload_3
    //   121: invokevirtual Zt : (Lburp/Zgbi;)Z
    //   124: ifeq -> 143
    //   127: aload_0
    //   128: getfield ZB : Lburp/Zkr1;
    //   131: new burp/Zsws
    //   134: dup
    //   135: aload #4
    //   137: invokespecial <init> : (Lburp/Zesp;)V
    //   140: invokevirtual Zy : (Ljava/lang/Object;)V
    //   143: aload #5
    //   145: ifnull -> 151
    //   148: aload #5
    //   150: areturn
    //   151: iload_1
    //   152: ifeq -> 4
    //   155: aconst_null
    //   156: areturn
  }
  
  private boolean Zt(Zgbi paramZgbi) {
    List list = paramZgbi.ZX().<List>ZO(Zxc6.TaintHops);
    return (list != null && list.size() > 0 && ZJ(paramZgbi));
  }
  
  private boolean ZJ(Zgbi paramZgbi) {
    if (paramZgbi.ZX() == paramZgbi.Zm())
      return false; 
    List<Zgbi> list = Zh().Zq();
    int i = list.indexOf(paramZgbi);
    return (i == -1 || i == list.size() - 1);
  }
  
  private boolean ZM(Zesp paramZesp) {
    List list = paramZesp.<List>ZO(Zxc6.TaintHops);
    byte b = 0;
    Iterator<Zgbi> iterator = list.iterator();
    boolean bool = Zrn9.Zn();
    while (iterator.hasNext()) {
      Zgbi zgbi = iterator.next();
      if (zgbi.Zm() == paramZesp && ++b > 1)
        return true; 
      if (bool)
        break; 
    } 
    return false;
  }
  
  private boolean ZN(Zkal paramZkal) {
    Zrn9 zrn9 = this.Zd.ZW(paramZkal);
    Zd(paramZkal, zrn9);
    return ((new Zxc1(this.ZJ, zrn9, this.ZU)).Zi() == null);
  }
  
  private void Zd(Zkal paramZkal, Zrn9 paramZrn9) {
    Zrn9 zrn9 = new Zrn9(paramZkal);
    Iterator<Zb3t> iterator = paramZrn9.Zp().iterator();
    boolean bool = Zrn9.Zn();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (!this.Zo.contains(zb3t)) {
        zrn9.Zv(zb3t);
        this.Zo.add(zb3t);
      } 
      if (bool)
        break; 
    } 
    if (!zrn9.Zp().isEmpty())
      (new Zb34(this.ZJ)).Zp(zrn9); 
  }
  
  private Zkal Zh() {
    Zrb zrb = new Zrb();
    zrb.ZT(new Zm4y(null, this.Zl));
    Iterator<Zsws> iterator = this.ZB.iterator();
    boolean bool = Zrn9.Zn();
    while (iterator.hasNext()) {
      Zsws zsws = iterator.next();
      zrb.ZT(zsws.Zh());
      if (bool)
        break; 
    } 
    return zrb;
  }
  
  private boolean Zi() {
    Zkr1<Zgbi> zkr1 = new Zkr1();
    Iterator<Zsws> iterator = this.ZB.iterator();
    boolean bool = Zrn9.Zn();
    while (iterator.hasNext()) {
      Zsws zsws = iterator.next();
      if (ZO(zkr1, zsws.Zh()))
        return true; 
      if (bool)
        break; 
    } 
    return false;
  }
  
  private boolean ZO(Zkr1<Zgbi> paramZkr1, Zgbi paramZgbi) {
    // Byte code:
    //   0: invokestatic Zn : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: instanceof burp/Zgjt
    //   8: ifeq -> 20
    //   11: aload_1
    //   12: aload_2
    //   13: invokevirtual Zy : (Ljava/lang/Object;)V
    //   16: iload_3
    //   17: ifeq -> 104
    //   20: aload_2
    //   21: instanceof burp/Zec9
    //   24: ifeq -> 93
    //   27: aload_1
    //   28: invokevirtual ZP : ()Ljava/lang/Object;
    //   31: checkcast burp/Zgbi
    //   34: astore #4
    //   36: aload #4
    //   38: ifnull -> 89
    //   41: aload #4
    //   43: invokeinterface Zm : ()Lburp/Zesp;
    //   48: checkcast burp/Zb3t
    //   51: astore #5
    //   53: aload #5
    //   55: invokeinterface ZI : ()Lburp/Zb3t;
    //   60: invokeinterface ZI : ()Lburp/Zb3t;
    //   65: astore #6
    //   67: aload #6
    //   69: aload_2
    //   70: invokeinterface ZX : ()Lburp/Zesp;
    //   75: if_acmpne -> 87
    //   78: aload_1
    //   79: invokevirtual Zc : ()Ljava/lang/Object;
    //   82: pop
    //   83: iload_3
    //   84: ifeq -> 89
    //   87: iconst_1
    //   88: ireturn
    //   89: iload_3
    //   90: ifeq -> 104
    //   93: aload_2
    //   94: instanceof burp/Zriw
    //   97: ifeq -> 104
    //   100: aload_1
    //   101: invokevirtual ZG : ()V
    //   104: iconst_0
    //   105: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrum.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */