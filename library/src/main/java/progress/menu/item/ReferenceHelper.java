package progress.menu.item;

import java.lang.ref.Reference;

final class ReferenceHelper {

    private ReferenceHelper() {
    }

    static <T> boolean isNotNull(Reference<T> reference) {
        return reference != null && reference.get() != null;
    }

}