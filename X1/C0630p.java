package X1;

import N1.C0576k;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.InterfaceC1253t;

/* renamed from: X1.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0630p extends com.google.android.play.core.splitinstall.internal.O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0576k f7083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f7084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630p(u uVar, C0576k c0576k, int i, C0576k c0576k2) {
        super(c0576k);
        this.f7084d = uVar;
        this.f7082b = i;
        this.f7083c = c0576k2;
    }

    @Override // com.google.android.play.core.splitinstall.internal.O
    public final void a() {
        C0576k c0576k = this.f7083c;
        int i = this.f7082b;
        u uVar = this.f7084d;
        try {
            InterfaceC1253t interfaceC1253t = uVar.f7090b.f13187m;
            String str = uVar.f7089a;
            Bundle bundle = new Bundle();
            bundle.putInt("playcore_version_code", 11004);
            interfaceC1253t.u0(str, i, bundle, new q(uVar, c0576k));
        } catch (RemoteException e6) {
            u.f7087c.c(e6, "cancelInstall(%d)", Integer.valueOf(i));
            c0576k.c(new RuntimeException(e6));
        }
    }
}
