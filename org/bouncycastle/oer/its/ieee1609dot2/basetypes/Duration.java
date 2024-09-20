package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class Duration extends ASN1Object implements ASN1Choice {
  public static final int microseconds = 0;
  
  public static final int milliseconds = 1;
  
  public static final int seconds = 2;
  
  public static final int minutes = 3;
  
  public static final int hours = 4;
  
  public static final int sixtyHours = 5;
  
  public static final int years = 6;
  
  private final int choice;
  
  private final UINT16 duration;
  
  public Duration(int paramInt, UINT16 paramUINT16) {
    this.choice = paramInt;
    this.duration = paramUINT16;
  }
  
  private Duration(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        try {
          this.duration = UINT16.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        } catch (Exception exception) {
          throw new IllegalStateException(exception.getMessage(), exception);
        } 
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static Duration getInstance(Object paramObject) {
    return (paramObject instanceof Duration) ? (Duration)paramObject : ((paramObject != null) ? new Duration(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static Duration years(UINT16 paramUINT16) {
    return new Duration(6, paramUINT16);
  }
  
  public static Duration sixtyHours(UINT16 paramUINT16) {
    return new Duration(5, paramUINT16);
  }
  
  public static Duration hours(UINT16 paramUINT16) {
    return new Duration(4, paramUINT16);
  }
  
  public static Duration minutes(UINT16 paramUINT16) {
    return new Duration(3, paramUINT16);
  }
  
  public static Duration seconds(UINT16 paramUINT16) {
    return new Duration(2, paramUINT16);
  }
  
  public static Duration milliseconds(UINT16 paramUINT16) {
    return new Duration(1, paramUINT16);
  }
  
  public static Duration microseconds(UINT16 paramUINT16) {
    return new Duration(0, paramUINT16);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, (ASN1Encodable)this.duration);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public UINT16 getDuration() {
    return this.duration;
  }
  
  public String toString() {
    switch (this.choice) {
      case 0:
        return this.duration.value + "uS";
      case 1:
        return this.duration.value + "mS";
      case 2:
        return this.duration.value + " seconds";
      case 3:
        return this.duration.value + " minute";
      case 4:
        return this.duration.value + " hours";
      case 5:
        return this.duration.value + " sixty hours";
      case 6:
        return this.duration.value + " years";
    } 
    return this.duration.value + " unknown choice";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Duration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */