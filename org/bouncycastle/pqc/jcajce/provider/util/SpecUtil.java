package org.bouncycastle.pqc.jcajce.provider.util;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;

public class SpecUtil {
  private static Class[] NO_PARAMS = new Class[0];
  
  private static Object[] NO_ARGS = new Object[0];
  
  public static String getNameFrom(final AlgorithmParameterSpec paramSpec) {
    return AccessController.<String>doPrivileged(new PrivilegedAction<String>() {
          public Object run() {
            try {
              Method method = paramSpec.getClass().getMethod("getName", SpecUtil.NO_PARAMS);
              return method.invoke(paramSpec, SpecUtil.NO_ARGS);
            } catch (Exception exception) {
              return null;
            } 
          }
        });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provide\\util\SpecUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */