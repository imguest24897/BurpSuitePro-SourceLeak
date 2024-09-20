package net.portswigger.swagger.v1.models;

import com.fasterxml.Zyx;
import java.util.ArrayList;
import java.util.List;

public class ComposedModel extends AbstractModel {
  private List<Model> allOf = new ArrayList<>();
  
  private Model parent;
  
  private Model child;
  
  private List<RefModel> interfaces;
  
  private String description;
  
  private Object example;
  
  public ComposedModel parent(Model paramModel) {
    setParent(paramModel);
    return this;
  }
  
  public ComposedModel child(Model paramModel) {
    setChild(paramModel);
    return this;
  }
  
  public ComposedModel interfaces(List<RefModel> paramList) {
    setInterfaces(paramList);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public void setExample(Object paramObject) {
    this.example = paramObject;
  }
  
  public List<Model> getAllOf() {
    return this.allOf;
  }
  
  public void setAllOf(List<Model> paramList) {
    this.allOf = paramList;
  }
  
  public Model getParent() {
    return this.parent;
  }
  
  @Zyx
  public void setParent(Model paramModel) {
    this.parent = paramModel;
    if (!this.allOf.contains(paramModel))
      this.allOf.add(paramModel); 
  }
  
  public Model getChild() {
    return this.child;
  }
  
  @Zyx
  public void setChild(Model paramModel) {
    this.child = paramModel;
    if (!this.allOf.contains(paramModel))
      this.allOf.add(paramModel); 
  }
  
  public List<RefModel> getInterfaces() {
    return this.interfaces;
  }
  
  @Zyx
  public void setInterfaces(List<RefModel> paramList) {
    this.interfaces = paramList;
    int i = AbstractModel.Zg();
    if (paramList != null)
      for (RefModel refModel : paramList) {
        if (!this.allOf.contains(refModel))
          this.allOf.add(refModel); 
        if (i == 0)
          break; 
      }  
  }
  
  public Object clone() {
    ComposedModel composedModel = new ComposedModel();
    cloneTo(composedModel);
    composedModel.allOf = this.allOf;
    composedModel.parent = this.parent;
    composedModel.child = this.child;
    composedModel.interfaces = this.interfaces;
    composedModel.description = this.description;
    composedModel.example = this.example;
    return composedModel;
  }
  
  public int hashCode() {
    byte b = 31;
    null = super.hashCode();
    null = 31 * null + ((this.allOf == null) ? 0 : this.allOf.hashCode());
    null = 31 * null + ((this.child == null) ? 0 : this.child.hashCode());
    null = 31 * null + ((this.description == null) ? 0 : this.description.hashCode());
    null = 31 * null + ((this.example == null) ? 0 : this.example.hashCode());
    null = 31 * null + ((this.interfaces == null) ? 0 : this.interfaces.hashCode());
    return 31 * null + ((this.parent == null) ? 0 : this.parent.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!super.equals(paramObject))
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    ComposedModel composedModel = (ComposedModel)paramObject;
    if (this.allOf == null) {
      if (composedModel.allOf != null)
        return false; 
    } else if (!this.allOf.equals(composedModel.allOf)) {
      return false;
    } 
    if (this.child == null) {
      if (composedModel.child != null)
        return false; 
    } else if (!this.child.equals(composedModel.child)) {
      return false;
    } 
    if (this.description == null) {
      if (composedModel.description != null)
        return false; 
    } else if (!this.description.equals(composedModel.description)) {
      return false;
    } 
    if (this.example == null) {
      if (composedModel.example != null)
        return false; 
    } else if (!this.example.equals(composedModel.example)) {
      return false;
    } 
    if (this.interfaces == null) {
      if (composedModel.interfaces != null)
        return false; 
    } else if (!this.interfaces.equals(composedModel.interfaces)) {
      return false;
    } 
    if (this.parent == null) {
      if (composedModel.parent != null)
        return false; 
    } else if (!this.parent.equals(composedModel.parent)) {
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\ComposedModel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */