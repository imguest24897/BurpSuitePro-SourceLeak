package org.bouncycastle.tls.crypto.impl.jcajce;

class Exceptions {
  static IllegalStateException illegalStateException(String paramString, Throwable paramThrowable) {
    return new IllegalStateException(paramString, paramThrowable);
  }
  
  static IllegalArgumentException illegalArgumentException(String paramString, Throwable paramThrowable) {
    return new IllegalArgumentException(paramString, paramThrowable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\Exceptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */