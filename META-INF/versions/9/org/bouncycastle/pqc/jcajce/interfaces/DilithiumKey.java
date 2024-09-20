package META-INF.versions.9.org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;

public interface DilithiumKey extends Key {
  DilithiumParameterSpec getParameterSpec();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\interfaces\DilithiumKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */