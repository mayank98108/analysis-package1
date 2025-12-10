package X1;

import N1.C0576k;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X1.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0628n extends com.google.android.play.core.splitinstall.internal.O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f7075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.splitinstall.internal.H f7077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0576k f7078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f7079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0628n(u uVar, C0576k c0576k, ArrayList arrayList, ArrayList arrayList2, com.google.android.play.core.splitinstall.internal.H h4, C0576k c0576k2) {
        super(c0576k);
        this.f7079f = uVar;
        this.f7075b = arrayList;
        this.f7076c = arrayList2;
        this.f7077d = h4;
        this.f7078e = c0576k2;
    }

    @Override // com.google.android.play.core.splitinstall.internal.O
    public final void a() {
        C0576k c0576k = this.f7078e;
        u uVar = this.f7079f;
        com.google.android.play.core.splitinstall.internal.H h4 = this.f7077d;
        Collection<String> collection = this.f7075b;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        ArrayList arrayList2 = this.f7076c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putString("language", str2);
            arrayList3.add(bundle2);
        }
        arrayList.addAll(arrayList3);
        try {
            ((ArrayList) h4.f13153a).add(new com.google.android.play.core.splitinstall.internal.I(2, System.currentTimeMillis()));
            uVar.f7090b.f13187m.U(uVar.f7089a, arrayList, u.a(h4), new s(uVar, c0576k));
        } catch (RemoteException e6) {
            u.f7087c.c(e6, "startInstall(%s,%s)", collection, arrayList2);
            c0576k.c(new RuntimeException(e6));
        }
    }
}
