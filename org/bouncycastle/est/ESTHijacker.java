package org.bouncycastle.est;

import java.io.IOException;

public interface ESTHijacker {
  ESTResponse hijack(ESTRequest paramESTRequest, Source paramSource) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\est\ESTHijacker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */