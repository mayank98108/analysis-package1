package X1;

import java.util.ArrayList;

/* renamed from: X1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0617c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7050a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7051b;

    /* renamed from: X1.c$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7052a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f7053b = new ArrayList();
    }

    public /* synthetic */ C0617c(a aVar) {
        this.f7050a = new ArrayList(aVar.f7052a);
        this.f7051b = new ArrayList(aVar.f7053b);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f7050a, this.f7051b);
    }
}
