package x1;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC2069a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final zzh f23869a;

    public ExecutorC2069a(@NonNull Looper looper) {
        this.f23869a = new zzh(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f23869a.post(runnable);
    }
}
