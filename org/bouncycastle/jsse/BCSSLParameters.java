package org.bouncycastle.jsse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.tls.TlsUtils;

public final class BCSSLParameters {
  private String[] cipherSuites;
  
  private String[] protocols;
  
  private boolean wantClientAuth;
  
  private boolean needClientAuth;
  
  private String endpointIdentificationAlgorithm;
  
  private BCAlgorithmConstraints algorithmConstraints;
  
  private List<BCSNIServerName> serverNames;
  
  private List<BCSNIMatcher> sniMatchers;
  
  private boolean useCipherSuitesOrder;
  
  private boolean enableRetransmissions = true;
  
  private int maximumPacketSize = 0;
  
  private String[] applicationProtocols = TlsUtils.EMPTY_STRINGS;
  
  private String[] signatureSchemes = null;
  
  private String[] namedGroups = null;
  
  private static <T> List<T> copyList(Collection<T> paramCollection) {
    return (paramCollection == null) ? null : (paramCollection.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList<>(paramCollection)));
  }
  
  public BCSSLParameters() {}
  
  public BCSSLParameters(String[] paramArrayOfString) {
    setCipherSuites(paramArrayOfString);
  }
  
  public BCSSLParameters(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    setCipherSuites(paramArrayOfString1);
    setProtocols(paramArrayOfString2);
  }
  
  public String[] getCipherSuites() {
    return TlsUtils.clone(this.cipherSuites);
  }
  
  public void setCipherSuites(String[] paramArrayOfString) {
    this.cipherSuites = TlsUtils.clone(paramArrayOfString);
  }
  
  public String[] getProtocols() {
    return TlsUtils.clone(this.protocols);
  }
  
  public void setProtocols(String[] paramArrayOfString) {
    this.protocols = TlsUtils.clone(paramArrayOfString);
  }
  
  public boolean getWantClientAuth() {
    return this.wantClientAuth;
  }
  
  public void setWantClientAuth(boolean paramBoolean) {
    this.wantClientAuth = paramBoolean;
    this.needClientAuth = false;
  }
  
  public boolean getNeedClientAuth() {
    return this.needClientAuth;
  }
  
  public void setNeedClientAuth(boolean paramBoolean) {
    this.needClientAuth = paramBoolean;
    this.wantClientAuth = false;
  }
  
  public String getEndpointIdentificationAlgorithm() {
    return this.endpointIdentificationAlgorithm;
  }
  
  public void setEndpointIdentificationAlgorithm(String paramString) {
    this.endpointIdentificationAlgorithm = paramString;
  }
  
  public BCAlgorithmConstraints getAlgorithmConstraints() {
    return this.algorithmConstraints;
  }
  
  public void setAlgorithmConstraints(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    this.algorithmConstraints = paramBCAlgorithmConstraints;
  }
  
  public List<BCSNIServerName> getServerNames() {
    return copyList(this.serverNames);
  }
  
  public void setServerNames(List<BCSNIServerName> paramList) {
    if (paramList == null) {
      this.serverNames = null;
    } else {
      List<BCSNIServerName> list = copyList(paramList);
      HashSet<Integer> hashSet = new HashSet();
      for (BCSNIServerName bCSNIServerName : list) {
        int i = bCSNIServerName.getType();
        if (!hashSet.add(Integer.valueOf(i)))
          throw new IllegalArgumentException("Found duplicate SNI server name entry of type " + i); 
      } 
      this.serverNames = list;
    } 
  }
  
  public Collection<BCSNIMatcher> getSNIMatchers() {
    return copyList(this.sniMatchers);
  }
  
  public void setSNIMatchers(Collection<BCSNIMatcher> paramCollection) {
    if (paramCollection == null) {
      this.sniMatchers = null;
    } else {
      List<BCSNIMatcher> list = copyList(paramCollection);
      HashSet<Integer> hashSet = new HashSet();
      for (BCSNIMatcher bCSNIMatcher : list) {
        int i = bCSNIMatcher.getType();
        if (!hashSet.add(Integer.valueOf(i)))
          throw new IllegalArgumentException("Found duplicate SNI matcher entry of type " + i); 
      } 
      this.sniMatchers = list;
    } 
  }
  
  public boolean getUseCipherSuitesOrder() {
    return this.useCipherSuitesOrder;
  }
  
  public void setUseCipherSuitesOrder(boolean paramBoolean) {
    this.useCipherSuitesOrder = paramBoolean;
  }
  
  public boolean getEnableRetransmissions() {
    return this.enableRetransmissions;
  }
  
  public void setEnableRetransmissions(boolean paramBoolean) {
    this.enableRetransmissions = paramBoolean;
  }
  
  public int getMaximumPacketSize() {
    return this.maximumPacketSize;
  }
  
  public void setMaximumPacketSize(int paramInt) {
    if (paramInt < 0)
      throw new IllegalArgumentException("The maximum packet size cannot be negative"); 
    this.maximumPacketSize = paramInt;
  }
  
  public String[] getApplicationProtocols() {
    return TlsUtils.clone(this.applicationProtocols);
  }
  
  public void setApplicationProtocols(String[] paramArrayOfString) {
    if (null == paramArrayOfString)
      throw new NullPointerException("'applicationProtocols' cannot be null"); 
    String[] arrayOfString = TlsUtils.clone(paramArrayOfString);
    for (String str : arrayOfString) {
      if (TlsUtils.isNullOrEmpty(str))
        throw new IllegalArgumentException("'applicationProtocols' entries cannot be null or empty strings"); 
    } 
    this.applicationProtocols = arrayOfString;
  }
  
  public String[] getSignatureSchemes() {
    return TlsUtils.clone(this.signatureSchemes);
  }
  
  public void setSignatureSchemes(String[] paramArrayOfString) {
    String[] arrayOfString = null;
    if (paramArrayOfString != null) {
      arrayOfString = TlsUtils.clone(paramArrayOfString);
      for (String str : arrayOfString) {
        if (TlsUtils.isNullOrEmpty(str))
          throw new IllegalArgumentException("'signatureSchemes' entries cannot be null or empty strings"); 
      } 
    } 
    this.signatureSchemes = arrayOfString;
  }
  
  public String[] getNamedGroups() {
    return TlsUtils.clone(this.namedGroups);
  }
  
  public void setNamedGroups(String[] paramArrayOfString) {
    String[] arrayOfString = null;
    if (paramArrayOfString != null) {
      arrayOfString = TlsUtils.clone(paramArrayOfString);
      HashSet<String> hashSet = new HashSet();
      for (String str : arrayOfString) {
        if (TlsUtils.isNullOrEmpty(str))
          throw new IllegalArgumentException("'namedGroups' entries cannot be null or empty strings"); 
        if (!hashSet.add(str))
          throw new IllegalArgumentException("'namedGroups' contains duplicate entry: " + str); 
      } 
    } 
    this.namedGroups = arrayOfString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\BCSSLParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */