package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ze5_ implements Zehc {
  private final Ze3n Zi;
  
  private static String Zb;
  
  public Ze5_(Ze3n paramZe3n) {
    this.Zi = paramZe3n;
  }
  
  public Ztk8 Zb() {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zt : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual ZS : ()Ljava/util/stream/Stream;
    //   15: aload_0
    //   16: <illegal opcode> test : (Lburp/Ze5_;)Ljava/util/function/Predicate;
    //   21: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   26: aload_0
    //   27: aload_2
    //   28: <illegal opcode> accept : (Lburp/Ze5_;Lburp/Zgq;)Ljava/util/function/Consumer;
    //   33: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   38: astore_1
    //   39: aload_2
    //   40: invokestatic Zy : (Lburp/Zgq;)Lburp/Ztk8;
    //   43: aload_1
    //   44: ifnull -> 54
    //   47: iconst_3
    //   48: anewarray burp/Zbqc
    //   51: invokestatic Zr : ([Lburp/Zbqc;)V
    //   54: areturn
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_DuplicateSetCookies;
  }
  
  private Stream<List<Ztbr>> ZS() {
    return ((LinkedHashMap)(this.Zi.Zp()).ZN.stream().filter(Ze5_::lambda$getCookiesGroupedByName$1).collect(Collectors.groupingBy(Ztbr::Zqy, LinkedHashMap::new, Collectors.toList()))).values().stream();
  }
  
  private boolean ZX(List<Ztbr> paramList) {
    return (paramList.stream().map(Ztbr::Zq0).distinct().count() > 1L);
  }
  
  private List<Zl1r> Zb(Collection<Ztbr> paramCollection) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Iterator<Ztbr> iterator = paramCollection.iterator();
    String str = Zt();
    while (iterator.hasNext()) {
      Ztbr ztbr = iterator.next();
      int i = Zlt_.Zc(this.Zi.ZL().Za(), (byte)10, 0, ztbr.ZqE());
      if (i < 0)
        continue; 
      arrayList.add(Zrlp.Zj(++i, i + ztbr.Zqk().length()));
      if (str != null)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean lambda$getCookiesGroupedByName$1(Ztbr paramZtbr) {
    return Zsw8.ZS(paramZtbr.Zq0());
  }
  
  private void lambda$doCheck$0(Zgq paramZgq, List<Ztbr> paramList) {
    List<Zl1r> list = Zb(paramList);
    Zvow zvow = this.Zi.Zt().Z_(list);
    paramZgq.Zu(Ztco.ZL(this.Zi.Za(), this.Zi.ZN(), zvow, paramList.get(0)));
  }
  
  public static void Z_(String paramString) {
    Zb = paramString;
  }
  
  public static String Zt() {
    return Zb;
  }
  
  static {
    if (Zt() != null)
      Z_("aF97q"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */