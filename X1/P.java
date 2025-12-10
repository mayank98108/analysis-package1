package X1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C1049m;
import com.google.android.gms.measurement.internal.C1079r0;
import com.google.android.gms.measurement.internal.C1085s0;
import com.google.android.gms.measurement.internal.C1110w1;
import com.google.android.gms.measurement.internal.InterfaceC1109w0;
import com.google.android.gms.measurement.internal.O0;
import com.google.android.gms.measurement.internal.Q3;
import com.google.android.gms.measurement.internal.U4;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7048c;

    public /* synthetic */ P(int i, Object obj, Object obj2) {
        this.f7046a = i;
        this.f7048c = obj;
        this.f7047b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7046a) {
            case 0:
                O o6 = ((C0621g) this.f7048c).f7062b;
                C0617c c0617c = (C0617c) this.f7047b;
                ArrayList arrayList = c0617c.f7050a;
                ArrayList h4 = C0621g.h(c0617c.f7051b);
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt("status", 5);
                bundle.putInt("error_code", 0);
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList<>(arrayList));
                }
                if (!h4.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList<>(h4));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                o6.c(AbstractC0618d.n(bundle));
                break;
            default:
                Q3 q32 = (Q3) this.f7048c;
                InterfaceC1109w0 interfaceC1109w0 = q32.f11798d;
                C1110w1 c1110w1 = q32.f11979a;
                if (interfaceC1109w0 == null) {
                    O0 o02 = c1110w1.f12466f;
                    C1110w1.j(o02);
                    o02.f11756f.a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        U4 u4 = (U4) this.f7047b;
                        C1049m c1049m = c1110w1.f12464d;
                        C1079r0 c1079r0 = C1085s0.f12355c1;
                        if (c1049m.o(null, c1079r0)) {
                            q32.w(interfaceC1109w0, null, u4);
                        }
                        interfaceC1109w0.A0(u4);
                        c1110w1.l().j();
                        c1110w1.f12464d.o(null, c1079r0);
                        q32.w(interfaceC1109w0, null, u4);
                        q32.r();
                        break;
                    } catch (RemoteException e6) {
                        O0 o03 = c1110w1.f12466f;
                        C1110w1.j(o03);
                        o03.f11756f.b(e6, "Failed to send app launch to the service");
                    }
                }
        }
    }
}
