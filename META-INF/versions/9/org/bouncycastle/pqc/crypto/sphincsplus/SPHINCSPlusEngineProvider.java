package META-INF.versions.9.org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine;

interface SPHINCSPlusEngineProvider {
  int getN();
  
  SPHINCSPlusEngine get();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusEngineProvider.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */