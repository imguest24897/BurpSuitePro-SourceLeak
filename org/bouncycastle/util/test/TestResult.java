package org.bouncycastle.util.test;

public interface TestResult {
  boolean isSuccessful();
  
  Throwable getException();
  
  String toString();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\test\TestResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */