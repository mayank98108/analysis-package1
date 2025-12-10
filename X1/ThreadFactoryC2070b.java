package x1;

import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.M3;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2070b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f23870a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f23871b = Executors.defaultThreadFactory();

    public ThreadFactoryC2070b(@NonNull String str) {
        this.f23870a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f23871b.newThread(new M3(runnable, 1));
        newThread.setName(this.f23870a);
        return newThread;
    }
}
