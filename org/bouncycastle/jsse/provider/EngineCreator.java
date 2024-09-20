package org.bouncycastle.jsse.provider;

import java.security.GeneralSecurityException;

interface EngineCreator {
  Object createInstance(Object paramObject) throws GeneralSecurityException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\EngineCreator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */