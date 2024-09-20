package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zrzt;

public class Zkox {
  private final Zg5c Zm;
  
  public Zkox(Zg5c paramZg5c) {
    this.Zm = paramZg5c;
  }
  
  public Zx_5 Zm(Ze3n paramZe3n, Zlit paramZlit, long paramLong, Zefx paramZefx, Zb6q paramZb6q, Zswz paramZswz, Zsw6 paramZsw6, Zsdd paramZsdd) {
    boolean bool = Zz_q.Za();
    List<Zvow> list = ZS(paramZe3n, paramZlit.Zdz(), paramLong, paramZefx, paramZb6q, paramZsdd);
    if (this.Zm.Z_() != Zmdu.DOM)
      ((Zvow)list.get(0)).ZK(this.Zm.Zr()); 
    List<Zznw> list1 = ZO(paramZsdd);
    List<E> list2 = !list.isEmpty() ? (List)list.subList(1, list.size()) : Collections.<E>emptyList();
    Zlfv<? extends Zgkc> zlfv = this.Zm.Zs(list1, list.get(0), (List)list2, paramZswz.ZR(), paramZsw6.ZR());
    int i = paramZswz.Zh() | paramZsw6.Zh();
    Zvs zvs = paramZsw6.Zn();
    if (!bool)
      Zbqc.Zr(new Zbqc[3]); 
    return Zn(Zeb4.Zs(zvs, this.Zm.Z_()), i, zlfv, paramZlit.Zdz(), paramZlit.Zd4(), this.Zm.Zd());
  }
  
  private Zx_5 Zn(Zvs paramZvs, int paramInt, Zlfv<? extends Zgkc> paramZlfv, Zmzk paramZmzk, byte[] paramArrayOfbyte, Zxs7 paramZxs7) {
    return new Zx_5(paramZvs, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(paramZlfv), Zmmq.Ze(paramInt, paramZvs), Zmmq.Zm(paramInt, paramZvs), paramZmzk, paramArrayOfbyte, paramZxs7);
  }
  
  private List<Zvow> ZS(Ze3n paramZe3n, Zmzk paramZmzk, long paramLong, Zefx paramZefx, Zb6q paramZb6q, Zsdd paramZsdd) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #9
    //   9: invokestatic Za : ()Z
    //   12: aconst_null
    //   13: astore #10
    //   15: istore #8
    //   17: aload_0
    //   18: aload #6
    //   20: invokeinterface Za : ()Lburp/Zstu;
    //   25: aload #7
    //   27: invokevirtual Z_ : (Lburp/Zstu;Lburp/Zsdd;)Ljava/util/List;
    //   30: astore #11
    //   32: aload_0
    //   33: aload #11
    //   35: invokevirtual Zi : (Ljava/util/List;)Ljava/util/List;
    //   38: astore #12
    //   40: aload #11
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #13
    //   49: aload #13
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 166
    //   59: aload #13
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast burp/Zmlv
    //   69: astore #14
    //   71: aload #14
    //   73: getfield ZW : Lburp/Zb6q;
    //   76: invokeinterface Za : ()Lburp/Zstu;
    //   81: aload #6
    //   83: invokeinterface Za : ()Lburp/Zstu;
    //   88: invokeinterface equals : (Ljava/lang/Object;)Z
    //   93: istore #15
    //   95: iload #15
    //   97: ifeq -> 113
    //   100: aload #14
    //   102: getfield ZI : Ljava/util/List;
    //   105: aload #12
    //   107: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   112: pop
    //   113: aload_0
    //   114: aload_1
    //   115: aload_2
    //   116: lload_3
    //   117: aload #14
    //   119: getfield ZZ : Lburp/Zefx;
    //   122: aload #14
    //   124: getfield ZW : Lburp/Zb6q;
    //   127: aload #14
    //   129: getfield ZI : Ljava/util/List;
    //   132: invokevirtual ZN : (Lburp/Ze3n;Lburp/Zmzk;JLburp/Zefx;Lburp/Zb6q;Ljava/util/List;)Lburp/Zvow;
    //   135: astore #16
    //   137: iload #15
    //   139: ifeq -> 151
    //   142: aload #16
    //   144: astore #10
    //   146: iload #8
    //   148: ifne -> 161
    //   151: aload #9
    //   153: aload #16
    //   155: invokeinterface add : (Ljava/lang/Object;)Z
    //   160: pop
    //   161: iload #8
    //   163: ifne -> 49
    //   166: aload #10
    //   168: ifnonnull -> 186
    //   171: aload_0
    //   172: aload_1
    //   173: aload_2
    //   174: lload_3
    //   175: aload #5
    //   177: aload #6
    //   179: aload #12
    //   181: invokevirtual ZN : (Lburp/Ze3n;Lburp/Zmzk;JLburp/Zefx;Lburp/Zb6q;Ljava/util/List;)Lburp/Zvow;
    //   184: astore #10
    //   186: aload #9
    //   188: iconst_0
    //   189: aload #10
    //   191: invokeinterface add : (ILjava/lang/Object;)V
    //   196: aload #9
    //   198: areturn
  }
  
  private List<Zmlv> Z_(Zstu paramZstu, Zsdd paramZsdd) {
    ArrayList<Zmlv> arrayList = new ArrayList();
    HashSet<Zb3t> hashSet = new HashSet(paramZsdd.ZD().Zp().size());
    Iterator<Zb3t> iterator = paramZsdd.ZD().Zp().iterator();
    boolean bool = Zz_q.ZB();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      Zz_y zz_y = (Zz_y)zb3t.ZJ();
      Zmlv zmlv = null;
      for (Zmlv zmlv1 : arrayList) {
        if (zmlv1.ZW.Za().equals(zz_y.Zi().Za())) {
          zmlv = zmlv1;
          break;
        } 
      } 
      if (zmlv == null) {
        zmlv = new Zmlv(zz_y);
        arrayList.add(zmlv);
      } 
      if (!hashSet.contains(zb3t)) {
        hashSet.add(zb3t);
        zmlv.ZI.add(Zc(paramZstu, zb3t, zz_y));
      } 
      if (bool)
        break; 
    } 
    return arrayList;
  }
  
  private Zl1r Zc(Zstu paramZstu, Zb3t paramZb3t, Zz_y paramZz_y) {
    boolean bool = Zz_q.Za();
    int i = paramZz_y.ZW();
    if (paramZz_y.ZE()) {
      String str = paramZstu.Zb(i, paramZz_y.Zf()).Zis();
      int[] arrayOfInt = { paramZb3t.ZT(), paramZb3t.Zz() };
      Zrzt.ZE(str, arrayOfInt);
      Zl1r zl1r = Zrlp.Zj(arrayOfInt[0] + i, arrayOfInt[1] + i);
      return !bool ? Zrlp.Zj(paramZb3t.ZT() + i, paramZb3t.Zz() + i) : zl1r;
    } 
    return Zrlp.Zj(paramZb3t.ZT() + i, paramZb3t.Zz() + i);
  }
  
  private Zvow ZN(Ze3n paramZe3n, Zmzk paramZmzk, long paramLong, Zefx paramZefx, Zb6q paramZb6q, List<Zl1r> paramList) {
    return paramZe3n.Zv(paramZmzk).ZF(paramLong).ZC(paramZefx).Zo(paramZb6q).Z_(paramList);
  }
  
  private List<Zl1r> Zi(List<Zmlv> paramList) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Iterator<Zmlv> iterator = paramList.iterator();
    boolean bool = Zz_q.ZB();
    while (iterator.hasNext()) {
      Zmlv zmlv = iterator.next();
      int[] arrayOfInt = zmlv.Zr;
      if (arrayOfInt != null)
        arrayList.add(Zrlp.Zh(arrayOfInt)); 
      if (bool)
        break; 
    } 
    return arrayList;
  }
  
  private List<Zznw> ZO(Zsdd paramZsdd) {
    Zrn9 zrn9 = paramZsdd.ZD();
    List<Zb3t> list = zrn9.Zp();
    ArrayList<Zznw> arrayList = new ArrayList();
    Iterator<Zb3t> iterator = list.iterator();
    boolean bool = Zz_q.Za();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      arrayList.add(new Zznw(zb3t, zrn9));
      if (!bool)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkox.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */