package net.portswigger.devtools.client.impl;

import java.util.concurrent.Future;
import net.portswigger.browser.Zd2;
import net.portswigger.browser.Zjt;
import net.portswigger.devtools.protocol.events.network.LoadingFailed;

class Zxp {
  private final Zjt ZM;
  
  private final Future<?> Zj;
  
  final Zxn Z_;
  
  private Zxp(Zxn paramZxn, Zjt paramZjt, Future<?> paramFuture) {
    this.ZM = paramZjt;
    this.Zj = paramFuture;
  }
  
  private boolean ZN(LoadingFailed paramLoadingFailed) {
    return (paramLoadingFailed.requestId != null && paramLoadingFailed.requestId.equals(this.ZM.ZT().ZB8()));
  }
  
  private void Ze() {
    this.Zj.cancel(false);
    if (this.ZM.ZT() != null)
      ((Zoh)this.Z_.Zp.computeIfAbsent(this.ZM.ZT(), Zxp::lambda$cancel$0)).Zp(); 
  }
  
  private static Zoh lambda$cancel$0(Zd2 paramZd2) {
    return new Zoh();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */