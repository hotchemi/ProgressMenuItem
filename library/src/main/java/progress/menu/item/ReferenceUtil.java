package progress.menu.item;

import java.lang.ref.Reference;

final class ReferenceUtils {

    private ReferenceUtils() {
    }

    static <T> boolean isNotNull(Reference<T> ref) {
        return ref != null && ref.get() != null;
    }

}