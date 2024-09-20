package org.bouncycastle.oer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;

public class OERDefinition {
  static final BigInteger[] uIntMax = new BigInteger[] { new BigInteger("256"), new BigInteger("65536"), new BigInteger("4294967296"), new BigInteger("18446744073709551616") };
  
  static final BigInteger[][] sIntRange = new BigInteger[][] { { new BigInteger("-128"), new BigInteger("127") }, { new BigInteger("-32768"), new BigInteger("32767") }, { new BigInteger("-2147483648"), new BigInteger("2147483647") }, { new BigInteger("-9223372036854775808"), new BigInteger("9223372036854775807") } };
  
  public static Builder bool() {
    return new Builder(BaseType.BOOLEAN);
  }
  
  public static Builder integer() {
    return new Builder(BaseType.INT);
  }
  
  public static Builder integer(long paramLong) {
    return (new Builder(BaseType.INT)).defaultValue((ASN1Encodable)new ASN1Integer(paramLong));
  }
  
  public static Builder bitString(long paramLong) {
    return (new Builder(BaseType.BIT_STRING)).fixedSize(paramLong);
  }
  
  public static Builder integer(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return (new Builder(BaseType.INT)).range(paramBigInteger1, paramBigInteger2);
  }
  
  public static Builder integer(long paramLong1, long paramLong2) {
    return (new Builder(BaseType.INT)).range(BigInteger.valueOf(paramLong1), BigInteger.valueOf(paramLong2));
  }
  
  public static Builder integer(long paramLong1, long paramLong2, ASN1Encodable paramASN1Encodable) {
    return (new Builder(BaseType.INT)).range(paramLong1, paramLong2, paramASN1Encodable);
  }
  
  public static Builder nullValue() {
    return new Builder(BaseType.NULL);
  }
  
  public static Builder seq() {
    return new Builder(BaseType.SEQ);
  }
  
  public static Builder seq(Object... paramVarArgs) {
    return (new Builder(BaseType.SEQ)).items(paramVarArgs);
  }
  
  public static Builder aSwitch(Switch paramSwitch) {
    return (new Builder(BaseType.Switch)).decodeSwitch(paramSwitch);
  }
  
  public static Builder enumItem(String paramString) {
    return (new Builder(BaseType.ENUM_ITEM)).label(paramString);
  }
  
  public static Builder enumItem(String paramString, BigInteger paramBigInteger) {
    return (new Builder(BaseType.ENUM_ITEM)).enumValue(paramBigInteger).label(paramString);
  }
  
  public static Builder enumeration(Object... paramVarArgs) {
    return (new Builder(BaseType.ENUM)).items(paramVarArgs);
  }
  
  public static Builder choice(Object... paramVarArgs) {
    return (new Builder(BaseType.CHOICE)).items(paramVarArgs);
  }
  
  public static Builder placeholder() {
    return new Builder(null);
  }
  
  public static Builder seqof(Object... paramVarArgs) {
    return (new Builder(BaseType.SEQ_OF)).items(paramVarArgs);
  }
  
  public static Builder octets() {
    return (new Builder(BaseType.OCTET_STRING)).unbounded();
  }
  
  public static Builder octets(int paramInt) {
    return (new Builder(BaseType.OCTET_STRING)).fixedSize(paramInt);
  }
  
  public static Builder octets(int paramInt1, int paramInt2) {
    return (new Builder(BaseType.OCTET_STRING)).range(BigInteger.valueOf(paramInt1), BigInteger.valueOf(paramInt2));
  }
  
  public static Builder ia5String() {
    return new Builder(BaseType.IA5String);
  }
  
  public static Builder utf8String() {
    return new Builder(BaseType.UTF8_STRING);
  }
  
  public static Builder utf8String(int paramInt) {
    return (new Builder(BaseType.UTF8_STRING)).rangeToMAXFrom(paramInt);
  }
  
  public static Builder utf8String(int paramInt1, int paramInt2) {
    return (new Builder(BaseType.UTF8_STRING)).range(BigInteger.valueOf(paramInt1), BigInteger.valueOf(paramInt2));
  }
  
  public static Builder opaque() {
    return new Builder(BaseType.OPAQUE);
  }
  
  public static List<Object> optional(Object... paramVarArgs) {
    return new OptionalList(Arrays.asList(paramVarArgs));
  }
  
  public static ExtensionList extension(Object... paramVarArgs) {
    return new ExtensionList(1, Arrays.asList(paramVarArgs));
  }
  
  public static ExtensionList extension(int paramInt, Object... paramVarArgs) {
    return new ExtensionList(paramInt, Arrays.asList(paramVarArgs));
  }
  
  public static Builder deferred(ElementSupplier paramElementSupplier) {
    return (new Builder(BaseType.Supplier)).elementSupplier(paramElementSupplier);
  }
  
  public enum BaseType {
    SEQ, SEQ_OF, CHOICE, ENUM, INT, OCTET_STRING, OPAQUE, UTF8_STRING, BIT_STRING, NULL, EXTENSION, ENUM_ITEM, BOOLEAN, IS0646String, PrintableString, NumericString, BMPString, UniversalString, IA5String, VisibleString, Switch, Supplier;
  }
  
  public static class Builder {
    protected final OERDefinition.BaseType baseType;
    
    protected ArrayList<Builder> children = new ArrayList<>();
    
    protected boolean explicit = true;
    
    protected String typeName;
    
    protected String label;
    
    protected BigInteger upperBound;
    
    protected BigInteger lowerBound;
    
    protected BigInteger enumValue;
    
    protected ASN1Encodable defaultValue;
    
    protected Builder placeholderValue;
    
    protected Boolean inScope;
    
    protected Switch aSwitch;
    
    protected ArrayList<ASN1Encodable> validSwitchValues = new ArrayList<>();
    
    protected ElementSupplier elementSupplier;
    
    protected boolean mayRecurse;
    
    protected Map<String, ElementSupplier> supplierMap = new HashMap<>();
    
    protected int block;
    
    private final OERDefinition.ItemProvider defaultItemProvider = new OERDefinition.ItemProvider() {
        public OERDefinition.Builder existingChild(int param2Int, OERDefinition.Builder param2Builder) {
          return param2Builder.copy(OERDefinition.Builder.this.defaultItemProvider);
        }
      };
    
    public Builder(OERDefinition.BaseType param1BaseType) {
      this.baseType = param1BaseType;
    }
    
    private Builder copy(OERDefinition.ItemProvider param1ItemProvider) {
      Builder builder = new Builder(this.baseType);
      byte b = 0;
      for (Builder builder1 : this.children)
        builder.children.add(param1ItemProvider.existingChild(b++, builder1)); 
      builder.explicit = this.explicit;
      builder.label = this.label;
      builder.upperBound = this.upperBound;
      builder.lowerBound = this.lowerBound;
      builder.defaultValue = this.defaultValue;
      builder.enumValue = this.enumValue;
      builder.inScope = this.inScope;
      builder.aSwitch = this.aSwitch;
      builder.validSwitchValues = new ArrayList<>(this.validSwitchValues);
      builder.elementSupplier = this.elementSupplier;
      builder.mayRecurse = this.mayRecurse;
      builder.typeName = this.typeName;
      builder.supplierMap = new HashMap<>(this.supplierMap);
      builder.block = this.block;
      return builder;
    }
    
    protected Builder block(int param1Int) {
      Builder builder = copy();
      builder.block = param1Int;
      return builder;
    }
    
    public Builder copy() {
      return copy(this.defaultItemProvider);
    }
    
    public Builder elementSupplier(ElementSupplier param1ElementSupplier) {
      Builder builder = copy();
      builder.elementSupplier = param1ElementSupplier;
      return builder;
    }
    
    public Builder validSwitchValue(ASN1Encodable... param1VarArgs) {
      Builder builder = copy();
      builder.validSwitchValues.addAll(Arrays.asList(param1VarArgs));
      return builder;
    }
    
    public Builder inScope(boolean param1Boolean) {
      Builder builder = copy();
      builder.inScope = Boolean.valueOf(param1Boolean);
      return builder;
    }
    
    public Builder limitScopeTo(String... param1VarArgs) {
      Builder builder = copy();
      HashSet hashSet = new HashSet();
      hashSet.addAll(Arrays.asList(param1VarArgs));
      ArrayList<Builder> arrayList = new ArrayList();
      for (Builder builder1 : this.children)
        arrayList.add(builder1.copy().inScope(hashSet.contains(builder1.label))); 
      builder.children = arrayList;
      return builder;
    }
    
    public Builder typeName(String param1String) {
      Builder builder = copy();
      builder.typeName = param1String;
      if (builder.label == null)
        builder.label = param1String; 
      return builder;
    }
    
    public Builder unbounded() {
      Builder builder = copy();
      builder.lowerBound = null;
      builder.upperBound = null;
      return builder;
    }
    
    public Builder decodeSwitch(Switch param1Switch) {
      Builder builder = copy();
      builder.aSwitch = param1Switch;
      return builder;
    }
    
    public Builder labelPrefix(String param1String) {
      Builder builder = copy();
      builder.label = param1String + " " + this.label;
      return builder;
    }
    
    public Builder explicit(boolean param1Boolean) {
      Builder builder = copy();
      builder.explicit = param1Boolean;
      return builder;
    }
    
    public Builder defaultValue(ASN1Encodable param1ASN1Encodable) {
      Builder builder = copy();
      builder.defaultValue = param1ASN1Encodable;
      return builder;
    }
    
    protected Builder wrap(boolean param1Boolean, Object param1Object) {
      if (param1Object instanceof Builder)
        return ((Builder)param1Object).explicit(param1Boolean); 
      if (param1Object instanceof OERDefinition.BaseType)
        return (new Builder((OERDefinition.BaseType)param1Object)).explicit(param1Boolean); 
      if (param1Object instanceof String)
        return OERDefinition.enumItem((String)param1Object); 
      throw new IllegalStateException("Unable to wrap item in builder");
    }
    
    protected void addExtensions(Builder param1Builder, OERDefinition.ExtensionList param1ExtensionList) {
      if (param1ExtensionList.isEmpty()) {
        Builder builder = new Builder(OERDefinition.BaseType.EXTENSION);
        builder.block = param1ExtensionList.block;
        param1Builder.children.add(builder);
        return;
      } 
      for (OERDefinition.OptionalList optionalList : param1ExtensionList) {
        if (optionalList instanceof OERDefinition.OptionalList) {
          addOptionals(param1Builder, param1ExtensionList.block, optionalList);
          continue;
        } 
        Builder builder = wrap(true, optionalList);
        builder.block = param1ExtensionList.block;
        param1Builder.children.add(builder);
      } 
    }
    
    protected void addOptionals(Builder param1Builder, int param1Int, OERDefinition.OptionalList param1OptionalList) {
      for (OERDefinition.ExtensionList extensionList : param1OptionalList) {
        if (extensionList instanceof OERDefinition.ExtensionList) {
          addExtensions(param1Builder, extensionList);
          continue;
        } 
        Builder builder = wrap(false, extensionList);
        builder.block = param1Int;
        param1Builder.children.add(builder);
      } 
    }
    
    public Builder items(Object... param1VarArgs) {
      Builder builder = copy();
      for (byte b = 0; b != param1VarArgs.length; b++) {
        Object object = param1VarArgs[b];
        if (object instanceof OERDefinition.ExtensionList) {
          addExtensions(builder, (OERDefinition.ExtensionList)object);
        } else if (object instanceof OERDefinition.OptionalList) {
          addOptionals(builder, builder.block, (OERDefinition.OptionalList)object);
        } else if (object.getClass().isArray()) {
          for (byte b1 = 0; b1 < ((Object[])object).length; b1++)
            builder.children.add(wrap(true, ((Object[])object)[b1])); 
        } else {
          builder.children.add(wrap(true, object));
        } 
      } 
      return builder;
    }
    
    public Builder label(String param1String) {
      Builder builder = copy();
      builder.label = param1String;
      return builder;
    }
    
    public Builder mayRecurse(boolean param1Boolean) {
      Builder builder = copy();
      builder.mayRecurse = param1Boolean;
      return builder;
    }
    
    public Element build() {
      ArrayList<Element> arrayList = new ArrayList();
      boolean bool1 = false;
      if (this.baseType == OERDefinition.BaseType.ENUM) {
        byte b1 = 0;
        HashSet<BigInteger> hashSet = new HashSet();
        for (byte b2 = 0; b2 < this.children.size(); b2++) {
          Builder builder = this.children.get(b2);
          if (builder.enumValue == null) {
            builder.enumValue = BigInteger.valueOf(b1);
            b1++;
          } 
          if (!hashSet.contains(builder.enumValue)) {
            hashSet.add(builder.enumValue);
          } else {
            throw new IllegalStateException("duplicate enum value at index " + b2);
          } 
        } 
      } 
      byte b = 0;
      boolean bool2 = false;
      for (Builder builder : this.children) {
        if (!bool1 && builder.block > 0)
          bool1 = true; 
        if (!builder.explicit)
          b++; 
        if (!bool2 && builder.defaultValue != null)
          bool2 = true; 
        arrayList.add(builder.build());
      } 
      return new Element(this.baseType, arrayList, (this.defaultValue == null && this.explicit), this.label, this.lowerBound, this.upperBound, bool1, this.enumValue, this.defaultValue, this.aSwitch, this.validSwitchValues.isEmpty() ? null : this.validSwitchValues, this.elementSupplier, this.mayRecurse, this.typeName, this.supplierMap.isEmpty() ? null : this.supplierMap, this.block, b, bool2);
    }
    
    public Builder range(BigInteger param1BigInteger1, BigInteger param1BigInteger2) {
      Builder builder = copy();
      builder.lowerBound = param1BigInteger1;
      builder.upperBound = param1BigInteger2;
      return builder;
    }
    
    public Builder rangeToMAXFrom(long param1Long) {
      Builder builder = copy();
      builder.lowerBound = BigInteger.valueOf(param1Long);
      builder.upperBound = null;
      return builder;
    }
    
    public Builder rangeZeroTo(long param1Long) {
      Builder builder = copy();
      builder.upperBound = BigInteger.valueOf(param1Long);
      builder.lowerBound = BigInteger.ZERO;
      return builder;
    }
    
    public Builder fixedSize(long param1Long) {
      Builder builder = copy();
      builder.upperBound = BigInteger.valueOf(param1Long);
      builder.lowerBound = BigInteger.valueOf(param1Long);
      return builder;
    }
    
    public Builder range(long param1Long1, long param1Long2, ASN1Encodable param1ASN1Encodable) {
      Builder builder = copy();
      builder.lowerBound = BigInteger.valueOf(param1Long1);
      builder.upperBound = BigInteger.valueOf(param1Long2);
      builder.defaultValue = param1ASN1Encodable;
      return builder;
    }
    
    public Builder enumValue(BigInteger param1BigInteger) {
      Builder builder = copy();
      this.enumValue = param1BigInteger;
      return builder;
    }
    
    public Builder replaceChild(final int index, final Builder newItem) {
      return copy(new OERDefinition.ItemProvider() {
            public OERDefinition.Builder existingChild(int param2Int, OERDefinition.Builder param2Builder) {
              return (index == param2Int) ? newItem : param2Builder;
            }
          });
    }
  }
  
  private static class ExtensionList extends ArrayList<Object> {
    protected final int block;
    
    public ExtensionList(int param1Int, List<Object> param1List) {
      this.block = param1Int;
      addAll(param1List);
    }
  }
  
  public static interface ItemProvider {
    OERDefinition.Builder existingChild(int param1Int, OERDefinition.Builder param1Builder);
  }
  
  public static class MutableBuilder extends Builder {
    private boolean frozen = false;
    
    public MutableBuilder(OERDefinition.BaseType param1BaseType) {
      super(param1BaseType);
    }
    
    public MutableBuilder label(String param1String) {
      this.label = param1String;
      return this;
    }
    
    public MutableBuilder addItemsAndFreeze(OERDefinition.Builder... param1VarArgs) {
      if (this.frozen)
        throw new IllegalStateException("build cannot be modified and must be copied only"); 
      for (byte b = 0; b != param1VarArgs.length; b++) {
        OERDefinition.Builder builder = param1VarArgs[b];
        if (builder instanceof OERDefinition.OptionalList) {
          Iterator iterator = ((List)builder).iterator();
          while (iterator.hasNext())
            this.children.add(wrap(false, iterator.next())); 
        } else if (builder.getClass().isArray()) {
          for (Object object : (Object[])builder)
            this.children.add(wrap(true, object)); 
        } else {
          this.children.add(wrap(true, builder));
        } 
      } 
      this.frozen = true;
      return this;
    }
  }
  
  private static class OptionalList extends ArrayList<Object> {
    public OptionalList(List<Object> param1List) {
      addAll(param1List);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\OERDefinition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */