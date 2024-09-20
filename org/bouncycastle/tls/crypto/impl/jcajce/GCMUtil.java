package org.bouncycastle.tls.crypto.impl.jcajce;

import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Integers;

class GCMUtil {
  static final Constructor<AlgorithmParameterSpec> gcmParameterSpec = getConstructor();
  
  static AlgorithmParameterSpec createGCMParameterSpec(final int tLen, final byte[] src) throws Exception {
    if (gcmParameterSpec == null)
      throw new IllegalStateException(); 
    return AccessController.<AlgorithmParameterSpec>doPrivileged(new PrivilegedExceptionAction<AlgorithmParameterSpec>() {
          public AlgorithmParameterSpec run() throws Exception {
            return GCMUtil.gcmParameterSpec.newInstance(new Object[] { Integers.valueOf(this.val$tLen), this.val$src });
          }
        });
  }
  
  static boolean isGCMParameterSpecAvailable() {
    return (gcmParameterSpec != null);
  }
  
  private static Constructor<AlgorithmParameterSpec> getConstructor() {
    return AccessController.<Constructor<AlgorithmParameterSpec>>doPrivileged(new PrivilegedAction<Constructor<AlgorithmParameterSpec>>() {
          public Constructor<AlgorithmParameterSpec> run() {
            try {
              String str = "javax.crypto.spec.GCMParameterSpec";
              ClassLoader classLoader = GCMUtil.class.getClassLoader();
              if (classLoader == null)
                classLoader = ClassLoader.getSystemClassLoader(); 
              Class<?> clazz = classLoader.loadClass(str);
              if (clazz != null && AlgorithmParameterSpec.class.isAssignableFrom(clazz)) {
                Class<?> clazz1 = clazz;
                return (Constructor)clazz1.getConstructor(new Class[] { int.class, byte[].class });
              } 
            } catch (Exception exception) {}
            return null;
          }
        });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\GCMUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */