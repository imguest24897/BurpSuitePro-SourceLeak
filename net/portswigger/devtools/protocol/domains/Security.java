package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.security.CertificateError;
import net.portswigger.devtools.protocol.events.security.SecurityStateChanged;
import net.portswigger.devtools.protocol.events.security.VisibleSecurityStateChanged;
import net.portswigger.devtools.protocol.types.security.CertificateErrorAction;

public interface Security {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> setIgnoreCertificateErrors(@Zu("ignore") Boolean paramBoolean);
  
  @Deprecated
  CompletableFuture<Zf<Void>> handleCertificateError(@Zu("eventId") Integer paramInteger, @Zu("action") CertificateErrorAction paramCertificateErrorAction);
  
  @Deprecated
  CompletableFuture<Zf<Void>> setOverrideCertificateErrors(@Zu("override") Boolean paramBoolean);
  
  @Zb("certificateError")
  @Deprecated
  Zs onCertificateError(Zp<CertificateError> paramZp) throws Zp;
  
  @Zb("visibleSecurityStateChanged")
  @Zy
  Zs onVisibleSecurityStateChanged(Zp<VisibleSecurityStateChanged> paramZp) throws Zp;
  
  @Zb("securityStateChanged")
  @Deprecated
  Zs onSecurityStateChanged(Zp<SecurityStateChanged> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Security.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */