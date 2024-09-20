/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.BidirectionalBinding;
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.WritableBooleanValue;
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
/*     */ 
/*     */ 
/*     */ public abstract class BooleanProperty
/*     */   extends ReadOnlyBooleanProperty
/*     */   implements Property<Boolean>, WritableBooleanValue
/*     */ {
/*     */   public void setValue(Boolean paramBoolean) {
/*  75 */     if (paramBoolean == null) {
/*  76 */       Logging.getLogger().fine("Attempt to set boolean property to null, using default value instead.", new NullPointerException());
/*  77 */       set(false);
/*     */     } else {
/*  79 */       set(paramBoolean.booleanValue());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<Boolean> paramProperty) {
/*  88 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<Boolean> paramProperty) {
/*  96 */     Bindings.unbindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 105 */     Object object = getBean();
/* 106 */     String str = getName();
/* 107 */     StringBuilder stringBuilder = new StringBuilder("BooleanProperty [");
/*     */     
/* 109 */     if (object != null) {
/* 110 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 112 */     if (str != null && !str.equals("")) {
/* 113 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 115 */     stringBuilder.append("value: ").append(get()).append("]");
/* 116 */     return stringBuilder.toString();
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
/*     */   public static BooleanProperty booleanProperty(final Property<Boolean> property) {
/* 138 */     Objects.requireNonNull(property, "Property cannot be null");
/* 139 */     return (property instanceof BooleanProperty) ? (BooleanProperty)property : new BooleanPropertyBase()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 146 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 151 */           return property.getName();
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
/*     */   public ObjectProperty<Boolean> asObject() {
/* 167 */     return new ObjectPropertyBase<Boolean>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 174 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 179 */           return BooleanProperty.this.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\BooleanProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */