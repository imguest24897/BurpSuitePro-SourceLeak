package burp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class Zly {
  private final Ze3n ZD;
  
  Zly(Ze3n paramZe3n) {
    this.ZD = paramZe3n;
  }
  
  Zsqx<Zrdb> ZE(Zsxd paramZsxd, String paramString) {
    Zm86 zm86 = Zm86.ZJ(Zsoh.Zu(paramZsxd).Zis());
    return zm86.ZI() ? ZN(this.ZD, paramZsxd.Zz().ZR().ZD(), Zsoh.ZA(paramZsxd), paramString, zm86) : null;
  }
  
  private static Zsqx<Zrdb> ZN(Ze3n paramZe3n, byte[] paramArrayOfbyte, Zstu paramZstu, String paramString, Zm86 paramZm86) {
    Collection<String> collection = paramZm86.Zf();
    Zvow zvow = paramZe3n.ZI().Zp(paramArrayOfbyte).ZK(Za(paramArrayOfbyte, paramString)).Zu(paramZstu).Z_(ZE(paramZstu.ZiD(), collection));
    boolean bool = collection.isEmpty() ? true : true;
    return Zzhp.ZK(paramZe3n.Za(), zvow, paramString, bool, !collection.isEmpty());
  }
  
  private static List<Zl1r> Za(byte[] paramArrayOfbyte, String paramString) {
    LinkedList<Zl1r> linkedList = new LinkedList();
    Zl8v.Zm(paramString, paramArrayOfbyte, 0, paramArrayOfbyte.length, linkedList, false);
    return linkedList;
  }
  
  private static List<Zl1r> ZE(byte[] paramArrayOfbyte, Collection<String> paramCollection) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifeq -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedList
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore_2
    //   19: new burp/Zth2
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore_3
    //   27: aload_1
    //   28: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   33: aload_3
    //   34: dup
    //   35: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: pop
    //   39: <illegal opcode> apply : (Lburp/Zth2;)Ljava/util/function/Function;
    //   44: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   49: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   54: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   59: aload_0
    //   60: aload_2
    //   61: <illegal opcode> accept : ([BLjava/util/List;)Ljava/util/function/Consumer;
    //   66: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   71: aload_2
    //   72: areturn
  }
  
  private static void lambda$highlightResponse$1(byte[] paramArrayOfbyte, List<Zl1r> paramList, String paramString) {
    Zl8v.Zm(paramString, paramArrayOfbyte, 0, paramArrayOfbyte.length, paramList, true);
  }
  
  private static String lambda$highlightResponse$0(String paramString) {
    return "\"" + paramString + "\"";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zly.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */