package F3;

import F3.C0288l;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.mobile.gro247.model.unbox.model.Products;
import com.mobile.gro247.utility.unbox.UnBoxPLPUtility;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F3.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0289m implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0288l f677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0288l.a f678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K3.X f679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Products f680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f682f;

    public C0289m(C0288l c0288l, C0288l.a aVar, K3.X x6, Products products, String str, String str2) {
        this.f677a = c0288l;
        this.f678b = aVar;
        this.f679c = x6;
        this.f680d = products;
        this.f681e = str;
        this.f682f = str2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j6) {
        C0288l.a aVar = this.f678b;
        String obj = aVar.f676a.f1929w.getSelectedItem().toString();
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        C0288l c0288l = this.f677a;
        c0288l.f675m = obj;
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        Context context = c0288l.f666a;
        Intrinsics.checkNotNull(context);
        String units = companion.getUnits(context, c0288l.f675m);
        Intrinsics.checkNotNullParameter(units, "<set-?>");
        c0288l.f675m = units;
        this.f679c.f1928v.setText(c0288l.c((int) Double.parseDouble(this.f681e), this.f680d, aVar.f676a.f1929w.getSelectedItem().toString(), this.f682f));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C0288l c0288l = this.f677a;
        String str = c0288l.l.get(0);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        c0288l.f675m = str2;
        UnBoxPLPUtility.Companion companion = UnBoxPLPUtility.INSTANCE;
        Context context = c0288l.f666a;
        Intrinsics.checkNotNull(context);
        String units = companion.getUnits(context, c0288l.f675m);
        Intrinsics.checkNotNullParameter(units, "<set-?>");
        c0288l.f675m = units;
    }
}
