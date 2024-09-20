package net.portswigger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zth {
  public static final Zrm7 ZN;
  
  private Ztb ZX;
  
  public Zth(Ztb paramZtb) {
    this.ZX = paramZtb;
  }
  
  public Zrmf ZR(Zrmf paramZrmf) {
    Zqa zqa = new Zqa(paramZrmf);
    try {
      Za3 za3 = new Za3();
      List<Zms> list = ZB();
      try {
        if (!list.isEmpty()) {
          Objects.requireNonNull(za3);
          list.forEach(za3::Zn);
          zqa.Zw(za3.Zg());
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return zqa.ZG();
  }
  
  private List<Zms> ZB() {
    List<List<Zms>> list = (List)this.ZX.ZO().stream().map(this::lambda$getCookiesFragments$0).filter(Zth::lambda$getCookiesFragments$1).collect(Collectors.toList());
    ZX(list);
    return (List<Zms>)list.stream().flatMap(Collection::stream).collect(Collectors.toList());
  }
  
  private void ZX(List<List<Zms>> paramList) {
    ListIterator<List<Zms>> listIterator = paramList.listIterator();
    String[] arrayOfString = Zki.Zl();
    while (listIterator.hasNext()) {
      List<Zrm7> list = (List)listIterator.next();
      try {
        if (listIterator.hasNext())
          list.add(ZN); 
      } catch (Zki zki) {
        throw a(null);
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private Stream<Zms> Zr(Zi5 paramZi5) {
    Stream stream = Zeu.ZA(paramZi5).<Stream>map(paramZi5::lambda$getCookie$2).orElse(Stream.empty());
    return Zud.Zj((Stream<Zms>[])new Stream[] { stream });
  }
  
  private static Stream lambda$getCookie$2(Zi5 paramZi5, Zms paramZms) {
    return Stream.of(new Zms[] { new Zrm7(paramZi5.ZX() + "="), paramZms });
  }
  
  private static boolean lambda$getCookiesFragments$1(List paramList) {
    try {
    
    } catch (Zki zki) {
      throw a(null);
    } 
    return !paramList.isEmpty();
  }
  
  private List lambda$getCookiesFragments$0(Zi5 paramZi5) {
    try {
      return Zr(paramZi5).collect((Collector)Collectors.toList());
    } catch (Zki zki) {
      Zah.Zl(zki, Zk_.COMMON_RUNTIME_FAILURE);
      return new ArrayList();
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #86
    //   2: ldc '1p'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 152
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 126
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #92
    //   82: goto -> 110
    //   85: bipush #6
    //   87: goto -> 110
    //   90: iconst_5
    //   91: goto -> 110
    //   94: bipush #33
    //   96: goto -> 110
    //   99: bipush #107
    //   101: goto -> 110
    //   104: iconst_5
    //   105: goto -> 110
    //   108: bipush #14
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #1, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 33
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_1
    //   130: if_icmpgt -> 30
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: new net/portswigger/Zrm7
    //   155: dup
    //   156: aload_0
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: putstatic net/portswigger/Zth.ZN : Lnet/portswigger/Zrm7;
    //   163: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zth.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */