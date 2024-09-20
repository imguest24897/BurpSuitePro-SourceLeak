package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.types.schema.Domain;

@Deprecated
public interface Schema {
  @Zr("domains")
  CompletableFuture<Zf<List<Domain>>> getDomains();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Schema.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */