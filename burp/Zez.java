package burp;

import java.util.function.Supplier;
import net.portswigger.Zfp;
import net.portswigger.Zm2;

interface Zez {
  void Zy(Ze9k paramZe9k);
  
  static Supplier<Zez> Zu(Zfp paramZfp) {
    return paramZfp::lambda$simplePayloadSourceTelemetry$1;
  }
  
  private static Zez lambda$simplePayloadSourceTelemetry$1(Zfp paramZfp) {
    return paramZfp::lambda$simplePayloadSourceTelemetry$0;
  }
  
  private static void lambda$simplePayloadSourceTelemetry$0(Zfp paramZfp, Ze9k paramZe9k) {
    Zm2.Zo(paramZfp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zez.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */