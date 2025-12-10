package X1;

import android.app.PendingIntent;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: X1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0620f extends AbstractC0618d {

    /* renamed from: a, reason: collision with root package name */
    public final int f7054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7055b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7056c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7057d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7058e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7059f;
    public final List g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f7060h;
    public final List i;

    public C0620f(int i, int i3, int i6, long j6, long j7, @Nullable List list, @Nullable List list2, @Nullable PendingIntent pendingIntent, @Nullable List list3) {
        this.f7054a = i;
        this.f7055b = i3;
        this.f7056c = i6;
        this.f7057d = j6;
        this.f7058e = j7;
        this.f7059f = list;
        this.g = list2;
        this.f7060h = pendingIntent;
        this.i = list3;
    }

    @Override // X1.AbstractC0618d
    public final long a() {
        return this.f7057d;
    }

    @Override // X1.AbstractC0618d
    public final int c() {
        return this.f7056c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0618d)) {
            return false;
        }
        AbstractC0618d abstractC0618d = (AbstractC0618d) obj;
        if (this.f7054a != abstractC0618d.h() || this.f7055b != abstractC0618d.i() || this.f7056c != abstractC0618d.c() || this.f7057d != abstractC0618d.a() || this.f7058e != abstractC0618d.j()) {
            return false;
        }
        List list = this.f7059f;
        if (list == null) {
            if (abstractC0618d.l() != null) {
                return false;
            }
        } else if (!list.equals(abstractC0618d.l())) {
            return false;
        }
        List list2 = this.g;
        if (list2 == null) {
            if (abstractC0618d.k() != null) {
                return false;
            }
        } else if (!list2.equals(abstractC0618d.k())) {
            return false;
        }
        PendingIntent pendingIntent = this.f7060h;
        if (pendingIntent == null) {
            if (abstractC0618d.g() != null) {
                return false;
            }
        } else if (!pendingIntent.equals(abstractC0618d.g())) {
            return false;
        }
        List list3 = this.i;
        return list3 == null ? abstractC0618d.m() == null : list3.equals(abstractC0618d.m());
    }

    @Override // X1.AbstractC0618d
    @Nullable
    @Deprecated
    public final PendingIntent g() {
        return this.f7060h;
    }

    @Override // X1.AbstractC0618d
    public final int h() {
        return this.f7054a;
    }

    public final int hashCode() {
        int i = ((((this.f7054a ^ 1000003) * 1000003) ^ this.f7055b) * 1000003) ^ this.f7056c;
        long j6 = this.f7057d;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.f7058e;
        long j9 = (j8 >>> 32) ^ j8;
        List list = this.f7059f;
        int hashCode = ((((((i * 1000003) ^ ((int) j7)) * 1000003) ^ ((int) j9)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f7060h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.i;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // X1.AbstractC0618d
    public final int i() {
        return this.f7055b;
    }

    @Override // X1.AbstractC0618d
    public final long j() {
        return this.f7058e;
    }

    @Override // X1.AbstractC0618d
    @Nullable
    public final List k() {
        return this.g;
    }

    @Override // X1.AbstractC0618d
    @Nullable
    public final List l() {
        return this.f7059f;
    }

    @Override // X1.AbstractC0618d
    @Nullable
    public final List m() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7059f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.f7060h);
        String valueOf4 = String.valueOf(this.i);
        StringBuilder b6 = androidx.appcompat.view.a.b("SplitInstallSessionState{sessionId=", this.f7054a, ", status=", this.f7055b, ", errorCode=");
        b6.append(this.f7056c);
        b6.append(", bytesDownloaded=");
        b6.append(this.f7057d);
        b6.append(", totalBytesToDownload=");
        b6.append(this.f7058e);
        b6.append(", moduleNamesNullable=");
        androidx.compose.runtime.snapshots.a.b(b6, valueOf, ", languagesNullable=", valueOf2, ", resolutionIntent=");
        return androidx.camera.camera2.internal.N.d(b6, valueOf3, ", splitFileIntents=", valueOf4, "}");
    }
}
