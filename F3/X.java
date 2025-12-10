package F3;

import K3.E0;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mobile.gro247.utility.AutoScrollUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class X extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f624b;

    public X(V v6, E0 e02) {
        this.f623a = v6;
        this.f624b = e02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i3) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i3);
        V v6 = this.f623a;
        if (v6.f602a != null) {
            AutoScrollUtil.Companion companion = AutoScrollUtil.INSTANCE;
            LinearLayout selectedItemIndicator = this.f624b.f1408E;
            Intrinsics.checkNotNullExpressionValue(selectedItemIndicator, "selectedItemIndicator");
            companion.indicatorChanged(recyclerView, selectedItemIndicator, v6.f602a);
        }
    }
}
