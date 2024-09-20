package burp;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import net.portswigger.Zfb;
import net.portswigger.Zrmq;
import net.portswigger.Zv3;

public interface Zgpb {
  Zrmq ZT();
  
  static Zfb Zo(Collection<? extends Zgpb> paramCollection) {
    return Zv3.ZV(paramCollection.stream().map(Zgpb::ZT).toList());
  }
  
  static <T> List<T> ZF(Zrmq paramZrmq, Function<Zrmq, T> paramFunction) {
    return ((Zfb)paramZrmq.Zv(Zgpb::lambda$fromNullableArray$0, Zv3.ZG())).Zc().<T>map(paramFunction).toList();
  }
  
  private static Zfb lambda$fromNullableArray$0(Zrmq paramZrmq) {
    return paramZrmq.Zy() ? Zv3.ZG() : (Zfb)paramZrmq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgpb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */