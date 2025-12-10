package F3;

import K3.E0;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mobile.gro247.utility.AutoScrollUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class E extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f534b;

    public E(E0 e02, D d6) {
        this.f533a = e02;
        this.f534b = d6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i3) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i3);
        AutoScrollUtil.Companion companion = AutoScrollUtil.INSTANCE;
        LinearLayout selectedItemIndicator = this.f533a.f1408E;
        Intrinsics.checkNotNullExpressionValue(selectedItemIndicator, "selectedItemIndicator");
        companion.indicatorChanged(recyclerView, selectedItemIndicator, this.f534b.f516a);
    }
}
