package net.portswigger.devtools.client.impl.connection;

import burp.Zlli;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.impl.Zm_;
import net.portswigger.devtools.client.impl.Zmf;
import net.portswigger.devtools.client.impl.Zxi;

public interface Zl extends Zlli<Zu> {
  void Ze(URI paramURI, String paramString) throws Zi;
  
  void Zd();
  
  URI Zf();
  
  boolean ZR();
  
  CompletableFuture<Zf<?>> ZP(Zm_ paramZm_);
  
  void ZR(Predicate<Zmf> paramPredicate);
  
  Zxi Zp();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Zl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */