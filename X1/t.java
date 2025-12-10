package X1;

import N1.C0576k;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public class t extends com.google.android.play.core.splitinstall.internal.u {

    /* renamed from: a, reason: collision with root package name */
    public final C0576k f7085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f7086b;

    public t(u uVar, C0576k c0576k) {
        this.f7086b = uVar;
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        this.f7085a = c0576k;
    }

    public void K(int i, Bundle bundle) throws RemoteException {
        this.f7086b.f7090b.d(this.f7085a);
        u.f7087c.d("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.v
    public void Q(int i, Bundle bundle) throws RemoteException {
        this.f7086b.f7090b.d(this.f7085a);
        u.f7087c.d("onGetSession(%d)", Integer.valueOf(i));
    }

    public void c0(int i, Bundle bundle) throws RemoteException {
        this.f7086b.f7090b.d(this.f7085a);
        u.f7087c.d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    public void m(List list) throws RemoteException {
        this.f7086b.f7090b.d(this.f7085a);
        u.f7087c.d("onGetSessionStates", new Object[0]);
    }
}
