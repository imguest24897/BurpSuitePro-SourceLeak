package net.portswigger;

import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Zlm {
  public static List<Zf6> Zo(Zid paramZid) {
    return Zoz.ZK(paramZid, Zlm::ZW);
  }
  
  static Zf6 ZW(Zr paramZr) {
    Ziz ziz = new Ziz();
    paramZr.Zj().forEachRemaining(ziz::lambda$buildJsonFragmentFromObjectNode$1);
    return ziz.ZI();
  }
  
  static Zh2 Zd(Zh paramZh) {
    Zdx zdx = new Zdx();
    paramZh.Zn().forEachRemaining(zdx::lambda$buildJsonArrayFragmentFromObjectNode$2);
    return zdx.ZO();
  }
  
  static Optional<Zms> ZE(Zb paramZb) {
    return Zoz.ZH(paramZb, Zlm::lambda$buildFragmentFromJsonNode$3, Zlm::lambda$buildFragmentFromJsonNode$4);
  }
  
  private static Optional lambda$buildFragmentFromJsonNode$4(Zh paramZh) {
    return Optional.of(Zd(paramZh));
  }
  
  private static Optional lambda$buildFragmentFromJsonNode$3(Zr paramZr) {
    return Optional.of(ZW(paramZr));
  }
  
  private static void lambda$buildJsonArrayFragmentFromObjectNode$2(Zdx paramZdx, Zb paramZb) {
    Objects.requireNonNull(paramZdx);
    ZE(paramZb).ifPresent(paramZdx::Zn);
  }
  
  private static void lambda$buildJsonFragmentFromObjectNode$1(Ziz paramZiz, Map.Entry paramEntry) {
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
    //   21: invokestatic ZE : (Lcom/fasterxml/Zor/Zb;)Ljava/util/Optional;
    //   24: aload_0
    //   25: aload_2
    //   26: <illegal opcode> accept : (Lnet/portswigger/Ziz;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   31: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   34: return
  }
  
  private static void lambda$buildJsonFragmentFromObjectNode$0(Ziz paramZiz, String paramString, Zms paramZms) {
    paramZiz.ZG(paramString, paramZms);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zlm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */