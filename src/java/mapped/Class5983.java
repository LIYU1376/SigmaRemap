// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5983 implements JsonDeserializer<Class6429>
{
    private static final Class9138 field24460;
    private static final Class9138 field24461;
    private static final Class9138 field24462;
    
    public Class6429 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Class9138 method17905 = this.method17905(asJsonObject, "rotation", Class5983.field24460);
        final Class9138 method17906 = this.method17905(asJsonObject, "translation", Class5983.field24461);
        method17906.method33314(0.0625f);
        method17906.method33316(-5.0f, 5.0f);
        final Class9138 method17907 = this.method17905(asJsonObject, "scale", Class5983.field24462);
        method17907.method33316(-4.0f, 4.0f);
        return new Class6429(method17905, method17906, method17907);
    }
    
    private Class9138 method17905(final JsonObject jsonObject, final String s, final Class9138 class9138) {
        if (!jsonObject.has(s)) {
            return class9138;
        }
        final JsonArray method35917 = Class9583.method35917(jsonObject, s);
        if (method35917.size() == 3) {
            final float[] array = new float[3];
            for (int i = 0; i < array.length; ++i) {
                array[i] = Class9583.method35902(method35917.get(i), s + "[" + i + "]");
            }
            return new Class9138(array[0], array[1], array[2]);
        }
        throw new JsonParseException("Expected 3 " + s + " values, found: " + method35917.size());
    }
    
    static {
        field24460 = new Class9138(0.0f, 0.0f, 0.0f);
        field24461 = new Class9138(0.0f, 0.0f, 0.0f);
        field24462 = new Class9138(1.0f, 1.0f, 1.0f);
    }
}
