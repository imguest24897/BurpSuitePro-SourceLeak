package net.portswigger;

import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Zs2 {
  public static List<Zms> ZL(Zid paramZid) {
    return Zoz.ZK(paramZid, Zs2::ZI);
  }
  
  private static Zt2 ZI(Zr paramZr) {
    Ztk ztk = new Ztk();
    paramZr.Zj().forEachRemaining(ztk::lambda$buildXmlFragmentFromObjectNode$0);
    return ztk.Zk();
  }
  
  private static Zlw ZF(String paramString, Zb paramZb) {
    Zuq zuq = (new Zuq()).Zb(paramString);
    Objects.requireNonNull(zuq);
    ZP(paramZb).ifPresent(zuq::Za);
    return zuq.Zu();
  }
  
  private static Optional<Zms> ZP(Zb paramZb) {
    return Zoz.ZH(paramZb, Zs2::lambda$getContentsFromJsonNode$1, Zs2::lambda$getContentsFromJsonNode$2);
  }
  
  private static Optional lambda$getContentsFromJsonNode$2(Zh paramZh) {
    return Optional.empty();
  }
  
  private static Optional lambda$getContentsFromJsonNode$1(Zr paramZr) {
    return Optional.empty();
  }
  
  private static void lambda$buildXmlFragmentFromObjectNode$0(Ztk paramZtk, Map.Entry paramEntry) {
    paramZtk.Zt(ZF((String)paramEntry.getKey(), (Zb)paramEntry.getValue()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zs2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */