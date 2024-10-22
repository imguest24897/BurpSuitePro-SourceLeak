package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

public interface CommitmentTypeIdentifier {
  public static final ASN1ObjectIdentifier proofOfOrigin = PKCSObjectIdentifiers.id_cti_ets_proofOfOrigin;
  
  public static final ASN1ObjectIdentifier proofOfReceipt = PKCSObjectIdentifiers.id_cti_ets_proofOfReceipt;
  
  public static final ASN1ObjectIdentifier proofOfDelivery = PKCSObjectIdentifiers.id_cti_ets_proofOfDelivery;
  
  public static final ASN1ObjectIdentifier proofOfSender = PKCSObjectIdentifiers.id_cti_ets_proofOfSender;
  
  public static final ASN1ObjectIdentifier proofOfApproval = PKCSObjectIdentifiers.id_cti_ets_proofOfApproval;
  
  public static final ASN1ObjectIdentifier proofOfCreation = PKCSObjectIdentifiers.id_cti_ets_proofOfCreation;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\esf\CommitmentTypeIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */