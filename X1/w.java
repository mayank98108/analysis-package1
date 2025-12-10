package X1;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7092a;

    public w(@NonNull Context context) {
        this.f7092a = context;
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (w.class) {
            try {
                hashSet = this.f7092a.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }
}
