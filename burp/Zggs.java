package burp;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

class Zggs {
  static Optional<Zlru> ZS(List<Zlru> paramList) {
    return paramList.isEmpty() ? Optional.<Zlru>empty() : Optional.<Zlru>of(paramList.get(0));
  }
  
  static void Zr(boolean paramBoolean, List<Zlru> paramList, Collection<Zr8t> paramCollection, Zmv7 paramZmv7) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifeq -> 10
    //   9: return
    //   10: aload_1
    //   11: iconst_0
    //   12: invokeinterface remove : (I)Ljava/lang/Object;
    //   17: checkcast burp/Zlru
    //   20: astore #4
    //   22: aload_3
    //   23: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   26: getstatic burp/Zlq7.ADVANCE_KEY : Lburp/Zlq7;
    //   29: iconst_2
    //   30: anewarray java/lang/Object
    //   33: dup
    //   34: iconst_0
    //   35: aload #4
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: aload_1
    //   41: invokeinterface size : ()I
    //   46: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   49: aastore
    //   50: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   55: aload_2
    //   56: iload_0
    //   57: aload #4
    //   59: <illegal opcode> accept : (ZLburp/Zlru;)Ljava/util/function/Consumer;
    //   64: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   69: return
  }
  
  static boolean Zj(Collection<Zr8t> paramCollection, List<Zlru> paramList, Zmv7 paramZmv7) {
    if (paramList.isEmpty())
      return true; 
    Zlru zlru = paramList.get(0);
    if (paramCollection.stream().anyMatch(zlru::lambda$isEmpty$1)) {
      paramZmv7.Zy(Zrp6.INFO, Zlq7.DISCONTINUATION_STRATEGY_APPLIED, new Object[0]);
      paramList.clear();
      return true;
    } 
    return false;
  }
  
  private static boolean lambda$isEmpty$1(Zlru paramZlru, Zr8t paramZr8t) {
    return paramZr8t.Zz(paramZlru);
  }
  
  private static void lambda$advance$0(boolean paramBoolean, Zlru paramZlru, Zr8t paramZr8t) {
    String[] arrayOfString = Zrxo.Zk();
    if (paramBoolean) {
      paramZr8t.Zw(paramZlru);
      if (arrayOfString == null) {
        paramZr8t.ZD(paramZlru);
        return;
      } 
      return;
    } 
    paramZr8t.ZD(paramZlru);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */