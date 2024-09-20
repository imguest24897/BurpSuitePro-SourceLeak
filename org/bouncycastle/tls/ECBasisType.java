package org.bouncycastle.tls;

public class ECBasisType {
  public static final short ec_basis_trinomial = 1;
  
  public static final short ec_basis_pentanomial = 2;
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 1 && paramShort <= 2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\ECBasisType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */