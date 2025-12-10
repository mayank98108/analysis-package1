package X1;

import N1.C0576k;
import android.os.RemoteException;

/* renamed from: X1.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0629o extends com.google.android.play.core.splitinstall.internal.O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0576k f7080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f7081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0629o(u uVar, C0576k c0576k, C0576k c0576k2) {
        super(c0576k);
        this.f7081c = uVar;
        this.f7080b = c0576k2;
    }

    @Override // com.google.android.play.core.splitinstall.internal.O
    public final void a() {
        C0576k c0576k = this.f7080b;
        try {
            u uVar = this.f7081c;
            uVar.f7090b.f13187m.k0(uVar.f7089a, new r(uVar, c0576k));
        } catch (RemoteException e6) {
            u.f7087c.c(e6, "getSessionStates", new Object[0]);
            c0576k.c(new RuntimeException(e6));
        }
    }
}
