package X1;

import L3.O1;
import N1.AbstractC0575j;
import N1.InterfaceC0570e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.C1663l;

/* loaded from: classes3.dex */
public final class z implements InterfaceC0570e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7094a;

    public z(C1663l c1663l) {
        this.f7094a = c1663l;
    }

    @Override // N1.InterfaceC0570e
    public void onComplete(AbstractC0575j abstractC0575j) {
        C1663l c1663l = (C1663l) this.f7094a;
        Exception l = abstractC0575j.l();
        if (l != null) {
            Result.Companion companion = Result.INSTANCE;
            c1663l.resumeWith(Result.m4772constructorimpl(ResultKt.a(l)));
        } else if (abstractC0575j.o()) {
            c1663l.n(null);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c1663l.resumeWith(Result.m4772constructorimpl(abstractC0575j.m()));
        }
    }

    public z(C0623i c0623i) {
        O1 o12 = new O1(c0623i);
        com.google.android.play.core.splitinstall.internal.B b6 = com.google.android.play.core.splitinstall.internal.z.b(new v(o12));
        com.google.android.play.core.splitinstall.internal.B b7 = com.google.android.play.core.splitinstall.internal.z.b(new C0626l(c0623i));
        com.google.android.play.core.splitinstall.internal.B b8 = com.google.android.play.core.splitinstall.internal.z.b(new K(o12));
        com.google.android.play.core.splitinstall.internal.B b9 = com.google.android.play.core.splitinstall.internal.z.b(new C0622h(b6, b7, b8, com.google.android.play.core.splitinstall.internal.z.b(new x(o12))));
        com.google.android.play.core.splitinstall.internal.B b10 = com.google.android.play.core.splitinstall.internal.z.b(new C0625k(o12));
        com.google.android.play.core.splitinstall.internal.B b11 = com.google.android.play.core.splitinstall.internal.z.b(new N4.c(b9, com.google.android.play.core.splitinstall.internal.z.b(new Z1.p(o12, b10, b8, new C0624j(b10))), b10));
        C0627m c0627m = new C0627m();
        c0627m.f7074a = b11;
        this.f7094a = com.google.android.play.core.splitinstall.internal.z.b(c0627m);
    }
}
