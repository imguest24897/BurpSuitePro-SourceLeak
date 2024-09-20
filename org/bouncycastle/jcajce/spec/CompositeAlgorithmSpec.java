package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompositeAlgorithmSpec implements AlgorithmParameterSpec {
  private final List<String> algorithmNames;
  
  private final List<AlgorithmParameterSpec> parameterSpecs;
  
  public CompositeAlgorithmSpec(Builder paramBuilder) {
    this.algorithmNames = Collections.unmodifiableList(new ArrayList<>(paramBuilder.algorithmNames));
    this.parameterSpecs = Collections.unmodifiableList(new ArrayList<>(paramBuilder.parameterSpecs));
  }
  
  public List<String> getAlgorithmNames() {
    return this.algorithmNames;
  }
  
  public List<AlgorithmParameterSpec> getParameterSpecs() {
    return this.parameterSpecs;
  }
  
  public static class Builder {
    private List<String> algorithmNames = new ArrayList<>();
    
    private List<AlgorithmParameterSpec> parameterSpecs = new ArrayList<>();
    
    public Builder add(String param1String) {
      return add(param1String, null);
    }
    
    public Builder add(String param1String, AlgorithmParameterSpec param1AlgorithmParameterSpec) {
      if (!this.algorithmNames.contains(param1String)) {
        this.algorithmNames.add(param1String);
        this.parameterSpecs.add(param1AlgorithmParameterSpec);
        return this;
      } 
      throw new IllegalStateException("cannot build with the same algorithm name added");
    }
    
    public CompositeAlgorithmSpec build() {
      if (this.algorithmNames.isEmpty())
        throw new IllegalStateException("cannot call build with no algorithm names added"); 
      return new CompositeAlgorithmSpec(this);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\CompositeAlgorithmSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */