package X1;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class M implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0620f f7036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f7037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f7038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f7039d;

    public M(O o6, C0620f c0620f, Intent intent, Context context) {
        this.f7039d = o6;
        this.f7036a = c0620f;
        this.f7037b = intent;
        this.f7038c = context;
    }

    @Override // X1.A
    public final void zza() {
        O o6 = this.f7039d;
        o6.g.post(new N(o6, this.f7036a, 5, 0));
    }

    @Override // X1.A
    public final void zzb(int i) {
        O o6 = this.f7039d;
        o6.g.post(new N(o6, this.f7036a, 6, i));
    }

    @Override // X1.A
    public final void zzc() {
        Intent intent = this.f7037b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f7039d.f13157a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            this.f7038c.sendBroadcast(intent);
        }
    }
}
