package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zsmx {
  private final List<Zgh_> Zj;
  
  private final Zm03 Za;
  
  private final Zbph Zh;
  
  private final Zbnt ZZ;
  
  private final List<Zxs7> ZB;
  
  Zsmx(List<Zgh_> paramList, Zm03 paramZm03, Zbph paramZbph, Zbnt paramZbnt) {
    this.Zj = paramList;
    this.Za = paramZm03;
    this.Zh = paramZbph;
    this.ZZ = paramZbnt;
    this.ZB = new ArrayList<>();
  }
  
  public Zsmx ZU(Zmfj paramZmfj, Zerg paramZerg) {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: invokevirtual ZH : (Lburp/Zmfj;Lburp/Zerg;)Ljava/util/List;
    //   10: invokeinterface iterator : ()Ljava/util/Iterator;
    //   15: astore #4
    //   17: aload #4
    //   19: invokeinterface hasNext : ()Z
    //   24: ifeq -> 169
    //   27: aload #4
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast burp/Zxs7
    //   37: astore #5
    //   39: aload_0
    //   40: getfield Zh : Lburp/Zbph;
    //   43: ifnull -> 95
    //   46: aload_0
    //   47: getfield Zj : Ljava/util/List;
    //   50: invokeinterface size : ()I
    //   55: aload_0
    //   56: getfield ZB : Ljava/util/List;
    //   59: invokeinterface size : ()I
    //   64: iadd
    //   65: aload_0
    //   66: getfield Zh : Lburp/Zbph;
    //   69: invokeinterface ZNE : ()I
    //   74: if_icmplt -> 95
    //   77: aload_0
    //   78: getfield Za : Lburp/Zm03;
    //   81: aload #5
    //   83: invokeinterface Z_ : ()Lburp/Zs66;
    //   88: invokevirtual ZU : (Lburp/Zs66;)V
    //   91: aload_3
    //   92: ifnull -> 165
    //   95: aload_0
    //   96: getfield Zh : Lburp/Zbph;
    //   99: ifnull -> 153
    //   102: aload_0
    //   103: getfield Zh : Lburp/Zbph;
    //   106: aload #5
    //   108: invokeinterface Z_ : ()Lburp/Zs66;
    //   113: aload #5
    //   115: invokeinterface Zf : ()Ljava/lang/String;
    //   120: aload #5
    //   122: invokeinterface ZI : ()Ljava/lang/String;
    //   127: invokeinterface Z_ : (Lburp/Zs66;Ljava/lang/String;Ljava/lang/String;)Z
    //   132: ifeq -> 153
    //   135: aload_0
    //   136: getfield Za : Lburp/Zm03;
    //   139: aload #5
    //   141: invokeinterface Z_ : ()Lburp/Zs66;
    //   146: invokevirtual Zc : (Lburp/Zs66;)V
    //   149: aload_3
    //   150: ifnull -> 165
    //   153: aload_0
    //   154: getfield ZB : Ljava/util/List;
    //   157: aload #5
    //   159: invokeinterface add : (Ljava/lang/Object;)Z
    //   164: pop
    //   165: aload_3
    //   166: ifnull -> 17
    //   169: aload_0
    //   170: areturn
  }
  
  public Zxdk Zm() {
    List<Zxs7> list = (List)this.Zj.stream().map(Zsmx::lambda$build$0).collect(Collectors.toList());
    list.addAll(this.ZB);
    return new Zxdk(list, this.Za);
  }
  
  private List<Zxs7> ZH(Zmfj paramZmfj, Zerg paramZerg) {
    AtomicInteger atomicInteger = new AtomicInteger();
    ArrayList<Zxs7> arrayList = new ArrayList();
    List<Zg_8> list = paramZerg.ZM().Zo();
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    try {
      if (list != null) {
        IHttpRequestResponse iHttpRequestResponse = Zkvw.Za(paramZmfj, this.ZZ);
        for (Zg_8 zg_8 : list) {
          List<Zxs7> list1 = zg_8.Zv(iHttpRequestResponse, atomicInteger);
          try {
            if (list1 != null)
              arrayList.addAll(list1); 
          } catch (Exception exception) {
            throw a(null);
          } 
          if (arrayOfZbqc != null)
            break; 
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return arrayList;
  }
  
  public Optional<Zxs7> Zh(Zro0 paramZro0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zj : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_1
    //   10: <illegal opcode> test : (Lburp/Zro0;)Ljava/util/function/Predicate;
    //   15: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   20: invokeinterface findFirst : ()Ljava/util/Optional;
    //   25: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   30: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   33: aload_0
    //   34: aload_1
    //   35: <illegal opcode> get : (Lburp/Zsmx;Lburp/Zro0;)Ljava/util/function/Supplier;
    //   40: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   43: areturn
  }
  
  private Optional lambda$find$4(Zro0 paramZro0) {
    return this.ZB.stream().filter(paramZro0::lambda$find$3).findFirst();
  }
  
  private static boolean lambda$find$3(Zro0 paramZro0, Zxs7 paramZxs7) {
    return paramZxs7.Zl().equals(paramZro0);
  }
  
  private static boolean lambda$find$1(Zro0 paramZro0, Zgh_ paramZgh_) {
    return paramZgh_.ZM().equals(paramZro0);
  }
  
  private static Zxs7 lambda$build$0(Zgh_ paramZgh_) {
    return paramZgh_.<Zxs7>Z_(new Zlvw());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */