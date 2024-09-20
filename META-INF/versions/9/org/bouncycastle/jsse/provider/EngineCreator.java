package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.GeneralSecurityException;

interface EngineCreator {
  Object createInstance(Object paramObject) throws GeneralSecurityException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\EngineCreator.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */