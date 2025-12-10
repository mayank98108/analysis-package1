package X1;

import N1.AbstractC0575j;
import N1.C0576k;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitinstall.internal.C1240f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0621g implements InterfaceC0616b {

    /* renamed from: a, reason: collision with root package name */
    public final u f7061a;

    /* renamed from: b, reason: collision with root package name */
    public final O f7062b;

    /* renamed from: c, reason: collision with root package name */
    public final J f7063c;

    /* renamed from: d, reason: collision with root package name */
    public final w f7064d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f7065e = new Handler(Looper.getMainLooper());

    public C0621g(u uVar, O o6, J j6, w wVar) {
        this.f7061a = uVar;
        this.f7062b = o6;
        this.f7063c = j6;
        this.f7064d = wVar;
    }

    public static ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList2;
    }

    @Override // X1.InterfaceC0616b
    public final boolean a(AbstractC0618d abstractC0618d, androidx.navigation.dynamicfeatures.fragment.ui.d dVar) throws IntentSender.SendIntentException {
        if (abstractC0618d.i() != 8 || abstractC0618d.g() == null) {
            return false;
        }
        dVar.a(abstractC0618d.g().getIntentSender());
        return true;
    }

    @Override // X1.InterfaceC0616b
    public final AbstractC0575j<Void> b(int i) {
        u uVar = this.f7061a;
        C1240f c1240f = uVar.f7090b;
        if (c1240f == null) {
            return u.b();
        }
        u.f7087c.d("cancelInstall(%d)", Integer.valueOf(i));
        C0576k c0576k = new C0576k();
        c1240f.c(new C0630p(uVar, c0576k, i, c0576k), c0576k);
        return c0576k.f5956a;
    }

    @Override // X1.InterfaceC0616b
    public final AbstractC0575j<List<AbstractC0618d>> c() {
        u uVar = this.f7061a;
        C1240f c1240f = uVar.f7090b;
        if (c1240f == null) {
            return u.b();
        }
        u.f7087c.d("getSessionStates", new Object[0]);
        C0576k c0576k = new C0576k();
        c1240f.c(new C0629o(uVar, c0576k, c0576k), c0576k);
        return c0576k.f5956a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (r6.containsAll(r1) != false) goto L29;
     */
    @Override // X1.InterfaceC0616b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N1.AbstractC0575j<java.lang.Integer> d(X1.C0617c r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.C0621g.d(X1.c):N1.j");
    }

    @Override // X1.InterfaceC0616b
    public final Set<String> e() {
        return this.f7063c.b();
    }

    @Override // X1.InterfaceC0616b
    public final synchronized void f(InterfaceC0619e interfaceC0619e) {
        O o6 = this.f7062b;
        synchronized (o6) {
            o6.f13157a.d("registerListener", new Object[0]);
            o6.f13160d.add(interfaceC0619e);
            o6.a();
        }
    }

    @Override // X1.InterfaceC0616b
    public final synchronized void g(InterfaceC0619e interfaceC0619e) {
        O o6 = this.f7062b;
        synchronized (o6) {
            o6.f13157a.d("unregisterListener", new Object[0]);
            if (interfaceC0619e == null) {
                throw new NullPointerException("Unregistered Play Core listener should not be null.");
            }
            o6.f13160d.remove(interfaceC0619e);
            o6.a();
        }
    }
}
