package net.portswigger.devtools.client.impl;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zco;
import net.portswigger.browser.Zd1;
import net.portswigger.browser.Zk;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zxt implements Zk {
  private final Zn ZR;
  
  public Zxt(Zn paramZn) {
    this.ZR = Objects.<Zn>requireNonNull(paramZn);
  }
  
  public void ZF(Zco paramZco) throws Ztk {
    try {
      this.ZR.Zz(Zk.ZA(paramZco::lambda$mouseEvent$0));
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  public void Zp(Zd1 paramZd1) throws Ztk {
    try {
      this.ZR.Zz(Zk.ZA(paramZd1::lambda$keyEvent$1));
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  private static CompletableFuture lambda$text$2(String paramString, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getInput().insertText(paramString);
  }
  
  private static CompletableFuture lambda$keyEvent$1(Zd1 paramZd1, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getInput().dispatchKeyEvent(Zm.Zw().ZF(paramZd1.ZA()), Zm6.ZJ().ZZ(paramZd1.ZD()), null, paramZd1.ZM(), paramZd1.Zt(), paramZd1.ZZ(), null, paramZd1.ZL(), paramZd1.Zv(), paramZd1.Zk(), paramZd1.Zi(), paramZd1.Zl(), paramZd1.ZY(), null, null);
  }
  
  private static CompletableFuture lambda$mouseEvent$0(Zco paramZco, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getInput().dispatchMouseEvent(Zq.Zq().ZF(paramZco.ZQ()), Double.valueOf(paramZco.Zz()), Double.valueOf(paramZco.ZM()), Zm6.ZJ().ZZ(paramZco.Zq()), null, Zmq.ZT().ZF(paramZco.ZK()), Integer.valueOf(paramZco.Zl()), Integer.valueOf(paramZco.ZS()), null, null, null, null, null, null, null, Zxm.ZW().ZF(paramZco.ZT()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */