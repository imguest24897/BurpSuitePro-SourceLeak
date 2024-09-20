package net.portswigger;

import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Zlx {
  static List<Zu3> ZN(Zid paramZid) {
    return Zoz.ZK(paramZid, Zlx::ZA);
  }
  
  static Zu3 ZA(Zr paramZr) {
    Ztz ztz = new Ztz();
    paramZr.Zj().forEachRemaining(ztz::lambda$buildFormObjectFragmentFromObjectNode$1);
    return ztz.ZX();
  }
  
  static Zoj ZW(Zh paramZh) {
    Zur zur = new Zur();
    paramZh.Zn().forEachRemaining(zur::lambda$buildFormArrayFragmentFromObjectNode$2);
    return zur.ZS();
  }
  
  static Optional<Zms> ZB(Zb paramZb) {
    if (paramZb != null) {
      switch (Zi3.Zr[paramZb.ZF().ordinal()]) {
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
      } 
      return Optional.empty();
    } 
    return Optional.empty();
  }
  
  private static void lambda$buildFormArrayFragmentFromObjectNode$2(Zur paramZur, Zb paramZb) {
    Objects.requireNonNull(paramZur);
    ZB(paramZb).ifPresent(paramZur::Zx);
  }
  
  private static void lambda$buildFormObjectFragmentFromObjectNode$1(Ztz paramZtz, Map.Entry paramEntry) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getKey : ()Ljava/lang/Object;
    //   6: checkcast java/lang/String
    //   9: astore_2
    //   10: aload_1
    //   11: invokeinterface getValue : ()Ljava/lang/Object;
    //   16: checkcast com/fasterxml/Zor/Zb
    //   19: astore_3
    //   20: aload_3
    //   21: invokestatic ZB : (Lcom/fasterxml/Zor/Zb;)Ljava/util/Optional;
    //   24: aload_0
    //   25: aload_2
    //   26: <illegal opcode> accept : (Lnet/portswigger/Ztz;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   31: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   34: return
  }
  
  private static void lambda$buildFormObjectFragmentFromObjectNode$0(Ztz paramZtz, String paramString, Zms paramZms) {
    paramZtz.ZK(paramString, paramZms);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zlx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */