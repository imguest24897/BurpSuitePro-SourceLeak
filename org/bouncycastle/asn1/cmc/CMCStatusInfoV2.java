package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

public class CMCStatusInfoV2 extends ASN1Object {
  private final CMCStatus cMCStatus;
  
  private final ASN1Sequence bodyList;
  
  private final ASN1UTF8String statusString;
  
  private final OtherStatusInfo otherStatusInfo;
  
  CMCStatusInfoV2(CMCStatus paramCMCStatus, ASN1Sequence paramASN1Sequence, ASN1UTF8String paramASN1UTF8String, OtherStatusInfo paramOtherStatusInfo) {
    this.cMCStatus = paramCMCStatus;
    this.bodyList = paramASN1Sequence;
    this.statusString = paramASN1UTF8String;
    this.otherStatusInfo = paramOtherStatusInfo;
  }
  
  private CMCStatusInfoV2(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() < 2 || paramASN1Sequence.size() > 4)
      throw new IllegalArgumentException("incorrect sequence size"); 
    this.cMCStatus = CMCStatus.getInstance(paramASN1Sequence.getObjectAt(0));
    this.bodyList = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(1));
    if (paramASN1Sequence.size() > 2) {
      if (paramASN1Sequence.size() == 4) {
        this.statusString = ASN1UTF8String.getInstance(paramASN1Sequence.getObjectAt(2));
        this.otherStatusInfo = OtherStatusInfo.getInstance(paramASN1Sequence.getObjectAt(3));
      } else if (paramASN1Sequence.getObjectAt(2) instanceof ASN1UTF8String) {
        this.statusString = ASN1UTF8String.getInstance(paramASN1Sequence.getObjectAt(2));
        this.otherStatusInfo = null;
      } else {
        this.statusString = null;
        this.otherStatusInfo = OtherStatusInfo.getInstance(paramASN1Sequence.getObjectAt(2));
      } 
    } else {
      this.statusString = null;
      this.otherStatusInfo = null;
    } 
  }
  
  public CMCStatus getCMCStatus() {
    return this.cMCStatus;
  }
  
  public CMCStatus getcMCStatus() {
    return this.cMCStatus;
  }
  
  public BodyPartID[] getBodyList() {
    return Utils.toBodyPartIDArray(this.bodyList);
  }
  
  public DERUTF8String getStatusString() {
    return (null == this.statusString || this.statusString instanceof DERUTF8String) ? (DERUTF8String)this.statusString : new DERUTF8String(this.statusString.getString());
  }
  
  public ASN1UTF8String getStatusStringUTF8() {
    return this.statusString;
  }
  
  public OtherStatusInfo getOtherStatusInfo() {
    return this.otherStatusInfo;
  }
  
  public boolean hasOtherInfo() {
    return (this.otherStatusInfo != null);
  }
  
  public static CMCStatusInfoV2 getInstance(Object paramObject) {
    return (paramObject instanceof CMCStatusInfoV2) ? (CMCStatusInfoV2)paramObject : ((paramObject != null) ? new CMCStatusInfoV2(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
    aSN1EncodableVector.add((ASN1Encodable)this.cMCStatus);
    aSN1EncodableVector.add((ASN1Encodable)this.bodyList);
    if (this.statusString != null)
      aSN1EncodableVector.add((ASN1Encodable)this.statusString); 
    if (this.otherStatusInfo != null)
      aSN1EncodableVector.add((ASN1Encodable)this.otherStatusInfo); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmc\CMCStatusInfoV2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */