package X1;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0618d {
    public static C0620f b(int i, int i3, int i6, long j6, long j7, List list, List list2) {
        if (i3 != 8) {
            return new C0620f(i, i3, i6, j6, j7, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static C0620f n(Bundle bundle) {
        return new C0620f(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int c();

    public final boolean d() {
        int i = i();
        return i == 0 || i == 5 || i == 6 || i == 7;
    }

    @NonNull
    public final ArrayList e() {
        return k() != null ? new ArrayList(k()) : new ArrayList();
    }

    @NonNull
    public final ArrayList f() {
        return l() != null ? new ArrayList(l()) : new ArrayList();
    }

    @Nullable
    @Deprecated
    public abstract PendingIntent g();

    public abstract int h();

    public abstract int i();

    public abstract long j();

    @Nullable
    public abstract List k();

    @Nullable
    public abstract List l();

    @Nullable
    public abstract List m();
}
