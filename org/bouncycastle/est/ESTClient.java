package org.bouncycastle.est;

import java.io.IOException;

public interface ESTClient {
  ESTResponse doRequest(ESTRequest paramESTRequest) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\est\ESTClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */