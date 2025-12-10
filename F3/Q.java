package F3;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzbc;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.uxcam.internals.dv;
import kotlin.jvm.internal.Intrinsics;
import s4.U0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q implements TabLayoutMediator.TabConfigurationStrategy, G4.b {
    public static zzbc b(int i) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    @Override // G4.b
    public void a(Bitmap bitmap) {
        if (com.uxcam.internals.v.f19298m) {
            return;
        }
        if (C4.a.f222s == null) {
            C4.a.f222s = new C4.a();
        }
        C4.a aVar = C4.a.f222s;
        Intrinsics.checkNotNull(aVar);
        L4.b bVar = aVar.f230j;
        dv<U0> dvVar = com.uxcam.internals.v.f19294f;
        if (dvVar != null) {
            dvVar.a(new U0(bitmap, bVar.f5768a));
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "<unused var>");
    }
}
