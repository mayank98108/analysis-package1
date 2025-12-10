package X1;

/* loaded from: classes3.dex */
public final class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0620f f7040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f7043d;

    public N(O o6, C0620f c0620f, int i, int i3) {
        this.f7043d = o6;
        this.f7040a = c0620f;
        this.f7041b = i;
        this.f7042c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0620f c0620f = this.f7040a;
        this.f7043d.c(new C0620f(c0620f.f7054a, this.f7041b, this.f7042c, c0620f.f7057d, c0620f.f7058e, c0620f.f7059f, c0620f.g, c0620f.f7060h, c0620f.i));
    }
}
