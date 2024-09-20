package org.bouncycastle.tls;

import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.SRP6StandardGroups;
import org.bouncycastle.tls.crypto.TlsSRPConfig;

public class DefaultTlsSRPConfigVerifier implements TlsSRPConfigVerifier {
  private static final Vector DEFAULT_GROUPS = new Vector();
  
  protected final Vector groups;
  
  public DefaultTlsSRPConfigVerifier() {
    this(DEFAULT_GROUPS);
  }
  
  public DefaultTlsSRPConfigVerifier(Vector<?> paramVector) {
    this.groups = new Vector(paramVector);
  }
  
  public boolean accept(TlsSRPConfig paramTlsSRPConfig) {
    for (byte b = 0; b < this.groups.size(); b++) {
      if (areGroupsEqual(paramTlsSRPConfig, this.groups.elementAt(b)))
        return true; 
    } 
    return false;
  }
  
  protected boolean areGroupsEqual(TlsSRPConfig paramTlsSRPConfig, SRP6Group paramSRP6Group) {
    BigInteger[] arrayOfBigInteger = paramTlsSRPConfig.getExplicitNG();
    return (areParametersEqual(arrayOfBigInteger[0], paramSRP6Group.getN()) && areParametersEqual(arrayOfBigInteger[1], paramSRP6Group.getG()));
  }
  
  protected boolean areParametersEqual(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return (paramBigInteger1 == paramBigInteger2 || paramBigInteger1.equals(paramBigInteger2));
  }
  
  static {
    DEFAULT_GROUPS.addElement(SRP6StandardGroups.rfc5054_1024);
    DEFAULT_GROUPS.addElement(SRP6StandardGroups.rfc5054_1536);
    DEFAULT_GROUPS.addElement(SRP6StandardGroups.rfc5054_2048);
    DEFAULT_GROUPS.addElement(SRP6StandardGroups.rfc5054_3072);
    DEFAULT_GROUPS.addElement(SRP6StandardGroups.rfc5054_4096);
    DEFAULT_GROUPS.addElement(SRP6StandardGroups.rfc5054_6144);
    DEFAULT_GROUPS.addElement(SRP6StandardGroups.rfc5054_8192);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DefaultTlsSRPConfigVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */