package x1;

import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.M3;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2071c implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f23873b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f23874c = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final String f23872a = "GAC_Transform";

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f23874c.newThread(new M3(runnable, 1));
        newThread.setName(this.f23872a + "[" + this.f23873b.getAndIncrement() + "]");
        return newThread;
    }
}
