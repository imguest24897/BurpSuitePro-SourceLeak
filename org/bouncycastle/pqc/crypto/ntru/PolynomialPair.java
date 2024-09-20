package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

class PolynomialPair {
  private final Polynomial a;
  
  private final Polynomial b;
  
  public PolynomialPair(Polynomial paramPolynomial1, Polynomial paramPolynomial2) {
    this.a = paramPolynomial1;
    this.b = paramPolynomial2;
  }
  
  public Polynomial f() {
    return this.a;
  }
  
  public Polynomial g() {
    return this.b;
  }
  
  public Polynomial r() {
    return this.a;
  }
  
  public Polynomial m() {
    return this.b;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\PolynomialPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */