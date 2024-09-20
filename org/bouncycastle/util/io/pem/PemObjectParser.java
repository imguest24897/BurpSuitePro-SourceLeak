package org.bouncycastle.util.io.pem;

import java.io.IOException;

public interface PemObjectParser {
  Object parseObject(PemObject paramPemObject) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\io\pem\PemObjectParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */