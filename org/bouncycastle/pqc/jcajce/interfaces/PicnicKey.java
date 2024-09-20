package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec;

public interface PicnicKey extends Key {
  PicnicParameterSpec getParameterSpec();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\interfaces\PicnicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */