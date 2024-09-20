package org.bouncycastle.tls;

import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.tls.crypto.DHGroup;
import org.bouncycastle.tls.crypto.DHStandardGroups;

public class DefaultTlsDHGroupVerifier implements TlsDHGroupVerifier {
  public static final int DEFAULT_MINIMUM_PRIME_BITS = 2048;
  
  private static final Vector DEFAULT_GROUPS = new Vector();
  
  protected Vector groups;
  
  protected int minimumPrimeBits;
  
  private static void addDefaultGroup(DHGroup paramDHGroup) {
    DEFAULT_GROUPS.addElement(paramDHGroup);
  }
  
  public DefaultTlsDHGroupVerifier() {
    this(2048);
  }
  
  public DefaultTlsDHGroupVerifier(int paramInt) {
    this(DEFAULT_GROUPS, paramInt);
  }
  
  public DefaultTlsDHGroupVerifier(Vector<?> paramVector, int paramInt) {
    this.groups = new Vector(paramVector);
    this.minimumPrimeBits = paramInt;
  }
  
  public boolean accept(DHGroup paramDHGroup) {
    return (checkMinimumPrimeBits(paramDHGroup) && checkGroup(paramDHGroup));
  }
  
  public int getMinimumPrimeBits() {
    return this.minimumPrimeBits;
  }
  
  protected boolean areGroupsEqual(DHGroup paramDHGroup1, DHGroup paramDHGroup2) {
    return (paramDHGroup1 == paramDHGroup2 || (areParametersEqual(paramDHGroup1.getP(), paramDHGroup2.getP()) && areParametersEqual(paramDHGroup1.getG(), paramDHGroup2.getG())));
  }
  
  protected boolean areParametersEqual(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return (paramBigInteger1 == paramBigInteger2 || paramBigInteger1.equals(paramBigInteger2));
  }
  
  protected boolean checkGroup(DHGroup paramDHGroup) {
    for (byte b = 0; b < this.groups.size(); b++) {
      if (areGroupsEqual(paramDHGroup, this.groups.elementAt(b)))
        return true; 
    } 
    return false;
  }
  
  protected boolean checkMinimumPrimeBits(DHGroup paramDHGroup) {
    return (paramDHGroup.getP().bitLength() >= getMinimumPrimeBits());
  }
  
  static {
    addDefaultGroup(DHStandardGroups.rfc3526_2048);
    addDefaultGroup(DHStandardGroups.rfc3526_3072);
    addDefaultGroup(DHStandardGroups.rfc3526_4096);
    addDefaultGroup(DHStandardGroups.rfc3526_6144);
    addDefaultGroup(DHStandardGroups.rfc3526_8192);
    addDefaultGroup(DHStandardGroups.rfc7919_ffdhe2048);
    addDefaultGroup(DHStandardGroups.rfc7919_ffdhe3072);
    addDefaultGroup(DHStandardGroups.rfc7919_ffdhe4096);
    addDefaultGroup(DHStandardGroups.rfc7919_ffdhe6144);
    addDefaultGroup(DHStandardGroups.rfc7919_ffdhe8192);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DefaultTlsDHGroupVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */