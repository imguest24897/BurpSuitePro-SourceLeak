package org.bouncycastle.util.test;

public class TestFailedException extends RuntimeException {
  private TestResult _result;
  
  public TestFailedException(TestResult paramTestResult) {
    this._result = paramTestResult;
  }
  
  public TestResult getResult() {
    return this._result;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\test\TestFailedException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */