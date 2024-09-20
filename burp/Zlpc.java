package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Function;

public class Zlpc {
  private final List<Zscl> Zh = new ArrayList<>();
  
  private final List<Zscl> ZJ = new ArrayList<>();
  
  private final List<Zscl> Zo = new ArrayList<>();
  
  public void Zf(List<Zscl> paramList) {
    // Byte code:
    //   0: invokestatic ZA : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 166
    //   8: aload_0
    //   9: getfield Zh : Ljava/util/List;
    //   12: dup
    //   13: astore_3
    //   14: monitorenter
    //   15: aload_0
    //   16: getfield Zh : Ljava/util/List;
    //   19: invokeinterface clear : ()V
    //   24: aload_0
    //   25: getfield Zo : Ljava/util/List;
    //   28: invokeinterface clear : ()V
    //   33: aload_0
    //   34: getfield ZJ : Ljava/util/List;
    //   37: invokeinterface clear : ()V
    //   42: aload_1
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 141
    //   60: aload #4
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast burp/Zscl
    //   70: astore #5
    //   72: aload #5
    //   74: getfield Z_ : Lnet/portswigger/Zcr;
    //   77: invokevirtual ZX : ()Z
    //   80: ifeq -> 106
    //   83: aload_0
    //   84: getfield ZJ : Ljava/util/List;
    //   87: aload #5
    //   89: invokeinterface add : (Ljava/lang/Object;)Z
    //   94: pop
    //   95: aload_2
    //   96: ifnull -> 137
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload_0
    //   107: getfield Zh : Ljava/util/List;
    //   110: aload #5
    //   112: invokeinterface add : (Ljava/lang/Object;)Z
    //   117: pop
    //   118: aload_0
    //   119: getfield Zo : Ljava/util/List;
    //   122: aload #5
    //   124: invokeinterface add : (Ljava/lang/Object;)Z
    //   129: pop
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload_2
    //   138: ifnull -> 50
    //   141: goto -> 154
    //   144: astore #4
    //   146: aload #4
    //   148: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   151: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   154: aload_3
    //   155: monitorexit
    //   156: goto -> 166
    //   159: astore #6
    //   161: aload_3
    //   162: monitorexit
    //   163: aload #6
    //   165: athrow
    //   166: return
    // Exception table:
    //   from	to	target	type
    //   15	141	144	java/lang/Exception
    //   15	156	159	finally
    //   72	99	102	java/lang/Exception
    //   83	130	133	java/lang/Exception
    //   159	163	159	finally
  }
  
  public List<Zscl> Zo() {
    synchronized (this.Zh) {
      return Zepo.Zj(this.Zh);
    } 
  }
  
  public List<Zscl> ZX() {
    synchronized (this.Zh) {
      return Zepo.Zj(this.ZJ);
    } 
  }
  
  public Zscl ZF(int paramInt) {
    synchronized (this.Zo) {
      return this.Zo.get(paramInt);
    } 
  }
  
  public int Zd() {
    synchronized (this.Zo) {
      return this.Zo.size();
    } 
  }
  
  public void ZJ(String paramString) {
    int[] arrayOfInt = Zee5.ZA();
    if (Zsw8.ZS(paramString)) {
      Zl(Zm(paramString));
      if (arrayOfInt != null) {
        Zl(Zo());
        return;
      } 
      return;
    } 
    Zl(Zo());
  }
  
  private List<Zscl> Zm(String paramString) {
    if (Zsw8.ZS(paramString)) {
      List<List<Zscl>> list = ZM(paramString);
      return ZB(list);
    } 
    return Zo();
  }
  
  private void Zl(List<Zscl> paramList) {
    synchronized (this.Zo) {
      this.Zo.clear();
      this.Zo.addAll(paramList);
    } 
  }
  
  private List<Zscl> ZB(List<List<Zscl>> paramList) {
    LinkedHashSet<? extends Zscl> linkedHashSet = new LinkedHashSet();
    Iterator<List<Zscl>> iterator = paramList.iterator();
    int[] arrayOfInt = Zee5.ZA();
    while (iterator.hasNext()) {
      List list = iterator.next();
      linkedHashSet.addAll(list);
      if (arrayOfInt != null)
        break; 
    } 
    return new ArrayList<>(linkedHashSet);
  }
  
  private List<List<Zscl>> ZM(String paramString) {
    ArrayList<List<Zscl>> arrayList = new ArrayList();
    List<Function> list = List.of(Zlpc::lambda$rankMatchingBapps$0, Zlpc::lambda$rankMatchingBapps$1, Zlpc::lambda$rankMatchingBapps$2);
    int[] arrayOfInt = Zee5.ZA();
    int i = list.size();
    for (Function<Zscl, String> function : list) {
      List<Zscl> list1 = ZA(paramString, i, function);
      arrayList.add(list1);
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  private List<Zscl> ZA(String paramString, int paramInt, Function<Zscl, String> paramFunction) {
    ArrayList<Zscl> arrayList = new ArrayList(paramInt);
    paramString = paramString.toLowerCase();
    Iterator<Zscl> iterator = Zo().iterator();
    int[] arrayOfInt = Zee5.ZA();
    while (iterator.hasNext()) {
      Zscl zscl = iterator.next();
      String str = ((String)paramFunction.apply(zscl)).toLowerCase();
      if (str.startsWith(paramString) || str.contains(paramString))
        arrayList.add(zscl); 
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  private static String lambda$rankMatchingBapps$2(Zscl paramZscl) {
    return paramZscl.Z_.Zm();
  }
  
  private static String lambda$rankMatchingBapps$1(Zscl paramZscl) {
    return paramZscl.Z_.Zx();
  }
  
  private static String lambda$rankMatchingBapps$0(Zscl paramZscl) {
    return paramZscl.Z_.ZI();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlpc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */