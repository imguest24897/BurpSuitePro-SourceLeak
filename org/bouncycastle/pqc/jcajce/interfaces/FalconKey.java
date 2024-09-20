package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec;

public interface FalconKey extends Key {
  FalconParameterSpec getParameterSpec();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\interfaces\FalconKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */