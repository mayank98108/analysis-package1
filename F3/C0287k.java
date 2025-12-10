package F3;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0287k implements TabLayoutMediator.TabConfigurationStrategy, l2.e, l2.f {
    public static String b(long j6, String str) {
        return str + j6;
    }

    @Override // l2.f
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // l2.e
    public Object c(l2.u uVar) {
        H2.g lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(uVar);
        return lambda$getComponents$0;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "<unused var>");
    }
}
