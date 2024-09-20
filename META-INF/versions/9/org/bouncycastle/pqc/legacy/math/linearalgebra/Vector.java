package META-INF.versions.9.org.bouncycastle.pqc.legacy.math.linearalgebra;

import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;

public abstract class Vector {
  protected int length;
  
  public final int getLength() {
    return this.length;
  }
  
  public abstract byte[] getEncoded();
  
  public abstract boolean isZero();
  
  public abstract org.bouncycastle.pqc.legacy.math.linearalgebra.Vector add(org.bouncycastle.pqc.legacy.math.linearalgebra.Vector paramVector);
  
  public abstract org.bouncycastle.pqc.legacy.math.linearalgebra.Vector multiply(Permutation paramPermutation);
  
  public abstract boolean equals(Object paramObject);
  
  public abstract int hashCode();
  
  public abstract String toString();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\legacy\math\linearalgebra\Vector.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */