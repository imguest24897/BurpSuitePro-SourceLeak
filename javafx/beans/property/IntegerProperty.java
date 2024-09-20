/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.BidirectionalBinding;
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.WritableIntegerValue;
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
/*     */ public abstract class IntegerProperty
/*     */   extends ReadOnlyIntegerProperty
/*     */   implements Property<Number>, WritableIntegerValue
/*     */ {
/*     */   public void setValue(Number paramNumber) {
/*  73 */     if (paramNumber == null) {
/*  74 */       Logging.getLogger().fine("Attempt to set integer property to null, using default value instead.", new NullPointerException());
/*  75 */       set(0);
/*     */     } else {
/*  77 */       set(paramNumber.intValue());
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
/* 105 */     StringBuilder stringBuilder = new StringBuilder("IntegerProperty [");
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
/*     */   public static IntegerProperty integerProperty(final Property<Integer> property) {
/* 154 */     Objects.requireNonNull(property, "Property cannot be null");
/* 155 */     return new IntegerPropertyBase()
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
/*     */   public ObjectProperty<Integer> asObject() {
/* 193 */     return new ObjectPropertyBase<Integer>()
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
/* 205 */           return IntegerProperty.this.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\IntegerProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */