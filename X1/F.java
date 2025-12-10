package X1;

import N1.AbstractC0575j;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class F implements InterfaceC0616b {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.y f7024a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.y f7025b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.y f7026c;

    public F(com.google.android.play.core.splitinstall.internal.y yVar, com.google.android.play.core.splitinstall.internal.y yVar2, com.google.android.play.core.splitinstall.internal.y yVar3) {
        this.f7024a = yVar;
        this.f7025b = yVar2;
        this.f7026c = yVar3;
    }

    @Override // X1.InterfaceC0616b
    public final boolean a(@NonNull AbstractC0618d abstractC0618d, @NonNull androidx.navigation.dynamicfeatures.fragment.ui.d dVar) throws IntentSender.SendIntentException {
        return h().a(abstractC0618d, dVar);
    }

    @Override // X1.InterfaceC0616b
    @NonNull
    public final AbstractC0575j<Void> b(int i) {
        return h().b(i);
    }

    @Override // X1.InterfaceC0616b
    @NonNull
    public final AbstractC0575j<List<AbstractC0618d>> c() {
        return h().c();
    }

    @Override // X1.InterfaceC0616b
    public final AbstractC0575j<Integer> d(@NonNull C0617c c0617c) {
        return h().d(c0617c);
    }

    @Override // X1.InterfaceC0616b
    @NonNull
    public final Set<String> e() {
        return h().e();
    }

    @Override // X1.InterfaceC0616b
    public final void f(@NonNull InterfaceC0619e interfaceC0619e) {
        h().f(interfaceC0619e);
    }

    @Override // X1.InterfaceC0616b
    public final void g(@NonNull InterfaceC0619e interfaceC0619e) {
        h().g(interfaceC0619e);
    }

    public final InterfaceC0616b h() {
        return this.f7026c.zza() != null ? (InterfaceC0616b) this.f7025b.zza() : (InterfaceC0616b) this.f7024a.zza();
    }
}
