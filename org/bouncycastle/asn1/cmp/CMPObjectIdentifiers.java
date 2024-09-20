package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface CMPObjectIdentifiers {
  public static final ASN1ObjectIdentifier passwordBasedMac = new ASN1ObjectIdentifier("1.2.840.113533.7.66.13");
  
  public static final ASN1ObjectIdentifier dhBasedMac = new ASN1ObjectIdentifier("1.2.840.113533.7.66.30");
  
  public static final ASN1ObjectIdentifier id_it = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4");
  
  public static final ASN1ObjectIdentifier it_caProtEncCert = id_it.branch("1");
  
  public static final ASN1ObjectIdentifier it_signKeyPairTypes = id_it.branch("2");
  
  public static final ASN1ObjectIdentifier it_encKeyPairTypes = id_it.branch("3");
  
  public static final ASN1ObjectIdentifier it_preferredSymAlg = id_it.branch("4");
  
  public static final ASN1ObjectIdentifier it_caKeyUpdateInfo = id_it.branch("5");
  
  public static final ASN1ObjectIdentifier it_currentCRL = id_it.branch("6");
  
  public static final ASN1ObjectIdentifier it_unsupportedOIDs = id_it.branch("7");
  
  public static final ASN1ObjectIdentifier it_keyPairParamReq = id_it.branch("10");
  
  public static final ASN1ObjectIdentifier it_keyPairParamRep = id_it.branch("11");
  
  public static final ASN1ObjectIdentifier it_revPassphrase = id_it.branch("12");
  
  public static final ASN1ObjectIdentifier it_implicitConfirm = id_it.branch("13");
  
  public static final ASN1ObjectIdentifier it_confirmWaitTime = id_it.branch("14");
  
  public static final ASN1ObjectIdentifier it_origPKIMessage = id_it.branch("15");
  
  public static final ASN1ObjectIdentifier it_suppLangTags = id_it.branch("16");
  
  public static final ASN1ObjectIdentifier id_it_caCerts = id_it.branch("17");
  
  public static final ASN1ObjectIdentifier id_it_rootCaKeyUpdate = id_it.branch("18");
  
  public static final ASN1ObjectIdentifier id_it_certReqTemplate = id_it.branch("19");
  
  public static final ASN1ObjectIdentifier id_it_rootCaCert = id_it.branch("20");
  
  public static final ASN1ObjectIdentifier id_it_certProfile = id_it.branch("21");
  
  public static final ASN1ObjectIdentifier id_it_crlStatusList = id_it.branch("22");
  
  public static final ASN1ObjectIdentifier id_it_crls = id_it.branch("23");
  
  public static final ASN1ObjectIdentifier id_pkip = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5");
  
  public static final ASN1ObjectIdentifier id_regCtrl = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1");
  
  public static final ASN1ObjectIdentifier id_regInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.2");
  
  public static final ASN1ObjectIdentifier regCtrl_regToken = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.1");
  
  public static final ASN1ObjectIdentifier regCtrl_authenticator = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.2");
  
  public static final ASN1ObjectIdentifier regCtrl_pkiPublicationInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.3");
  
  public static final ASN1ObjectIdentifier regCtrl_pkiArchiveOptions = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.4");
  
  public static final ASN1ObjectIdentifier regCtrl_oldCertID = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.5");
  
  public static final ASN1ObjectIdentifier regCtrl_protocolEncrKey = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.6");
  
  public static final ASN1ObjectIdentifier regCtrl_altCertTemplate = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.7");
  
  public static final ASN1ObjectIdentifier regInfo_utf8Pairs = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.2.1");
  
  public static final ASN1ObjectIdentifier regInfo_certReq = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.2.2");
  
  public static final ASN1ObjectIdentifier ct_encKeyWithID = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.1.21");
  
  public static final ASN1ObjectIdentifier id_regCtrl_algId = id_pkip.branch("1.11");
  
  public static final ASN1ObjectIdentifier id_regCtrl_rsaKeyLen = id_pkip.branch("1.12");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CMPObjectIdentifiers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */