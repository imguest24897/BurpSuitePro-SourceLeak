package burp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zgnt {
  private final Map<Zr9_, Set<Zbop>> Zr = new HashMap<>();
  
  public Zgnt Zi(Ze4y paramZe4y) {
    Zedm zedm = (new Zedm()).ZU(paramZe4y);
    Zrc_ zrc_ = (new Zrc_(zedm)).Zd(paramZe4y);
    Zgxm zgxm = new Zgxm(paramZe4y);
    Zbqc[] arrayOfZbqc = Zm_m.ZW();
    List<Zm_m> list = (new Zs5b()).Zt(zgxm);
    ZH(list, zrc_);
    while (true) {
      boolean bool = false;
      for (Zm_m zm_m : list) {
        Zewm zewm = zm_m.Zw();
        if (ZI(zewm, zedm)) {
          Set<Zbop> set = Zf(zm_m);
          int i = set.size();
          ZJ(zm_m, set);
          if (set.size() > i)
            bool = true; 
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
      if (!bool) {
        if (Zbqc.Zwu() == null)
          Zm_m.Zy(new Zbqc[2]); 
        return this;
      } 
    } 
  }
  
  private Set<Zbop> Zf(Zm_m paramZm_m) {
    Zr9_ zr9_ = paramZm_m.Z_();
    return this.Zr.get(zr9_);
  }
  
  private void ZJ(Zm_m paramZm_m, Set<Zbop> paramSet) {
    Zr9_ zr9_ = paramZm_m.Zy();
    paramSet.addAll(this.Zr.get(zr9_));
  }
  
  private boolean ZI(Zewm paramZewm, Zedm paramZedm) {
    return (!Zr(paramZewm) && paramZedm.Zc(paramZewm));
  }
  
  public Set<Zbop> ZH(Zr9_ paramZr9_) {
    return this.Zr.get(paramZr9_);
  }
  
  private void ZH(List<Zm_m> paramList, Zrc_ paramZrc_) {
    // Byte code:
    //   0: invokestatic ZW : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokeinterface iterator : ()Ljava/util/Iterator;
    //   10: astore #4
    //   12: aload #4
    //   14: invokeinterface hasNext : ()Z
    //   19: ifeq -> 133
    //   22: aload #4
    //   24: invokeinterface next : ()Ljava/lang/Object;
    //   29: checkcast burp/Zm_m
    //   32: astore #5
    //   34: aload_0
    //   35: getfield Zr : Ljava/util/Map;
    //   38: aload #5
    //   40: invokevirtual Z_ : ()Lburp/Zr9_;
    //   43: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: checkcast java/util/Set
    //   51: astore #6
    //   53: aload #6
    //   55: ifnonnull -> 67
    //   58: new java/util/HashSet
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: astore #6
    //   67: aload #5
    //   69: invokevirtual Zw : ()Lburp/Zewm;
    //   72: astore #7
    //   74: aload_0
    //   75: aload #7
    //   77: invokevirtual Zr : (Lburp/Zewm;)Z
    //   80: ifeq -> 98
    //   83: aload #6
    //   85: getstatic burp/Zrl.EOF : Lburp/Zrl;
    //   88: invokeinterface add : (Ljava/lang/Object;)Z
    //   93: pop
    //   94: aload_3
    //   95: ifnonnull -> 112
    //   98: aload #6
    //   100: aload_2
    //   101: aload #7
    //   103: invokevirtual ZI : (Lburp/Zewm;)Ljava/util/Set;
    //   106: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   111: pop
    //   112: aload_0
    //   113: getfield Zr : Ljava/util/Map;
    //   116: aload #5
    //   118: invokevirtual Z_ : ()Lburp/Zr9_;
    //   121: aload #6
    //   123: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: aload_3
    //   130: ifnonnull -> 12
    //   133: return
  }
  
  private boolean Zr(Zewm paramZewm) {
    return (paramZewm.ZN() == 1 && paramZewm.ZQ() == Zrl.EOF);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgnt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */