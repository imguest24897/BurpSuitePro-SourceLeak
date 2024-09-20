/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.BidirectionalBinding;
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.WritableFloatValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class FloatProperty
/*     */   extends ReadOnlyFloatProperty
/*     */   implements Property<Number>, WritableFloatValue
/*     */ {
/*     */   public void setValue(Number paramNumber) {
/*  73 */     if (paramNumber == null) {
/*  74 */       Logging.getLogger().fine("Attempt to set float property to null, using default value instead.", new NullPointerException());
/*  75 */       set(0.0F);
/*     */     } else {
/*  77 */       set(paramNumber.floatValue());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<Number> paramProperty) {
/*  86 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<Number> paramProperty) {
/*  94 */     Bindings.unbindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     Object object = getBean();
/* 104 */     String str = getName();
/* 105 */     StringBuilder stringBuilder = new StringBuilder("FloatProperty [");
/*     */     
/* 107 */     if (object != null) {
/* 108 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 110 */     if (str != null && !str.equals("")) {
/* 111 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 113 */     stringBuilder.append("value: ").append(get()).append("]");
/* 114 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FloatProperty floatProperty(final Property<Float> property) {
/* 154 */     Objects.requireNonNull(property, "Property cannot be null");
/* 155 */     return new FloatPropertyBase()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 162 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 167 */           return property.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectProperty<Float> asObject() {
/* 193 */     return new ObjectPropertyBase<Float>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 200 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 205 */           return FloatProperty.this.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\FloatProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */