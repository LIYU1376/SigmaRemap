// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Class6098<T extends Class3680> implements Class6096<T>
{
    private final int field24753;
    private final Class8371<T> field24754;
    
    public Class6098(final Class8371<T> field24754, final int field24755) {
        this.field24753 = field24755;
        this.field24754 = field24754;
    }
    
    public T method18186(final Class1932 class1932, final JsonObject jsonObject) {
        return this.field24754.method27913(class1932, Class9583.method35896(jsonObject, "group", ""), Class120.method622((JsonElement)(Class9583.method35891(jsonObject, "ingredient") ? Class9583.method35917(jsonObject, "ingredient") : Class9583.method35914(jsonObject, "ingredient"))), new Class8321(Class90.field211.method506(new Class1932(Class9583.method35895(jsonObject, "result"))).orElseThrow(() -> {
            new IllegalStateException("Item: " + str + " does not exist");
            return;
        })), Class9583.method35904(jsonObject, "experience", 0.0f), Class9583.method35910(jsonObject, "cookingtime", this.field24753));
    }
    
    public T method18187(final Class1932 class1932, final Class8654 class1933) {
        return this.field24754.method27913(class1932, class1933.method29513(32767), Class120.method621(class1933), class1933.method29511(), class1933.readFloat(), class1933.method29501());
    }
    
    public void method18188(final Class8654 class8654, final T t) {
        class8654.method29514(t.field16976);
        t.field16977.method614(class8654);
        class8654.method29509(t.field16978);
        class8654.writeFloat(t.field16979);
        class8654.method29505(t.field16980);
    }
}
