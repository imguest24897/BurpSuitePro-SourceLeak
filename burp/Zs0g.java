package burp;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class Zs0g {
  private final Zt4u Zf;
  
  private final Supplier<Zx8n> Ze;
  
  private final Zbnt ZM;
  
  private final Ztwv Zh;
  
  private final Zey9 ZR;
  
  public Zs0g(Zt4u paramZt4u, Supplier<Zx8n> paramSupplier, Zbnt paramZbnt, Ztwv paramZtwv, Zey9 paramZey9) {
    this.Zf = paramZt4u;
    this.Ze = paramSupplier;
    this.ZM = paramZbnt;
    this.Zh = paramZtwv;
    this.ZR = paramZey9;
  }
  
  public void Zu(Collection<Zrdb> paramCollection) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: new java/util/LinkedList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore_3
    //   16: aload_1
    //   17: aload_3
    //   18: aload_2
    //   19: <illegal opcode> accept : (Ljava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
    //   24: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   29: aload_1
    //   30: invokeinterface isEmpty : ()Z
    //   35: ifne -> 87
    //   38: new burp/Zrdv
    //   41: dup
    //   42: aload_2
    //   43: aload_3
    //   44: invokespecial <init> : (Ljava/util/Collection;Ljava/util/Collection;)V
    //   47: astore #4
    //   49: new burp/Zkeg
    //   52: dup
    //   53: aload_0
    //   54: getfield Zf : Lburp/Zt4u;
    //   57: aload_0
    //   58: getfield Ze : Ljava/util/function/Supplier;
    //   61: invokeinterface get : ()Ljava/lang/Object;
    //   66: checkcast burp/Zx8n
    //   69: aload #4
    //   71: aload_0
    //   72: getfield ZM : Lburp/Zbnt;
    //   75: aload_0
    //   76: getfield Zh : Lburp/Ztwv;
    //   79: aload_0
    //   80: getfield ZR : Lburp/Zey9;
    //   83: invokespecial <init> : (Lburp/Zt4u;Lburp/Zx8n;Lburp/Zrdv;Lburp/Zbnt;Lburp/Ztwv;Lburp/Zey9;)V
    //   86: pop
    //   87: return
  }
  
  private static void lambda$initiateReport$0(List paramList1, List paramList2, Zrdb paramZrdb) {
    List<Zrdb> list = (paramZrdb.ZaJ() == -1) ? paramList1 : paramList2;
    list.add(paramZrdb);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs0g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */