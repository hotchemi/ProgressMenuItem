package progress.menu.item;

import android.view.MenuItem;

import java.lang.ref.Reference;

final class ReferenceUtil {

    private ReferenceUtil() {
    }

    static boolean isNotNull(Reference<MenuItem> reference) {
        return reference != null && reference.get() != null;
    }

}