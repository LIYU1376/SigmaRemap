// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class Class6696 extends Class6693
{
    public Class6696() {
        super("panic", "Disable all modules", new String[0]);
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length <= 0) {
            final Class9076 method21556 = Class9463.method35173().method35189().method21556();
            if (method21556.method32705("Panic")) {
                for (int size = method21556.method32709().size(), i = 0; i < size; ++i) {
                    final Class8241 class6429 = method21556.method32709().get(i);
                    if (class6429.field33839.equals("Panic")) {
                        method21556.method32701(class6429);
                        --i;
                        --size;
                    }
                }
            }
            final Class8241 class6430 = new Class8241("Panic", new Class4405());
            method21556.method32700(class6430);
            method21556.method32708(class6430);
            class6428.method19104("All modules disabled.");
            return;
        }
        throw new Class2332("Too many arguments");
    }
}
