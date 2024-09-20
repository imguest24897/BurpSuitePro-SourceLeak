package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.SABERParameterSpec;

public interface SABERKey extends Key {
  SABERParameterSpec getParameterSpec();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\interfaces\SABERKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */