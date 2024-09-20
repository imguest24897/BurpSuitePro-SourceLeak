package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsc3 implements Zrw4 {
  private final Zr_4 Zh;
  
  private final Set<Object> Zk = new HashSet();
  
  private final Map<Zstu, Zstu> Zs = new HashMap<>();
  
  Zsc3(Zr_4 paramZr_4) {
    this.Zh = paramZr_4;
  }
  
  <T extends Zgpi> T Zv(T paramT) {
    Ztew ztew = new Ztew(this);
    return ztew.ZT(paramT);
  }
  
  public <T extends Zgpi> boolean ZG(T paramT) {
    return false;
  }
  
  public <T extends Zgpi> Zz8x<T> Z_(T paramT) {
    return new Zz8x<>(this.Zk.contains(paramT));
  }
  
  public <T extends Zgpi> T Zd(Ztew paramZtew, T paramT) {
    if (!(paramT instanceof Zni))
      return paramT; 
    this.Zk.add(paramT);
    paramT.ZQ(paramT.ZF().Zc(), new Zk7i(paramZtew, paramT));
    return paramT;
  }
  
  public Zstu ZR(Ztew paramZtew, Zstu paramZstu) {
    Zstu zstu2;
    try {
      if (!(paramZstu instanceof Zni))
        return paramZstu; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zstu zstu1 = this.Zs.get(paramZstu);
    try {
      if (zstu1 != null)
        return zstu1; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zstu2 = this.Zh.ZZ(paramZstu.ZiD());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      return paramZstu;
    } 
    this.Zs.put(paramZstu, zstu2);
    return zstu2;
  }
  
  public Zsqo ZB(Ztew paramZtew, Zsqo paramZsqo) {
    return paramZsqo;
  }
  
  public Zmrq ZD(Ztew paramZtew, Zmrq paramZmrq) {
    return paramZmrq;
  }
  
  public Ze4r ZS(Ztew paramZtew, Ze4r paramZe4r) {
    return paramZe4r;
  }
  
  public Zghu Ze(Ztew paramZtew, Zghu paramZghu) {
    return paramZghu;
  }
  
  public Zmyi Zc(Ztew paramZtew, Zmyi paramZmyi) {
    return paramZmyi;
  }
  
  public Zrap Zj(Ztew paramZtew, Zrap paramZrap) {
    return paramZrap;
  }
  
  public <T extends Zgpi> Zrte<T> ZG(Ztew paramZtew, Zrte<T> paramZrte) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore_3
    //   4: aload_2
    //   5: instanceof burp/Zni
    //   8: ifne -> 13
    //   11: aload_2
    //   12: areturn
    //   13: iconst_0
    //   14: istore #4
    //   16: iload #4
    //   18: aload_2
    //   19: invokeinterface Zpu : ()I
    //   24: if_icmpge -> 85
    //   27: aload_2
    //   28: iload #4
    //   30: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   35: astore #5
    //   37: aload #5
    //   39: instanceof burp/Zyf
    //   42: ifeq -> 63
    //   45: aload_2
    //   46: iload #4
    //   48: aload_1
    //   49: aload #5
    //   51: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   54: invokeinterface ZU : (ILburp/Zgpi;)V
    //   59: aload_3
    //   60: ifnull -> 78
    //   63: aload #5
    //   65: instanceof burp/Zni
    //   68: ifeq -> 78
    //   71: aload_1
    //   72: aload #5
    //   74: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   77: pop
    //   78: iinc #4, 1
    //   81: aload_3
    //   82: ifnull -> 16
    //   85: aload_2
    //   86: areturn
  }
  
  public Zsdr Zj(Zsdr paramZsdr) {
    return paramZsdr;
  }
  
  public Zzvg ZA(Zzvg paramZzvg) {
    return paramZzvg;
  }
  
  public Zl5u ZZ(Zl5u paramZl5u) {
    return paramZl5u;
  }
  
  public <T extends Zgpi> Zefg<T> Zx(Ztew paramZtew, Zefg<T> paramZefg, Zeu4 paramZeu4) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore #4
    //   5: aload_2
    //   6: instanceof burp/Zni
    //   9: ifne -> 14
    //   12: aload_2
    //   13: areturn
    //   14: iconst_0
    //   15: istore #5
    //   17: iload #5
    //   19: aload_2
    //   20: invokeinterface size : ()I
    //   25: if_icmpge -> 92
    //   28: aload_2
    //   29: iload #5
    //   31: invokeinterface get : (I)Ljava/lang/Object;
    //   36: checkcast burp/Zgpi
    //   39: astore #6
    //   41: aload #6
    //   43: instanceof burp/Zyf
    //   46: ifeq -> 69
    //   49: aload_2
    //   50: iload #5
    //   52: aload_1
    //   53: aload #6
    //   55: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   58: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   63: pop
    //   64: aload #4
    //   66: ifnull -> 84
    //   69: aload #6
    //   71: instanceof burp/Zni
    //   74: ifeq -> 84
    //   77: aload_1
    //   78: aload #6
    //   80: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   83: pop
    //   84: iinc #5, 1
    //   87: aload #4
    //   89: ifnull -> 17
    //   92: aload_2
    //   93: areturn
  }
  
  public <T extends Zgpi> Zefg<T> Zs(Ztew paramZtew, Zefg<T> paramZefg, int paramInt, Zeu4 paramZeu4) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore #5
    //   5: aload_2
    //   6: instanceof burp/Zni
    //   9: ifne -> 14
    //   12: aload_2
    //   13: areturn
    //   14: iconst_0
    //   15: istore #6
    //   17: iload #6
    //   19: aload_2
    //   20: invokeinterface size : ()I
    //   25: if_icmpge -> 92
    //   28: aload_2
    //   29: iload #6
    //   31: invokeinterface get : (I)Ljava/lang/Object;
    //   36: checkcast burp/Zgpi
    //   39: astore #7
    //   41: aload #7
    //   43: instanceof burp/Zyf
    //   46: ifeq -> 69
    //   49: aload_2
    //   50: iload #6
    //   52: aload_1
    //   53: aload #7
    //   55: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   58: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   63: pop
    //   64: aload #5
    //   66: ifnull -> 84
    //   69: aload #7
    //   71: instanceof burp/Zni
    //   74: ifeq -> 84
    //   77: aload_1
    //   78: aload #7
    //   80: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   83: pop
    //   84: iinc #6, 1
    //   87: aload #5
    //   89: ifnull -> 17
    //   92: aload_2
    //   93: areturn
  }
  
  public Zmfv ZO(Ztew paramZtew, Zmfv paramZmfv) {
    return paramZmfv;
  }
  
  public Zg06 ZR(Ztew paramZtew, Zg06 paramZg06) {
    return paramZg06;
  }
  
  public Zmg ZD(Zmg paramZmg) {
    return paramZmg;
  }
  
  public Zmg ZE(Zmg paramZmg, int paramInt) {
    return paramZmg;
  }
  
  public Zrpj Zr(Ztew paramZtew, Zrpj paramZrpj) {
    return paramZrpj;
  }
  
  public Zxsn ZD(Ztew paramZtew, Zxsn paramZxsn) {
    return paramZxsn;
  }
  
  public Ze68 Za(Ztew paramZtew, Ze68 paramZe68) {
    return paramZe68;
  }
  
  public <T extends Zgpi> Zrfx<T> ZI(Ztew paramZtew, Zrfx<T> paramZrfx, Zeu4 paramZeu4) {
    return paramZrfx;
  }
  
  public Zgpi ZG(Ztew paramZtew, Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    return paramZzwo;
  }
  
  public Zgpi Zk(Ztew paramZtew, Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    return paramZzwo;
  }
  
  public Zgpi ZR(Ztew paramZtew, Zg49<? extends Zgpi> paramZg49, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return paramZg49;
  }
  
  public Zgpi ZI(Ztew paramZtew, Zxsf<? extends Zgpi> paramZxsf, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return paramZxsf;
  }
  
  public Zgpi Zl(Ztew paramZtew, Zr5a<? extends Zgpi> paramZr5a, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return paramZr5a;
  }
  
  public Zgpi Zr(Ztew paramZtew, Zxlv<? extends Zgpi> paramZxlv, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return paramZxlv;
  }
  
  public Zgpi Zx(Ztew paramZtew, Zmwp<? extends Zgpi> paramZmwp, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    return paramZmwp;
  }
  
  public Zgpi Zz(Ztew paramZtew, Ze93<? extends Zgpi> paramZe93, Zeu4<? extends Zgpi> paramZeu4) {
    return paramZe93;
  }
  
  public Zgpi Zh(Ztew paramZtew, Zt7v<? extends Zgpi> paramZt7v, Zeu4<? extends Zgpi> paramZeu4) {
    return paramZt7v;
  }
  
  public Zgpi ZS(Ztew paramZtew, Zltc paramZltc) {
    return paramZltc;
  }
  
  public <T extends Zgpi> void ZS(T paramT) {}
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsc3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */