package burp;

import java.util.function.BooleanSupplier;

class Zlw7 {
  static Zgdp ZW(Zex_ paramZex_, boolean paramBoolean, BooleanSupplier paramBooleanSupplier) {
    Zgdp zgdp = Ztir.DONE;
    if (paramZex_.Ze())
      return ZV(paramZex_); 
    if (paramBoolean)
      zgdp = paramBooleanSupplier.getAsBoolean() ? Ztir.STREAMING_STORED : Ztir.STREAMING_NOT_STORED; 
    int i = paramZex_.ZZ();
    if (i > 0)
      zgdp = Zgdp.ZJ(zgdp, i); 
    return zgdp;
  }
  
  private static Zgdp ZV(Zex_ paramZex_) {
    Exception exception = paramZex_.ZB();
    return (exception instanceof Zls6) ? Ztir.HTTP2_NOT_ADVERTISED_MESSAGE : ((exception instanceof Zx0m) ? Ztir.CONNECTION_CLOSED_DURING_REQUEST_SEQUENCE : Zgdp.ZT(exception));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlw7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */