package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec;

public interface CMCEKey extends Key {
  CMCEParameterSpec getParameterSpec();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\interfaces\CMCEKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */