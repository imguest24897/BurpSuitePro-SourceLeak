package net.portswigger.devtools.client.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import net.portswigger.browser.Zev;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.target.AttachedToTarget;
import net.portswigger.devtools.protocol.events.target.TargetCrashed;
import net.portswigger.devtools.protocol.events.target.TargetDestroyed;

class Zb {
  private final Zs Za;
  
  private final Zs ZB;
  
  private final Zs Zv;
  
  private final Set<Zev> Zh = new CopyOnWriteArraySet<>();
  
  private final Collection<Zev> ZU = new HashSet<>();
  
  private final CountDownLatch ZW = new CountDownLatch(1);
  
  public Zb(Zn paramZn) throws Z_, Zp {
    this.Za = paramZn.Zn(this::lambda$new$1);
    this.ZB = paramZn.Zn(this::lambda$new$3);
    this.Zv = paramZn.Zn(this::lambda$new$5);
  }
  
  private void ZE(Zev paramZev) {
    this.Zh.add(paramZev);
    if (this.Zh.containsAll(this.ZU))
      ZP(); 
  }
  
  private void ZP() {
    this.ZW.countDown();
    this.Za.Zf();
    this.ZB.Zf();
    this.Zv.Zf();
  }
  
  public CountDownLatch Zw(Collection<Zev> paramCollection) {
    this.ZU.addAll(paramCollection);
    if (this.Zh.containsAll(paramCollection))
      ZP(); 
    return this.ZW;
  }
  
  private Zs lambda$new$5(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getTarget().onTargetDestroyed(this::lambda$new$4);
  }
  
  private void lambda$new$4(TargetDestroyed paramTargetDestroyed) {
    ZE(new Zev(paramTargetDestroyed.targetId));
  }
  
  private Zs lambda$new$3(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getTarget().onTargetCrashed(this::lambda$new$2);
  }
  
  private void lambda$new$2(TargetCrashed paramTargetCrashed) {
    ZE(new Zev(paramTargetCrashed.targetId));
  }
  
  private Zs lambda$new$1(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getTarget().onAttachedToTarget(this::lambda$new$0);
  }
  
  private void lambda$new$0(AttachedToTarget paramAttachedToTarget) {
    ZE(new Zev(paramAttachedToTarget.targetInfo.targetId));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */