package com.staples.asgard.core.util;
/**
* Utility cast to separate unsafe type cast from other code that requires warning-free
* compiles.
* 
 * @author
*/
public final class TypeCast {

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj) {
        return (T) obj; // unchecked cast: OK
    }

    private TypeCast() {
        // prevent instantiation
    }
}
