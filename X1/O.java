package X1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.splitinstall.zzo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class O extends com.google.android.play.core.splitinstall.internal.L {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static O f7044j;
    public final Handler g;

    /* renamed from: h, reason: collision with root package name */
    public final B f7045h;
    public final LinkedHashSet i;

    @VisibleForTesting
    public O(Context context, zzo zzoVar) {
        super(new com.google.android.play.core.splitinstall.internal.N("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.f7045h = zzoVar;
    }

    public static synchronized O b(Context context) {
        O o6;
        synchronized (O.class) {
            try {
                if (f7044j == null) {
                    f7044j = new O(context, zzo.INSTANCE);
                }
                o6 = f7044j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o6;
    }

    public final synchronized void c(C0620f c0620f) {
        try {
            Iterator it = new LinkedHashSet(this.i).iterator();
            while (it.hasNext()) {
                ((InterfaceC0619e) it.next()).onStateUpdate(c0620f);
            }
            synchronized (this) {
                Iterator it2 = new HashSet(this.f13160d).iterator();
                while (it2.hasNext()) {
                    ((S1.a) it2.next()).onStateUpdate(c0620f);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
