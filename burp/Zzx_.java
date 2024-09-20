package burp;

import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

abstract class Zzx_ implements Ztg8, Zrw4, Zlof {
  final Zkit ZG;
  
  final Zkit ZQ;
  
  final Ze24 Zu;
  
  final Zl2m Zh;
  
  private final Zkqo ZL;
  
  private Ze38 ZP;
  
  private Zk9n ZN;
  
  private Zgb Zx;
  
  private Zejp ZV;
  
  private Zrni ZE;
  
  private Zb3h Zn;
  
  private List<Ztf0> ZD;
  
  Zzx_(Zkit paramZkit1, Zkit paramZkit2, Ze24 paramZe24, Zl2m paramZl2m, Zkqo paramZkqo) {
    this.ZG = paramZkit1;
    this.ZQ = paramZkit2;
    this.Zu = paramZe24;
    this.Zh = paramZl2m;
    this.ZL = paramZkqo;
    if (Zszd.ZL)
      paramZl2m.ZA(paramZkit1); 
  }
  
  public <T extends Zgpi> T Zw(T paramT) {
    Ztew ztew = new Ztew(this);
    this.ZP = new Ze38(ztew, this, this.ZG, this.ZQ, this.Zu, this.Zh);
    this.ZN = new Zk9n(this, this.ZG, this.ZQ, this.Zu, this.Zh);
    String[] arrayOfString = Ztgq.ZZ();
    try {
      this.Zx = new Zgb(ztew, this, this.ZG, this.ZQ, this.Zu, this.Zh);
      this.ZV = new Zejp(ztew, this, this.ZG, this.ZQ, this.Zu, this.Zh);
      this.ZE = new Zrni(ztew, this, this.ZG, this.ZQ, this.Zu, this.Zh);
      this.Zn = new Zb3h(ZR(ztew), this, this.ZQ, this.Zu);
      this.ZD = this.ZL.Z_(ztew, ZR(ztew), this, this.ZG, this.ZQ, this.Zu, this.Zh, this.Zn);
      if (arrayOfString == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    return ztew.ZT(paramT);
  }
  
  abstract Zxfv ZR(Ztew paramZtew);
  
  public <T extends Zgpi> Zz8x<T> Z_(T paramT) {
    try {
      if (this.Zu.Zg())
        return new Zz8x<>(true); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    T t = (T)this.Zu.Zw((Object)paramT, this.ZQ);
    try {
      if (t != null)
        return new Zz8x<>(t); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    Zeu4<T> zeu4 = paramT.ZF();
    Long long_ = this.Zu.ZY((Zgpi)paramT, this.ZQ);
    try {
      if (long_ != null) {
        try {
        
        } catch (Ztgq ztgq) {
          throw a(null);
        } 
        return new Zz8x<>((long_.longValue() == 0L) ? null : ZS(long_, zeu4));
      } 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      if (Zszd.ZL)
        this.Zh.ZU((Zgpi)paramT); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    try {
      if (this.Zu.ZN((Zgpi)paramT))
        return new Zz8x<>(null); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    return new Zz8x<>(false);
  }
  
  private <T extends Zgpi> T ZS(Long paramLong, Zeu4<T> paramZeu4) {
    try {
      return this.ZQ.Zo(paramLong.longValue(), paramZeu4);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      ZK(throwable);
      return null;
    } 
  }
  
  public <T extends Zgpi> boolean ZG(T paramT) {
    return false;
  }
  
  public Zsqo ZB(Ztew paramZtew, Zsqo paramZsqo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zsqo;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zsqo
    //   14: areturn
  }
  
  public Zstu ZR(Ztew paramZtew, Zstu paramZstu) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zstu;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zstu
    //   14: areturn
  }
  
  public Zmrq ZD(Ztew paramZtew, Zmrq paramZmrq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zmrq;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zmrq
    //   14: areturn
  }
  
  public Ze4r ZS(Ztew paramZtew, Ze4r paramZe4r) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Ze4r;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Ze4r
    //   14: areturn
  }
  
  public Zghu Ze(Ztew paramZtew, Zghu paramZghu) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zghu;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zghu
    //   14: areturn
  }
  
  public Zmyi Zc(Ztew paramZtew, Zmyi paramZmyi) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zmyi;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zmyi
    //   14: areturn
  }
  
  public Zrap Zj(Ztew paramZtew, Zrap paramZrap) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zrap;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zrap
    //   14: areturn
  }
  
  public <T extends Zgpi> Zrte<T> ZG(Ztew paramZtew, Zrte<T> paramZrte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zrte;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zrte
    //   14: areturn
  }
  
  public Zsdr Zj(Zsdr paramZsdr) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zsdr;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zsdr
    //   14: areturn
  }
  
  public Zzvg ZA(Zzvg paramZzvg) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zzvg;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zzvg
    //   14: areturn
  }
  
  public Zl5u ZZ(Zl5u paramZl5u) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zl5u;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zl5u
    //   14: areturn
  }
  
  public <T extends Zgpi> Zefg<T> Zx(Ztew paramZtew, Zefg<T> paramZefg, Zeu4 paramZeu4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zefg;Lburp/Zeu4;)Ljava/util/function/Supplier;
    //   9: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   12: checkcast burp/Zefg
    //   15: areturn
  }
  
  public <T extends Zgpi> Zefg<T> Zs(Ztew paramZtew, Zefg<T> paramZefg, int paramInt, Zeu4 paramZeu4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: iload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zefg;ILburp/Zeu4;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: checkcast burp/Zefg
    //   17: areturn
  }
  
  public Zmfv ZO(Ztew paramZtew, Zmfv paramZmfv) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zmfv;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zmfv
    //   14: areturn
  }
  
  public Zg06 ZR(Ztew paramZtew, Zg06 paramZg06) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zg06;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zg06
    //   14: areturn
  }
  
  public Zmg ZD(Zmg paramZmg) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zmg;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zmg
    //   14: areturn
  }
  
  public Zmg ZE(Zmg paramZmg, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: iload_2
    //   4: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zmg;I)Ljava/util/function/Supplier;
    //   9: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   12: checkcast burp/Zmg
    //   15: areturn
  }
  
  public Zxsn ZD(Ztew paramZtew, Zxsn paramZxsn) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zxsn;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zxsn
    //   14: areturn
  }
  
  public Zgpi ZG(Ztew paramZtew, Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zzwo;Lburp/Zeu4;Lburp/Zeu4;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: areturn
  }
  
  public Zgpi Zk(Ztew paramZtew, Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zzwo;Lburp/Zeu4;Lburp/Zeu4;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: areturn
  }
  
  public Zgpi ZR(Ztew paramZtew, Zg49<? extends Zgpi> paramZg49, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zg49;Lburp/Zeu4;Lburp/Ztdo;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: areturn
  }
  
  public Zgpi ZI(Ztew paramZtew, Zxsf<? extends Zgpi> paramZxsf, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zxsf;Lburp/Zeu4;Lburp/Ztdo;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: areturn
  }
  
  public Zgpi Zl(Ztew paramZtew, Zr5a<? extends Zgpi> paramZr5a, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zr5a;Lburp/Zeu4;Lburp/Ztdo;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: areturn
  }
  
  public Zgpi Zr(Ztew paramZtew, Zxlv<? extends Zgpi> paramZxlv, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zxlv;Lburp/Zeu4;Lburp/Ztdo;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: areturn
  }
  
  public Zgpi Zx(Ztew paramZtew, Zmwp<? extends Zgpi> paramZmwp, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zmwp;Lburp/Zeu4;Lburp/Ztdo;)Ljava/util/function/Supplier;
    //   11: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   14: areturn
  }
  
  public Zgpi Zz(Ztew paramZtew, Ze93<? extends Zgpi> paramZe93, Zeu4<? extends Zgpi> paramZeu4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: <illegal opcode> get : (Lburp/Zzx_;Lburp/Ze93;Lburp/Zeu4;)Ljava/util/function/Supplier;
    //   9: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   12: areturn
  }
  
  public Zgpi Zh(Ztew paramZtew, Zt7v<? extends Zgpi> paramZt7v, Zeu4<? extends Zgpi> paramZeu4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zt7v;Lburp/Zeu4;)Ljava/util/function/Supplier;
    //   9: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   12: areturn
  }
  
  public Zgpi ZS(Ztew paramZtew, Zltc paramZltc) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zltc;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: areturn
  }
  
  public Zrpj Zr(Ztew paramZtew, Zrpj paramZrpj) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zrpj;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Zrpj
    //   14: areturn
  }
  
  public Ze68 Za(Ztew paramZtew, Ze68 paramZe68) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzx_;Lburp/Ze68;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   11: checkcast burp/Ze68
    //   14: areturn
  }
  
  public <T extends Zgpi> Zrfx<T> ZI(Ztew paramZtew, Zrfx<T> paramZrfx, Zeu4 paramZeu4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zrfx;Lburp/Zeu4;)Ljava/util/function/Supplier;
    //   9: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   12: checkcast burp/Zrfx
    //   15: areturn
  }
  
  public <T extends Zgpi> T Zd(Ztew paramZtew, T paramT) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZD : Ljava/util/List;
    //   7: invokeinterface iterator : ()Ljava/util/Iterator;
    //   12: astore #4
    //   14: astore_3
    //   15: aload #4
    //   17: invokeinterface hasNext : ()Z
    //   22: ifeq -> 73
    //   25: aload #4
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast burp/Ztf0
    //   35: astore #5
    //   37: aload #5
    //   39: aload_0
    //   40: getfield ZG : Lburp/Zkit;
    //   43: aload_2
    //   44: invokeinterface Zr : (Lburp/Zr_4;Lburp/Zgpi;)Z
    //   49: ifeq -> 69
    //   52: aload_0
    //   53: aload #5
    //   55: aload_2
    //   56: <illegal opcode> get : (Lburp/Ztf0;Lburp/Zgpi;)Ljava/util/function/Supplier;
    //   61: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   64: areturn
    //   65: invokestatic a : (Lburp/Ztgq;)Lburp/Ztgq;
    //   68: athrow
    //   69: aload_3
    //   70: ifnonnull -> 15
    //   73: aload_0
    //   74: aload_0
    //   75: aload_2
    //   76: <illegal opcode> get : (Lburp/Zzx_;Lburp/Zgpi;)Ljava/util/function/Supplier;
    //   81: invokevirtual Zs : (Ljava/util/function/Supplier;)Lburp/Zgpi;
    //   84: areturn
    // Exception table:
    //   from	to	target	type
    //   37	65	65	burp/Ztgq
  }
  
  private <T extends Zgpi> T Zs(Supplier<T> paramSupplier) {
    try {
      return paramSupplier.get();
    } catch (Ztgq|Zb_f ztgq) {
      Zah.Zl(ztgq, Zk_.RETHROWN);
      throw ztgq;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      ZG(throwable);
      return null;
    } 
  }
  
  public <T extends Zgpi> void ZS(T paramT) {
    this.Zu.ZA(this.ZQ);
  }
  
  public abstract void ZG(Throwable paramThrowable);
  
  public void ZK(Throwable paramThrowable) {
    try {
      Zah.Zl(paramThrowable, Zk_.COMMON_RUNTIME_FAILURE);
      if (!Zepz.Zm(paramThrowable))
        throw new Ztgq(this.ZQ, paramThrowable); 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
  }
  
  private Zgpi lambda$object$32(Zgpi paramZgpi) {
    return this.Zn.ZO(paramZgpi);
  }
  
  private static Zgpi lambda$object$31(Ztf0 paramZtf0, Zgpi paramZgpi) {
    return paramZtf0.Zb(paramZgpi);
  }
  
  private Zrfx lambda$objectSet$30(Zrfx<Zgpi> paramZrfx, Zeu4 paramZeu4) {
    return this.ZV.Zs(paramZrfx, paramZeu4);
  }
  
  private Ze68 lambda$longSet$29(Ze68 paramZe68) {
    return this.ZV.Zx(paramZe68);
  }
  
  private Zrpj lambda$integerSet$28(Zrpj paramZrpj) {
    return this.ZV.Zm(paramZrpj);
  }
  
  private Zgpi lambda$longKeyLongMap$27(Zltc paramZltc) {
    return this.ZE.ZZ(paramZltc);
  }
  
  private Zgpi lambda$longKeyObjectMap$26(Zt7v<? extends Zgpi> paramZt7v, Zeu4<? extends Zgpi> paramZeu4) {
    return this.ZE.ZY(paramZt7v, paramZeu4);
  }
  
  private Zgpi lambda$shortKeyObjectMap$25(Ze93<? extends Zgpi> paramZe93, Zeu4<? extends Zgpi> paramZeu4) {
    return this.ZE.ZC(paramZe93, paramZeu4);
  }
  
  private Zgpi lambda$primitiveLongMap$24(Zmwp<? extends Zgpi> paramZmwp, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return this.ZE.ZQ(paramZmwp, paramZeu4, paramZtdo);
  }
  
  private Zgpi lambda$longMap$23(Zxlv<? extends Zgpi> paramZxlv, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return this.ZE.ZU(paramZxlv, paramZeu4, paramZtdo);
  }
  
  private Zgpi lambda$intMap$22(Zr5a<? extends Zgpi> paramZr5a, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return this.ZE.Zl(paramZr5a, paramZeu4, paramZtdo);
  }
  
  private Zgpi lambda$shortMap$21(Zxsf<? extends Zgpi> paramZxsf, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return this.ZE.ZO(paramZxsf, paramZeu4, paramZtdo);
  }
  
  private Zgpi lambda$byteMap$20(Zg49<? extends Zgpi> paramZg49, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return this.ZE.Zd(paramZg49, paramZeu4, paramZtdo);
  }
  
  private Zgpi lambda$identityMap$19(Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    return this.ZE.Zx(paramZzwo, paramZeu41, paramZeu42);
  }
  
  private Zgpi lambda$objectMap$18(Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    return this.ZE.ZT(paramZzwo, paramZeu41, paramZeu42);
  }
  
  private Zxsn lambda$longList$17(Zxsn paramZxsn) {
    return this.Zx.Zz(paramZxsn);
  }
  
  private Zmg lambda$multipleIntegerList$16(Zmg paramZmg, int paramInt) {
    return this.Zx.ZA(paramZmg, paramInt);
  }
  
  private Zmg lambda$singleIntegerList$15(Zmg paramZmg) {
    return this.Zx.Zv(paramZmg);
  }
  
  private Zg06 lambda$shortList$14(Zg06 paramZg06) {
    return this.Zx.Zo(paramZg06);
  }
  
  private Zmfv lambda$booleanList$13(Zmfv paramZmfv) {
    return this.Zx.Zu(paramZmfv);
  }
  
  private Zefg lambda$multipleArrayList$12(Zefg<Zgpi> paramZefg, int paramInt, Zeu4 paramZeu4) {
    return this.Zx.ZQ(paramZefg, paramInt, paramZeu4);
  }
  
  private Zefg lambda$singleArrayList$11(Zefg<Zgpi> paramZefg, Zeu4 paramZeu4) {
    return this.Zx.Zt(paramZefg, paramZeu4);
  }
  
  private Zl5u lambda$stringStorage$10(Zl5u paramZl5u) {
    return this.ZN.ZI(paramZl5u);
  }
  
  private Zzvg lambda$mutableString$9(Zzvg paramZzvg) {
    return this.ZN.Zm(paramZzvg);
  }
  
  private Zsdr lambda$string$8(Zsdr paramZsdr) {
    return this.ZN.Z_(paramZsdr);
  }
  
  private Zrte lambda$objectArray$7(Zrte<Zgpi> paramZrte) {
    return this.ZP.ZQ(paramZrte);
  }
  
  private Zrap lambda$longArray$6(Zrap paramZrap) {
    return this.ZP.ZP(paramZrap);
  }
  
  private Zmyi lambda$intArray$5(Zmyi paramZmyi) {
    return this.ZP.ZF(paramZmyi);
  }
  
  private Zghu lambda$shortArray$4(Zghu paramZghu) {
    return this.ZP.ZL(paramZghu);
  }
  
  private Ze4r lambda$charArray$3(Ze4r paramZe4r) {
    return this.ZP.ZE(paramZe4r);
  }
  
  private Zmrq lambda$growableByteArray$2(Zmrq paramZmrq) {
    return this.ZP.Zi(paramZmrq);
  }
  
  private Zstu lambda$byteArray$1(Zstu paramZstu) {
    return this.ZP.ZE(paramZstu);
  }
  
  private Zsqo lambda$booleanArray$0(Zsqo paramZsqo) {
    return this.ZP.Zk(paramZsqo);
  }
  
  private static Ztgq a(Ztgq paramZtgq) {
    return paramZtgq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzx_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */