package org.bouncycastle.jsse;

import java.util.List;

public interface BCApplicationProtocolSelector<T> {
  String select(T paramT, List<String> paramList);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\BCApplicationProtocolSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */